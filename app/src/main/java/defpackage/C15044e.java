package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۢ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15044e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f29808e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f29809e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f29810e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f29811e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f29812e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29813e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f29814e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f29815e;

    public /* synthetic */ C15044e(C2892e c2892e, C2892e c2892e2, InterfaceC12864e interfaceC12864e, C2892e c2892e3, Function2 function2, C10405e c10405e, C15274e c15274e, int i) {
        this.f29809e = c2892e;
        this.f29812e = c2892e2;
        this.f29810e = interfaceC12864e;
        this.f29808e = c2892e3;
        this.f29815e = function2;
        this.f29814e = c10405e;
        this.f29811e = c15274e;
    }

    public /* synthetic */ C15044e(InterfaceC12864e interfaceC12864e, C13389e c13389e, InterfaceC3314e interfaceC3314e, C6260e c6260e, C6260e c6260e2, C4993e c4993e, InterfaceC3314e interfaceC3314e2) {
        this.f29810e = interfaceC12864e;
        this.f29809e = c13389e;
        this.f29812e = interfaceC3314e;
        this.f29808e = c6260e;
        this.f29815e = c6260e2;
        this.f29814e = c4993e;
        this.f29811e = interfaceC3314e2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29813e) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC12546e.vip((C2892e) this.f29809e, (C2892e) this.f29812e, this.f29810e, (C2892e) this.f29808e, (Function2) this.f29815e, (C10405e) this.f29814e, (C15274e) this.f29811e, (C13770e) obj, AbstractC5190e.advert(3511));
                return Unit.INSTANCE;
            default:
                C13389e c13389e = (C13389e) this.f29809e;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f29812e;
                C6260e c6260e = (C6260e) this.f29808e;
                C6260e c6260e2 = (C6260e) this.f29815e;
                C4993e c4993e = (C4993e) this.f29814e;
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) this.f29811e;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    int ordinal = ((EnumC7481e) interfaceC16132e.getValue()).ordinal();
                    InterfaceC12864e interfaceC12864e = this.f29810e;
                    if (ordinal == 0) {
                        c13770e.m3676strictfp(-1917026758);
                        InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
                        long j = c13770e.f27286case;
                        int i = (int) (j ^ (j >>> 32));
                        InterfaceC3483e advert = c13770e.advert();
                        InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
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
                        AbstractC6574e.ad(null, ((C6032e) c13770e.adcel(AbstractC12491e.ad)).billing(), 0.0f, 0L, 0, 0.0f, c13770e, 0, 61);
                        c13770e.Signature(true);
                        c13770e.Signature(false);
                    } else if (ordinal == 1) {
                        c13770e.m3676strictfp(-1916728042);
                        c13770e.Signature(false);
                    } else {
                        if (ordinal != 2) {
                            throw AbstractC1786e.loadAd(907991328, c13770e, false);
                        }
                        c13770e.m3676strictfp(-1916648248);
                        AbstractC0487e.vip(c13389e.purchase, interfaceC12864e, AbstractC16653e.license(-548641699, new C6409e(c6260e, c6260e2, c4993e, interfaceC16132e2, 1), c13770e), c13770e, 384);
                        c13770e.Signature(false);
                    }
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
