package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16232e implements InterfaceC0023e {
    public abstract int ad();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC16232e)) {
            return false;
        }
        AbstractC16232e abstractC16232e = (AbstractC16232e) obj;
        return metrica() == abstractC16232e.metrica() && ad() == abstractC16232e.ad() && vip().equals(abstractC16232e.vip());
    }

    public final int hashCode() {
        int m2467class = AbstractC8703e.m2467class(ad());
        if (AbstractC11957e.advert(vip())) {
            return (m2467class * 31) + 19;
        }
        return (m2467class * 31) + (metrica() ? 17 : vip().hashCode());
    }

    public abstract AbstractC16232e license(C13520e c13520e);

    public abstract boolean metrica();

    public final String toString() {
        if (metrica()) {
            return "*";
        }
        if (ad() == 1) {
            return vip().toString();
        }
        return AbstractC8647e.m2461throw(ad()) + " " + vip();
    }

    public abstract AbstractC1186e vip();
}
