package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18322e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5769e f35977e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35978e;

    public /* synthetic */ C18322e(C5769e c5769e, int i) {
        this.f35978e = i;
        this.f35977e = c5769e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f35978e;
        C5769e c5769e = this.f35977e;
        int i2 = 1;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    AbstractC0865e.ad(null, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.license, null, null, null, AbstractC16653e.license(2140152408, new C18322e(c5769e, i2), c13770e), c13770e, 196608, 29);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    float f = AbstractC11992e.ad;
                    C8872e ad = AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e2, 510);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                    boolean yandex = c13770e2.yandex(c5769e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C0322e(c5769e, 0);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC16429e.ad(AbstractC13281e.appmetrica, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, AbstractC13281e.purchase, AbstractC13281e.billing, ad, 0.0f, 0.0f, c13770e2, 221190, 396);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
