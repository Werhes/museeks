package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11668e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3625e f23451e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23452e;

    public /* synthetic */ C11668e(C3625e c3625e, int i) {
        this.f23452e = i;
        this.f23451e = c3625e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f23452e) {
            case 0:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    C3625e c3625e = this.f23451e;
                    boolean yandex = c13770e.yandex(c3625e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C6846e(9, c3625e);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.ad(null, null, interfaceC12123e, null, null, null, false, null, (Function1) m3681throw, c13770e, (intValue << 6) & 896, 507);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                    C3625e c3625e2 = this.f23451e;
                    boolean yandex2 = c13770e2.yandex(c3625e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C12851e(28, c3625e2);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC16429e.ad(AbstractC8306e.metrica, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw2, 15), null, null, AbstractC8306e.license, null, null, 0.0f, 0.0f, c13770e2, 24582, 492);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
