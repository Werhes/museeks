package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۜؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12755e {
    public final Object ad;
    public final InterfaceC12732e metrica;
    public final C16401e vip;

    public C12755e(Object obj, C16401e c16401e, InterfaceC12732e interfaceC12732e) {
        this.ad = obj;
        this.vip = c16401e;
        this.metrica = interfaceC12732e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12755e)) {
            return false;
        }
        C12755e c12755e = (C12755e) obj;
        C16401e c16401e = c12755e.vip;
        C16401e c16401e2 = this.vip;
        return AbstractC7890e.billing(c16401e2, c16401e) && c16401e2.ad(this.ad, c12755e.ad) && AbstractC7890e.billing(this.metrica, c12755e.metrica);
    }

    public final int hashCode() {
        C16401e c16401e = this.vip;
        return this.metrica.hashCode() + ((c16401e.vip(this.ad) + (c16401e.hashCode() * 31)) * 31);
    }
}
