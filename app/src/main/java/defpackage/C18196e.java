package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18196e {
    public final C17333e ad;
    public final C17424e vip;

    public C18196e(C17333e c17333e, C17424e c17424e) {
        this.ad = c17333e;
        this.vip = c17424e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18196e)) {
            return false;
        }
        C18196e c18196e = (C18196e) obj;
        return AbstractC7890e.billing(this.ad, c18196e.ad) && AbstractC7890e.billing(this.vip, c18196e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "IacAuthSession(tag=" + this.ad + ", handle=" + this.vip + ')';
    }
}
