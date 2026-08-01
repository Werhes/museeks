package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2511e extends C4707e {
    public final C7784e advert;
    public final C5363e smaato;

    public C2511e(String str, int i) {
        super(str, null, i);
        this.advert = C7784e.appmetrica;
        this.smaato = new C5363e(new C15736e(i, str, this, 1));
    }

    @Override // defpackage.C4707e, defpackage.InterfaceC9998e
    public final InterfaceC9998e adcel(int i) {
        return ((InterfaceC9998e[]) this.smaato.getValue())[i];
    }

    @Override // defpackage.C4707e, defpackage.InterfaceC9998e
    public final AbstractC8457e appmetrica() {
        return this.advert;
    }

    @Override // defpackage.C4707e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InterfaceC9998e)) {
            return false;
        }
        InterfaceC9998e interfaceC9998e = (InterfaceC9998e) obj;
        return interfaceC9998e.appmetrica() == C7784e.appmetrica && AbstractC7890e.billing(this.ad, interfaceC9998e.ad()) && AbstractC7890e.billing(AbstractC14161e.ad(this), AbstractC14161e.ad(interfaceC9998e));
    }

    @Override // defpackage.C4707e
    public final int hashCode() {
        int hashCode = this.ad.hashCode();
        C1630e c1630e = new C1630e(this);
        int i = 1;
        while (c1630e.hasNext()) {
            int i2 = i * 31;
            String str = (String) c1630e.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // defpackage.C4707e
    public final String toString() {
        return AbstractC13480e.m3608try(new C8950e(3, this), ", ", AbstractC4653e.applovin(new StringBuilder(), this.ad, '('), ")", null, 56);
    }
}
