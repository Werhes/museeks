package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: eؚۖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7358e {
    public final byte[] ad;
    public final byte[] vip;

    public C7358e() {
        this.ad = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        byte[] bArr = new byte[128];
        this.vip = bArr;
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            bArr[i2] = -1;
        }
        while (true) {
            byte[] bArr2 = this.ad;
            if (i >= bArr2.length) {
                return;
            }
            bArr[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public /* synthetic */ C7358e(byte[] bArr, byte[] bArr2) {
        this.ad = bArr;
        this.vip = bArr2;
    }

    public static int license(int i, int i2, String str) {
        while (i < i2 && metrica(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public static boolean metrica(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public int ad(String str, ByteArrayOutputStream byteArrayOutputStream) {
        char c;
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && metrica(str.charAt(length - 1))) {
            length--;
        }
        if (length == 0) {
            return 0;
        }
        int i = length;
        int i2 = 0;
        while (true) {
            c = 4;
            if (i <= 0 || i2 == 4) {
                break;
            }
            if (!metrica(str.charAt(i - 1))) {
                i2++;
            }
            i--;
        }
        int license = license(0, i, str);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            byte[] bArr2 = this.vip;
            if (license >= i) {
                if (i3 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
                int license2 = license(license, length, str);
                int license3 = license(license2 + 1, length, str);
                int license4 = license(license3 + 1, length, str);
                int license5 = license(license4 + 1, length, str);
                char charAt = str.charAt(license2);
                char charAt2 = str.charAt(license3);
                char charAt3 = str.charAt(license4);
                char charAt4 = str.charAt(license5);
                int i5 = 2;
                if (charAt3 == '=') {
                    if (charAt4 != '=') {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byte b = bArr2[charAt];
                    byte b2 = bArr2[charAt2];
                    if ((b | b2) < 0) {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byteArrayOutputStream.write((b << 2) | (b2 >> 4));
                    i5 = 1;
                } else if (charAt4 == '=') {
                    byte b3 = bArr2[charAt];
                    byte b4 = bArr2[charAt2];
                    byte b5 = bArr2[charAt3];
                    if ((b3 | b4 | b5) < 0) {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byteArrayOutputStream.write((b3 << 2) | (b4 >> 4));
                    byteArrayOutputStream.write((b4 << 4) | (b5 >> 2));
                } else {
                    byte b6 = bArr2[charAt];
                    byte b7 = bArr2[charAt2];
                    byte b8 = bArr2[charAt3];
                    byte b9 = bArr2[charAt4];
                    if ((b6 | b7 | b8 | b9) < 0) {
                        throw new IOException("invalid characters encountered at end of base64 data");
                    }
                    byteArrayOutputStream.write((b6 << 2) | (b7 >> 4));
                    byteArrayOutputStream.write((b7 << 4) | (b8 >> 2));
                    byteArrayOutputStream.write(b9 | (b8 << 6));
                    i5 = 3;
                }
                return i4 + i5;
            }
            int i6 = license + 1;
            byte b10 = bArr2[str.charAt(license)];
            int license6 = license(i6, i, str);
            int i7 = license6 + 1;
            byte b11 = bArr2[str.charAt(license6)];
            int license7 = license(i7, i, str);
            int i8 = license7 + 1;
            byte b12 = bArr2[str.charAt(license7)];
            int license8 = license(i8, i, str);
            char c2 = c;
            int i9 = license8 + 1;
            byte b13 = bArr2[str.charAt(license8)];
            if ((b10 | b11 | b12 | b13) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr[i3] = (byte) ((b10 << 2) | (b11 >> 4));
            int i10 = i3 + 2;
            bArr[i3 + 1] = (byte) ((b11 << 4) | (b12 >> 2));
            i3 += 3;
            bArr[i10] = (byte) (b13 | (b12 << 6));
            i4 += 3;
            if (i3 == 54) {
                byteArrayOutputStream.write(bArr);
                i3 = 0;
            }
            license = license(i9, i, str);
            c = c2;
        }
    }

    public int vip(byte[] bArr, int i, int i2, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr2;
        if (i2 < 0) {
            return 0;
        }
        byte[] bArr3 = new byte[72];
        int i3 = i2;
        int i4 = 0;
        while (i3 > 0) {
            int min = Math.min(54, i3);
            int i5 = i4 + min;
            int i6 = i5 - 2;
            int i7 = 0;
            int i8 = i4;
            while (true) {
                bArr2 = this.ad;
                if (i8 >= i6) {
                    break;
                }
                byte b = bArr[i8];
                int i9 = i8 + 2;
                int i10 = bArr[i8 + 1] & 255;
                i8 += 3;
                byte b2 = bArr[i9];
                bArr3[i7] = bArr2[(b >>> 2) & 63];
                bArr3[i7 + 1] = bArr2[((b << 4) | (i10 >>> 4)) & 63];
                int i11 = i7 + 3;
                bArr3[i7 + 2] = bArr2[((i10 << 2) | ((b2 & 255) >>> 6)) & 63];
                i7 += 4;
                bArr3[i11] = bArr2[b2 & 63];
            }
            int i12 = min - (i8 - i4);
            if (i12 == 1) {
                int i13 = bArr[i8] & 255;
                bArr3[i7] = bArr2[(i13 >>> 2) & 63];
                bArr3[i7 + 1] = bArr2[(i13 << 4) & 63];
                int i14 = i7 + 3;
                bArr3[i7 + 2] = 61;
                i7 += 4;
                bArr3[i14] = 61;
            } else if (i12 == 2) {
                int i15 = i8 + 1;
                int i16 = bArr[i8] & 255;
                int i17 = bArr[i15] & 255;
                bArr3[i7] = bArr2[(i16 >>> 2) & 63];
                bArr3[i7 + 1] = bArr2[((i16 << 4) | (i17 >>> 4)) & 63];
                int i18 = i7 + 3;
                bArr3[i7 + 2] = bArr2[(i17 << 2) & 63];
                i7 += 4;
                bArr3[i18] = 61;
            }
            byteArrayOutputStream.write(bArr3, 0, i7);
            i3 -= min;
            i4 = i5;
        }
        return ((i2 + 2) / 3) * 4;
    }
}
