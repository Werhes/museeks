package defpackage;

import java.util.Arrays;

/* renamed from: eّؑٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12180e extends Cdefault implements Cnew {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f24478e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f24477e = new inmobi(22, C12180e.class);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final char[] f24476e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public C12180e(byte[] bArr) {
        this.f24478e = bArr;
    }

    public static void subs(int i, StringBuilder sb) {
        char[] cArr = f24476e;
        sb.append(cArr[(i >>> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(28, z, this.f24478e);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        return AbstractC12442e.isVip(this.f24478e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof C12180e) {
            return Arrays.equals(this.f24478e, ((C12180e) cdefault).f24478e);
        }
        return false;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f24478e.length, z);
    }

    public final String toString() {
        return yandex();
    }

    @Override // defpackage.Cnew
    public final String yandex() {
        int i;
        byte[] bArr = this.f24478e;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(((C7850e.m2326class(length) + length) * 2) + 3);
        sb.append("#1C");
        if (length < 128) {
            subs(length, sb);
        } else {
            byte[] bArr2 = new byte[5];
            int i2 = length;
            int i3 = 5;
            while (true) {
                i = i3 - 1;
                bArr2[i] = (byte) i2;
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3 = i;
            }
            int i4 = i3 - 2;
            bArr2[i4] = (byte) (128 | (5 - i));
            while (true) {
                int i5 = i4 + 1;
                subs(bArr2[i4], sb);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (byte b : bArr) {
            subs(b, sb);
        }
        return sb.toString();
    }
}
