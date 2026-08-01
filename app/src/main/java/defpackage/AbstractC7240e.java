package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: eؙؚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7240e {
    public static final C2873e ad = new C2873e();

    public static byte[] ad(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ad.ad(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new Cabstract(AbstractC1786e.remoteconfig(e, new StringBuilder("exception decoding Hex string: ")), e, 1);
        }
    }

    public static String appmetrica(int i, int i2, byte[] bArr) {
        return AbstractC1433e.ad(license(i, i2, bArr));
    }

    public static byte[] license(int i, int i2, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C2873e c2873e = ad;
            c2873e.getClass();
            if (i2 >= 0) {
                byte[] bArr2 = new byte[72];
                while (i2 > 0) {
                    int min = Math.min(36, i2);
                    int i3 = i + min;
                    int i4 = 0;
                    while (i < i3) {
                        int i5 = i + 1;
                        byte b = bArr[i];
                        int i6 = i4 + 1;
                        byte[] bArr3 = c2873e.ad;
                        bArr2[i4] = bArr3[(b & 255) >>> 4];
                        i4 += 2;
                        bArr2[i6] = bArr3[b & 15];
                        i = i5;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4);
                    i2 -= min;
                    i = i3;
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new Cabstract(AbstractC1786e.remoteconfig(e, new StringBuilder("exception encoding Hex string: ")), e, 2);
        }
    }

    public static byte[] metrica(String str) {
        try {
            return ad.vip(0, str.length(), str);
        } catch (Exception e) {
            throw new Cabstract(AbstractC1786e.remoteconfig(e, new StringBuilder("exception decoding Hex string: ")), e, 1);
        }
    }

    public static byte[] vip(int i, String str) {
        try {
            return ad.vip(1, i, str);
        } catch (Exception e) {
            throw new Cabstract(AbstractC1786e.remoteconfig(e, new StringBuilder("exception decoding Hex string: ")), e, 1);
        }
    }
}
