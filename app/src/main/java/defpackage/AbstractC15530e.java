package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15530e {
    public static final Charset ad = Charset.forName("UTF-8");

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e2, code lost:
    
        if (r7 != 4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] ad(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15530e.ad(java.lang.String):byte[]");
    }

    public static String vip(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = AbstractC16534e.appmetrica;
        int i = (length / 3) * 4;
        if (length % 3 > 0) {
            i += 4;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        while (true) {
            int i5 = i2 + 3;
            if (i5 > length) {
                break;
            }
            int i6 = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            bArr3[i3] = bArr2[(i6 >> 18) & 63];
            bArr3[i3 + 1] = bArr2[(i6 >> 12) & 63];
            bArr3[i3 + 2] = bArr2[(i6 >> 6) & 63];
            bArr3[i3 + 3] = bArr2[i6 & 63];
            int i7 = i3 + 4;
            i4--;
            if (i4 == 0) {
                i3 += 5;
                bArr3[i7] = 10;
                i4 = 19;
            } else {
                i3 = i7;
            }
            i2 = i5;
        }
        if (i2 == length - 1) {
            int i8 = (bArr[i2] & 255) << 4;
            bArr3[i3] = bArr2[(i8 >> 6) & 63];
            bArr3[i3 + 1] = bArr2[i8 & 63];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
        } else if (i2 == length - 2) {
            int i9 = ((bArr[i2 + 1] & 255) << 2) | ((bArr[i2] & 255) << 10);
            bArr3[i3] = bArr2[(i9 >> 12) & 63];
            bArr3[i3 + 1] = bArr2[(i9 >> 6) & 63];
            bArr3[i3 + 2] = bArr2[i9 & 63];
            bArr3[i3 + 3] = 61;
        }
        return new String(bArr3, StandardCharsets.US_ASCII);
    }
}
