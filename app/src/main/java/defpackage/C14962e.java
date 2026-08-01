package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۛٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14962e extends AbstractC6986e {
    public final Object ad;
    public final String vip;

    public C14962e(Object obj, String str) {
        this.ad = obj;
        this.vip = str;
    }

    @Override // defpackage.AbstractC6986e
    public final Object ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14962e)) {
            return false;
        }
        C14962e c14962e = (C14962e) obj;
        return AbstractC7890e.billing(this.ad, c14962e.ad) && AbstractC7890e.billing(this.vip, c14962e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    @Override // defpackage.AbstractC6986e
    public final String metrica() {
        return this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Destroyed(configuration=");
        sb.append(this.ad);
        sb.append(", key=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }

    @Override // defpackage.AbstractC6986e
    public final /* bridge */ /* synthetic */ Object vip() {
        return null;
    }
}
