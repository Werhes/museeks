package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10959e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f21686e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7576e f21687e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f21688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10959e(int i, InterfaceC5083e interfaceC5083e, C7576e c7576e) {
        super(1, interfaceC5083e);
        this.f21686e = i;
        this.f21687e = c7576e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f21686e) {
            case 0:
                return ((C10959e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C10959e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f21686e) {
            case 0:
                int i = this.f21688e;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                InterfaceC4417e billing = this.f21687e.billing();
                this.f21688e = 1;
                Object ad = billing.ad(this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                return ad == enumC2821e ? enumC2821e : ad;
            default:
                int i2 = this.f21688e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                InterfaceC2885e interfaceC2885e = (InterfaceC2885e) this.f21687e.mopub.getValue();
                this.f21688e = 1;
                Object license = interfaceC2885e.license(new C6397e(3, (InterfaceC5083e) null), this);
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                return license == enumC2821e2 ? enumC2821e2 : license;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f21686e) {
            case 0:
                return new C10959e(0, interfaceC5083e, this.f21687e);
            default:
                return new C10959e(1, interfaceC5083e, this.f21687e);
        }
    }
}
