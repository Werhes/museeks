package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1631e extends AbstractC6986e {
    public final Object ad;
    public final String metrica;
    public final Object vip;

    public C1631e(Object obj, Object obj2, String str) {
        this.ad = obj;
        this.vip = obj2;
        this.metrica = str;
    }

    @Override // defpackage.AbstractC6986e
    public final Object ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1631e)) {
            return false;
        }
        C1631e c1631e = (C1631e) obj;
        return AbstractC7890e.billing(this.ad, c1631e.ad) && AbstractC7890e.billing(this.vip, c1631e.vip) && AbstractC7890e.billing(this.metrica, c1631e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31);
    }

    @Override // defpackage.AbstractC6986e
    public final String metrica() {
        return this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Created(configuration=");
        sb.append(this.ad);
        sb.append(", instance=");
        sb.append(this.vip);
        sb.append(", key=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }

    @Override // defpackage.AbstractC6986e
    public final Object vip() {
        return this.vip;
    }
}
