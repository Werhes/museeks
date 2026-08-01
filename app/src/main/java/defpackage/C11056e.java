package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11056e {
    public final String ad;
    public final Map vip;

    public C11056e(String str, Map map) {
        this.ad = str;
        this.vip = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11056e)) {
            return false;
        }
        C11056e c11056e = (C11056e) obj;
        return AbstractC7890e.billing(this.ad, c11056e.ad) && AbstractC7890e.billing(this.vip, c11056e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "@" + this.ad + '(' + AbstractC13480e.m3608try(AbstractC10064e.adcel(this.vip), null, null, null, C7247e.f14826e, 31) + ')';
    }
}
