package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9198e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9261e f18376e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18377e = 1;

    public /* synthetic */ C9198e(C9261e c9261e) {
        this.f18376e = c9261e;
    }

    public /* synthetic */ C9198e(C9261e c9261e, int i) {
        this.f18376e = c9261e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18377e) {
            case 0:
                ((Integer) obj2).getClass();
                this.f18376e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C9261e c9261e = this.f18376e;
                    boolean yandex = c13770e.yandex(c9261e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C7755e c7755e = new C7755e(0, c9261e, C9261e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 15);
                        c13770e.m3682throws(c7755e);
                        m3681throw = c7755e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC18268e.metrica, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
