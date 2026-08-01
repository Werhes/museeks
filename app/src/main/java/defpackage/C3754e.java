package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۦؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3754e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9289e f8342e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8343e;

    public /* synthetic */ C3754e(C9289e c9289e, int i) {
        this.f8343e = i;
        this.f8342e = c9289e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e = (C13770e) obj;
        switch (this.f8343e) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C9289e c9289e = this.f8342e;
                    boolean yandex = c13770e.yandex(c9289e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C7736e c7736e = new C7736e(0, c9289e, C9289e.class, "onDismissClicked", "onDismissClicked()V", 0, 0, 28);
                        c13770e.m3682throws(c7736e);
                        m3681throw = c7736e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC0207e.vip, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C9289e c9289e2 = this.f8342e;
                    boolean yandex2 = c13770e.yandex(c9289e2);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        C7736e c7736e2 = new C7736e(0, c9289e2, C9289e.class, "dismissSnippetHint", "dismissSnippetHint()V", 0, 0, 29);
                        c13770e.m3682throws(c7736e2);
                        m3681throw2 = c7736e2;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw2), null, false, null, null, null, AbstractC0207e.yandex, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
