package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2452e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6265e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C12805e f6266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2452e(C12805e c12805e, InterfaceC5083e interfaceC5083e, int i) {
        super(3, interfaceC5083e);
        this.f6265e = i;
        this.f6266e = c12805e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
        switch (this.f6265e) {
            case 0:
                return new C2452e(this.f6266e, interfaceC5083e, 0).loadAd(Unit.INSTANCE);
            default:
                return new C2452e(this.f6266e, interfaceC5083e, 1).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f6265e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C12805e c12805e = this.f6266e;
                RunnableC12991e runnableC12991e = c12805e.metrica;
                if (runnableC12991e != null) {
                    c12805e.ad.removeCallbacks(runnableC12991e);
                }
                c12805e.metrica = null;
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                C12805e c12805e2 = this.f6266e;
                RunnableC12991e runnableC12991e2 = c12805e2.metrica;
                if (runnableC12991e2 != null) {
                    c12805e2.ad.removeCallbacks(runnableC12991e2);
                }
                c12805e2.metrica = null;
                return Unit.INSTANCE;
        }
    }
}
