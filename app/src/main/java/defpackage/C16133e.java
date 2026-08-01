package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16133e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5016e f31715e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31716e = 1;

    public /* synthetic */ C16133e(C5016e c5016e) {
        this.f31715e = c5016e;
    }

    public /* synthetic */ C16133e(C5016e c5016e, int i) {
        this.f31715e = c5016e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31716e) {
            case 0:
                ((Integer) obj2).getClass();
                this.f31715e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C5016e c5016e = this.f31715e;
                    boolean yandex = c13770e.yandex(c5016e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C12829e c12829e = new C12829e(0, c5016e, C5016e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 11);
                        c13770e.m3682throws(c12829e);
                        m3681throw = c12829e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC3265e.vip, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
