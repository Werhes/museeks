package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۢ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8288e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C1374e f16961e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16904e f16962e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f16963e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16964e;

    public /* synthetic */ C8288e(C1374e c1374e, AbstractC16904e abstractC16904e, InterfaceC18435e interfaceC18435e) {
        this.f16964e = 2;
        this.f16961e = c1374e;
        this.f16962e = abstractC16904e;
        this.f16963e = interfaceC18435e;
    }

    public /* synthetic */ C8288e(AbstractC16904e abstractC16904e, C1374e c1374e, InterfaceC18435e interfaceC18435e, int i) {
        this.f16964e = i;
        this.f16962e = abstractC16904e;
        this.f16961e = c1374e;
        this.f16963e = interfaceC18435e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16964e;
        InterfaceC18435e interfaceC18435e = this.f16963e;
        AbstractC16904e abstractC16904e = this.f16962e;
        C1374e c1374e = this.f16961e;
        int i2 = 1;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C16005e c16005e = AbstractC9083e.ad;
                    AbstractC10560e.license(AbstractC16653e.license(1442820650, new C8288e(abstractC16904e, c1374e, interfaceC18435e, i2), c13770e), null, AbstractC16653e.license(626773420, new C11749e(c1374e), c13770e), AbstractC11575e.metrica, 0.0f, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).appmetrica(c13770e), AbstractC9083e.purchase(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.Signature, 0L, 0L, 0L, 0L, c13770e, 62), null, null, c13770e, 3462, 402);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC14924e.ad(16, 0.0f, ((C16330e) abstractC16904e.license.f17056e).purchase(), 918752256, C3618e.startapp, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.admob, C5438e.f11700e, AbstractC16653e.license(-665590852, new C0048e(abstractC16904e, i2), c13770e2), AbstractC11575e.ad, AbstractC16653e.license(-1755123617, new C8288e(c1374e, abstractC16904e, interfaceC18435e), c13770e2), c13770e2, AbstractC13328e.license(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), AbstractC13328e.appmetrica()), null);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    int i3 = 0;
                    for (Object obj3 : c1374e.f4168e) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC6874e.Signature();
                            throw null;
                        }
                        int intValue4 = ((Number) obj3).intValue();
                        boolean z = ((C16330e) abstractC16904e.license.f17056e).purchase() == i3;
                        long j = ((C7019e) c13770e3.adcel(AbstractC11785e.ad)).ad.ad;
                        long j2 = ((C3618e) c13770e3.adcel(AbstractC0608e.ad)).ad;
                        boolean yandex = c13770e3.yandex(interfaceC18435e) | c13770e3.purchase(abstractC16904e) | c13770e3.license(i3);
                        Object m3681throw = c13770e3.m3681throw();
                        if (yandex || m3681throw == C2987e.ad) {
                            m3681throw = new C15736e(interfaceC18435e, abstractC16904e, i3);
                            c13770e3.m3682throws(m3681throw);
                        }
                        AbstractC12843e.vip(z, (Function0) m3681throw, null, false, AbstractC16653e.license(-431782259, new C2172e(intValue4, 23, r6 ? (byte) 1 : (byte) 0), c13770e3), j, j2, c13770e3, 24576);
                        i3 = i4;
                    }
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
