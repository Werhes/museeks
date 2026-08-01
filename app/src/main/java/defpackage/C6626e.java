package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6626e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f13669e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f13670e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f13671e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f13672e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6626e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f13669e = i;
        this.f13670e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6626e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f13669e = i;
        this.f13671e = obj;
        this.f13670e = obj2;
    }

    private final Object inmobi(Object obj) {
        Object c12763e;
        InterfaceC16671e interfaceC16671e = (InterfaceC16671e) this.f13671e;
        int i = this.f13672e;
        try {
            if (i == 0) {
                AbstractC2003e.purchase(obj);
                C5981e c5981e = AbstractC15448e.ad;
                C4310e c4310e = (C4310e) this.f13670e;
                C17647e c17647e = C14157e.f27993e;
                long Signature = AbstractC0326e.Signature(30, EnumC15934e.SECONDS);
                C6626e c6626e = new C6626e(c4310e, interfaceC16671e, null, 27);
                this.f13671e = null;
                this.f13672e = 1;
                Object adcel = AbstractC8306e.adcel(Signature, c6626e, this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (adcel == enumC2821e) {
                    return enumC2821e;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2003e.purchase(obj);
            }
            c12763e = Unit.INSTANCE;
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        Throwable ad = C13523e.ad(c12763e);
        if (ad != null) {
            C7546e c7546e = C11102e.ad;
            C11102e.license(ad, AbstractC10064e.purchase(new C6571e("reason", "bus_message_collection_timeout"), new C6571e("type", AbstractC3826e.class.getName())));
        }
        return Unit.INSTANCE;
    }

    private final Object isPro(Object obj) {
        int i = this.f13672e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C4310e c4310e = (C4310e) this.f13671e;
            InterfaceC16671e interfaceC16671e = (InterfaceC16671e) this.f13670e;
            this.f13672e = 1;
            Object invoke = c4310e.invoke(interfaceC16671e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (invoke == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object isVip(Object obj) {
        int i = this.f13672e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
            throw new C14803e(9);
        }
        AbstractC2003e.purchase(obj);
        C10689e c10689e = (C10689e) this.f13671e;
        C1247e c1247e = (C1247e) this.f13670e;
        this.f13672e = 1;
        AbstractC1807e.ad(c10689e, c1247e, this);
        return EnumC2821e.f6782e;
    }

    private final Object signatures(Object obj) {
        int i = this.f13672e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            InterfaceC13742e interfaceC13742e = (InterfaceC13742e) this.f13671e;
            C18042e c18042e = new C18042e((AbstractC16904e) this.f13670e, null, 2);
            this.f13672e = 1;
            Object metrica = AbstractC13406e.metrica(interfaceC13742e, c18042e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (metrica == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object subscription(Object obj) {
        int i = this.f13672e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
            return obj;
        }
        AbstractC2003e.purchase(obj);
        InterfaceC8018e interfaceC8018e = ((C14067e) this.f13671e).metrica;
        C4870e c4870e = new C4870e((Long) this.f13670e, null, 25);
        this.f13672e = 1;
        Object vip = interfaceC8018e.vip(new C2122e(c4870e, null), this);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        return vip == enumC2821e ? enumC2821e : vip;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f13669e) {
            case 0:
                return new C6626e((C14875e) this.f13670e, interfaceC5083e, 0);
            case 1:
                return new C6626e((C4870e) this.f13671e, (InterfaceC16671e) this.f13670e, interfaceC5083e, 1);
            case 2:
                C6626e c6626e = new C6626e((C4870e) this.f13670e, interfaceC5083e, 2);
                c6626e.f13671e = obj;
                return c6626e;
            case 3:
                return new C6626e((C9042e) this.f13671e, (InterfaceC16671e) this.f13670e, interfaceC5083e, 3);
            case 4:
                C6626e c6626e2 = new C6626e((C9042e) this.f13670e, interfaceC5083e, 4);
                c6626e2.f13671e = obj;
                return c6626e2;
            case 5:
                return new C6626e((C12894e) this.f13671e, (C11364e) this.f13670e, interfaceC5083e, 5);
            case 6:
                return new C6626e((C12856e) this.f13671e, (C5033e) this.f13670e, interfaceC5083e, 6);
            case 7:
                return new C6626e((C12284e) this.f13671e, (String) this.f13670e, interfaceC5083e, 7);
            case 8:
                return new C6626e((C16070e) this.f13671e, (String) this.f13670e, interfaceC5083e, 8);
            case 9:
                return new C6626e((C4126e) this.f13671e, (String) this.f13670e, interfaceC5083e, 9);
            case 10:
                return new C6626e((String) this.f13671e, (C0267e) this.f13670e, interfaceC5083e, 10);
            case 11:
                return new C6626e((C0909e) this.f13671e, (C6088e) this.f13670e, interfaceC5083e, 11);
            case 12:
                return new C6626e((C16382e) this.f13671e, (C18447e) this.f13670e, interfaceC5083e, 12);
            case 13:
                return new C6626e((C13115e) this.f13671e, (C3658e) this.f13670e, interfaceC5083e, 13);
            case 14:
                return new C6626e((C13115e) this.f13671e, (InterfaceC13352e) this.f13670e, interfaceC5083e, 14);
            case 15:
                C6626e c6626e3 = new C6626e((InterfaceC1108e) this.f13670e, interfaceC5083e, 15);
                c6626e3.f13671e = obj;
                return c6626e3;
            case 16:
                return new C6626e((InterfaceC5673e) this.f13671e, (AbstractC9512e) this.f13670e, interfaceC5083e, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C6626e c6626e4 = new C6626e((C10838e) this.f13670e, interfaceC5083e, 17);
                c6626e4.f13671e = obj;
                return c6626e4;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C6626e((Context) this.f13671e, (AbstractC12260e) this.f13670e, interfaceC5083e, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C6626e((AbstractActivityC15824e) this.f13671e, (C7016e) this.f13670e, interfaceC5083e, 19);
            case 20:
                return new C6626e((C14947e) this.f13671e, (C10017e) this.f13670e, interfaceC5083e, 20);
            case 21:
                return new C6626e((InterfaceC12732e) this.f13671e, (C14542e) this.f13670e, interfaceC5083e, 21);
            case 22:
                return new C6626e((C11048e) this.f13671e, (C8004e) this.f13670e, interfaceC5083e, 22);
            case 23:
                return new C6626e((C14067e) this.f13671e, (Function1) this.f13670e, interfaceC5083e, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C6626e((C14067e) this.f13671e, (Long) this.f13670e, interfaceC5083e, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C6626e((InterfaceC13742e) this.f13671e, (AbstractC16904e) this.f13670e, interfaceC5083e, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C6626e((C10689e) this.f13671e, (C1247e) this.f13670e, interfaceC5083e, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C6626e((C4310e) this.f13671e, (InterfaceC16671e) this.f13670e, interfaceC5083e, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6626e c6626e5 = new C6626e((C4310e) this.f13670e, interfaceC5083e, 28);
                c6626e5.f13671e = obj;
                return c6626e5;
            default:
                return new C6626e((C4310e) this.f13671e, (InterfaceC16671e) this.f13670e, interfaceC5083e, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13669e) {
            case 0:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC9543e) obj)).loadAd(Unit.INSTANCE);
            case 16:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C6626e) advert((InterfaceC5083e) obj2, (C6999e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
            case 20:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C6626e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x06b2, code lost:
    
        if (r0 == r7) goto L337;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x081a  */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 2986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6626e.loadAd(java.lang.Object):java.lang.Object");
    }
}
