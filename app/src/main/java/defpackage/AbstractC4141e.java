package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4141e {
    public static final HashMap ad;
    public static final HashMap vip;

    static {
        HashMap hashMap = new HashMap();
        ad = hashMap;
        vip = new HashMap();
        hashMap.put("JPG", "image/jpeg");
        hashMap.put("PNG", "image/png");
        hashMap.put("GIF", "image/gif");
        hashMap.put("BMP", "image/bmp");
        hashMap.put("TIF", "image/tiff");
        hashMap.put("PDF", "image/pdf");
        hashMap.put("PIC", "image/x-pict");
        for (String str : hashMap.keySet()) {
            vip.put((String) ad.get(str), str);
        }
        vip.put("image/jpg", "JPG");
    }

    public static boolean ad(byte[] bArr) {
        return bArr.length >= 3 && 71 == (bArr[0] & 255) && 73 == (bArr[1] & 255) && 70 == (bArr[2] & 255);
    }

    public static String license(byte[] bArr) {
        if (metrica(bArr)) {
            return "image/png";
        }
        if (vip(bArr)) {
            return "image/jpeg";
        }
        if (ad(bArr)) {
            return "image/gif";
        }
        if (bArr.length >= 2 && 66 == (bArr[0] & 255) && 77 == (bArr[1] & 255)) {
            return "image/bmp";
        }
        if (bArr.length >= 4 && 37 == (bArr[0] & 255) && 80 == (bArr[1] & 255) && 68 == (bArr[2] & 255) && 70 == (bArr[3] & 255)) {
            return "image/pdf";
        }
        if (bArr.length < 4) {
            return null;
        }
        int i = bArr[0] & 255;
        if (73 == i && 73 == (bArr[1] & 255) && 42 == (bArr[2] & 255) && (bArr[3] & 255) == 0) {
            return "image/tiff";
        }
        if (77 == i && 77 == (bArr[1] & 255) && (bArr[2] & 255) == 0 && 42 == (bArr[3] & 255)) {
            return "image/tiff";
        }
        return null;
    }

    public static boolean metrica(byte[] bArr) {
        return bArr.length >= 4 && 137 == (bArr[0] & 255) && 80 == (bArr[1] & 255) && 78 == (bArr[2] & 255) && 71 == (bArr[3] & 255);
    }

    public static boolean vip(byte[] bArr) {
        return bArr.length >= 4 && 255 == (bArr[0] & 255) && 216 == (bArr[1] & 255) && 255 == (bArr[2] & 255) && 219 <= (bArr[3] & 255);
    }
}
