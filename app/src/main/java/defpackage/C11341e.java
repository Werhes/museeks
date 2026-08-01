package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11341e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f22801e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ float f22802e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8642e f22803e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C3229e f22804e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C15096e f22805e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f22806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11341e(C15096e c15096e, InterfaceC8642e interfaceC8642e, C3229e c3229e, float f, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f22805e = c15096e;
        this.f22803e = interfaceC8642e;
        this.f22804e = c3229e;
        this.f22802e = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C3229e c3229e = this.f22804e;
        float f = this.f22802e;
        C11341e c11341e = new C11341e(this.f22805e, this.f22803e, c3229e, f, (InterfaceC5083e) obj3);
        c11341e.f22806e = (C5624e) obj;
        return c11341e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C15096e c15096e;
        int i = this.f22801e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C2407e c2407e = new C2407e(this.f22804e, (C5624e) this.f22806e, 2);
            C15096e c15096e2 = this.f22805e;
            this.f22806e = c15096e2;
            this.f22801e = 1;
            Object ad = this.f22803e.ad(c2407e, this.f22802e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (ad == enumC2821e) {
                return enumC2821e;
            }
            c15096e = c15096e2;
            obj = ad;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c15096e = (C15096e) this.f22806e;
            AbstractC2003e.purchase(obj);
        }
        c15096e.f29883e = ((Number) obj).floatValue();
        return Unit.INSTANCE;
    }
}
