package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٙؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7238e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f14782e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C15274e f14783e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f14784e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f14785e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ long f14786e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ C14307e f14787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7238e(InterfaceC18435e interfaceC18435e, InterfaceC3314e interfaceC3314e, C15274e c15274e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f14784e = interfaceC18435e;
        this.f14785e = interfaceC3314e;
        this.f14783e = c15274e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C2152e) obj2).ad;
        InterfaceC3314e interfaceC3314e = this.f14785e;
        C15274e c15274e = this.f14783e;
        C7238e c7238e = new C7238e(this.f14784e, interfaceC3314e, c15274e, (InterfaceC5083e) obj3);
        c7238e.f14787e = (C14307e) obj;
        c7238e.f14786e = j;
        return c7238e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f14782e;
        InterfaceC18435e interfaceC18435e = this.f14784e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C14307e c14307e = this.f14787e;
            AbstractC5336e.purchase(interfaceC18435e, null, 0, new C5840e(this.f14785e, this.f14786e, this.f14783e, (InterfaceC5083e) null, 7), 3);
            this.f14782e = 1;
            obj = c14307e.purchase(this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (obj == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C14078e(this.f14785e, ((Boolean) obj).booleanValue(), this.f14783e, (InterfaceC5083e) null), 3);
        return Unit.INSTANCE;
    }
}
