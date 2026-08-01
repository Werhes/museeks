package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10452e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f20640e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14564e f20641e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20642e;

    public /* synthetic */ C10452e(C14564e c14564e, InterfaceC16132e interfaceC16132e, int i) {
        this.f20642e = i;
        this.f20641e = c14564e;
        this.f20640e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f20642e) {
            case 0:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    C13964e billing = AbstractC16497e.billing(8);
                    InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), 16, 0.0f, 2);
                    C14564e c14564e = this.f20641e;
                    boolean yandex = c13770e.yandex(c14564e);
                    InterfaceC16132e interfaceC16132e = this.f20640e;
                    boolean purchase = yandex | c13770e.purchase(interfaceC16132e);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == C2987e.ad) {
                        m3681throw = new C10869e(c14564e, interfaceC16132e, 25);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(smaato, null, null, billing, null, null, false, null, (Function1) m3681throw, c13770e, 24576, 494);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C18055e c18055e = (C18055e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(c18055e) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    InterfaceC16132e interfaceC16132e2 = this.f20640e;
                    this.f20641e.m3826package(((C3230e) interfaceC16132e2.getValue()).f7360e, ((C3230e) interfaceC16132e2.getValue()).f7359e, AbstractC8703e.mopub(c18055e, C0115e.f1276e), c13770e2, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
