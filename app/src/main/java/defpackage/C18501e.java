package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۦٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18501e implements InterfaceC11306e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f36256e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f36257e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f36258e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f36259e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f36260e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f36261e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f36262e;

    public C18501e(int i) {
        C12456e c12456e = new C12456e(1);
        if (i == 32) {
            c12456e.f5689e = C2231e.f5685e;
        } else if (i == 64) {
            c12456e.f5689e = C2231e.f5687e;
        } else {
            if (i != 128) {
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "Unsupported length: "));
            }
            c12456e.f5689e = C2231e.f5688e;
        }
        this.f36259e = c12456e;
        this.f36260e = i;
        int i2 = i / 32;
        this.f36256e = new int[i2];
        this.f36262e = new int[i2 + 1];
    }

    public C18501e(int i, int i2, int i3, String str, Handler handler, C6268e c6268e) {
        this.f36262e = handler;
        this.f36261e = c6268e;
        this.f36260e = i;
        this.f36258e = i2;
        this.f36257e = i3;
        this.f36259e = str;
    }

    public VolumeProvider ad() {
        C18501e c18501e;
        if (((VolumeProvider) this.f36256e) != null) {
            c18501e = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            c18501e = this;
            c18501e.f36256e = new C10753e(c18501e, this.f36260e, this.f36258e, this.f36257e, (String) this.f36259e, 0);
        } else {
            c18501e = this;
            c18501e.f36256e = new C9682e(c18501e, c18501e.f36260e, c18501e.f36258e, c18501e.f36257e, 0);
        }
        return (VolumeProvider) c18501e.f36256e;
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        int i2 = (this.f36257e + 1) % 4;
        this.f36257e = i2;
        if (i2 == 0) {
            this.f36258e = (this.f36258e + 1) % ((int[]) this.f36262e).length;
        }
        metrica(i2 * 8);
        int i3 = 0;
        while (true) {
            int[] iArr = (int[]) this.f36256e;
            if (i3 >= iArr.length) {
                reset();
                return getMacSize();
            }
            C6130e.mopub(iArr[i3], i3 * 4, bArr);
            i3++;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        return "Zuc256Mac-" + this.f36260e;
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return this.f36260e / 8;
    }

    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        C12456e c12456e = (C12456e) this.f36259e;
        c12456e.init(true, interfaceC3894e);
        c12456e.getClass();
        this.f36261e = new C6130e(c12456e);
        vip();
    }

    public void metrica(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.f36256e;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2];
            int[] iArr2 = (int[]) this.f36262e;
            int i4 = this.f36258e + i2;
            int i5 = iArr2[i4 % iArr2.length];
            if (i != 0) {
                i5 = (i5 << i) | (iArr2[(i4 + 1) % iArr2.length] >>> (32 - i));
            }
            iArr[i2] = i3 ^ i5;
            i2++;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        C2231e c2231e = (C2231e) this.f36261e;
        if (c2231e != null) {
            ((C12456e) this.f36259e).vip(c2231e);
        }
        vip();
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        int[] iArr = (int[]) this.f36262e;
        int i = (this.f36257e + 1) % 4;
        this.f36257e = i;
        if (i == 0) {
            iArr[this.f36258e] = ((C12456e) this.f36259e).smaato();
            this.f36258e = (this.f36258e + 1) % iArr.length;
        }
        int i2 = this.f36257e * 8;
        int i3 = 128;
        int i4 = 0;
        while (i3 > 0) {
            if ((b & i3) != 0) {
                metrica(i2 + i4);
            }
            i3 >>= 1;
            i4++;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }

    public void vip() {
        C12456e c12456e = (C12456e) this.f36259e;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.f36256e;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = c12456e.smaato();
            i2++;
        }
        while (true) {
            int[] iArr2 = (int[]) this.f36262e;
            if (i >= iArr2.length - 1) {
                this.f36258e = iArr2.length - 1;
                this.f36257e = 3;
                return;
            } else {
                iArr2[i] = c12456e.smaato();
                i++;
            }
        }
    }
}
