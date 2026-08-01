package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؒٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f3160e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ float f3161e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ float f3162e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C10469e f3163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0788e(C10469e c10469e, float f, float f2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3163e = c10469e;
        this.f3162e = f;
        this.f3161e = f2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C0788e(this.f3163e, this.f3162e, this.f3161e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0788e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f3160e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            this.f3160e = 1;
            Object metrica = AbstractC16342e.metrica(this.f3163e.f20666e, (Float.floatToRawIntBits(this.f3162e) << 32) | (Float.floatToRawIntBits(this.f3161e) & 4294967295L), this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (metrica == enumC2821e) {
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
}
