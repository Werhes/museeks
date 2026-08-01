package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14323e {
    public final InterfaceC8046e ad;
    public final C14911e metrica;
    public final C12973e vip;

    public C14323e(InterfaceC8046e interfaceC8046e, C12973e c12973e, C14911e c14911e, int i) {
        c12973e = (i & 2) != 0 ? null : c12973e;
        c14911e = (i & 64) != 0 ? null : c14911e;
        this.ad = interfaceC8046e;
        this.vip = c12973e;
        this.metrica = c14911e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14323e)) {
            return false;
        }
        C14323e c14323e = (C14323e) obj;
        return AbstractC7890e.billing(this.ad, c14323e.ad) && AbstractC7890e.billing(this.vip, c14323e.vip) && AbstractC7890e.billing(this.metrica, c14323e.metrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        C12973e c12973e = this.vip;
        int hashCode2 = (hashCode + (c12973e != null ? c12973e.hashCode() : 0)) * 28629151;
        C14911e c14911e = this.metrica;
        return hashCode2 + (c14911e != null ? c14911e.hashCode() : 0);
    }

    public final String toString() {
        return "TextStyle(color=" + this.ad + ", fontSize=" + this.vip + ", fontWeight=null, fontStyle=null, textDecoration=null, textAlign=null, fontFamily=" + this.metrica + ')';
    }
}
