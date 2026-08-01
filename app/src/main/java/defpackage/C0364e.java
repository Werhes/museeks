package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ float f2393e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f2394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0364e(InterfaceC3314e interfaceC3314e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f2394e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        C0364e c0364e = new C0364e(this.f2394e, (InterfaceC5083e) obj3);
        c0364e.f2393e = floatValue;
        return c0364e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        ((Function1) this.f2394e.getValue()).invoke(new Float(this.f2393e));
        return Unit.INSTANCE;
    }
}
