package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1065e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3591e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C10743e f3592e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f3593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1065e(C10743e c10743e, InterfaceC5083e interfaceC5083e, int i) {
        super(1, interfaceC5083e);
        this.f3591e = i;
        this.f3592e = c10743e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f3591e) {
            case 0:
                return ((C1065e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C1065e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f3591e) {
            case 0:
                int i = this.f3593e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f3593e = 1;
                    Object ad = C10743e.ad(this.f3592e, EnumC10320e.f20366e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (ad == enumC2821e) {
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
                int i2 = this.f3593e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f3593e = 1;
                    Object ad2 = C10743e.ad(this.f3592e, EnumC10320e.f20365e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (ad2 == enumC2821e2) {
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

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f3591e) {
            case 0:
                return new C1065e(this.f3592e, interfaceC5083e, 0);
            default:
                return new C1065e(this.f3592e, interfaceC5083e, 1);
        }
    }
}
