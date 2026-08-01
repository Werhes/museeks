package defpackage;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10282e {
    public final SharedPreferences ad;
    public final Set vip;

    public C10282e(SharedPreferences sharedPreferences, Set set) {
        this.ad = sharedPreferences;
        this.vip = set;
    }

    public final void ad(String str) {
        Set set = this.vip;
        if (set != null && !set.contains(str)) {
            throw new IllegalStateException("Can't access key outside migration: ".concat(str).toString());
        }
    }

    public final boolean metrica(String str, boolean z) {
        ad(str);
        return this.ad.getBoolean(str, z);
    }

    public final LinkedHashMap vip() {
        Map<String, ?> all = this.ad.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.vip;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC10064e.appmetrica(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = AbstractC13480e.m3582e((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }
}
