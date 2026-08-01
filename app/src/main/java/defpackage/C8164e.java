package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8164e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f16612e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C15096e f16613e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ float f16614e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C9570e f16615e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f16616e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8164e(C9570e c9570e, C15096e c15096e, float f, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f16615e = c9570e;
        this.f16613e = c15096e;
        this.f16614e = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C15096e c15096e = this.f16613e;
        float f = this.f16614e;
        C8164e c8164e = new C8164e(this.f16615e, c15096e, f, (InterfaceC5083e) obj3);
        c8164e.f16616e = (C5624e) obj;
        return c8164e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C15096e c15096e;
        int i = this.f16612e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C9570e c9570e = this.f16615e;
            C2407e c2407e = new C2407e(c9570e, (C5624e) this.f16616e, 0);
            InterfaceC8642e interfaceC8642e = c9570e.f19001e;
            if (interfaceC8642e == null) {
                interfaceC8642e = null;
            }
            C15096e c15096e2 = this.f16613e;
            this.f16616e = c15096e2;
            this.f16612e = 1;
            obj = interfaceC8642e.ad(c2407e, this.f16614e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (obj == enumC2821e) {
                return enumC2821e;
            }
            c15096e = c15096e2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c15096e = (C15096e) this.f16616e;
            AbstractC2003e.purchase(obj);
        }
        c15096e.f29883e = ((Number) obj).floatValue();
        return Unit.INSTANCE;
    }
}
