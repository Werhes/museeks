package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9560e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f18978e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f18979e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18980e;

    public /* synthetic */ C9560e(long j, InterfaceC12864e interfaceC12864e) {
        this.f18980e = 0;
        this.f18978e = j;
        this.f18979e = interfaceC12864e;
    }

    public /* synthetic */ C9560e(Object obj, long j, int i, int i2) {
        this.f18980e = i2;
        this.f18979e = obj;
        this.f18978e = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18980e) {
            case 0:
                InterfaceC12864e interfaceC12864e = (InterfaceC12864e) this.f18979e;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    long j = this.f18978e;
                    if (j != 9205357640488583168L) {
                        c13770e.m3676strictfp(-1244013944);
                        InterfaceC12864e yandex = AbstractC18007e.yandex(interfaceC12864e, C16109e.vip(j), C16109e.ad(j), 0.0f, 0.0f, 12);
                        InterfaceC2747e license = AbstractC17074e.license(C5438e.f11669e, false);
                        long j2 = c13770e.f27286case;
                        int i = (int) (j2 ^ (j2 >>> 32));
                        InterfaceC3483e advert = c13770e.advert();
                        InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, yandex);
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
                        AbstractC5805e.vip(0, 1, c13770e, null);
                        c13770e.Signature(true);
                        c13770e.Signature(false);
                    } else {
                        c13770e.m3676strictfp(-1243644858);
                        AbstractC5805e.vip(0, 0, c13770e, interfaceC12864e);
                        c13770e.Signature(false);
                    }
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC12864e interfaceC12864e2 = (InterfaceC12864e) this.f18979e;
                ((Integer) obj2).getClass();
                AbstractC15842e.appmetrica(AbstractC5190e.advert(3073), this.f18978e, (C13770e) obj, interfaceC12864e2);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC11148e.ad((InterfaceC14468e) this.f18979e, this.f18978e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
