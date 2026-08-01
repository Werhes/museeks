package defpackage;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16895e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33115e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f33116e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ AbstractC11424e f33117e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f33118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16895e(int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f33115e = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC11424e abstractC11424e = (AbstractC11424e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
        switch (this.f33115e) {
            case 0:
                C16895e c16895e = new C16895e(3, 0, interfaceC5083e);
                c16895e.f33117e = abstractC11424e;
                c16895e.f33116e = obj2;
                return c16895e.loadAd(Unit.INSTANCE);
            case 1:
                C16895e c16895e2 = new C16895e(3, 1, interfaceC5083e);
                c16895e2.f33117e = abstractC11424e;
                c16895e2.f33116e = obj2;
                return c16895e2.loadAd(Unit.INSTANCE);
            case 2:
                C16895e c16895e3 = new C16895e(3, 2, interfaceC5083e);
                c16895e3.f33117e = abstractC11424e;
                c16895e3.f33116e = obj2;
                return c16895e3.loadAd(Unit.INSTANCE);
            case 3:
                C16895e c16895e4 = new C16895e(3, 3, interfaceC5083e);
                c16895e4.f33117e = abstractC11424e;
                c16895e4.f33116e = obj2;
                return c16895e4.loadAd(Unit.INSTANCE);
            default:
                C16895e c16895e5 = new C16895e(3, 4, interfaceC5083e);
                c16895e5.f33117e = abstractC11424e;
                c16895e5.f33116e = obj2;
                return c16895e5.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC14601e c16496e;
        int i = this.f33115e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                AbstractC11424e abstractC11424e = this.f33117e;
                Object obj2 = this.f33116e;
                int i2 = this.f33118e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    if (!(obj2 instanceof AbstractC14601e)) {
                        C12941e c12941e = new C12941e(C2394e.f6122e);
                        this.f33117e = null;
                        this.f33116e = null;
                        this.f33118e = 1;
                        if (abstractC11424e.purchase(this, c12941e) == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC11424e abstractC11424e2 = this.f33117e;
                Object obj3 = this.f33116e;
                int i3 = this.f33118e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    Object obj4 = abstractC11424e2.f22964e;
                    C8208e c8208e = AbstractC17667e.ad;
                    if (((InterfaceC8376e) obj4).loadAd().admob()) {
                        return Unit.INSTANCE;
                    }
                    if (!(obj3 instanceof AbstractC14601e)) {
                        throw new IllegalArgumentException("Response pipeline couldn't transform '" + AbstractC3820e.ad.vip(obj3.getClass()) + "' to the OutgoingContent");
                    }
                    InterfaceC8376e interfaceC8376e = (InterfaceC8376e) obj4;
                    InterfaceC7046e loadAd = interfaceC8376e.loadAd();
                    C6582e c6582e = loadAd instanceof C6582e ? (C6582e) loadAd : null;
                    if (c6582e == null) {
                        c6582e = (C6582e) interfaceC8376e.getAttributes().metrica(C6582e.f13569e);
                    }
                    this.f33117e = null;
                    this.f33116e = null;
                    this.f33118e = 1;
                    if (c6582e.adcel((AbstractC14601e) obj3, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC11424e abstractC11424e3 = this.f33117e;
                Object obj5 = this.f33116e;
                int i4 = this.f33118e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    Object obj6 = abstractC11424e3.f22964e;
                    if (((C10263e) obj6).metrica.m4623e("Accept") == null) {
                        ((C10263e) obj6).metrica.mo859e("Accept", "*/*");
                    }
                    C1622e vip = AbstractC17419e.vip((InterfaceC8526e) obj6);
                    if (obj5 instanceof String) {
                        String str = (String) obj5;
                        if (vip == null) {
                            vip = AbstractC17135e.vip;
                        }
                        c16496e = new C12171e(str, vip, null);
                    } else if (obj5 instanceof byte[]) {
                        c16496e = new C4092e(vip, obj5);
                    } else if (obj5 instanceof InterfaceC13033e) {
                        c16496e = new C16496e(abstractC11424e3, vip, obj5);
                    } else if (obj5 instanceof AbstractC14601e) {
                        c16496e = (AbstractC14601e) obj5;
                    } else {
                        c16496e = obj5 instanceof InputStream ? new C16496e((C10263e) obj6, vip, obj5) : null;
                    }
                    if ((c16496e != null ? c16496e.vip() : null) != null) {
                        C10263e c10263e = (C10263e) obj6;
                        c10263e.metrica.m4628e("Content-Type");
                        AbstractC17605e.ad.amazon("Transformed with default transformers request body for " + c10263e.ad + " from " + AbstractC3820e.ad.vip(obj5.getClass()));
                        this.f33117e = null;
                        this.f33116e = null;
                        this.f33118e = 1;
                        if (abstractC11424e3.purchase(this, c16496e) == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC11424e abstractC11424e4 = this.f33117e;
                Object obj7 = this.f33116e;
                int i5 = this.f33118e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    AbstractC14601e mopub = AbstractC15842e.mopub((InterfaceC8376e) abstractC11424e4.f22964e, obj7);
                    if (mopub != null) {
                        this.f33117e = null;
                        this.f33116e = null;
                        this.f33118e = 1;
                        if (abstractC11424e4.purchase(this, mopub) == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                AbstractC11424e abstractC11424e5 = this.f33117e;
                Object obj8 = this.f33116e;
                int i6 = this.f33118e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC13033e interfaceC13033e = obj8 instanceof InterfaceC13033e ? (InterfaceC13033e) obj8 : null;
                    if (interfaceC13033e != null && AbstractC7890e.billing(AbstractC17667e.ad((InterfaceC8376e) abstractC11424e5.f22964e).ad, AbstractC3820e.ad.vip(String.class))) {
                        Object obj9 = abstractC11424e5.f22964e;
                        InterfaceC8376e interfaceC8376e2 = (InterfaceC8376e) obj9;
                        try {
                            Charset ad = AbstractC9757e.ad(AbstractC7535e.purchase(((InterfaceC8376e) obj9).license()));
                            if (ad == null) {
                                ad = AbstractC5508e.ad;
                            }
                            this.f33117e = abstractC11424e5;
                            this.f33116e = null;
                            this.f33118e = 1;
                            obj = AbstractC17802e.ad(interfaceC13033e, ad, this);
                            if (obj == enumC2821e) {
                                return enumC2821e;
                            }
                        } catch (C18445e e) {
                            throw new Exception("Illegal Content-Type header format: " + interfaceC8376e2.license().ad().mo459e("Content-Type"), e);
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return Unit.INSTANCE;
                }
                AbstractC2003e.purchase(obj);
                this.f33117e = null;
                this.f33116e = null;
                this.f33118e = 2;
                if (abstractC11424e5.purchase(this, (String) obj) == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
        }
    }
}
