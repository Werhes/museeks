package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4293e implements InterfaceC15276e {
    public final C5782e ad;
    public final C5782e appmetrica;
    public final C5782e license;
    public final C5782e metrica;
    public final C5782e purchase;
    public final C5782e vip;

    public /* synthetic */ C4293e(C5782e c5782e, C5782e c5782e2, C5782e c5782e3, C5782e c5782e4) {
        this(new C5782e(3, 0.0f), c5782e, c5782e2, new C5782e(3, 0.0f), c5782e3, c5782e4);
    }

    public C4293e(C5782e c5782e, C5782e c5782e2, C5782e c5782e3, C5782e c5782e4, C5782e c5782e5, C5782e c5782e6) {
        this.ad = c5782e;
        this.vip = c5782e2;
        this.metrica = c5782e3;
        this.license = c5782e4;
        this.appmetrica = c5782e5;
        this.purchase = c5782e6;
    }

    @Override // defpackage.InterfaceC7189e
    public final Object appmetrica(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC7189e
    public final boolean billing(C17187e c17187e) {
        return ((Boolean) c17187e.invoke(this)).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4293e)) {
            return false;
        }
        C4293e c4293e = (C4293e) obj;
        return AbstractC7890e.billing(this.ad, c4293e.ad) && AbstractC7890e.billing(this.vip, c4293e.vip) && AbstractC7890e.billing(this.metrica, c4293e.metrica) && AbstractC7890e.billing(this.license, c4293e.license) && AbstractC7890e.billing(this.appmetrica, c4293e.appmetrica) && AbstractC7890e.billing(this.purchase, c4293e.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + ((this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC7189e
    public final /* synthetic */ InterfaceC7189e purchase(InterfaceC7189e interfaceC7189e) {
        return AbstractC0869e.mopub(this, interfaceC7189e);
    }

    public final String toString() {
        return "PaddingModifier(left=" + this.ad + ", start=" + this.vip + ", top=" + this.metrica + ", right=" + this.license + ", end=" + this.appmetrica + ", bottom=" + this.purchase + ')';
    }

    @Override // defpackage.InterfaceC7189e
    public final boolean yandex(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
