package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1583e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4489e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7558e f4490e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f4491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1583e(C7558e c7558e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f4489e = i;
        this.f4490e = c7558e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f4489e) {
            case 0:
                return new C1583e(this.f4490e, interfaceC5083e, 0);
            default:
                return new C1583e(this.f4490e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f4489e) {
            case 0:
                return ((C1583e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C1583e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f4489e) {
            case 0:
                int i = this.f4491e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    Float f = new Float(360.0f);
                    C5043e vip = AbstractC12696e.vip(AbstractC12696e.yandex(4666, 2, AbstractC5616e.license), 1, 0L, 4);
                    this.f4491e = 1;
                    Object vip2 = C7558e.vip(this.f4490e, f, vip, null, this, 12);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (vip2 == enumC2821e) {
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
                int i2 = this.f4491e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    Float f2 = new Float(0.0f);
                    this.f4491e = 1;
                    Object vip3 = C7558e.vip(this.f4490e, f2, null, null, this, 14);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (vip3 == enumC2821e2) {
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
