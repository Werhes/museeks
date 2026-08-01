package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eٍؙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6452e {
    public static final Map vip;
    public final String ad;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ad(32, 67, "SHA-256"), new C6452e(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(ad(64, 131, "SHA-512"), new C6452e(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(ad(32, 67, "SHAKE128"), new C6452e(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(ad(64, 131, "SHAKE256"), new C6452e(67108868, "WOTSP_SHAKE256_W16"));
        vip = DesugarCollections.unmodifiableMap(hashMap);
    }

    public C6452e(int i, String str) {
        this.ad = str;
    }

    public static String ad(int i, int i2, String str) {
        return str + "-" + i + "-16-" + i2;
    }

    public final String toString() {
        return this.ad;
    }
}
