package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12565e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25161e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C2164e f25162e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C2164e f25163e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C10743e f25164e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f25165e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12565e(C10743e c10743e, C2164e c2164e, C2164e c2164e2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f25161e = i;
        this.f25164e = c10743e;
        this.f25162e = c2164e;
        this.f25163e = c2164e2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f25161e) {
            case 0:
                return new C12565e(this.f25164e, this.f25162e, this.f25163e, interfaceC5083e, 0);
            default:
                return new C12565e(this.f25164e, this.f25162e, this.f25163e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f25161e) {
            case 0:
                return ((C12565e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C12565e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f25161e) {
            case 0:
                int i = this.f25165e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f25165e = 1;
                    Object vip = C10743e.vip(this.f25164e, this.f25162e, this.f25163e, this);
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
                int i2 = this.f25165e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f25165e = 1;
                    Object vip2 = C10743e.vip(this.f25164e, this.f25162e, this.f25163e, this);
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
