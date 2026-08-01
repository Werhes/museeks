package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7067e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f14506e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ boolean f14507e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C3967e f14508e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f14509e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7576e f14510e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f14511e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7067e(C7576e c7576e, C3967e c3967e, Object obj, boolean z, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f14510e = c7576e;
        this.f14508e = c3967e;
        this.f14509e = obj;
        this.f14507e = z;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C7067e c7067e = new C7067e(this.f14510e, this.f14508e, this.f14509e, this.f14507e, interfaceC5083e);
        c7067e.f14511e = obj;
        return c7067e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7067e) advert((InterfaceC5083e) obj2, (InterfaceC15437e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        InterfaceC15437e interfaceC15437e = (InterfaceC15437e) this.f14511e;
        int i = this.f14506e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            this.f14510e.getClass();
            C4091e c4091e = new C4091e(this.f14508e, this.f14510e, interfaceC15437e, this.f14509e, this.f14507e, null);
            this.f14511e = null;
            this.f14506e = 1;
            Object purchase = AbstractC12731e.purchase(c4091e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (purchase == enumC2821e) {
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
