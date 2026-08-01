package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17809e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final char[] f34896e = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof AbstractC17809e) {
            byte[] bArr = ((C18330e) this).f35993e;
            int length = bArr.length * 8;
            byte[] bArr2 = ((C18330e) ((AbstractC17809e) obj)).f35993e;
            if (length == bArr2.length * 8) {
                if (bArr.length != bArr2.length) {
                    z = false;
                } else {
                    z = true;
                    for (int i = 0; i < bArr.length; i++) {
                        z &= bArr[i] == bArr2[i];
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((C18330e) this).f35993e;
        if (bArr.length * 8 >= 32) {
            boolean z = bArr.length >= 4;
            int length = bArr.length;
            if (z) {
                return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
            }
            throw new IllegalStateException(AbstractC12992e.adcel("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i = bArr[0] & 255;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            i |= (bArr[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArr = ((C18330e) this).f35993e;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = f34896e;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
