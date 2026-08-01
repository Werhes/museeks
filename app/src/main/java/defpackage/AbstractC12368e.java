package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12368e {
    public static final int[] ad;
    public static final long[] metrica;
    public static final int[] vip;

    static {
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        ad = iArr;
        int[] iArr2 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        int[] iArr3 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 16) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < 16) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        vip = iArr3;
        long[] jArr = new long[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < 16) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < 16) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        metrica = jArr;
    }

    public static final int ad(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) C10994e.vip(j)));
    }

    public static final int appmetrica(int i, String str) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 << 4;
            char charAt = str.charAt(i4);
            if ((charAt >>> '\b') != 0 || (i2 = vip[charAt]) < 0) {
                purchase(i4, str);
                throw null;
            }
            i3 = i5 | i2;
        }
        return i3;
    }

    public static final void billing(int i, int i2, int i3, String str, String str2) {
        throw new NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was \"" + str.substring(i, i2) + "\" of length " + (i2 - i));
    }

    public static final byte license(int i, String str) {
        int[] iArr;
        int i2;
        int i3;
        char charAt = str.charAt(i);
        if ((charAt >>> '\b') != 0 || (i2 = (iArr = vip)[charAt]) < 0) {
            purchase(i, str);
            throw null;
        }
        int i4 = i + 1;
        char charAt2 = str.charAt(i4);
        if ((charAt2 >>> '\b') == 0 && (i3 = iArr[charAt2]) >= 0) {
            return (byte) ((i2 << 4) | i3);
        }
        purchase(i4, str);
        throw null;
    }

    public static final int metrica(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static final void purchase(int i, String str) {
        StringBuilder premium = AbstractC4653e.premium("Expected a hexadecimal digit at index ", i, ", but was ");
        premium.append(str.charAt(i));
        throw new NumberFormatException(premium.toString());
    }

    public static final long startapp(int i, long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }

    public static final void vip(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 < 1) {
            billing(i, i2, 1, str, "at least");
            throw null;
        }
        if (i3 > 8) {
            int i4 = (i3 + i) - 8;
            while (i < i4) {
                if (str.charAt(i) != '0') {
                    StringBuilder premium = AbstractC4653e.premium("Expected the hexadecimal digit '0' at index ", i, ", but was '");
                    premium.append(str.charAt(i));
                    premium.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(premium.toString());
                }
                i++;
            }
        }
    }

    public static final int yandex(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }
}
