package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7054e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14479e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f14480e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Function3 f14481e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ AbstractC11424e f14482e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f14483e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7054e(Function3 function3, InterfaceC5083e interfaceC5083e, int i) {
        super(3, interfaceC5083e);
        this.f14479e = i;
        this.f14481e = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC11424e abstractC11424e = (AbstractC11424e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
        switch (this.f14479e) {
            case 0:
                C7054e c7054e = new C7054e(this.f14481e, interfaceC5083e, 0);
                c7054e.f14482e = abstractC11424e;
                c7054e.f14480e = obj2;
                return c7054e.loadAd(Unit.INSTANCE);
            default:
                C7054e c7054e2 = new C7054e(this.f14481e, interfaceC5083e, 1);
                c7054e2.f14482e = abstractC11424e;
                c7054e2.f14480e = obj2;
                return c7054e2.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f14479e) {
            case 0:
                AbstractC11424e abstractC11424e = this.f14482e;
                Object obj2 = this.f14480e;
                int i = this.f14483e;
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    if (!(obj2 instanceof AbstractC14601e)) {
                        return Unit.INSTANCE;
                    }
                    Object obj3 = abstractC11424e.f22964e;
                    this.f14482e = abstractC11424e;
                    this.f14480e = null;
                    this.f14483e = 1;
                    obj = this.f14481e.invoke(obj3, obj2, this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                AbstractC14601e abstractC14601e = (AbstractC14601e) obj;
                if (abstractC14601e == null) {
                    return Unit.INSTANCE;
                }
                this.f14482e = null;
                this.f14480e = null;
                this.f14483e = 2;
                if (abstractC11424e.purchase(this, abstractC14601e) == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
            default:
                AbstractC11424e abstractC11424e2 = this.f14482e;
                Object obj4 = this.f14480e;
                int i2 = this.f14483e;
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    Object obj5 = abstractC11424e2.f22964e;
                    this.f14482e = abstractC11424e2;
                    this.f14480e = null;
                    this.f14483e = 1;
                    obj = this.f14481e.invoke(obj5, obj4, this);
                    if (obj == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                AbstractC14601e abstractC14601e2 = (AbstractC14601e) obj;
                if (abstractC14601e2 != null) {
                    this.f14482e = null;
                    this.f14480e = null;
                    this.f14483e = 2;
                    if (abstractC11424e2.purchase(this, abstractC14601e2) == enumC2821e2) {
                        return enumC2821e2;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
