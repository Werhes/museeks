package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14446e implements InterfaceC2283e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f28556e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC15672e f28557e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f28558e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f28560e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f28561e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public byte[] f28555e = new byte[65536];

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f28559e = new byte[4096];

    static {
        AbstractC1418e.ad("media3.extractor");
    }

    public C14446e(InterfaceC15672e interfaceC15672e, long j, long j2) {
        this.f28557e = interfaceC15672e;
        this.f28558e = j;
        this.f28556e = j2;
    }

    public final void Signature(int i) {
        int i2 = this.f28561e + i;
        byte[] bArr = this.f28555e;
        if (i2 > bArr.length) {
            this.f28555e = Arrays.copyOf(this.f28555e, AbstractC9413e.adcel(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    @Override // defpackage.InterfaceC2283e
    public final void ad(int i, int i2, byte[] bArr) {
        billing(bArr, i, i2, false);
    }

    @Override // defpackage.InterfaceC2283e
    public final int adcel(int i) {
        C14446e c14446e;
        int min = Math.min(this.f28560e, i);
        subscription(min);
        if (min == 0) {
            byte[] bArr = this.f28559e;
            c14446e = this;
            min = c14446e.admob(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            c14446e = this;
        }
        if (min != -1) {
            c14446e.f28558e += min;
        }
        return min;
    }

    public final int admob(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f28557e.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.InterfaceC2283e
    public final void amazon(int i) {
        purchase(i, false);
    }

    @Override // defpackage.InterfaceC2283e
    public final int appmetrica(int i, int i2, byte[] bArr) {
        C14446e c14446e;
        int min;
        Signature(i2);
        int i3 = this.f28560e;
        int i4 = this.f28561e;
        int i5 = i3 - i4;
        if (i5 == 0) {
            c14446e = this;
            min = c14446e.admob(this.f28555e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            c14446e.f28560e += min;
        } else {
            c14446e = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(c14446e.f28555e, c14446e.f28561e, bArr, i, min);
        c14446e.f28561e += min;
        return min;
    }

    @Override // defpackage.InterfaceC2283e
    public final boolean billing(byte[] bArr, int i, int i2, boolean z) {
        if (!mopub(i2, z)) {
            return false;
        }
        System.arraycopy(this.f28555e, this.f28561e - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.InterfaceC2283e
    public final long getLength() {
        return this.f28556e;
    }

    @Override // defpackage.InterfaceC2283e
    public final long getPosition() {
        return this.f28558e;
    }

    public final boolean mopub(int i, boolean z) {
        Signature(i);
        int i2 = this.f28560e - this.f28561e;
        while (i2 < i) {
            int i3 = i;
            boolean z2 = z;
            i2 = admob(this.f28555e, this.f28561e, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            this.f28560e = this.f28561e + i2;
            i = i3;
            z = z2;
        }
        this.f28561e += i;
        return true;
    }

    @Override // defpackage.InterfaceC2283e
    public final boolean purchase(int i, boolean z) {
        int min = Math.min(this.f28560e, i);
        subscription(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.f28559e;
            i2 = admob(bArr, -i2, Math.min(i, bArr.length + i2), i2, z);
        }
        if (i2 != -1) {
            this.f28558e += i2;
        }
        return i2 != -1;
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        C14446e c14446e;
        int i3 = this.f28560e;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.f28555e, 0, bArr, i, min);
            subscription(min);
            i4 = min;
        }
        if (i4 == 0) {
            c14446e = this;
            i4 = c14446e.admob(bArr, i, i2, 0, true);
        } else {
            c14446e = this;
        }
        if (i4 != -1) {
            c14446e.f28558e += i4;
        }
        return i4;
    }

    @Override // defpackage.InterfaceC2283e
    public final void readFully(byte[] bArr, int i, int i2) {
        vip(bArr, i, i2, false);
    }

    @Override // defpackage.InterfaceC2283e
    public final void smaato() {
        this.f28561e = 0;
    }

    @Override // defpackage.InterfaceC2283e
    public final void startapp(int i) {
        mopub(i, false);
    }

    public final void subscription(int i) {
        int i2 = this.f28560e - i;
        this.f28560e = i2;
        this.f28561e = 0;
        byte[] bArr = this.f28555e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f28555e = bArr2;
    }

    @Override // defpackage.InterfaceC2283e
    public final boolean vip(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.f28560e;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.f28555e, 0, bArr, i, min);
            subscription(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = admob(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.f28558e += i4;
        }
        return i4 != -1;
    }

    @Override // defpackage.InterfaceC2283e
    public final long yandex() {
        return this.f28558e + this.f28561e;
    }
}
