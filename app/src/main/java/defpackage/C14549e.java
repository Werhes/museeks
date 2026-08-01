package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٔۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14549e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f28757e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f28758e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28759e;

    public /* synthetic */ C14549e(InterfaceC18435e interfaceC18435e, InterfaceC3314e interfaceC3314e, int i) {
        this.f28759e = i;
        this.f28758e = interfaceC18435e;
        this.f28757e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f28759e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                    InterfaceC18435e interfaceC18435e = this.f28758e;
                    boolean yandex = c13770e.yandex(interfaceC18435e);
                    InterfaceC3314e interfaceC3314e = this.f28757e;
                    boolean purchase = yandex | c13770e.purchase(interfaceC3314e);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == C2987e.ad) {
                        m3681throw = new Celse(interfaceC18435e, interfaceC3314e, 10);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC16429e.ad(AbstractC13482e.mopub, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, AbstractC13482e.advert, null, AbstractC16653e.license(-610687611, new C6949e(interfaceC18435e, interfaceC3314e, 8), c13770e), null, 0.0f, 0.0f, c13770e, 199686, 468);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    InterfaceC3314e interfaceC3314e2 = this.f28757e;
                    boolean z = ((C3230e) interfaceC3314e2.getValue()).f7360e;
                    InterfaceC18435e interfaceC18435e2 = this.f28758e;
                    boolean yandex2 = c13770e2.yandex(interfaceC18435e2) | c13770e2.purchase(interfaceC3314e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C9041e(interfaceC18435e2, interfaceC3314e2, 8);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    float f = 16;
                    AbstractC16565e.vip(z, (Function1) m3681throw2, AbstractC12220e.loadAd(AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7), c13770e2, 384);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
