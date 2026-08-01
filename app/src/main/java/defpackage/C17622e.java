package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17622e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f34535e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6512e f34536e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13119e f34537e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f34538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17622e(C13119e c13119e, InterfaceC6512e interfaceC6512e, Object obj, C2892e c2892e) {
        super(2);
        this.f34537e = c13119e;
        this.f34536e = interfaceC6512e;
        this.f34538e = obj;
        this.f34535e = c2892e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object startapp;
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Number) obj2).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
            C13119e c13119e = this.f34537e;
            boolean billing = c13119e.billing();
            C5170e c5170e = C2987e.ad;
            if (billing) {
                startapp = AbstractC13501e.startapp(c13770e, 1666827533, false, c13119e);
            } else {
                c13770e.m3676strictfp(1666573488);
                boolean purchase = c13770e.purchase(c13119e);
                startapp = c13770e.m3681throw();
                if (purchase || startapp == c5170e) {
                    AbstractC13717e adcel = AbstractC12640e.adcel();
                    Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
                    AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
                    try {
                        Object metrica = c13119e.metrica();
                        AbstractC12640e.Signature(adcel, smaato, appmetrica);
                        c13770e.m3682throws(metrica);
                        startapp = metrica;
                    } catch (Throwable th) {
                        AbstractC12640e.Signature(adcel, smaato, appmetrica);
                        throw th;
                    }
                }
                c13770e.Signature(false);
            }
            c13770e.m3676strictfp(1378811975);
            Object obj3 = this.f34538e;
            float f = AbstractC7890e.billing(startapp, obj3) ? 1.0f : 0.0f;
            c13770e.Signature(false);
            Float valueOf = Float.valueOf(f);
            boolean purchase2 = c13770e.purchase(c13119e);
            Object m3681throw = c13770e.m3681throw();
            if (purchase2 || m3681throw == c5170e) {
                m3681throw = AbstractC14533e.purchase(new C2000e(c13119e, 4));
                c13770e.m3682throws(m3681throw);
            }
            Object value = ((InterfaceC16132e) m3681throw).getValue();
            c13770e.m3676strictfp(1378811975);
            float f2 = AbstractC7890e.billing(value, obj3) ? 1.0f : 0.0f;
            c13770e.Signature(false);
            Float valueOf2 = Float.valueOf(f2);
            boolean purchase3 = c13770e.purchase(c13119e);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase3 || m3681throw2 == c5170e) {
                m3681throw2 = AbstractC14533e.purchase(new C2000e(c13119e, 5));
                c13770e.m3682throws(m3681throw2);
            }
            c13770e.m3676strictfp(955869654);
            c13770e.Signature(false);
            C11117e billing2 = AbstractC0207e.billing(c13119e, valueOf, valueOf2, this.f34536e, AbstractC9546e.ad, c13770e, 0);
            boolean purchase4 = c13770e.purchase(billing2);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase4 || m3681throw3 == c5170e) {
                m3681throw3 = new C17097e(14, billing2);
                c13770e.m3682throws(m3681throw3);
            }
            InterfaceC12864e yandex = AbstractC12546e.yandex(C0115e.f1276e, (Function1) m3681throw3);
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e, yandex);
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
            AbstractC2270e.appmetrica(c13770e, Integer.valueOf(i), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase5, C2721e.license);
            this.f34535e.invoke(obj3, c13770e, 0);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
