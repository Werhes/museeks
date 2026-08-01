package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14566e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f28781e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f28782e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f28783e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ Object f28784e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f28785e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f28786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14566e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(3, interfaceC5083e);
        this.f28781e = i;
        this.f28782e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14566e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(3, interfaceC5083e);
        this.f28781e = i;
        this.f28784e = obj;
        this.f28782e = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f28781e) {
            case 0:
                C14566e c14566e = new C14566e((C12856e) this.f28784e, (String) this.f28782e, (InterfaceC5083e) obj3, 0);
                c14566e.f28785e = (C5033e) obj;
                c14566e.f28783e = (ClassLoader) obj2;
                return c14566e.loadAd(Unit.INSTANCE);
            case 1:
                C14566e c14566e2 = new C14566e((List) this.f28782e, (InterfaceC5083e) obj3, 1);
                c14566e2.f28783e = (C4371e) obj;
                c14566e2.f28784e = (C10263e) obj2;
                return c14566e2.loadAd(Unit.INSTANCE);
            case 2:
                C14566e c14566e3 = new C14566e((C7145e) this.f28782e, (InterfaceC5083e) obj3, 2);
                c14566e3.f28783e = (C10263e) obj;
                c14566e3.f28784e = (Function1) obj2;
                return c14566e3.loadAd(Unit.INSTANCE);
            default:
                C14566e c14566e4 = new C14566e((Function3) this.f28784e, (C9398e) this.f28782e, (InterfaceC5083e) obj3, 3);
                c14566e4.f28785e = (InterfaceC11426e) obj;
                c14566e4.f28783e = (C10263e) obj2;
                return c14566e4.loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eؙۧؐ, java.lang.Object, eؙٙؓ, eُۥٔ] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Throwable th;
        C11380e c11380e;
        int i = this.f28781e;
        Object obj2 = this.f28782e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                C5033e c5033e = (C5033e) this.f28785e;
                ClassLoader classLoader = (ClassLoader) this.f28783e;
                int i2 = this.f28786e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C12856e c12856e = (C12856e) this.f28784e;
                    String str = (String) obj2;
                    this.f28785e = null;
                    this.f28783e = null;
                    this.f28786e = 1;
                    Object vip = c12856e.vip(str, new C2119e(classLoader, str, c5033e, c12856e, null), this);
                    if (vip != enumC2821e) {
                        vip = Unit.INSTANCE;
                    }
                    if (vip == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                C4371e c4371e = (C4371e) this.f28783e;
                C10263e c10263e = (C10263e) this.f28784e;
                int i3 = this.f28786e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f28783e = null;
                    this.f28784e = null;
                    this.f28786e = 1;
                    obj = c4371e.f9506e.ad(c10263e, this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5042e c5042e = (C5042e) this.f28785e;
                        AbstractC2003e.purchase(obj);
                        return c5042e;
                    }
                    AbstractC2003e.purchase(obj);
                }
                C5042e c5042e2 = (C5042e) obj;
                List list = (List) obj2;
                AbstractC16824e abstractC16824e = c5042e2.f10750e;
                if (abstractC16824e == null) {
                    abstractC16824e = null;
                }
                this.f28783e = null;
                this.f28784e = null;
                this.f28785e = c5042e2;
                this.f28786e = 2;
                return AbstractC14421e.vip(list, abstractC16824e, this) == enumC2821e ? enumC2821e : c5042e2;
            case 2:
                C10263e c10263e2 = (C10263e) this.f28783e;
                Function1 function1 = (Function1) this.f28784e;
                int i4 = this.f28786e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    ?? c6799e = new C6799e(c10263e2.appmetrica);
                    InterfaceC10500e interfaceC10500e = (InterfaceC10500e) ((C7145e) obj2).ad.f18702e.mo397public(C4524e.f9798e);
                    InterfaceC4911e interfaceC4911e = AbstractC7609e.ad;
                    c6799e.mo692else(new C2109e(5, interfaceC10500e.mo692else(new C2109e(4, c6799e))));
                    try {
                        c10263e2.appmetrica = c6799e;
                        this.f28783e = null;
                        this.f28784e = null;
                        this.f28785e = c6799e;
                        this.f28786e = 1;
                        if (function1.invoke(this) == enumC2821e) {
                            return enumC2821e;
                        }
                        c11380e = c6799e;
                    } catch (Throwable th2) {
                        th = th2;
                        c11380e = c6799e;
                        c11380e.m2244e(th);
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c11380e = (C11380e) this.f28785e;
                    try {
                        AbstractC2003e.purchase(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            c11380e.m2244e(th);
                            throw th;
                        } catch (Throwable th4) {
                            c11380e.m2245e();
                            throw th4;
                        }
                    }
                }
                c11380e.m2245e();
                return Unit.INSTANCE;
            default:
                InterfaceC11426e interfaceC11426e = (InterfaceC11426e) this.f28785e;
                C10263e c10263e3 = (C10263e) this.f28783e;
                int i5 = this.f28786e;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                Function3 function3 = (Function3) this.f28784e;
                C4371e c4371e2 = new C4371e(interfaceC11426e, ((C9398e) obj2).f18702e);
                this.f28785e = null;
                this.f28783e = null;
                this.f28786e = 1;
                Object invoke = function3.invoke(c4371e2, c10263e3, this);
                return invoke == enumC2821e ? enumC2821e : invoke;
        }
    }
}
