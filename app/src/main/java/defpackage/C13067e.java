package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13067e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f25999e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Exception f26000e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26001e = 1;

    public /* synthetic */ C13067e(Exception exc, Function0 function0) {
        this.f26000e = exc;
        this.f25999e = function0;
    }

    public /* synthetic */ C13067e(Exception exc, Function0 function0, int i) {
        this.f26000e = exc;
        this.f25999e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26001e) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC10558e.metrica(this.f26000e, this.f25999e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C14544e c14544e = C5438e.f11668e;
                    InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16, 0.0f, 2);
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, c14544e, c13770e, 48);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, smaato);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    Exception exc = this.f26000e;
                    boolean yandex = c13770e.yandex(exc);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C10479e(2, exc);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC1513e.license((Function0) m3681throw, null, false, null, null, null, AbstractC0882e.metrica, c13770e, 805306368, 510);
                    if (1.0f <= 0.0d) {
                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                    }
                    AbstractC17074e.ad(new C5228e(1.0f, true), c13770e, 0);
                    AbstractC1513e.ad(this.f25999e, null, false, null, null, null, null, null, AbstractC0882e.license, c13770e, 805306368, 510);
                    c13770e.Signature(true);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
