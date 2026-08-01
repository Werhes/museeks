package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۧۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12911e {
    public final C7228e ad;
    public final C2335e metrica = AbstractC11263e.Signature();
    public final C7228e vip;

    public C12911e(C7228e c7228e, C7228e c7228e2) {
        this.ad = c7228e;
        this.vip = c7228e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C12911e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C12911e c12911e = (C12911e) obj;
        if (!this.ad.equals(c12911e.ad) || !this.vip.equals(c12911e.vip)) {
            return false;
        }
        C2614e c2614e = C2614e.ad;
        return c2614e.equals(c2614e) && AbstractC7890e.billing(this.metrica, c12911e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((((this.vip.ad.hashCode() + (this.ad.ad.hashCode() * 31)) * 31) + 107738481) * 31);
    }
}
