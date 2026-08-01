package defpackage;

import java.math.BigInteger;

/* renamed from: eًٛٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8048e {
    public static byte[] ad(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i < byteArray.length) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, byteArray.length - i, bArr, 0, i);
            return bArr;
        }
        if (i <= byteArray.length) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
        return bArr2;
    }
}
