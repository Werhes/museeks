package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13714e extends AbstractC3370e {
    public final C3168e vip = new C3168e(new C16728e(7));
    public static final C9265e metrica = AbstractC10510e.purchase(2, false, null, 5).vip(3);
    public static final C9265e license = AbstractC10510e.purchase(2, false, null, 5).vip(2);

    public final C6571e billing(AbstractC10226e abstractC10226e, InterfaceC5052e interfaceC5052e, C9265e c9265e) {
        if (abstractC10226e.loadAd().getParameters().isEmpty()) {
            return new C6571e(abstractC10226e, Boolean.FALSE);
        }
        if (AbstractC13270e.isPro(abstractC10226e)) {
            AbstractC16232e abstractC16232e = (AbstractC16232e) abstractC10226e.mopub().get(0);
            return new C6571e(AbstractC1596e.license(abstractC10226e.smaato(), abstractC10226e.loadAd(), Collections.singletonList(new C7878e(abstractC16232e.ad(), yandex(abstractC16232e.vip(), c9265e))), abstractC10226e.Signature()), Boolean.FALSE);
        }
        if (AbstractC4520e.purchase(abstractC10226e)) {
            return new C6571e(C18139e.vip(EnumC16799e.f32910e, abstractC10226e.loadAd().toString()), Boolean.FALSE);
        }
        InterfaceC8528e mo1721e = interfaceC5052e.mo1721e(this);
        C6557e smaato = abstractC10226e.smaato();
        InterfaceC5021e mo1459goto = interfaceC5052e.mo1459goto();
        List<InterfaceC16046e> parameters = interfaceC5052e.mo1459goto().getParameters();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(parameters, 10));
        for (InterfaceC16046e interfaceC16046e : parameters) {
            arrayList.add(C16728e.smaato(interfaceC16046e, c9265e, this.vip.m1248e(interfaceC16046e, c9265e)));
        }
        return new C6571e(AbstractC1596e.purchase(smaato, mo1459goto, arrayList, abstractC10226e.Signature(), mo1721e, new C12857e(interfaceC5052e, this, abstractC10226e, c9265e)), Boolean.TRUE);
    }

    @Override // defpackage.AbstractC3370e
    public final AbstractC16232e license(AbstractC1186e abstractC1186e) {
        return new C7878e(yandex(abstractC1186e, new C9265e(2, false, false, null, 62)));
    }

    public final AbstractC1186e yandex(AbstractC1186e abstractC1186e, C9265e c9265e) {
        InterfaceC4077e advert = abstractC1186e.loadAd().advert();
        if (advert instanceof InterfaceC16046e) {
            c9265e.getClass();
            return yandex(this.vip.m1248e((InterfaceC16046e) advert, C9265e.ad(c9265e, 0, true, null, null, 59)), c9265e);
        }
        if (!(advert instanceof InterfaceC5052e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + advert).toString());
        }
        InterfaceC4077e advert2 = AbstractC9600e.license(abstractC1186e).loadAd().advert();
        if (advert2 instanceof InterfaceC5052e) {
            C6571e billing = billing(AbstractC9600e.metrica(abstractC1186e), (InterfaceC5052e) advert, metrica);
            AbstractC10226e abstractC10226e = (AbstractC10226e) billing.f13544e;
            boolean booleanValue = ((Boolean) billing.f13543e).booleanValue();
            C6571e billing2 = billing(AbstractC9600e.license(abstractC1186e), (InterfaceC5052e) advert2, license);
            AbstractC10226e abstractC10226e2 = (AbstractC10226e) billing2.f13544e;
            return (booleanValue || ((Boolean) billing2.f13543e).booleanValue()) ? new C13902e(abstractC10226e, abstractC10226e2, 0) : AbstractC1596e.ad(abstractC10226e, abstractC10226e2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + advert2 + "\" while for lower it's \"" + advert + '\"').toString());
    }
}
