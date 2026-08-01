package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10785e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f21242e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f21243e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C8874e f21244e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f21245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10785e(C8874e c8874e, boolean z, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f21242e = i;
        this.f21244e = c8874e;
        this.f21243e = z;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f21242e) {
            case 0:
                return new C10785e(this.f21244e, this.f21243e, interfaceC5083e, 0);
            default:
                return new C10785e(this.f21244e, this.f21243e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f21242e) {
            case 0:
                return ((C10785e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C10785e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f21242e) {
            case 0:
                int i = this.f21245e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C7850e c7850e = (C7850e) AbstractC1831e.metrica().f22774e;
                    EnumC0698e enumC0698e = this.f21244e.f17829e;
                    this.f21245e = 1;
                    Object vip = ((InterfaceC8018e) c7850e.f15896e).vip(new C13053e(enumC0698e, this.f21243e, (InterfaceC5083e) null, 2), this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (vip == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i2 = this.f21245e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7850e c7850e2 = (C7850e) AbstractC1831e.metrica().f22774e;
                    EnumC0698e enumC0698e2 = this.f21244e.f17829e;
                    this.f21245e = 1;
                    Object vip2 = ((InterfaceC8018e) c7850e2.f15896e).vip(new C13053e(enumC0698e2, this.f21243e, (InterfaceC5083e) null, 2), this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (vip2 == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
