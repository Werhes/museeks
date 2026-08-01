package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.session.SessionWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.ShortcutBridgeActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۦّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7602e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f15449e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f15450e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f15451e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f15452e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7602e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f15449e = i;
        this.f15450e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7602e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f15449e = i;
        this.f15451e = obj;
        this.f15450e = obj2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f15449e) {
            case 0:
                C7602e c7602e = new C7602e((C0567e) this.f15450e, interfaceC5083e, 0);
                c7602e.f15451e = obj;
                return c7602e;
            case 1:
                return new C7602e((C9456e) this.f15451e, (InterfaceC16132e) this.f15450e, interfaceC5083e, 1);
            case 2:
                return new C7602e((C15274e) this.f15451e, (C16330e) this.f15450e, interfaceC5083e, 2);
            case 3:
                return new C7602e((AbstractC16904e) this.f15451e, (C16330e) this.f15450e, interfaceC5083e, 3);
            case 4:
                return new C7602e((InterfaceC17155e) this.f15451e, (C10566e) this.f15450e, interfaceC5083e, 4);
            case 5:
                return new C7602e((SessionWorker) this.f15451e, (C16007e) this.f15450e, interfaceC5083e, 5);
            case 6:
                return new C7602e((C6621e) this.f15451e, (C16655e) this.f15450e, interfaceC5083e, 6);
            case 7:
                return new C7602e((C7589e) this.f15451e, (C13540e) this.f15450e, interfaceC5083e, 7);
            case 8:
                return new C7602e((C4473e) this.f15451e, (C12893e) this.f15450e, interfaceC5083e, 8);
            case 9:
                return new C7602e((ShortcutBridgeActivity) this.f15451e, (InterfaceC1686e) this.f15450e, interfaceC5083e, 9);
            case 10:
                return new C7602e((C11188e) this.f15451e, (C4993e) this.f15450e, interfaceC5083e, 10);
            case 11:
                return new C7602e((C18474e) this.f15451e, (InterfaceC16671e) this.f15450e, interfaceC5083e, 11);
            case 12:
                C7602e c7602e2 = new C7602e((C18474e) this.f15450e, interfaceC5083e, 12);
                c7602e2.f15451e = obj;
                return c7602e2;
            case 13:
                return new C7602e((C5245e) this.f15451e, (InterfaceC16671e) this.f15450e, interfaceC5083e, 13);
            case 14:
                C7602e c7602e3 = new C7602e((C5245e) this.f15450e, interfaceC5083e, 14);
                c7602e3.f15451e = obj;
                return c7602e3;
            case 15:
                return new C7602e((C15274e) this.f15451e, (C12742e) this.f15450e, interfaceC5083e, 15);
            case 16:
                return new C7602e((InterfaceC3239e) this.f15451e, (InterfaceC3314e) this.f15450e, interfaceC5083e, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C7602e((C18362e) this.f15451e, (InterfaceC14181e) this.f15450e, interfaceC5083e, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C7602e c7602e4 = new C7602e((C18046e) this.f15450e, interfaceC5083e, 18);
                c7602e4.f15451e = obj;
                return c7602e4;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C7602e((AbstractC16824e) this.f15451e, (AbstractC11069e) this.f15450e, interfaceC5083e, 19);
            case 20:
                C7602e c7602e5 = new C7602e((C10872e) this.f15450e, interfaceC5083e, 20);
                c7602e5.f15451e = obj;
                return c7602e5;
            case 21:
                return new C7602e((C12344e) this.f15451e, (InterfaceC2869e) this.f15450e, interfaceC5083e, 21);
            case 22:
                return new C7602e((C10954e) this.f15451e, (InterfaceC16671e) this.f15450e, interfaceC5083e, 22);
            case 23:
                C7602e c7602e6 = new C7602e((C10954e) this.f15450e, interfaceC5083e, 23);
                c7602e6.f15451e = obj;
                return c7602e6;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C7602e((C16546e) this.f15451e, (C15274e) this.f15450e, interfaceC5083e, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C7602e c7602e7 = new C7602e((C9556e) this.f15450e, interfaceC5083e, 25);
                c7602e7.f15451e = obj;
                return c7602e7;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C7602e((InterfaceC10500e) this.f15451e, (C14307e) this.f15450e, interfaceC5083e, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C7602e((EnumC1320e) this.f15451e, (C1902e) this.f15450e, interfaceC5083e, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C7602e c7602e8 = new C7602e((C1902e) this.f15450e, interfaceC5083e, 28);
                c7602e8.f15451e = obj;
                return c7602e8;
            default:
                C7602e c7602e9 = new C7602e((C11242e) this.f15450e, interfaceC5083e, 29);
                c7602e9.f15451e = obj;
                return c7602e9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15449e) {
            case 0:
                return ((C7602e) advert((InterfaceC5083e) obj2, (String) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 16:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C7602e) advert((InterfaceC5083e) obj2, (C15866e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 20:
                ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC6034e) obj)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
            case 21:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C7602e) advert((InterfaceC5083e) obj2, (C12747e) obj)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
            default:
                return ((C7602e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0358, code lost:
    
        if (r0 != r11) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x033a, code lost:
    
        if (r2 == r11) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03d9, code lost:
    
        if (r1.isTouchExplorationEnabled() != false) goto L226;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 2252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7602e.loadAd(java.lang.Object):java.lang.Object");
    }
}
