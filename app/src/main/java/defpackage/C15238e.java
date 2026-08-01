package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15238e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30142e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f30143e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f30144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15238e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f30142e = i;
        this.f30143e = obj;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f30142e) {
            case 0:
                return new C15238e((AbstractC10149e) this.f30143e, interfaceC5083e, 0);
            case 1:
                return new C15238e((C15458e) this.f30143e, interfaceC5083e, 1);
            case 2:
                return new C15238e((AppActivity) this.f30143e, interfaceC5083e, 2);
            case 3:
                return new C15238e((C11800e) this.f30143e, interfaceC5083e, 3);
            case 4:
                return new C15238e((InterfaceC1160e) this.f30143e, interfaceC5083e, 4);
            case 5:
                return new C15238e((C0063e) this.f30143e, interfaceC5083e, 5);
            case 6:
                return new C15238e((AbstractC9194e) this.f30143e, interfaceC5083e, 6);
            case 7:
                return new C15238e((C1208e) this.f30143e, interfaceC5083e, 7);
            case 8:
                return new C15238e((AbstractC18406e) this.f30143e, interfaceC5083e, 8);
            case 9:
                return new C15238e((InterfaceC13033e) this.f30143e, interfaceC5083e, 9);
            case 10:
                return new C15238e((C2331e) this.f30143e, interfaceC5083e, 10);
            case 11:
                return new C15238e((C5250e) this.f30143e, interfaceC5083e, 11);
            case 12:
                return new C15238e((C14246e) this.f30143e, interfaceC5083e, 12);
            case 13:
                return new C15238e((C13738e) this.f30143e, interfaceC5083e, 13);
            case 14:
                return new C15238e((C8221e) this.f30143e, interfaceC5083e, 14);
            case 15:
                return new C15238e((C0272e) this.f30143e, interfaceC5083e, 15);
            case 16:
                return new C15238e((C2628e) this.f30143e, interfaceC5083e, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C15238e((C4811e) this.f30143e, interfaceC5083e, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C15238e((C0593e) this.f30143e, interfaceC5083e, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C15238e((CoroutineWorker) this.f30143e, interfaceC5083e, 19);
            case 20:
                return new C15238e((C2616e) this.f30143e, interfaceC5083e, 20);
            case 21:
                return new C15238e((C13732e) this.f30143e, interfaceC5083e, 21);
            case 22:
                return new C15238e((C5223e) this.f30143e, interfaceC5083e, 22);
            case 23:
                return new C15238e((CachedTrack) this.f30143e, interfaceC5083e, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C15238e((C0437e) this.f30143e, interfaceC5083e, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C15238e((C14875e) this.f30143e, interfaceC5083e, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C15238e((C12602e) this.f30143e, interfaceC5083e, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C15238e((C5033e) this.f30143e, interfaceC5083e, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C15238e((C12856e) this.f30143e, interfaceC5083e, 28);
            default:
                return new C15238e((C12284e) this.f30143e, interfaceC5083e, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f30142e) {
            case 0:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 16:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 20:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C15238e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:407:0x06b4, code lost:
    
        if (r15 == r0) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x07fd, code lost:
    
        if (defpackage.C17354e.adcel(r14) == r0) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x07f4, code lost:
    
        if (kotlin.Unit.INSTANCE == r0) goto L425;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [eٟؔۙ] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 2388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15238e.loadAd(java.lang.Object):java.lang.Object");
    }
}
