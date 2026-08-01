package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11943e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f23924e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23925e;

    public /* synthetic */ C11943e(long j, int i) {
        this.f23925e = i;
        this.f23924e = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f23925e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                ((Integer) obj3).getClass();
                AbstractC2937e.yandex(this.f23924e, c13770e);
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == C2987e.ad) {
                    m3681throw = AbstractC14533e.startapp(null);
                    c13770e.m3682throws(m3681throw);
                }
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
                InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
                long j = c13770e.f27286case;
                int i = (int) (j ^ (j >>> 32));
                InterfaceC3483e advert = c13770e.advert();
                InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, C0115e.f1276e);
                InterfaceC5685e.mopub.getClass();
                C7309e c7309e = C2721e.vip;
                c13770e.m3666import();
                if (c13770e.f27292implements) {
                    c13770e.mopub(c7309e);
                } else {
                    c13770e.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e, license, C2721e.billing);
                AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                AbstractC2270e.purchase(c13770e, C2721e.mopub);
                AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                Function2 function2 = (Function2) interfaceC3314e.getValue();
                if (function2 == null) {
                    c13770e.m3676strictfp(-1624120968);
                } else {
                    c13770e.m3676strictfp(-52390999);
                    function2.invoke(c13770e, 0);
                }
                c13770e.Signature(false);
                c13770e.Signature(true);
                return Unit.INSTANCE;
            default:
                C18362e c18362e = (C18362e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e2.purchase(c18362e) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    C15492e c15492e = AbstractC3577e.ad;
                    AbstractC0839e.metrica(c18362e, null, null, this.f23924e, ((C0896e) c13770e2.adcel(c15492e)).vip, ((C0896e) c13770e2.adcel(c15492e)).ad, ((C0896e) c13770e2.adcel(c15492e)).ad, ((C0896e) c13770e2.adcel(c15492e)).vip, c13770e2, intValue & 14, 14);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
