package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15147e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f29976e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f29977e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29978e;

    public /* synthetic */ C15147e(Object obj, boolean z, int i) {
        this.f29978e = i;
        this.f29976e = obj;
        this.f29977e = z;
    }

    public /* synthetic */ C15147e(boolean z, Object obj, int i) {
        this.f29978e = i;
        this.f29977e = z;
        this.f29976e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.f29978e;
        C5170e c5170e = C2987e.ad;
        int i2 = 11;
        C0115e c0115e = C0115e.f1276e;
        int i3 = 4;
        boolean z = this.f29977e;
        Object obj4 = this.f29976e;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                C14623e c14623e = (C14623e) obj4;
                InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC10799e) ? 4 : 2;
                }
                if (!c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    c13770e.m3659default();
                } else if (c14623e.metrica != null) {
                    c13770e.m3676strictfp(345562349);
                    AbstractC6401e.ad(interfaceC10799e, AbstractC16653e.license(522963892, new C11213e(i2, c14623e), c13770e), AbstractC16653e.license(102844947, new C14674e(c14623e, z, i3), c13770e), c13770e, (14 & intValue) | 432);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(346904029);
                    AbstractC6401e.metrica(c14623e.vip, null, 0L, 0L, interfaceC10799e.ad(c0115e, 1.0f, true), c13770e, 48, 12);
                    c13770e.Signature(false);
                }
                return Unit.INSTANCE;
            case 1:
                C3566e c3566e = (C3566e) obj4;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (z) {
                        c13770e2.m3676strictfp(-1272428838);
                        boolean yandex = c13770e2.yandex(c3566e);
                        Object m3681throw = c13770e2.m3681throw();
                        if (yandex || m3681throw == c5170e) {
                            m3681throw = new C7604e(c3566e, 0);
                            c13770e2.m3682throws(m3681throw);
                        }
                        Function0 function0 = (Function0) m3681throw;
                        int i4 = C12563e.ad;
                        if (c3566e.f8041e.vip()) {
                            c13770e2.m3676strictfp(-1272175320);
                            j = ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.ad;
                            c13770e2.Signature(false);
                        } else {
                            c13770e2.m3676strictfp(-1272065146);
                            j = ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.admob;
                            c13770e2.Signature(false);
                        }
                        AbstractC0014e.metrica(function0, null, false, C12563e.purchase(j, c13770e2), null, null, AbstractC16653e.license(-555983464, new C9190e(c3566e, objArr == true ? 1 : 0), c13770e2), c13770e2, 1572864, 54);
                    } else {
                        c13770e2.m3676strictfp(-1289520719);
                    }
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                Function1 function1 = (Function1) obj4;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    InterfaceC12864e advert = AbstractC12220e.advert(c0115e, 20, 14);
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e3, 0);
                    long j2 = c13770e3.f27286case;
                    int i5 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e3.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e3, advert);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e3, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i5), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e3, purchase, C2721e.license);
                    boolean z2 = this.f29977e;
                    String appmetrica = AbstractC5297e.appmetrica(c13770e3, z2 ? R.string.eq3_enabled : R.string.eq3_disabled);
                    C15492e c15492e = AbstractC11785e.ad;
                    long j3 = ((C7019e) c13770e3.adcel(c15492e)).ad.tapsense;
                    long startapp = AbstractC13362e.startapp(20);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 0.85f);
                    C14544e c14544e = C5438e.f11668e;
                    AbstractC14489e.vip(appmetrica, metrica.premium(new C8388e(c14544e)), j3, startapp, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 24576, 0, 262120);
                    long vip = C3618e.vip(0.5f, ((C7019e) c13770e3.adcel(c15492e)).ad.Signature);
                    long j4 = ((C7019e) c13770e3.adcel(c15492e)).ad.ad;
                    long j5 = C3618e.startapp;
                    float f = AbstractC14463e.ad;
                    C4950e c4950e = new C4950e(j4, vip, j5, AbstractC7893e.appmetrica(c13770e3, 11), AbstractC7893e.appmetrica(c13770e3, 24), AbstractC7893e.appmetrica(c13770e3, 39), AbstractC7893e.appmetrica(c13770e3, 24), AbstractC7893e.appmetrica(c13770e3, 39), AbstractC6532e.billing(C3618e.vip(1.0f, AbstractC7893e.appmetrica(c13770e3, 35)), ((C7019e) c13770e3.adcel(c15492e)).ad.Signature), AbstractC6532e.billing(C3618e.vip(0.12f, AbstractC7893e.appmetrica(c13770e3, 18)), ((C7019e) c13770e3.adcel(c15492e)).ad.Signature), j5, AbstractC6532e.billing(C3618e.vip(0.38f, AbstractC7893e.appmetrica(c13770e3, 18)), ((C7019e) c13770e3.adcel(c15492e)).ad.Signature), AbstractC6532e.billing(C3618e.vip(0.38f, AbstractC7893e.appmetrica(c13770e3, 18)), ((C7019e) c13770e3.adcel(c15492e)).ad.Signature), AbstractC6532e.billing(C3618e.vip(0.12f, AbstractC7893e.appmetrica(c13770e3, 39)), ((C7019e) c13770e3.adcel(c15492e)).ad.Signature), AbstractC6532e.billing(C3618e.vip(0.12f, AbstractC7893e.appmetrica(c13770e3, 18)), ((C7019e) c13770e3.adcel(c15492e)).ad.Signature), AbstractC6532e.billing(C3618e.vip(0.38f, AbstractC7893e.appmetrica(c13770e3, 39)), ((C7019e) c13770e3.adcel(c15492e)).ad.Signature));
                    InterfaceC12864e premium = AbstractC18007e.metrica(c0115e, 1.0f).premium(new C8388e(c14544e));
                    boolean purchase2 = c13770e3.purchase(function1);
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (purchase2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C2046e(6, function1);
                        c13770e3.m3682throws(m3681throw2);
                    }
                    AbstractC8844e.ad(z2, (Function1) m3681throw2, premium, false, c4950e, c13770e3, 0, 88);
                    c13770e3.Signature(true);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C11200e c11200e = (C11200e) obj4;
                InterfaceC10648e interfaceC10648e = (InterfaceC10648e) obj;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= c13770e4.purchase(interfaceC10648e) ? 4 : 2;
                }
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 19) != 18)) {
                    C17194e.ad.ad(c11200e, this.f29977e, interfaceC10648e.ad(c0115e, C5438e.f11669e), 0L, 0L, 0.0f, c13770e4, 1572864);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            default:
                AbstractC2832e admob = ((InterfaceC16719e) obj2).admob(((C5602e) obj3).ad);
                return ((InterfaceC13158e) obj).ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C3778e((InterfaceC16132e) obj4, z, admob));
        }
    }
}
