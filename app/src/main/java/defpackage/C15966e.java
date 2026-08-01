package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.cache.path_migration.DedicatedCacheMigrationService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15966e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31478e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f31479e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f31480e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f31481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15966e(C7576e c7576e, InterfaceC5979e interfaceC5979e, C11467e c11467e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f31478e = 7;
        this.f31480e = c7576e;
        this.f31479e = c11467e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15966e(C7576e c7576e, C17215e c17215e, InterfaceC5979e interfaceC5979e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f31478e = 8;
        this.f31480e = c7576e;
        this.f31479e = c17215e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15966e(C15062e c15062e, InterfaceC5083e interfaceC5083e, List list) {
        super(2, interfaceC5083e);
        this.f31478e = 29;
        this.f31480e = c15062e;
        this.f31479e = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15966e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f31478e = i;
        this.f31479e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15966e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f31478e = i;
        this.f31480e = obj;
        this.f31479e = obj2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f31478e) {
            case 0:
                return new C15966e((ScrollCaptureCallbackC17336e) this.f31480e, (Runnable) this.f31479e, interfaceC5083e, 0);
            case 1:
                return new C15966e((InterfaceC13742e) this.f31480e, (C15860e) this.f31479e, interfaceC5083e, 1);
            case 2:
                return new C15966e((AbstractC15876e) this.f31480e, (List) this.f31479e, interfaceC5083e, 2);
            case 3:
                return new C15966e((AbstractC15876e) this.f31480e, (C0593e) this.f31479e, interfaceC5083e, 3);
            case 4:
                return new C15966e((AbstractC9870e) this.f31480e, (List) this.f31479e, interfaceC5083e, 4);
            case 5:
                return new C15966e((InterfaceC10500e) this.f31480e, (C10771e) this.f31479e, interfaceC5083e, 5);
            case 6:
                C15966e c15966e = new C15966e(this.f31479e, interfaceC5083e, 6);
                c15966e.f31480e = obj;
                return c15966e;
            case 7:
                return new C15966e((C7576e) this.f31480e, (InterfaceC5979e) null, (C11467e) this.f31479e, interfaceC5083e);
            case 8:
                return new C15966e((C7576e) this.f31480e, (C17215e) this.f31479e, (InterfaceC5979e) null, interfaceC5083e);
            case 9:
                return new C15966e((C9573e) this.f31480e, (InterfaceC16671e) this.f31479e, interfaceC5083e, 9);
            case 10:
                C15966e c15966e2 = new C15966e((C9573e) this.f31479e, interfaceC5083e, 10);
                c15966e2.f31480e = obj;
                return c15966e2;
            case 11:
                return new C15966e((C9573e) this.f31480e, (InterfaceC16671e) this.f31479e, interfaceC5083e, 11);
            case 12:
                C15966e c15966e3 = new C15966e((C9573e) this.f31479e, interfaceC5083e, 12);
                c15966e3.f31480e = obj;
                return c15966e3;
            case 13:
                return new C15966e((C9573e) this.f31480e, (InterfaceC16671e) this.f31479e, interfaceC5083e, 13);
            case 14:
                C15966e c15966e4 = new C15966e((C9573e) this.f31479e, interfaceC5083e, 14);
                c15966e4.f31480e = obj;
                return c15966e4;
            case 15:
                return new C15966e((C9573e) this.f31480e, (InterfaceC16671e) this.f31479e, interfaceC5083e, 15);
            case 16:
                C15966e c15966e5 = new C15966e((C9573e) this.f31479e, interfaceC5083e, 16);
                c15966e5.f31480e = obj;
                return c15966e5;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C15966e((C9573e) this.f31480e, (InterfaceC16671e) this.f31479e, interfaceC5083e, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C15966e c15966e6 = new C15966e((C9573e) this.f31479e, interfaceC5083e, 18);
                c15966e6.f31480e = obj;
                return c15966e6;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C15966e((C4870e) this.f31480e, (InterfaceC16671e) this.f31479e, interfaceC5083e, 19);
            case 20:
                C15966e c15966e7 = new C15966e((C4870e) this.f31479e, interfaceC5083e, 20);
                c15966e7.f31480e = obj;
                return c15966e7;
            case 21:
                return new C15966e((C9042e) this.f31480e, (InterfaceC16671e) this.f31479e, interfaceC5083e, 21);
            case 22:
                C15966e c15966e8 = new C15966e((C9042e) this.f31479e, interfaceC5083e, 22);
                c15966e8.f31480e = obj;
                return c15966e8;
            case 23:
                return new C15966e((DedicatedCacheMigrationService) this.f31480e, (C7163e) this.f31479e, interfaceC5083e, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C15966e((InterfaceC9093e) this.f31480e, (C0389e) this.f31479e, interfaceC5083e, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C15966e((C4870e) this.f31480e, (InterfaceC16671e) this.f31479e, interfaceC5083e, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C15966e c15966e9 = new C15966e((C4870e) this.f31479e, interfaceC5083e, 26);
                c15966e9.f31480e = obj;
                return c15966e9;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C15966e((C9042e) this.f31480e, (InterfaceC16671e) this.f31479e, interfaceC5083e, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C15966e c15966e10 = new C15966e((C9042e) this.f31479e, interfaceC5083e, 28);
                c15966e10.f31480e = obj;
                return c15966e10;
            default:
                return new C15966e((C15062e) this.f31480e, interfaceC5083e, (List) this.f31479e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31478e) {
            case 0:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
            case 6:
                return ((C15966e) advert((InterfaceC5083e) obj2, (C5817e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 16:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 20:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC16671e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C15966e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:365:0x060e, code lost:
    
        if (r3 == r2) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x06e0, code lost:
    
        if (defpackage.AbstractC16481e.vip(500, r18) == r2) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x06bd, code lost:
    
        if (defpackage.AbstractC6629e.purchase(r0, r18) == r2) goto L419;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06d5  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:378:0x06e0 -> B:373:0x06e3). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 2102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15966e.loadAd(java.lang.Object):java.lang.Object");
    }
}
