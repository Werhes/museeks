package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16332e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10685e f32093e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32094e;

    public /* synthetic */ C16332e(C10685e c10685e, int i) {
        this.f32094e = 2;
        this.f32093e = c10685e;
    }

    public /* synthetic */ C16332e(C10685e c10685e, int i, byte b) {
        this.f32094e = i;
        this.f32093e = c10685e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32094e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C10685e c10685e = this.f32093e;
                    boolean yandex = c13770e.yandex(c10685e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        Cvolatile cvolatile = new Cvolatile(0, c10685e, C10685e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 22);
                        c13770e.m3682throws(cvolatile);
                        m3681throw = cvolatile;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC13482e.purchase, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C10685e c10685e2 = this.f32093e;
                    boolean yandex2 = c13770e2.yandex(c10685e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C8570e(c10685e2, 0);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC1513e.license((Function0) m3681throw2, null, false, null, null, null, AbstractC13482e.vip, c13770e2, 805306368, 510);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f32093e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
