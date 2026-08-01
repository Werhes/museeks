package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۨۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1499e {
    public final Map ad;
    public final Map vip;

    public C1499e(Map map, Map map2) {
        this.ad = map;
        this.vip = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1499e)) {
            return false;
        }
        C1499e c1499e = (C1499e) obj;
        return AbstractC7890e.billing(this.ad, c1499e.ad) && AbstractC7890e.billing(this.vip, c1499e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "State(receiverToProviderName=" + this.ad + ", providerNameToReceivers=" + this.vip + ')';
    }
}
