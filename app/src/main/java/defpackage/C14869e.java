package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٞۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14869e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f29441e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f29442e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f29443e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f29444e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f29445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14869e(C14826e c14826e, BroadcastReceiver.PendingResult pendingResult, Function2 function2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f29441e = 23;
        this.f29444e = c14826e;
        this.f29442e = pendingResult;
        this.f29443e = (AbstractC7185e) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14869e(C14995e c14995e, InterfaceC5083e interfaceC5083e, Function3 function3) {
        super(2, interfaceC5083e);
        this.f29441e = 3;
        this.f29442e = (AbstractC7185e) function3;
        this.f29443e = c14995e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14869e(C17292e c17292e, EnumC6955e enumC6955e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f29441e = 28;
        this.f29444e = c17292e;
        this.f29442e = enumC6955e;
        this.f29443e = (AbstractC7185e) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14869e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f29441e = i;
        this.f29443e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14869e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f29441e = i;
        this.f29442e = obj;
        this.f29443e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14869e(Object obj, Object obj2, Object obj3, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f29441e = i;
        this.f29444e = obj;
        this.f29442e = obj2;
        this.f29443e = obj3;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    private final Object signatures(Object obj) {
        int i = this.f29445e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C17292e c17292e = (C17292e) this.f29444e;
            C10684e c10684e = c17292e.metrica;
            C16822e c16822e = c17292e.vip;
            EnumC6955e enumC6955e = (EnumC6955e) this.f29442e;
            ?? r5 = (AbstractC7185e) this.f29443e;
            this.f29445e = 1;
            c10684e.getClass();
            Object appmetrica = AbstractC9743e.appmetrica(new C13455e(enumC6955e, c10684e, r5, c16822e, null), this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (appmetrica == enumC2821e) {
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
    
        if (r10 == r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r1.startapp(r5, r9) == r8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0051, code lost:
    
        if (r10 == r8) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object subscription(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14869e.subscription(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r1v18, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v7, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f29441e) {
            case 0:
                return new C14869e((C15274e) this.f29444e, (C1867e) this.f29442e, (InterfaceC1232e) this.f29443e, interfaceC5083e, 0);
            case 1:
                return new C14869e((Function2) this.f29444e, this.f29442e, (InterfaceC18435e) this.f29443e, interfaceC5083e, 1);
            case 2:
                C14869e c14869e = new C14869e((Function0) this.f29442e, (Function2) this.f29443e, interfaceC5083e, 2);
                c14869e.f29444e = obj;
                return c14869e;
            case 3:
                C14869e c14869e2 = new C14869e((C14995e) this.f29443e, interfaceC5083e, (Function3) this.f29442e);
                c14869e2.f29444e = obj;
                return c14869e2;
            case 4:
                C14869e c14869e3 = new C14869e((Function4) this.f29442e, (C14995e) this.f29443e, interfaceC5083e, 4);
                c14869e3.f29444e = obj;
                return c14869e3;
            case 5:
                C14869e c14869e4 = new C14869e((C13119e) this.f29442e, (InterfaceC3314e) this.f29443e, interfaceC5083e, 5);
                c14869e4.f29444e = obj;
                return c14869e4;
            case 6:
                C14869e c14869e5 = new C14869e((String) this.f29442e, (AppActivity) this.f29443e, interfaceC5083e, 6);
                c14869e5.f29444e = obj;
                return c14869e5;
            case 7:
                return new C14869e((C6337e) this.f29442e, (AppActivity) this.f29443e, interfaceC5083e, 7);
            case 8:
                return new C14869e((AbstractC5857e) this.f29444e, (Context) this.f29442e, (C10838e) this.f29443e, interfaceC5083e, 8);
            case 9:
                return new C14869e((C7995e) this.f29444e, (C5033e) this.f29442e, (ClassLoader) this.f29443e, interfaceC5083e, 9);
            case 10:
                return new C14869e((C17046e) this.f29444e, (String) this.f29442e, (C3967e) this.f29443e, interfaceC5083e, 10);
            case 11:
                return new C14869e((C13108e) this.f29442e, (C1097e) this.f29443e, interfaceC5083e, 11);
            case 12:
                return new C14869e((C7256e) this.f29443e, interfaceC5083e, 12);
            case 13:
                return new C14869e((InterfaceC13033e) this.f29444e, (InterfaceC1618e) this.f29442e, (Long) this.f29443e, interfaceC5083e, 13);
            case 14:
                return new C14869e((InterfaceC8384e) this.f29442e, (C6540e) this.f29443e, interfaceC5083e, 14);
            case 15:
                return new C14869e((EnumC16488e) this.f29444e, (InterfaceC3314e) this.f29442e, (C6540e) this.f29443e, interfaceC5083e, 15);
            case 16:
                return new C14869e((C16317e) this.f29444e, (AbstractC17732e) this.f29442e, (C14194e) this.f29443e, interfaceC5083e, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C14869e((C5327e) this.f29443e, interfaceC5083e, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C14869e((C11467e) this.f29444e, (String) this.f29442e, (C15031e) this.f29443e, interfaceC5083e, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C14869e((C8221e) this.f29444e, (String) this.f29442e, (C0272e) this.f29443e, interfaceC5083e, 19);
            case 20:
                C14869e c14869e6 = new C14869e((InterfaceC6034e) this.f29442e, (AbstractC9910e) this.f29443e, interfaceC5083e, 20);
                c14869e6.f29444e = obj;
                return c14869e6;
            case 21:
                C14869e c14869e7 = new C14869e((InterfaceC15080e) this.f29442e, this.f29443e, interfaceC5083e, 21);
                c14869e7.f29444e = obj;
                return c14869e7;
            case 22:
                C14869e c14869e8 = new C14869e((C2038e) this.f29443e, interfaceC5083e, 22);
                c14869e8.f29442e = obj;
                return c14869e8;
            case 23:
                return new C14869e((C14826e) this.f29444e, (BroadcastReceiver.PendingResult) this.f29442e, (Function2) this.f29443e, interfaceC5083e);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C14869e((C15972e) this.f29442e, (CoroutineWorker) this.f29443e, interfaceC5083e, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C14869e((VKProfile) this.f29444e, (C1875e) this.f29442e, (C0714e) this.f29443e, interfaceC5083e, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C14869e c14869e9 = new C14869e((C7576e) this.f29443e, interfaceC5083e, 26);
                c14869e9.f29442e = obj;
                return c14869e9;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C14869e((AudioTrack) this.f29444e, (DedicatedCacheService) this.f29442e, (CachedTrack) this.f29443e, interfaceC5083e, 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C14869e((C17292e) this.f29444e, (EnumC6955e) this.f29442e, (Function2) this.f29443e, interfaceC5083e);
            default:
                C14869e c14869e10 = new C14869e((C18237e) this.f29442e, (Function2) this.f29443e, interfaceC5083e, 29);
                c14869e10.f29444e = obj;
                return c14869e10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29441e) {
            case 0:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C14869e) advert((InterfaceC5083e) obj2, (C1295e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C14869e) advert((InterfaceC5083e) obj2, (C6571e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C14869e) advert((InterfaceC5083e) obj2, (C10848e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 16:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 20:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC6034e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C14869e) advert((InterfaceC5083e) obj2, (InterfaceC1719e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0756  */
    /* JADX WARN: Type inference failed for: r0v111, types: [eٟؔۙ] */
    /* JADX WARN: Type inference failed for: r1v124, types: [kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r1v49, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r2v6, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r4v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r4v12, types: [eُؑٗ] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r9v37, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:225:0x042d -> B:220:0x0430). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14869e.loadAd(java.lang.Object):java.lang.Object");
    }
}
