package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16600e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f32559e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f32560e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f32561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16600e(InterfaceC10481e interfaceC10481e, int i, InterfaceC5083e interfaceC5083e, int i2) {
        super(2, interfaceC5083e);
        this.f32559e = i2;
        this.f32560e = interfaceC10481e;
        this.f32561e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16600e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f32559e = i;
        this.f32560e = obj;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f32559e) {
            case 0:
                return new C16600e((C16070e) this.f32560e, interfaceC5083e, 0);
            case 1:
                return new C16600e((C16801e) this.f32560e, interfaceC5083e, 1);
            case 2:
                return new C16600e((C2435e) this.f32560e, interfaceC5083e, 2);
            case 3:
                return new C16600e((InterfaceC1108e) this.f32560e, interfaceC5083e, 3);
            case 4:
                return new C16600e((C15108e) this.f32560e, interfaceC5083e, 4);
            case 5:
                return new C16600e((C15598e) this.f32560e, interfaceC5083e, 5);
            case 6:
                return new C16600e((C13539e) this.f32560e, interfaceC5083e, 6);
            case 7:
                return new C16600e((C15969e) this.f32560e, interfaceC5083e, 7);
            case 8:
                return new C16600e((C7016e) this.f32560e, interfaceC5083e, 8);
            case 9:
                return new C16600e((C6799e) this.f32560e, interfaceC5083e, 9);
            case 10:
                return new C16600e((C9143e) this.f32560e, interfaceC5083e, 10);
            case 11:
                return new C16600e((C10053e) this.f32560e, interfaceC5083e, 11);
            case 12:
                return new C16600e((InterfaceC16671e) this.f32560e, interfaceC5083e, 12);
            case 13:
                return new C16600e((C8202e) this.f32560e, this.f32561e, interfaceC5083e, 13);
            case 14:
                return new C16600e((C10312e) this.f32560e, interfaceC5083e, 14);
            case 15:
                return new C16600e((C13713e) this.f32560e, this.f32561e, interfaceC5083e, 15);
            case 16:
                return new C16600e((C8381e) this.f32560e, interfaceC5083e, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C16600e((C8054e) this.f32560e, interfaceC5083e, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C16600e((C17424e) this.f32560e, interfaceC5083e, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C16600e((C16948e) this.f32560e, interfaceC5083e, 19);
            case 20:
                return new C16600e((C14478e) this.f32560e, interfaceC5083e, 20);
            case 21:
                return new C16600e((C16066e) this.f32560e, interfaceC5083e, 21);
            case 22:
                return new C16600e((C16213e) this.f32560e, interfaceC5083e, 22);
            case 23:
                return new C16600e((C11439e) this.f32560e, interfaceC5083e, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C16600e((C3625e) this.f32560e, interfaceC5083e, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C16600e((C4070e) this.f32560e, interfaceC5083e, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C16600e((C2921e) this.f32560e, interfaceC5083e, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C16600e((EnumC5778e) this.f32560e, interfaceC5083e, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C16600e((EnumC4169e) this.f32560e, interfaceC5083e, 28);
            default:
                return new C16600e((C4271e) this.f32560e, interfaceC5083e, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32559e) {
            case 0:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC1719e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC1719e) obj)).loadAd(Unit.INSTANCE);
            case 16:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
            case 20:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C16600e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03c3 A[LOOP:1: B:228:0x03c1->B:229:0x03c3, LOOP_END] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [eٟؔۙ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x022c -> B:128:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x023b -> B:126:0x023e). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16600e.loadAd(java.lang.Object):java.lang.Object");
    }
}
