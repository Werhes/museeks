package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12300e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24677e = 0;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f24678e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7576e f24679e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f24680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12300e(InterfaceC5083e interfaceC5083e, C7576e c7576e, InterfaceC5979e interfaceC5979e, Function2 function2) {
        super(1, interfaceC5083e);
        this.f24679e = c7576e;
        this.f24678e = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12300e(C7576e c7576e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f24679e = c7576e;
        this.f24678e = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f24677e) {
            case 0:
                return ((C12300e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C12300e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f24677e) {
            case 0:
                int i = this.f24680e;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                C2119e c2119e = new C2119e(this.f24679e, this.f24678e, null);
                this.f24680e = 1;
                Object purchase = AbstractC12731e.purchase(c2119e, this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                return purchase == enumC2821e ? enumC2821e : purchase;
            default:
                int i2 = this.f24680e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f24680e = 1;
                    obj = null;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return obj;
                    }
                    AbstractC2003e.purchase(obj);
                }
                InterfaceC5979e interfaceC5979e = (InterfaceC5979e) obj;
                C12976e c12976e = (C12976e) this.f21135e.mo397public(C12575e.f25221e);
                C7576e c7576e = this.f24679e;
                if (c12976e != null) {
                    c12976e.ad(c7576e);
                }
                C12976e c12976e2 = new C12976e(c12976e, c7576e);
                C13696e c13696e = new C13696e(null, c7576e, interfaceC5979e, this.f24678e);
                this.f24680e = 2;
                Object advert = AbstractC5336e.advert(c12976e2, c13696e, this);
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                return advert == enumC2821e2 ? enumC2821e2 : advert;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f24677e) {
            case 0:
                return new C12300e(interfaceC5083e, this.f24679e, null, this.f24678e);
            default:
                return new C12300e(this.f24679e, this.f24678e, interfaceC5083e);
        }
    }
}
