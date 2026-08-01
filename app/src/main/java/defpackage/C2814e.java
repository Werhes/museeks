package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2814e {
    public final String ad;
    public final Map vip;

    public C2814e(String str, Map map) {
        this.ad = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            linkedHashMap.put(str2 != null ? str2.toLowerCase(Locale.US) : null, (String) entry.getValue());
        }
        this.vip = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2814e)) {
            return false;
        }
        C2814e c2814e = (C2814e) obj;
        return AbstractC7890e.billing(c2814e.ad, this.ad) && AbstractC7890e.billing(c2814e.vip, this.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + AbstractC1786e.advert(899, 31, this.ad);
    }

    public final String toString() {
        return this.ad + " authParams=" + this.vip;
    }
}
