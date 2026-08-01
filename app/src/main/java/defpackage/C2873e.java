package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: eؘؔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2873e {
    public final byte[] ad;
    public final byte[] vip;

    public C2873e() {
        this.ad = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        byte[] bArr = new byte[128];
        this.vip = bArr;
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = -1;
        }
        while (true) {
            byte[] bArr2 = this.ad;
            if (i >= bArr2.length) {
                bArr[65] = bArr[97];
                bArr[66] = bArr[98];
                bArr[67] = bArr[99];
                bArr[68] = bArr[100];
                bArr[69] = bArr[101];
                bArr[70] = bArr[102];
                return;
            }
            bArr[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public C2873e(byte[] bArr, byte[] bArr2) {
        this.ad = bArr;
        this.vip = bArr2;
    }

    public static boolean metrica(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public int ad(String str, ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr = new byte[36];
        int length = str.length();
        while (length > 0 && metrica(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            while (i < length && metrica(str.charAt(i))) {
                i++;
            }
            int i4 = i + 1;
            char charAt = str.charAt(i);
            byte[] bArr2 = this.vip;
            byte b = bArr2[charAt];
            while (i4 < length && metrica(str.charAt(i4))) {
                i4++;
            }
            int i5 = i4 + 1;
            byte b2 = bArr2[str.charAt(i4)];
            if ((b | b2) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            int i6 = i2 + 1;
            bArr[i2] = (byte) ((b << 4) | b2);
            if (i6 == 36) {
                byteArrayOutputStream.write(bArr);
                i2 = 0;
            } else {
                i2 = i6;
            }
            i3++;
            i = i5;
        }
        if (i2 > 0) {
            byteArrayOutputStream.write(bArr, 0, i2);
        }
        return i3;
    }

    public byte[] vip(int i, int i2, String str) {
        if (str == null) {
            throw new NullPointerException("'str' cannot be null");
        }
        if (i < 0 || i2 < 0 || i > str.length() - i2) {
            throw new IndexOutOfBoundsException("invalid offset and/or length specified");
        }
        if ((i2 & 1) != 0) {
            throw new IOException("a hexadecimal encoding must have an even number of characters");
        }
        int i3 = i2 >>> 1;
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            char charAt = str.charAt(i);
            byte[] bArr2 = this.vip;
            i += 2;
            int i5 = bArr2[str.charAt(i + 1)] | (bArr2[charAt] << 4);
            if (i5 < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            bArr[i4] = (byte) i5;
        }
        return bArr;
    }
}
