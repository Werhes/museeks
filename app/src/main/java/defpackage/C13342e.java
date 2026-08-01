package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eْٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13342e {
    public static final Map metrica;
    public final int ad;
    public final String vip;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ad("SHA-256", 32, 16, 67, 10), new C13342e(1, "XMSS_SHA2_10_256"));
        hashMap.put(ad("SHA-256", 32, 16, 67, 16), new C13342e(2, "XMSS_SHA2_16_256"));
        hashMap.put(ad("SHA-256", 32, 16, 67, 20), new C13342e(3, "XMSS_SHA2_20_256"));
        hashMap.put(ad("SHA-512", 64, 16, 131, 10), new C13342e(4, "XMSS_SHA2_10_512"));
        hashMap.put(ad("SHA-512", 64, 16, 131, 16), new C13342e(5, "XMSS_SHA2_16_512"));
        hashMap.put(ad("SHA-512", 64, 16, 131, 20), new C13342e(6, "XMSS_SHA2_20_512"));
        hashMap.put(ad("SHAKE128", 32, 16, 67, 10), new C13342e(7, "XMSS_SHAKE_10_256"));
        hashMap.put(ad("SHAKE128", 32, 16, 67, 16), new C13342e(8, "XMSS_SHAKE_16_256"));
        hashMap.put(ad("SHAKE128", 32, 16, 67, 20), new C13342e(9, "XMSS_SHAKE_20_256"));
        hashMap.put(ad("SHAKE256", 64, 16, 131, 10), new C13342e(10, "XMSS_SHAKE_10_512"));
        hashMap.put(ad("SHAKE256", 64, 16, 131, 16), new C13342e(11, "XMSS_SHAKE_16_512"));
        hashMap.put(ad("SHAKE256", 64, 16, 131, 20), new C13342e(12, "XMSS_SHAKE_20_512"));
        metrica = DesugarCollections.unmodifiableMap(hashMap);
    }

    public C13342e(int i, String str) {
        this.ad = i;
        this.vip = str;
    }

    public static String ad(String str, int i, int i2, int i3, int i4) {
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4;
    }

    public final String toString() {
        return this.vip;
    }
}
