package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٚۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11838e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f23746e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ float f23747e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C8933e f23748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11838e(C8933e c8933e, float f, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f23748e = c8933e;
        this.f23747e = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C11838e) mopub((InterfaceC5083e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f23746e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C8933e c8933e = this.f23748e;
            float purchase = c8933e.appmetrica.purchase();
            C17689e c17689e = new C17689e(20, c8933e);
            this.f23746e = 1;
            Object license = AbstractC7844e.license(purchase, this.f23747e, null, c17689e, this, 12);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (license == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        return new C11838e(this.f23748e, this.f23747e, interfaceC5083e);
    }
}
