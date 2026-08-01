package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eٔۜٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14983e {
    public static final Map metrica;
    public final int ad;
    public final String vip;

    static {
        HashMap hashMap = new HashMap();
        AbstractC13501e.advert(1, "XMSSMT_SHA2_20/2_256", hashMap, ad(32, 16, 67, 20, 2, "SHA-256"));
        AbstractC13501e.advert(2, "XMSSMT_SHA2_20/4_256", hashMap, ad(32, 16, 67, 20, 4, "SHA-256"));
        AbstractC13501e.advert(3, "XMSSMT_SHA2_40/2_256", hashMap, ad(32, 16, 67, 40, 2, "SHA-256"));
        AbstractC13501e.advert(4, "XMSSMT_SHA2_40/4_256", hashMap, ad(32, 16, 67, 40, 4, "SHA-256"));
        AbstractC13501e.advert(5, "XMSSMT_SHA2_40/8_256", hashMap, ad(32, 16, 67, 40, 8, "SHA-256"));
        AbstractC13501e.advert(6, "XMSSMT_SHA2_60/3_256", hashMap, ad(32, 16, 67, 60, 3, "SHA-256"));
        AbstractC13501e.advert(7, "XMSSMT_SHA2_60/6_256", hashMap, ad(32, 16, 67, 60, 6, "SHA-256"));
        AbstractC13501e.advert(8, "XMSSMT_SHA2_60/12_256", hashMap, ad(32, 16, 67, 60, 12, "SHA-256"));
        AbstractC13501e.advert(9, "XMSSMT_SHA2_20/2_512", hashMap, ad(64, 16, 131, 20, 2, "SHA-512"));
        AbstractC13501e.advert(10, "XMSSMT_SHA2_20/4_512", hashMap, ad(64, 16, 131, 20, 4, "SHA-512"));
        AbstractC13501e.advert(11, "XMSSMT_SHA2_40/2_512", hashMap, ad(64, 16, 131, 40, 2, "SHA-512"));
        AbstractC13501e.advert(12, "XMSSMT_SHA2_40/4_512", hashMap, ad(64, 16, 131, 40, 4, "SHA-512"));
        AbstractC13501e.advert(13, "XMSSMT_SHA2_40/8_512", hashMap, ad(64, 16, 131, 40, 8, "SHA-512"));
        AbstractC13501e.advert(14, "XMSSMT_SHA2_60/3_512", hashMap, ad(64, 16, 131, 60, 3, "SHA-512"));
        AbstractC13501e.advert(15, "XMSSMT_SHA2_60/6_512", hashMap, ad(64, 16, 131, 60, 6, "SHA-512"));
        AbstractC13501e.advert(16, "XMSSMT_SHA2_60/12_512", hashMap, ad(64, 16, 131, 60, 12, "SHA-512"));
        AbstractC13501e.advert(17, "XMSSMT_SHAKE_20/2_256", hashMap, ad(32, 16, 67, 20, 2, "SHAKE128"));
        AbstractC13501e.advert(18, "XMSSMT_SHAKE_20/4_256", hashMap, ad(32, 16, 67, 20, 4, "SHAKE128"));
        AbstractC13501e.advert(19, "XMSSMT_SHAKE_40/2_256", hashMap, ad(32, 16, 67, 40, 2, "SHAKE128"));
        AbstractC13501e.advert(20, "XMSSMT_SHAKE_40/4_256", hashMap, ad(32, 16, 67, 40, 4, "SHAKE128"));
        AbstractC13501e.advert(21, "XMSSMT_SHAKE_40/8_256", hashMap, ad(32, 16, 67, 40, 8, "SHAKE128"));
        AbstractC13501e.advert(22, "XMSSMT_SHAKE_60/3_256", hashMap, ad(32, 16, 67, 60, 3, "SHAKE128"));
        AbstractC13501e.advert(23, "XMSSMT_SHAKE_60/6_256", hashMap, ad(32, 16, 67, 60, 6, "SHAKE128"));
        AbstractC13501e.advert(24, "XMSSMT_SHAKE_60/12_256", hashMap, ad(32, 16, 67, 60, 12, "SHAKE128"));
        AbstractC13501e.advert(25, "XMSSMT_SHAKE_20/2_512", hashMap, ad(64, 16, 131, 20, 2, "SHAKE256"));
        AbstractC13501e.advert(26, "XMSSMT_SHAKE_20/4_512", hashMap, ad(64, 16, 131, 20, 4, "SHAKE256"));
        AbstractC13501e.advert(27, "XMSSMT_SHAKE_40/2_512", hashMap, ad(64, 16, 131, 40, 2, "SHAKE256"));
        AbstractC13501e.advert(28, "XMSSMT_SHAKE_40/4_512", hashMap, ad(64, 16, 131, 40, 4, "SHAKE256"));
        AbstractC13501e.advert(29, "XMSSMT_SHAKE_40/8_512", hashMap, ad(64, 16, 131, 40, 8, "SHAKE256"));
        AbstractC13501e.advert(30, "XMSSMT_SHAKE_60/3_512", hashMap, ad(64, 16, 131, 60, 3, "SHAKE256"));
        AbstractC13501e.advert(31, "XMSSMT_SHAKE_60/6_512", hashMap, ad(64, 16, 131, 60, 6, "SHAKE256"));
        hashMap.put(ad(64, 16, 131, 60, 12, "SHAKE256"), new C14983e(32, "XMSSMT_SHAKE_60/12_512"));
        metrica = DesugarCollections.unmodifiableMap(hashMap);
    }

    public C14983e(int i, String str) {
        this.ad = i;
        this.vip = str;
    }

    public static String ad(int i, int i2, int i3, int i4, int i5, String str) {
        if (str == null) {
            throw new NullPointerException("algorithmName == null");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        sb.append("-");
        sb.append(i3);
        sb.append("-");
        sb.append(i4);
        return AbstractC8647e.isPro(i5, "-", sb);
    }

    public final String toString() {
        return this.vip;
    }
}
