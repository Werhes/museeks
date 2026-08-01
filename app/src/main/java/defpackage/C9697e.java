package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9697e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19195e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C0086e f19196e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1686e f19197e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f19198e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9697e(InterfaceC1686e interfaceC1686e, C0086e c0086e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f19195e = i;
        this.f19197e = interfaceC1686e;
        this.f19196e = c0086e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f19195e) {
            case 0:
                return new C9697e(this.f19197e, this.f19196e, interfaceC5083e, 0);
            default:
                return new C9697e(this.f19197e, this.f19196e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f19195e) {
            case 0:
                return ((C9697e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C9697e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f19195e) {
            case 0:
                int i = this.f19198e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f19198e = 1;
                    Object advert = AbstractC5336e.advert(AbstractC6731e.ad, new C6046e(this.f19196e, this.f19197e, (InterfaceC5083e) null, 1), this);
                    Object obj2 = EnumC2821e.f6782e;
                    if (advert != obj2) {
                        advert = Unit.INSTANCE;
                    }
                    if (advert == obj2) {
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
                int i2 = this.f19198e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f19198e = 1;
                    Object advert2 = AbstractC5336e.advert(AbstractC6731e.ad, new C6046e(this.f19196e, this.f19197e, (InterfaceC5083e) null, 1), this);
                    Object obj3 = EnumC2821e.f6782e;
                    if (advert2 != obj3) {
                        advert2 = Unit.INSTANCE;
                    }
                    if (advert2 == obj3) {
                        return obj3;
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
