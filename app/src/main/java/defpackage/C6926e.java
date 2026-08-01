package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6926e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14187e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C9727e f14188e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f14189e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6926e(C9727e c9727e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f14187e = i;
        this.f14188e = c9727e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f14187e) {
            case 0:
                return new C6926e(this.f14188e, interfaceC5083e, 0);
            default:
                return new C6926e(this.f14188e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f14187e) {
            case 0:
                return ((C6926e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C6926e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f14187e) {
            case 0:
                int i = this.f14189e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C9727e c9727e = this.f14188e;
                    InterfaceC1108e ad = c9727e.vip.ad();
                    C14223e c14223e = new C14223e(1, c9727e.metrica);
                    this.f14189e = 1;
                    Object ad2 = ad.ad(c14223e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (ad2 == enumC2821e) {
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
                int i2 = this.f14189e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                InterfaceC1108e ad3 = this.f14188e.vip.ad();
                this.f14189e = 1;
                Object startapp = AbstractC7535e.startapp(ad3, this);
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                return startapp == enumC2821e2 ? enumC2821e2 : startapp;
        }
    }
}
