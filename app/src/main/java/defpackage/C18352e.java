package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۙۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18352e {
    public final String ad;
    public final C15926e vip;

    public C18352e(String str, C15926e c15926e) {
        this.ad = str;
        this.vip = c15926e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18352e)) {
            return false;
        }
        C18352e c18352e = (C18352e) obj;
        return AbstractC7890e.billing(this.ad, c18352e.ad) && AbstractC7890e.billing(this.vip, c18352e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.ad + ", range=" + this.vip + ')';
    }
}
