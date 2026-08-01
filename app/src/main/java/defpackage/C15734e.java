package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15734e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30984e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Context f30985e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f30986e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15734e(Context context, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f30984e = i;
        this.f30985e = context;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f30984e) {
            case 0:
                return new C15734e(this.f30985e, interfaceC5083e, 0);
            case 1:
                return new C15734e(this.f30985e, interfaceC5083e, 1);
            case 2:
                return new C15734e(this.f30985e, interfaceC5083e, 2);
            case 3:
                return new C15734e(this.f30985e, interfaceC5083e, 3);
            default:
                return new C15734e(this.f30985e, interfaceC5083e, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f30984e) {
            case 0:
                return ((C15734e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C15734e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C15734e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C15734e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C15734e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f30984e;
        InterfaceC5083e interfaceC5083e = null;
        int i2 = 2;
        Context context = this.f30985e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i3 = this.f30986e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f30986e = 1;
                    C18353e c18353e = C18353e.ad;
                    obj = C18353e.purchase(new C2091e(12), this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        AbstractC15615e.ad(new C1478e(0, context, context.getString(R.string.qf_damaged_cache_done, new Integer(((Number) obj).intValue()))));
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                C15420e c15420e = AbstractC6731e.ad;
                ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
                C1767e c1767e = new C1767e((List) obj, null);
                this.f30986e = 2;
                obj = AbstractC5336e.advert(executorC3603e, c1767e, this);
                if (obj == enumC2821e) {
                    return enumC2821e;
                }
                AbstractC15615e.ad(new C1478e(0, context, context.getString(R.string.qf_damaged_cache_done, new Integer(((Number) obj).intValue()))));
                return Unit.INSTANCE;
            case 1:
                int i4 = this.f30986e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C16456e c16456e = C16456e.ad;
                    this.f30986e = 1;
                    if (c16456e.ad(context, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                C1343e c1343e = AbstractC12918e.ad;
                this.f30986e = 2;
                Object ad = AbstractC12918e.metrica.ad.ad(this);
                if (ad != enumC2821e) {
                    ad = Unit.INSTANCE;
                }
                if (ad == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
            case 2:
                int i5 = this.f30986e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    C1890e c1890e = new C1890e(context);
                    this.f30986e = 1;
                    if (c1890e.ad(this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i6 = this.f30986e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC1108e ad2 = AbstractC16214e.ad(context).ad();
                    this.f30986e = 1;
                    if (ad2.ad(C3140e.f7210e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i7 = this.f30986e;
                if (i7 == 0) {
                    AbstractC2003e.purchase(obj);
                    C9616e c9616e = C9616e.f19073e;
                    C1343e ad3 = AbstractC12918e.ad();
                    this.f30986e = 1;
                    obj = c9616e.yandex(ad3, this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                int ordinal = ((EnumC6583e) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        InterfaceC8018e ad4 = AbstractC16214e.ad(context);
                        C9754e c9754e = new C9754e(i2, 8, interfaceC5083e);
                        this.f30986e = 2;
                        if (ad4.vip(c9754e, this) == enumC2821e) {
                            return enumC2821e;
                        }
                        return Unit.INSTANCE;
                    }
                    if (ordinal != 2) {
                        throw new C14803e(10);
                    }
                }
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
        }
    }
}
