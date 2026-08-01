package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10130e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f20033e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2566e f20034e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20035e;

    public /* synthetic */ C10130e(C5958e c5958e, C0764e c0764e, int i) {
        this.f20035e = i;
        this.f20034e = c5958e;
        this.f20033e = c0764e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f20035e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    InterfaceC12864e license = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), this.f20034e.ad(), null);
                    InterfaceC3314e interfaceC3314e = this.f20033e;
                    boolean purchase = c13770e.purchase(interfaceC3314e);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == C2987e.ad) {
                        m3681throw = new C9214e(interfaceC3314e, 8);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(license, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 510);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    InterfaceC12864e license2 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), this.f20034e.ad(), null);
                    InterfaceC3314e interfaceC3314e2 = this.f20033e;
                    boolean purchase2 = c13770e.purchase(interfaceC3314e2);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (purchase2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C9214e(interfaceC3314e2, 22);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC7023e.ad(license2, null, null, null, null, null, false, null, (Function1) m3681throw2, c13770e, 0, 510);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
