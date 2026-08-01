package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3715e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5926e f8301e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8302e;

    public /* synthetic */ C3715e(C5926e c5926e, int i) {
        this.f8302e = i;
        this.f8301e = c5926e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C18236e c18236e;
        switch (this.f8302e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Number) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C5442e c5442e = this.f8301e.ad.admob;
                    AbstractC8636e.ad((c5442e == null || (c18236e = c5442e.appmetrica) == null) ? null : c18236e.purchase, 0, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.Signature, 0L, 0, 0.0f, false, null, null, null, c13770e, 0, 1018);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(interfaceC10799e) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    C5926e c5926e = this.f8301e;
                    AbstractC6401e.ad(interfaceC10799e, AbstractC16653e.license(-156241087, new C3129e(c5926e, 0), c13770e2), AbstractC16653e.license(1643584898, new C3129e(c5926e, 1), c13770e2), c13770e2, (intValue2 & 14) | 432);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
