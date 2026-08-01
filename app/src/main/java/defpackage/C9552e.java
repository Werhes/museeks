package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9552e {
    public final String ad;
    public final InterfaceC4402e vip;

    public C9552e(String str, InterfaceC4402e interfaceC4402e) {
        this.ad = str;
        this.vip = interfaceC4402e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9552e)) {
            return false;
        }
        C9552e c9552e = (C9552e) obj;
        return AbstractC7890e.billing(this.ad, c9552e.ad) && AbstractC7890e.billing(this.vip, c9552e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "WrappedTvCatalogEntry(id=" + this.ad + ", entry=" + this.vip + ')';
    }
}
