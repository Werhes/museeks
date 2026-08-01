package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.ShortcutBridgeActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7236e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14779e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f14780e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f14781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7236e(int i, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f14779e = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7236e(C7285e c7285e, int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f14779e = 11;
        this.f14780e = c7285e;
        this.f14781e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7236e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f14779e = i;
        this.f14780e = obj;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f14779e) {
            case 0:
                return new C7236e((String) this.f14780e, interfaceC5083e, 0);
            case 1:
                return new C7236e((C14947e) this.f14780e, interfaceC5083e, 1);
            case 2:
                return new C7236e((InterfaceC16132e) this.f14780e, interfaceC5083e, 2);
            case 3:
                return new C7236e((InterfaceC10081e) this.f14780e, interfaceC5083e, 3);
            case 4:
                return new C7236e((C9013e) this.f14780e, interfaceC5083e, 4);
            case 5:
                return new C7236e((C14609e) this.f14780e, interfaceC5083e, 5);
            case 6:
                return new C7236e(2, interfaceC5083e);
            case 7:
                return new C7236e((C18464e) this.f14780e, interfaceC5083e, 7);
            case 8:
                return new C7236e((C9261e) this.f14780e, interfaceC5083e, 8);
            case 9:
                return new C7236e((C18464e) this.f14780e, interfaceC5083e, 9);
            case 10:
                return new C7236e((C5769e) this.f14780e, interfaceC5083e, 10);
            case 11:
                return new C7236e((C7285e) this.f14780e, this.f14781e, interfaceC5083e);
            case 12:
                return new C7236e((C4199e) this.f14780e, interfaceC5083e, 12);
            case 13:
                return new C7236e((C9518e) this.f14780e, interfaceC5083e, 13);
            case 14:
                return new C7236e((C10743e) this.f14780e, interfaceC5083e, 14);
            case 15:
                return new C7236e((C4034e) this.f14780e, interfaceC5083e, 15);
            case 16:
                return new C7236e((InterfaceC10441e) this.f14780e, interfaceC5083e, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C7236e((C12340e) this.f14780e, interfaceC5083e, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C7236e((ShortcutBridgeActivity) this.f14780e, interfaceC5083e, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C7236e((C6029e) this.f14780e, interfaceC5083e, 19);
            case 20:
                return new C7236e((C6267e) this.f14780e, interfaceC5083e, 20);
            case 21:
                return new C7236e((C5422e) this.f14780e, interfaceC5083e, 21);
            case 22:
                return new C7236e((C0149e) this.f14780e, interfaceC5083e, 22);
            case 23:
                return new C7236e((C14214e) this.f14780e, interfaceC5083e, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C7236e((C3427e) this.f14780e, interfaceC5083e, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C7236e((C9556e) this.f14780e, interfaceC5083e, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C7236e((C9755e) this.f14780e, interfaceC5083e, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C7236e((C10771e) this.f14780e, interfaceC5083e, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C7236e((C13310e) this.f14780e, interfaceC5083e, 28);
            default:
                return new C7236e((C13622e) this.f14780e, interfaceC5083e, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14779e) {
            case 0:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                long j = ((C2152e) obj).ad;
                return new C7236e((C4034e) this.f14780e, (InterfaceC5083e) obj2, 15).loadAd(Unit.INSTANCE);
            case 16:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 20:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C7236e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v70, types: [eؚؖٞ, java.lang.Object] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7236e.loadAd(java.lang.Object):java.lang.Object");
    }
}
