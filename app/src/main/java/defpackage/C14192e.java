package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۘٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14192e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f28042e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C2347e f28043e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f28044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14192e(C2347e c2347e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f28042e = i;
        this.f28043e = c2347e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f28042e) {
            case 0:
                return new C14192e(this.f28043e, interfaceC5083e, 0);
            default:
                return new C14192e(this.f28043e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f28042e) {
            case 0:
                return ((C14192e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C14192e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f28042e;
        EnumC10002e enumC10002e = EnumC10002e.f19759e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        C2347e c2347e = this.f28043e;
        switch (i) {
            case 0:
                int i2 = this.f28044e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f28044e = 1;
                    if (AbstractC16481e.vip(500L, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                int i3 = C2347e.f5874e;
                c2347e.m808interface(enumC10002e);
                c2347e.f5878e = null;
                return Unit.INSTANCE;
            default:
                int i4 = this.f28044e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f28044e = 1;
                    if (AbstractC16481e.vip(1000L, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                int i5 = C2347e.f5874e;
                c2347e.m808interface(enumC10002e);
                c2347e.f5878e = null;
                return Unit.INSTANCE;
        }
    }
}
