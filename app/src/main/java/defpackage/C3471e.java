package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3471e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10797e f7733e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7734e;

    public /* synthetic */ C3471e(C10797e c10797e, int i) {
        this.f7734e = i;
        this.f7733e = c10797e;
    }

    public /* synthetic */ C3471e(C10797e c10797e, int i, int i2) {
        this.f7734e = i2;
        this.f7733e = c10797e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7734e) {
            case 0:
                ((Integer) obj2).getClass();
                this.f7733e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C10797e c10797e = this.f7733e;
                    boolean yandex = c13770e.yandex(c10797e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C6317e c6317e = new C6317e(0, c10797e, C10797e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 11);
                        c13770e.m3682throws(c6317e);
                        m3681throw = c6317e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC0815e.f3208e, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C10797e c10797e2 = this.f7733e;
                    boolean yandex2 = c13770e2.yandex(c10797e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        C6317e c6317e2 = new C6317e(0, c10797e2, C10797e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 12);
                        c13770e2.m3682throws(c6317e2);
                        m3681throw2 = c6317e2;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw2), null, false, null, null, null, AbstractC0815e.f3205e, c13770e2, 1572864, 62);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f7733e.m2936transient((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
