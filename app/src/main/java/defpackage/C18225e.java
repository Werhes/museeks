package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18225e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f35694e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ C16801e f35695e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ C6442e f35696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18225e(int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f35694e = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6442e c6442e = (C6442e) obj;
        C16801e c16801e = (C16801e) obj2;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
        switch (this.f35694e) {
            case 0:
                C18225e c18225e = new C18225e(3, 0, interfaceC5083e);
                c18225e.f35696e = c6442e;
                c18225e.f35695e = c16801e;
                return c18225e.loadAd(Unit.INSTANCE);
            default:
                C18225e c18225e2 = new C18225e(3, 1, interfaceC5083e);
                c18225e2.f35696e = c6442e;
                c18225e2.f35695e = c16801e;
                return c18225e2.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f35694e) {
            case 0:
                C6442e c6442e = this.f35696e;
                C16801e c16801e = this.f35695e;
                AbstractC2003e.purchase(obj);
                return C6442e.vip(c6442e, c16801e, null, null, null, null, null, null, null, 131070);
            default:
                C6442e c6442e2 = this.f35696e;
                C16801e c16801e2 = this.f35695e;
                AbstractC2003e.purchase(obj);
                return C6442e.vip(c6442e2, c16801e2, null, null, null, null, null, null, null, 131070);
        }
    }
}
