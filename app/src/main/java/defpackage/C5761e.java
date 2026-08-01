package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٜۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5761e {
    public final C15421e ad;
    public final boolean appmetrica;
    public final C12395e license;
    public final C4980e metrica;
    public final Map purchase;
    public final C1223e vip;

    public /* synthetic */ C5761e(C15421e c15421e, C1223e c1223e, C4980e c4980e, C12395e c12395e, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : c15421e, (i & 2) != 0 ? null : c1223e, (i & 4) != 0 ? null : c4980e, (i & 8) != 0 ? null : c12395e, (i & 32) == 0, (i & 64) != 0 ? C9139e.f18290e : linkedHashMap);
    }

    public C5761e(C15421e c15421e, C1223e c1223e, C4980e c4980e, C12395e c12395e, boolean z, Map map) {
        this.ad = c15421e;
        this.vip = c1223e;
        this.metrica = c4980e;
        this.license = c12395e;
        this.appmetrica = z;
        this.purchase = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5761e)) {
            return false;
        }
        C5761e c5761e = (C5761e) obj;
        return AbstractC7890e.billing(this.ad, c5761e.ad) && AbstractC7890e.billing(this.vip, c5761e.vip) && AbstractC7890e.billing(this.metrica, c5761e.metrica) && AbstractC7890e.billing(this.license, c5761e.license) && this.appmetrica == c5761e.appmetrica && AbstractC7890e.billing(this.purchase, c5761e.purchase);
    }

    public final int hashCode() {
        C15421e c15421e = this.ad;
        int hashCode = (c15421e == null ? 0 : c15421e.hashCode()) * 31;
        C1223e c1223e = this.vip;
        int hashCode2 = (hashCode + (c1223e == null ? 0 : c1223e.hashCode())) * 31;
        C4980e c4980e = this.metrica;
        int hashCode3 = (hashCode2 + (c4980e == null ? 0 : c4980e.hashCode())) * 31;
        C12395e c12395e = this.license;
        return this.purchase.hashCode() + ((((hashCode3 + (c12395e != null ? c12395e.hashCode() : 0)) * 961) + (this.appmetrica ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.ad + ", slide=" + this.vip + ", changeSize=" + this.metrica + ", scale=" + this.license + ", veil=null, hold=" + this.appmetrica + ", effectsMap=" + this.purchase + ')';
    }
}
