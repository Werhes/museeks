package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5245e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f11162e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C11188e f11163e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f11164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5245e(C11188e c11188e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f11162e = i;
        this.f11163e = c11188e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f11162e) {
            case 0:
                return new C5245e(this.f11163e, interfaceC5083e, 0);
            default:
                return new C5245e(this.f11163e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11162e) {
            case 0:
                return ((C5245e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C5245e) advert((InterfaceC5083e) obj2, (C18269e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f11162e) {
            case 0:
                int i = this.f11164e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C11188e c11188e = this.f11163e;
                    if (AbstractC7890e.billing(c11188e.m3046e(), C15383e.billing)) {
                        this.f11164e = 1;
                        Object m3047e = c11188e.m3047e(this);
                        EnumC2821e enumC2821e = EnumC2821e.f6782e;
                        if (m3047e == enumC2821e) {
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
                int i2 = this.f11164e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C11188e c11188e2 = this.f11163e;
                    c11188e2.f22446e.setValue(Boolean.FALSE);
                    this.f11164e = 1;
                    c11188e2.f22445e.setValue(C15383e.billing);
                    Object m3047e2 = c11188e2.m3047e(this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (m3047e2 != enumC2821e2) {
                        m3047e2 = Unit.INSTANCE;
                    }
                    if (m3047e2 == enumC2821e2) {
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
