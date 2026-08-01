package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f1221e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C13136e f1222e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f1223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0066e(C13136e c13136e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f1221e = i;
        this.f1222e = c13136e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f1221e) {
            case 0:
                return new C0066e(this.f1222e, interfaceC5083e, 0);
            case 1:
                return new C0066e(this.f1222e, interfaceC5083e, 1);
            default:
                return new C0066e(this.f1222e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f1221e) {
            case 0:
                return ((C0066e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C0066e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0066e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f1221e) {
            case 0:
                int i = this.f1223e;
                C13136e c13136e = this.f1222e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    long vip = ((InterfaceC11678e) AbstractC10432e.vip(c13136e, AbstractC11473e.pro)).vip();
                    this.f1223e = 1;
                    Object vip2 = AbstractC16481e.vip(vip, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (vip2 == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                Function0 function0 = c13136e.f26111e;
                if (function0 != null) {
                    function0.invoke();
                }
                if (c13136e.f26096e) {
                    ((C6169e) ((InterfaceC5178e) AbstractC10432e.vip(c13136e, AbstractC11473e.advert))).ad(0);
                }
                c13136e.f26112e = true;
                C8419e c8419e = c13136e.f26104e;
                if (c8419e != null) {
                    c8419e.Signature(null);
                }
                c13136e.f26104e = null;
                c13136e.f26110e = null;
                return Unit.INSTANCE;
            case 1:
                int i2 = this.f1223e;
                C13136e c13136e2 = this.f1222e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    long vip3 = ((InterfaceC11678e) AbstractC10432e.vip(c13136e2, AbstractC11473e.pro)).vip();
                    this.f1223e = 1;
                    Object vip4 = AbstractC16481e.vip(vip3, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (vip4 == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                Function0 function02 = c13136e2.f26111e;
                if (function02 != null) {
                    function02.invoke();
                }
                if (c13136e2.f26096e) {
                    ((C6169e) ((InterfaceC5178e) AbstractC10432e.vip(c13136e2, AbstractC11473e.advert))).ad(0);
                }
                c13136e2.f26106e = true;
                C8419e c8419e2 = c13136e2.f26113e;
                if (c8419e2 != null) {
                    c8419e2.Signature(null);
                }
                c13136e2.f26113e = null;
                c13136e2.f26109e = null;
                return Unit.INSTANCE;
            default:
                int i3 = this.f1223e;
                C13136e c13136e3 = this.f1222e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    long vip5 = ((InterfaceC11678e) AbstractC10432e.vip(c13136e3, AbstractC11473e.pro)).vip();
                    this.f1223e = 1;
                    Object vip6 = AbstractC16481e.vip(vip5, this);
                    EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                    if (vip6 == enumC2821e3) {
                        return enumC2821e3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                Function0 function03 = c13136e3.f26111e;
                if (function03 != null) {
                    function03.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
