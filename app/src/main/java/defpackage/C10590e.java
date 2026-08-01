package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۡ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10590e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f20899e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C8510e f20900e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f20901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10590e(C8510e c8510e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f20899e = i;
        this.f20900e = c8510e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f20899e) {
            case 0:
                return new C10590e(this.f20900e, interfaceC5083e, 0);
            default:
                return new C10590e(this.f20900e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20899e) {
            case 0:
                return ((C10590e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C10590e) advert((InterfaceC5083e) obj2, (C18269e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f20899e) {
            case 0:
                int i = this.f20901e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C8510e c8510e = this.f20900e;
                    if (AbstractC7890e.billing((C7355e) c8510e.f17309e.getValue(), C7355e.purchase)) {
                        this.f20901e = 1;
                        Object m2437synchronized = c8510e.m2437synchronized(this);
                        EnumC2821e enumC2821e = EnumC2821e.f6782e;
                        if (m2437synchronized == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i2 = this.f20901e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C8510e c8510e2 = this.f20900e;
                    c8510e2.f17310e.setValue(Boolean.FALSE);
                    this.f20901e = 1;
                    c8510e2.f17309e.setValue(C7355e.purchase);
                    Object m2437synchronized2 = c8510e2.m2437synchronized(this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (m2437synchronized2 != enumC2821e2) {
                        m2437synchronized2 = Unit.INSTANCE;
                    }
                    if (m2437synchronized2 == enumC2821e2) {
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
