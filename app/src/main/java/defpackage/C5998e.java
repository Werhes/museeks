package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5998e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f12634e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C15062e f12635e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f12636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5998e(C15062e c15062e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f12634e = i;
        this.f12635e = c15062e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f12634e) {
            case 0:
                return new C5998e(this.f12635e, interfaceC5083e, 0);
            case 1:
                return new C5998e(this.f12635e, interfaceC5083e, 1);
            default:
                return new C5998e(this.f12635e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f12634e) {
            case 0:
                return ((C5998e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C5998e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C5998e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f12634e) {
            case 0:
                int i = this.f12636e;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                C12810e advert = C15062e.advert(this.f12635e);
                this.f12636e = 1;
                Object license = advert.license(this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                return license == enumC2821e ? enumC2821e : license;
            case 1:
                int i2 = this.f12636e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                InterfaceC1908e mopub = C15062e.advert(this.f12635e).mopub();
                this.f12636e = 1;
                Object tapsense = ((C8823e) mopub).tapsense(this);
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                return tapsense == enumC2821e2 ? enumC2821e2 : tapsense;
            default:
                int i3 = this.f12636e;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                InterfaceC1908e vip = C15062e.advert(this.f12635e).vip();
                this.f12636e = 1;
                Object tapsense2 = ((C8823e) vip).tapsense(this);
                EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                return tapsense2 == enumC2821e3 ? enumC2821e3 : tapsense2;
        }
    }
}
