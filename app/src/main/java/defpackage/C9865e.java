package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۣۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9865e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19468e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C6759e f19469e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f19470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9865e(C6759e c6759e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f19468e = i;
        this.f19469e = c6759e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f19468e) {
            case 0:
                return new C9865e(this.f19469e, interfaceC5083e, 0);
            case 1:
                return new C9865e(this.f19469e, interfaceC5083e, 1);
            default:
                return new C9865e(this.f19469e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f19468e) {
            case 0:
                return ((C9865e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C9865e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C9865e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f19468e;
        C6759e c6759e = this.f19469e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f19470e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f19470e = 1;
                    if (C6759e.inmobi(c6759e, this) == enumC2821e) {
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
                int i3 = this.f19470e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C5981e c5981e = AbstractC15448e.ad;
                    this.f19470e = 1;
                    if (AbstractC15448e.ad(C11383e.ad, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                c6759e.purchase();
                return Unit.INSTANCE;
            default:
                int i4 = this.f19470e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f19470e = 1;
                    if (C6759e.isVip(c6759e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
