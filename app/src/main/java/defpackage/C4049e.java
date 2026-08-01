package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4049e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14987e f8997e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8998e = 1;

    public /* synthetic */ C4049e(C14987e c14987e) {
        this.f8997e = c14987e;
    }

    public /* synthetic */ C4049e(C14987e c14987e, int i) {
        this.f8997e = c14987e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8998e) {
            case 0:
                ((Integer) obj2).getClass();
                this.f8997e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C14987e c14987e = this.f8997e;
                    boolean yandex = c13770e.yandex(c14987e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C11212e c11212e = new C11212e(0, c14987e, C14987e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 19);
                        c13770e.m3682throws(c11212e);
                        m3681throw = c11212e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC2301e.vip, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
