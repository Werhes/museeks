package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۠ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14295e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16110e f28272e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28273e;

    public /* synthetic */ C14295e(C16110e c16110e, int i) {
        this.f28273e = i;
        this.f28272e = c16110e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e = (C13770e) obj;
        switch (this.f28273e) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C16110e c16110e = this.f28272e;
                    boolean booleanValue = ((Boolean) c16110e.appmetrica.getValue()).booleanValue();
                    boolean yandex = c13770e.yandex(c16110e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C10981e c10981e = new C10981e(1, c16110e, C16110e.class, "set", "set(Z)V", 0, 0, 1);
                        c13770e.m3682throws(c10981e);
                        m3681throw = c10981e;
                    }
                    AbstractC8844e.ad(booleanValue, (Function1) ((InterfaceC5261e) m3681throw), null, false, null, c13770e, 0, 124);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C16110e c16110e2 = this.f28272e;
                    boolean booleanValue2 = ((Boolean) c16110e2.appmetrica.getValue()).booleanValue();
                    boolean yandex2 = c13770e.yandex(c16110e2);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        C10981e c10981e2 = new C10981e(1, c16110e2, C16110e.class, "set", "set(Z)V", 0, 0, 0);
                        c13770e.m3682throws(c10981e2);
                        m3681throw2 = c10981e2;
                    }
                    AbstractC8844e.ad(booleanValue2, (Function1) ((InterfaceC5261e) m3681throw2), null, false, null, c13770e, 0, 124);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
