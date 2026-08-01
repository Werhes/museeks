package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2733e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6632e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f6633e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C6260e f6634e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f6635e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C6260e f6636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2733e(C6260e c6260e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f6632e = i;
        this.f6634e = c6260e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f6632e) {
            case 0:
                C2733e c2733e = new C2733e(this.f6634e, interfaceC5083e, 0);
                c2733e.f6633e = obj;
                return c2733e;
            case 1:
                C2733e c2733e2 = new C2733e(this.f6634e, interfaceC5083e, 1);
                c2733e2.f6633e = obj;
                return c2733e2;
            case 2:
                C2733e c2733e3 = new C2733e(this.f6634e, interfaceC5083e, 2);
                c2733e3.f6633e = obj;
                return c2733e3;
            default:
                C2733e c2733e4 = new C2733e(this.f6634e, interfaceC5083e, 3);
                c2733e4.f6633e = obj;
                return c2733e4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f6632e) {
            case 0:
                return ((C2733e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C2733e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C2733e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C2733e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C6260e c6260e;
        C6260e c6260e2;
        C6260e c6260e3;
        C6260e c6260e4;
        switch (this.f6632e) {
            case 0:
                int i = this.f6635e;
                try {
                    if (i == 0) {
                        AbstractC2003e.purchase(obj);
                        c6260e = this.f6634e;
                        this.f6633e = null;
                        this.f6636e = c6260e;
                        this.f6635e = 1;
                        Object vip = AbstractC16481e.vip(250L, this);
                        EnumC2821e enumC2821e = EnumC2821e.f6782e;
                        if (vip == enumC2821e) {
                            return enumC2821e;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c6260e = this.f6636e;
                        AbstractC2003e.purchase(obj);
                    }
                    C6260e.vip(c6260e);
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            case 1:
                int i2 = this.f6635e;
                try {
                    if (i2 == 0) {
                        AbstractC2003e.purchase(obj);
                        c6260e2 = this.f6634e;
                        this.f6633e = null;
                        this.f6636e = c6260e2;
                        this.f6635e = 1;
                        Object vip2 = AbstractC16481e.vip(250L, this);
                        EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                        if (vip2 == enumC2821e2) {
                            return enumC2821e2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c6260e2 = this.f6636e;
                        AbstractC2003e.purchase(obj);
                    }
                    C6260e.vip(c6260e2);
                } catch (Throwable unused2) {
                }
                return Unit.INSTANCE;
            case 2:
                int i3 = this.f6635e;
                try {
                    if (i3 == 0) {
                        AbstractC2003e.purchase(obj);
                        c6260e3 = this.f6634e;
                        this.f6633e = null;
                        this.f6636e = c6260e3;
                        this.f6635e = 1;
                        Object vip3 = AbstractC16481e.vip(250L, this);
                        EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                        if (vip3 == enumC2821e3) {
                            return enumC2821e3;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c6260e3 = this.f6636e;
                        AbstractC2003e.purchase(obj);
                    }
                    C6260e.vip(c6260e3);
                } catch (Throwable unused3) {
                }
                return Unit.INSTANCE;
            default:
                int i4 = this.f6635e;
                try {
                    if (i4 == 0) {
                        AbstractC2003e.purchase(obj);
                        c6260e4 = this.f6634e;
                        this.f6633e = null;
                        this.f6636e = c6260e4;
                        this.f6635e = 1;
                        Object vip4 = AbstractC16481e.vip(250L, this);
                        EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                        if (vip4 == enumC2821e4) {
                            return enumC2821e4;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c6260e4 = this.f6636e;
                        AbstractC2003e.purchase(obj);
                    }
                    C6260e.vip(c6260e4);
                } catch (Throwable unused4) {
                }
                return Unit.INSTANCE;
        }
    }
}
