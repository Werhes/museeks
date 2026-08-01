package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۘٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14193e {
    public static final C14193e vip = new C14193e(AbstractC18467e.license(new LinkedHashMap()));
    public final Map ad;

    public C14193e(Map map) {
        this.ad = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14193e) && AbstractC7890e.billing(this.ad, ((C14193e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.ad + ")";
    }
}
