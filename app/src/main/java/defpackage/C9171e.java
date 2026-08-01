package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9171e {
    public static final C9171e vip = new C9171e(AbstractC10064e.advert(new LinkedHashMap()));
    public final Map ad;

    public C9171e(Map map) {
        this.ad = map;
    }

    public final String ad() {
        List list = (List) this.ad.get("Content-Type".toLowerCase(Locale.ROOT));
        if (list != null) {
            return (String) AbstractC13480e.m3569abstract(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9171e) && AbstractC7890e.billing(this.ad, ((C9171e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.ad + ")";
    }
}
