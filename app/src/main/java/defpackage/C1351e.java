package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒ۟ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1351e extends AbstractC3370e {
    public final boolean license;
    public final AbstractC16232e[] metrica;
    public final InterfaceC16046e[] vip;

    public C1351e(InterfaceC16046e[] interfaceC16046eArr, AbstractC16232e[] abstractC16232eArr, boolean z) {
        this.vip = interfaceC16046eArr;
        this.metrica = abstractC16232eArr;
        this.license = z;
    }

    @Override // defpackage.AbstractC3370e
    public final boolean appmetrica() {
        return this.metrica.length == 0;
    }

    @Override // defpackage.AbstractC3370e
    public final AbstractC16232e license(AbstractC1186e abstractC1186e) {
        InterfaceC4077e advert = abstractC1186e.loadAd().advert();
        InterfaceC16046e interfaceC16046e = advert instanceof InterfaceC16046e ? (InterfaceC16046e) advert : null;
        if (interfaceC16046e != null) {
            int index = interfaceC16046e.getIndex();
            InterfaceC16046e[] interfaceC16046eArr = this.vip;
            if (index < interfaceC16046eArr.length && AbstractC7890e.billing(interfaceC16046eArr[index].mo1459goto(), interfaceC16046e.mo1459goto())) {
                return this.metrica[index];
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC3370e
    public final boolean vip() {
        return this.license;
    }
}
