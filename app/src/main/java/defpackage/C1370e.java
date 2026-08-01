package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1370e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4164e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ C6019e f4165e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ C6442e f4166e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1370e(int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f4164e = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6442e c6442e = (C6442e) obj;
        C6019e c6019e = (C6019e) obj2;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
        switch (this.f4164e) {
            case 0:
                C1370e c1370e = new C1370e(3, 0, interfaceC5083e);
                c1370e.f4166e = c6442e;
                c1370e.f4165e = c6019e;
                return c1370e.loadAd(Unit.INSTANCE);
            default:
                C1370e c1370e2 = new C1370e(3, 1, interfaceC5083e);
                c1370e2.f4166e = c6442e;
                c1370e2.f4165e = c6019e;
                return c1370e2.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f4164e) {
            case 0:
                C6442e c6442e = this.f4166e;
                C6019e c6019e = this.f4165e;
                AbstractC2003e.purchase(obj);
                return C6442e.vip(c6442e, null, null, null, null, null, c6019e, null, null, 130815);
            default:
                C6442e c6442e2 = this.f4166e;
                C6019e c6019e2 = this.f4165e;
                AbstractC2003e.purchase(obj);
                return C6442e.vip(c6442e2, null, null, null, null, null, null, null, c6019e2, 130047);
        }
    }
}
