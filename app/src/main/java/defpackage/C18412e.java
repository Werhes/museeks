package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۠ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18412e implements InterfaceC16154e {
    public final InterfaceC3314e ad;
    public final InterfaceC16154e metrica;
    public final InterfaceC16154e vip;
    public final C17985e license = AbstractC11972e.ad();
    public final C17985e appmetrica = AbstractC11972e.ad();
    public final C17985e purchase = AbstractC11972e.ad();

    public C18412e(InterfaceC3314e interfaceC3314e, InterfaceC16154e interfaceC16154e, InterfaceC16154e interfaceC16154e2) {
        this.ad = interfaceC3314e;
        this.vip = interfaceC16154e;
        this.metrica = interfaceC16154e2;
    }

    @Override // defpackage.InterfaceC16154e
    public final AbstractC14073e ad(long j, EnumC7792e enumC7792e, InterfaceC14388e interfaceC14388e) {
        C17985e c17985e = this.license;
        c17985e.yandex();
        C17985e c17985e2 = this.appmetrica;
        c17985e2.yandex();
        C17985e c17985e3 = this.purchase;
        c17985e3.yandex();
        AbstractC14073e ad = this.vip.ad(j, enumC7792e, interfaceC14388e);
        AbstractC14073e ad2 = this.metrica.ad(j, enumC7792e, interfaceC14388e);
        if (ad instanceof C10435e) {
            c17985e.ad(((C10435e) ad).appmetrica, 0L);
        } else if (ad instanceof C2904e) {
            AbstractC1634e.license(c17985e, ((C2904e) ad).appmetrica);
        } else {
            if (!(ad instanceof C14340e)) {
                throw new C14803e(10);
            }
            AbstractC1634e.metrica(c17985e, ((C14340e) ad).appmetrica);
        }
        if (ad2 instanceof C10435e) {
            c17985e3.ad(((C10435e) ad2).appmetrica, 0L);
        } else if (ad2 instanceof C2904e) {
            AbstractC1634e.license(c17985e3, ((C2904e) ad2).appmetrica);
        } else {
            if (!(ad2 instanceof C14340e)) {
                throw new C14803e(10);
            }
            AbstractC1634e.metrica(c17985e3, ((C14340e) ad2).appmetrica);
        }
        c17985e3.mopub(((C6739e) this.ad.getValue()).ad);
        c17985e2.billing(c17985e, c17985e3, 2);
        return new C10435e(c17985e2);
    }
}
