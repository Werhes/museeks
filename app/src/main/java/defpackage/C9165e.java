package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؐۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9165e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f18339e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f18340e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ float f18341e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ float f18342e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ float f18343e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C13202e f18344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9165e(C13202e c13202e, float f, float f2, float f3, Function0 function0, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f18344e = c13202e;
        this.f18343e = f;
        this.f18341e = f2;
        this.f18342e = f3;
        this.f18340e = function0;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C9165e(this.f18344e, this.f18343e, this.f18341e, this.f18342e, this.f18340e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9165e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f18339e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            this.f18339e = 1;
            float f = AbstractC8741e.ad;
            C13423e c13423e = new C13423e(this.f18343e, this.f18341e, this.f18342e, null);
            Object ad = this.f18344e.ad(EnumC6955e.f14256e, c13423e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (ad != enumC2821e) {
                ad = Unit.INSTANCE;
            }
            if (ad == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        Function0 function0 = this.f18340e;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
