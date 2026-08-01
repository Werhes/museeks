package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3371e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C14542e f3372e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C0624e f3373e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f3374e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0944e(C0624e c0624e, C14542e c14542e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f3371e = i;
        this.f3373e = c0624e;
        this.f3372e = c14542e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f3371e) {
            case 0:
                return new C0944e(this.f3373e, this.f3372e, interfaceC5083e, 0);
            default:
                return new C0944e(this.f3373e, this.f3372e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f3371e) {
            case 0:
                return ((C0944e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0944e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f3371e;
        C14542e c14542e = this.f3372e;
        C0624e c0624e = this.f3373e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f3374e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                this.f3374e = 1;
                int i3 = C0624e.purchase;
                Object vip = c0624e.vip(c14542e, 0, this);
                return vip == enumC2821e ? enumC2821e : vip;
            default:
                int i4 = this.f3374e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                this.f3374e = 1;
                int i5 = C0624e.purchase;
                Object vip2 = c0624e.vip(c14542e, 1, this);
                return vip2 == enumC2821e ? enumC2821e : vip2;
        }
    }
}
