package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٞؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1976e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15349e f5185e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5186e;

    public /* synthetic */ C1976e(AbstractC15349e abstractC15349e, int i) {
        this.f5186e = i;
        this.f5185e = abstractC15349e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f5186e;
        AbstractC15349e abstractC15349e = this.f5185e;
        switch (i) {
            case 0:
                InterfaceC8528e mo1726e = abstractC15349e.mo1726e();
                C17877e c17877e = new C17877e(1, this);
                C3267e c3267e = AbstractC11957e.ad;
                if (C18139e.appmetrica(abstractC15349e)) {
                    return C18139e.vip(EnumC16799e.f32921e, abstractC15349e.toString());
                }
                InterfaceC5021e mo1459goto = abstractC15349e.mo1459goto();
                if (mo1459goto == null) {
                    AbstractC11957e.ad(12);
                    throw null;
                }
                if (mo1726e == null) {
                    AbstractC11957e.ad(13);
                    throw null;
                }
                List license = AbstractC11957e.license(mo1459goto.getParameters());
                C6557e.f13492e.getClass();
                return AbstractC1596e.purchase(C6557e.f13491e, mo1459goto, license, false, mo1726e, c17877e);
            case 1:
                return new C4304e(abstractC15349e.mo1726e());
            default:
                return new C16169e(abstractC15349e);
        }
    }
}
