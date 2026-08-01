package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11773e extends AbstractC16858e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C5385e f23647e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f23648e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f23649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11773e(C5385e c5385e, InterfaceC3314e interfaceC3314e, int i) {
        super(2);
        this.f23648e = i;
        this.f23647e = c5385e;
        this.f23649e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f23648e;
        InterfaceC3314e interfaceC3314e = this.f23649e;
        C5385e c5385e = this.f23647e;
        int i2 = 0;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    Object m3681throw = c13770e.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (m3681throw == c5170e) {
                        m3681throw = C5430e.f11634e;
                        c13770e.m3682throws(m3681throw);
                    }
                    C18138e c18138e = new C18138e((Function1) m3681throw, false);
                    boolean yandex = c13770e.yandex(c5385e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex || m3681throw2 == c5170e) {
                        m3681throw2 = new C2155e(c5385e, 1);
                        c13770e.m3682throws(m3681throw2);
                    }
                    InterfaceC12864e ad = AbstractC1376e.ad(AbstractC6437e.vip(c18138e, (Function1) m3681throw2), c5385e.getCanCalculatePosition() ? 1.0f : 0.0f);
                    C5015e c5015e = AbstractC12710e.ad;
                    Function2 function2 = (Function2) interfaceC3314e.getValue();
                    Object m3681throw3 = c13770e.m3681throw();
                    if (m3681throw3 == c5170e) {
                        m3681throw3 = C3783e.metrica;
                        c13770e.m3682throws(m3681throw3);
                    }
                    InterfaceC2747e interfaceC2747e = (InterfaceC2747e) m3681throw3;
                    long j = c13770e.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, ad);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, interfaceC2747e, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    function2.invoke(c13770e, 0);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC1101e.ad(AbstractC12710e.vip.ad(Boolean.TRUE), AbstractC16653e.license(1022273628, new C11773e(c5385e, interfaceC3314e, i2), c13770e2), c13770e2, 56);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
