package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3045e implements InterfaceC2747e {
    public final InterfaceC0929e ad;

    public C3045e(InterfaceC0929e interfaceC0929e) {
        this.ad = interfaceC0929e;
    }

    @Override // defpackage.InterfaceC2747e
    public final int ad(InterfaceC0732e interfaceC0732e, List list, int i) {
        return this.ad.ad(interfaceC0732e, AbstractC8913e.purchase(interfaceC0732e), i);
    }

    @Override // defpackage.InterfaceC2747e
    public final int appmetrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return this.ad.appmetrica(interfaceC0732e, AbstractC8913e.purchase(interfaceC0732e), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3045e) && AbstractC7890e.billing(this.ad, ((C3045e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC2747e
    public final int license(InterfaceC0732e interfaceC0732e, List list, int i) {
        return this.ad.license(interfaceC0732e, AbstractC8913e.purchase(interfaceC0732e), i);
    }

    @Override // defpackage.InterfaceC2747e
    public final int metrica(InterfaceC0732e interfaceC0732e, List list, int i) {
        return this.ad.metrica(interfaceC0732e, AbstractC8913e.purchase(interfaceC0732e), i);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.ad + ')';
    }

    @Override // defpackage.InterfaceC2747e
    public final InterfaceC17242e vip(InterfaceC13158e interfaceC13158e, List list, long j) {
        return this.ad.vip(interfaceC13158e, AbstractC8913e.purchase(interfaceC13158e), j);
    }
}
