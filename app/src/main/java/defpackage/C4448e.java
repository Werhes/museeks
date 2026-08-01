package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4448e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9652e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C16818e f9653e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f9654e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4448e(C16818e c16818e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f9652e = i;
        this.f9653e = c16818e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f9652e) {
            case 0:
                return new C4448e(this.f9653e, interfaceC5083e, 0);
            default:
                return new C4448e(this.f9653e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9652e) {
            case 0:
                return ((C4448e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C4448e) advert((InterfaceC5083e) obj2, (Unit) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f9652e) {
            case 0:
                int i = this.f9654e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f9654e = 1;
                    C16818e c16818e = this.f9653e;
                    Object appmetrica = AbstractC7535e.appmetrica(new C5923e(c16818e.appmetrica, true), new C4448e(c16818e, null, 1), this);
                    Object obj2 = EnumC2821e.f6782e;
                    if (appmetrica != obj2) {
                        appmetrica = Unit.INSTANCE;
                    }
                    if (appmetrica == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i2 = this.f9654e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f9654e = 1;
                    Object vip = AbstractC16481e.vip(1500L, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (vip == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                this.f9653e.vip.crashlytics(-1);
                return Unit.INSTANCE;
        }
    }
}
