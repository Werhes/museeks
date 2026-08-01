package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7826e implements InterfaceC10306e {
    public final Object ad;
    public final C13391e appmetrica;
    public final C6156e billing;
    public final C11898e license;
    public final Object metrica;
    public final C16722e purchase;
    public final String vip;

    public C7826e(Object obj, String str, Object obj2, C11898e c11898e, C13391e c13391e, C16722e c16722e, C6156e c6156e) {
        this.ad = obj;
        this.vip = str;
        this.metrica = obj2;
        this.license = c11898e;
        this.appmetrica = c13391e;
        this.purchase = c16722e;
        this.billing = c6156e;
    }

    @Override // defpackage.InterfaceC10306e
    public final Object ad() {
        return this.metrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7826e)) {
            return false;
        }
        C7826e c7826e = (C7826e) obj;
        return AbstractC7890e.billing(this.ad, c7826e.ad) && AbstractC7890e.billing(this.vip, c7826e.vip) && AbstractC7890e.billing(this.metrica, c7826e.metrica) && this.license.equals(c7826e.license) && this.appmetrica.equals(c7826e.appmetrica) && this.purchase.equals(c7826e.purchase) && this.billing.equals(c7826e.billing);
    }

    @Override // defpackage.InterfaceC10306e
    public final String getKey() {
        return this.vip;
    }

    public final int hashCode() {
        return this.billing.hashCode() + ((this.purchase.hashCode() + ((this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC10306e
    public final Object metrica() {
        return this.ad;
    }

    public final String toString() {
        return "Created(configuration=" + this.ad + ", key=" + this.vip + ", instance=" + this.metrica + ", lifecycleRegistry=" + this.license + ", stateKeeperDispatcher=" + this.appmetrica + ", instanceKeeperDispatcher=" + this.purchase + ", backHandler=" + this.billing + ')';
    }

    @Override // defpackage.InterfaceC10306e
    public final C16722e vip() {
        return this.purchase;
    }
}
