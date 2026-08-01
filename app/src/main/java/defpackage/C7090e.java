package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7090e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14544e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C18046e f14545e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f14546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7090e(C18046e c18046e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f14544e = i;
        this.f14545e = c18046e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f14544e) {
            case 0:
                return new C7090e(this.f14545e, interfaceC5083e, 0);
            default:
                return new C7090e(this.f14545e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f14544e) {
            case 0:
                return ((C7090e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C7090e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f14544e;
        C18046e c18046e = this.f14545e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f14546e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f14546e = 1;
                    C8208e c8208e = C18046e.mopub;
                    if (c18046e.metrica(this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f14546e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C15420e c15420e = AbstractC6731e.ad;
                    ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
                    C7090e c7090e = new C7090e(c18046e, null, 0);
                    this.f14546e = 1;
                    if (AbstractC5336e.advert(executorC3603e, c7090e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
