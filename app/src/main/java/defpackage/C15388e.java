package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15388e {
    public final C13935e ad;
    public C18217e license;
    public final Set metrica;
    public final Map vip;

    public /* synthetic */ C15388e(C13935e c13935e, LinkedHashMap linkedHashMap, C18217e c18217e, int i) {
        this((i & 1) != 0 ? new C13935e(5) : c13935e, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i & 8) != 0 ? null : c18217e);
    }

    public C15388e(C13935e c13935e, Map map, Set set, C18217e c18217e) {
        this.ad = c13935e;
        this.vip = map;
        this.metrica = set;
        this.license = c18217e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15388e)) {
            return false;
        }
        C15388e c15388e = (C15388e) obj;
        return AbstractC7890e.billing(this.ad, c15388e.ad) && AbstractC7890e.billing(this.vip, c15388e.vip) && AbstractC7890e.billing(this.metrica, c15388e.metrica) && AbstractC7890e.billing(this.license, c15388e.license);
    }

    public final int hashCode() {
        int hashCode = (this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31;
        C18217e c18217e = this.license;
        return hashCode + (c18217e == null ? 0 : c18217e.ad);
    }

    public final String toString() {
        return "InfoBundle(options=" + this.ad + ", tags=" + this.vip + ", listeners=" + this.metrica + ", template=" + this.license + ')';
    }
}
