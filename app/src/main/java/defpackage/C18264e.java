package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٞ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18264e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2038e f35715e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35716e;

    public /* synthetic */ C18264e(C2038e c2038e, int i) {
        this.f35716e = 4;
        this.f35715e = c2038e;
    }

    public /* synthetic */ C18264e(C2038e c2038e, int i, byte b) {
        this.f35716e = i;
        this.f35715e = c2038e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35716e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    this.f35715e.vip(AbstractC18007e.metrica, c13770e, 6);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C2038e c2038e = this.f35715e;
                    boolean yandex = c13770e2.yandex(c2038e);
                    Object m3681throw = c13770e2.m3681throw();
                    Object obj3 = C2987e.ad;
                    if (yandex || m3681throw == obj3) {
                        m3681throw = new C5636e(c2038e, 1);
                        c13770e2.m3682throws(m3681throw);
                    }
                    Function0 function0 = (Function0) m3681throw;
                    InterfaceC12864e license = AbstractC18007e.license(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 2);
                    float f = 0;
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (m3681throw2 == obj3) {
                        m3681throw2 = new C2894e(11);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC6574e.vip(function0, license, 0L, 0L, 2, f, (Function1) m3681throw2, c13770e2, 1769520, 12);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C2038e c2038e2 = this.f35715e;
                    boolean yandex2 = c13770e3.yandex(c2038e2);
                    Object m3681throw3 = c13770e3.m3681throw();
                    Object obj4 = C2987e.ad;
                    if (yandex2 || m3681throw3 == obj4) {
                        m3681throw3 = new C5636e(c2038e2, 2);
                        c13770e3.m3682throws(m3681throw3);
                    }
                    Function0 function02 = (Function0) m3681throw3;
                    InterfaceC12864e license2 = AbstractC18007e.license(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 2);
                    float f2 = 0;
                    Object m3681throw4 = c13770e3.m3681throw();
                    if (m3681throw4 == obj4) {
                        m3681throw4 = new C2894e(12);
                        c13770e3.m3682throws(m3681throw4);
                    }
                    AbstractC6574e.vip(function02, license2, 0L, 0L, 2, f2, (Function1) m3681throw4, c13770e3, 1769520, 12);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    C2038e c2038e3 = this.f35715e;
                    boolean yandex3 = c13770e4.yandex(c2038e3);
                    Object m3681throw5 = c13770e4.m3681throw();
                    if (yandex3 || m3681throw5 == C2987e.ad) {
                        C17011e c17011e = new C17011e(0, c2038e3, C2038e.class, "discardQueueRestoration", "discardQueueRestoration()V", 0, 0, 9);
                        c13770e4.m3682throws(c17011e);
                        m3681throw5 = c17011e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw5), null, false, null, null, null, AbstractC3199e.vip, c13770e4, 1572864, 62);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f35715e.license((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
