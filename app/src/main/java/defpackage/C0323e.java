package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f2346e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1686e f2347e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f2348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0323e(InterfaceC1686e interfaceC1686e, InterfaceC5083e interfaceC5083e, int i) {
        super(1, interfaceC5083e);
        this.f2346e = i;
        this.f2347e = interfaceC1686e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f2346e) {
            case 0:
                return ((C0323e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0323e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f2346e) {
            case 0:
                int i = this.f2348e;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                InterfaceC11116e interfaceC11116e = (InterfaceC11116e) this.f2347e;
                this.f2348e = 1;
                Object appmetrica = interfaceC11116e.appmetrica(this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                return appmetrica == enumC2821e ? enumC2821e : appmetrica;
            default:
                int i2 = this.f2348e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                InterfaceC4079e interfaceC4079e = (InterfaceC4079e) this.f2347e;
                this.f2348e = 1;
                Object ad = interfaceC4079e.ad(this);
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                return ad == enumC2821e2 ? enumC2821e2 : ad;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f2346e) {
            case 0:
                return new C0323e(this.f2347e, interfaceC5083e, 0);
            default:
                return new C0323e(this.f2347e, interfaceC5083e, 1);
        }
    }
}
