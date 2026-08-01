package defpackage;

import java.util.Arrays;

/* renamed from: eؕؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3102e extends Cdefault implements Cnew {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f7182e = new inmobi(0, C3102e.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final char[] f7183e;

    public C3102e(String str) {
        if (str == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f7183e = str.toCharArray();
    }

    public C3102e(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 * 2;
            cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
        }
        this.f7183e = cArr;
    }

    public C3102e(char[] cArr) {
        this.f7183e = cArr;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        char[] cArr = this.f7183e;
        int length = cArr.length;
        c7850e.m2343super(30, z);
        c7850e.m2330abstract(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            c7850e.m2331break(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = cArr[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            c7850e.m2331break(bArr, 0, i3);
        }
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        char[] cArr = this.f7183e;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof C3102e) {
            return Arrays.equals(this.f7183e, ((C3102e) cdefault).f7183e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f7183e.length * 2, z);
    }

    public final String toString() {
        return yandex();
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        return new String(this.f7183e);
    }
}
