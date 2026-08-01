package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٝۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11143e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f22351e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f22352e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ int f22353e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f22354e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11143e(int i, C18183e c18183e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f22351e = 3;
        this.f22353e = i;
        this.f22352e = c18183e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11143e(C1447e c1447e, int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f22351e = 4;
        this.f22352e = c1447e;
        this.f22354e = i;
        this.f22353e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11143e(C9755e c9755e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f22351e = 8;
        this.f22352e = c9755e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11143e(C15062e c15062e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f22351e = 1;
        this.f22352e = c15062e;
        this.f22353e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11143e(Object obj, int i, InterfaceC5083e interfaceC5083e, int i2) {
        super(2, interfaceC5083e);
        this.f22351e = i2;
        this.f22352e = obj;
        this.f22353e = i;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f22351e) {
            case 0:
                return new C11143e((AbstractC11409e) this.f22352e, this.f22353e, interfaceC5083e, 0);
            case 1:
                return new C11143e((C15062e) this.f22352e, interfaceC5083e, this.f22353e);
            case 2:
                return new C11143e((C7344e) this.f22352e, this.f22353e, interfaceC5083e, 2);
            case 3:
                return new C11143e(this.f22353e, (C18183e) this.f22352e, interfaceC5083e);
            case 4:
                return new C11143e((C1447e) this.f22352e, this.f22354e, this.f22353e, interfaceC5083e);
            case 5:
                return new C11143e((C17521e) this.f22352e, this.f22353e, interfaceC5083e, 5);
            case 6:
                return new C11143e((C5488e) this.f22352e, this.f22353e, interfaceC5083e, 6);
            case 7:
                return new C11143e((C1374e) this.f22352e, this.f22353e, interfaceC5083e, 7);
            default:
                C11143e c11143e = new C11143e((C9755e) this.f22352e, interfaceC5083e);
                c11143e.f22353e = ((Number) obj).intValue();
                return c11143e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22351e) {
            case 0:
                return ((C11143e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C11143e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C11143e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C11143e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C11143e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C11143e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C11143e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C11143e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C11143e) advert((InterfaceC5083e) obj2, Integer.valueOf(((Number) obj).intValue()))).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C10771e c10771e;
        int i = this.f22351e;
        Object obj2 = EnumC2821e.f6782e;
        Object obj3 = this.f22352e;
        switch (i) {
            case 0:
                AbstractC11409e abstractC11409e = (AbstractC11409e) obj3;
                int i2 = this.f22354e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    float purchase = abstractC11409e.f22953e.purchase();
                    C7558e ad = AbstractC7111e.ad(purchase);
                    float f = 1.0f + purchase;
                    Float f2 = new Float(purchase);
                    Float f3 = new Float(f);
                    Function1 function1 = AbstractC9546e.ad.ad;
                    AbstractC3424e abstractC3424e = (AbstractC3424e) function1.invoke(f2);
                    if (abstractC3424e == null) {
                        abstractC3424e = ad.yandex;
                    }
                    AbstractC3424e abstractC3424e2 = (AbstractC3424e) function1.invoke(f3);
                    if (abstractC3424e2 == null) {
                        abstractC3424e2 = ad.startapp;
                    }
                    int vip = abstractC3424e.vip();
                    for (int i3 = 0; i3 < vip; i3++) {
                        if (abstractC3424e.ad(i3) > abstractC3424e2.ad(i3)) {
                            AbstractC2878e.vip("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + abstractC3424e + " is greater than upper bound " + abstractC3424e2 + " on index " + i3);
                        }
                    }
                    ad.adcel = abstractC3424e;
                    ad.mopub = abstractC3424e2;
                    if (!ad.appmetrica()) {
                        Object metrica = ad.metrica(ad.license());
                        if (!AbstractC7890e.billing(metrica, ad.license())) {
                            ad.metrica.f32835e.setValue(metrica);
                        }
                    }
                    Float f4 = new Float(f);
                    C5043e vip2 = AbstractC12696e.vip(AbstractC12696e.yandex(this.f22353e, 2, AbstractC5616e.license), 1, 0L, 4);
                    C0609e c0609e = new C0609e(10, abstractC11409e);
                    this.f22354e = 1;
                    if (C7558e.vip(ad, f4, vip2, c0609e, this, 4) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i4 = this.f22354e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                InterfaceC1908e purchase2 = C15062e.advert((C15062e) obj3).purchase(this.f22353e);
                this.f22354e = 1;
                Object tapsense = ((C8823e) purchase2).tapsense(this);
                return tapsense == obj2 ? obj2 : tapsense;
            case 2:
                int i5 = this.f22354e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC5495e interfaceC5495e = ((C7344e) obj3).f15067e;
                    int i6 = this.f22353e;
                    this.f22354e = 1;
                    if (interfaceC5495e.metrica(i6, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i7 = this.f22354e;
                if (i7 == 0) {
                    AbstractC2003e.purchase(obj);
                    C5981e c5981e = AbstractC15448e.ad;
                    C0519e c0519e = new C0519e(this.f22353e, ((C18183e) obj3).f35609e);
                    this.f22354e = 1;
                    if (AbstractC15448e.ad(c0519e, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 4:
                AbstractC2003e.purchase(obj);
                C1447e c1447e = (C1447e) obj3;
                ((C1607e) c1447e.ad.f21740e).setIndeterminate(false);
                ((C1607e) c1447e.ad.f21740e).setMax(this.f22354e);
                ((C1607e) c1447e.ad.f21740e).ad(this.f22353e, true);
                return Unit.INSTANCE;
            case 5:
                int i8 = this.f22354e;
                if (i8 == 0) {
                    AbstractC2003e.purchase(obj);
                    C9137e c9137e = ((C17521e) obj3).ad;
                    int i9 = this.f22353e;
                    C12870e c12870e = AbstractC14924e.vip;
                    this.f22354e = 1;
                    Object ad2 = AbstractC16653e.ad(c9137e, i9 - c9137e.ad.purchase(), c12870e, this);
                    if (ad2 != obj2) {
                        ad2 = Unit.INSTANCE;
                    }
                    if (ad2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 6:
                int i10 = this.f22354e;
                if (i10 == 0) {
                    AbstractC2003e.purchase(obj);
                    C9137e c9137e2 = ((C5488e) obj3).ad;
                    int i11 = this.f22353e;
                    C12870e c12870e2 = AbstractC9672e.ad;
                    this.f22354e = 1;
                    Object ad3 = AbstractC16653e.ad(c9137e2, i11 - c9137e2.ad.purchase(), c12870e2, this);
                    if (ad3 != obj2) {
                        ad3 = Unit.INSTANCE;
                    }
                    if (ad3 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 7:
                int i12 = this.f22354e;
                if (i12 == 0) {
                    AbstractC2003e.purchase(obj);
                    int i13 = this.f22353e;
                    this.f22354e = 1;
                    if (C1374e.m574transient((C1374e) obj3, i13, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i14 = this.f22354e;
                if (i14 == 0) {
                    AbstractC2003e.purchase(obj);
                    if (Math.abs(this.f22353e) == 1 && (c10771e = ((C9755e) obj3).f19297e) != null) {
                        this.f22354e = 1;
                        Object appmetrica = AbstractC9743e.appmetrica(new C4870e(c10771e, null, 12), this);
                        if (appmetrica != obj2) {
                            appmetrica = Unit.INSTANCE;
                        }
                        if (appmetrica == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
