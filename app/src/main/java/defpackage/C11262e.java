package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11262e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9669e f22624e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22625e = 1;

    public /* synthetic */ C11262e(C9669e c9669e) {
        this.f22624e = c9669e;
    }

    public /* synthetic */ C11262e(C9669e c9669e, int i) {
        this.f22624e = c9669e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22625e) {
            case 0:
                ((Integer) obj2).getClass();
                this.f22624e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C9669e c9669e = this.f22624e;
                    boolean yandex = c13770e.yandex(c9669e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C7736e c7736e = new C7736e(0, c9669e, C9669e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 14);
                        c13770e.m3682throws(c7736e);
                        m3681throw = c7736e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC12110e.billing, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
