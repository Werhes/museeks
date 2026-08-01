package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؐٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7639e {
    public final LinkedHashMap ad;

    public C7639e(LinkedHashMap linkedHashMap) {
        this.ad = linkedHashMap;
    }

    public final C7639e ad() {
        LinkedHashMap linkedHashMap = this.ad;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC10064e.appmetrica(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C10796e c10796e = (C10796e) entry.getValue();
            linkedHashMap2.put(key, new C10796e(c10796e.ad, c10796e.vip, c10796e.metrica, true));
        }
        return new C7639e(linkedHashMap2);
    }
}
