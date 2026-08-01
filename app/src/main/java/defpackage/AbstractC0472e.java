package defpackage;

/* renamed from: eٌٟؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0472e {
    public static final short[] ad = new short[128];
    public static final byte[] vip;

    static {
        byte[] bArr = new byte[112];
        vip = bArr;
        byte[] bArr2 = new byte[128];
        ad(bArr2, 0, 15, (byte) 1);
        ad(bArr2, 16, 31, (byte) 2);
        ad(bArr2, 32, 63, (byte) 3);
        ad(bArr2, 64, 65, (byte) 0);
        ad(bArr2, 66, 95, (byte) 4);
        ad(bArr2, 96, 96, (byte) 5);
        ad(bArr2, 97, 108, (byte) 6);
        ad(bArr2, 109, 109, (byte) 7);
        ad(bArr2, 110, 111, (byte) 6);
        ad(bArr2, 112, 112, (byte) 8);
        ad(bArr2, 113, 115, (byte) 9);
        ad(bArr2, 116, 116, (byte) 10);
        ad(bArr2, 117, 127, (byte) 0);
        ad(bArr, 0, bArr.length - 1, (byte) -2);
        ad(bArr, 8, 11, (byte) -1);
        ad(bArr, 24, 27, (byte) 0);
        ad(bArr, 40, 43, (byte) 16);
        ad(bArr, 58, 59, (byte) 0);
        ad(bArr, 72, 73, (byte) 0);
        ad(bArr, 89, 91, (byte) 16);
        ad(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, 80, 32, 96};
        for (int i = 0; i < 128; i++) {
            byte b = bArr2[i];
            ad[i] = (short) (bArr4[b] | ((bArr3[b] & i) << 8));
        }
    }

    public static void ad(byte[] bArr, int i, int i2, byte b) {
        while (i <= i2) {
            bArr[i] = b;
            i++;
        }
    }
}
