package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3955e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7765e f3956e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f3957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1258e(C7765e c7765e, InterfaceC5083e interfaceC5083e, int i) {
        super(1, interfaceC5083e);
        this.f3955e = i;
        this.f3956e = c7765e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f3955e) {
            case 0:
                return ((C1258e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C1258e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C1258e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f3955e) {
            case 0:
                int i = this.f3957e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f3957e = 1;
                    Unit purchase = this.f3956e.purchase(this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (purchase == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i2 = this.f3957e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7765e c7765e = this.f3956e;
                    boolean booleanValue = ((Boolean) c7765e.signatures.getValue()).booleanValue();
                    this.f3957e = 1;
                    Unit appmetrica = c7765e.appmetrica(booleanValue, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (appmetrica == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f3957e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f3957e = 1;
                    Object remoteconfig = this.f3956e.remoteconfig(this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (remoteconfig == enumC2821e3) {
                        return enumC2821e3;
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

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f3955e) {
            case 0:
                return new C1258e(this.f3956e, interfaceC5083e, 0);
            case 1:
                return new C1258e(this.f3956e, interfaceC5083e, 1);
            default:
                return new C1258e(this.f3956e, interfaceC5083e, 2);
        }
    }
}
