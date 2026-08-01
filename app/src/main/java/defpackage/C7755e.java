package defpackage;

import android.animation.ValueAnimator;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7755e extends C7460e implements Function0 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f15735e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7755e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f15735e = i4;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15735e;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        InterfaceC5083e interfaceC5083e = null;
        int i2 = 0;
        Object obj = this.f7266e;
        switch (i) {
            case 0:
                ((C9289e) obj).metrica.invoke();
                return Unit.INSTANCE;
            case 1:
                ((C1925e) obj).license.invoke();
                return Unit.INSTANCE;
            case 2:
                ((C4837e) obj).purchase.invoke();
                return Unit.INSTANCE;
            case 3:
                C10366e c10366e = (C10366e) ((InterfaceC1332e) obj);
                c10366e.vip.invoke(c10366e.license);
                return Unit.INSTANCE;
            case 4:
                C10366e c10366e2 = (C10366e) obj;
                if (((C15369e) c10366e2.yandex.startapp()).metrica.subs() == 1) {
                    z = false;
                } else {
                    c10366e2.appmetrica.ad(C15146e.f29965e, new C17084e(1));
                }
                return Boolean.valueOf(z);
            case 5:
                ((C14564e) obj).mo734case();
                return Unit.INSTANCE;
            case 6:
                ((C12688e) obj).mo734case();
                return Unit.INSTANCE;
            case 7:
                C12688e c12688e = (C12688e) obj;
                c12688e.getClass();
                c12688e.m2514goto(new C14398e());
                return Unit.INSTANCE;
            case 8:
                C12688e c12688e2 = (C12688e) obj;
                AbstractC16519e.vip((AppActivity) c12688e2.pro(), new C13024e(c12688e2, null));
                return Unit.INSTANCE;
            case 9:
                PlaybackService playbackService = (PlaybackService) obj;
                AbstractC5336e.purchase(playbackService.f36734e, null, 0, new C0990e(playbackService, interfaceC5083e, c == true ? 1 : 0), 3);
                return Unit.INSTANCE;
            case 10:
                C1511e c1511e = (C1511e) obj;
                ValueAnimator valueAnimator = c1511e.yandex;
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
                c1511e.startapp = false;
                c1511e.adcel = false;
                C12490e c12490e = c1511e.appmetrica ? c1511e.vip : c1511e.metrica;
                c12490e.mo2139this();
                c12490e.stop();
                c1511e.ad().mo2126for(1.0f);
                return Unit.INSTANCE;
            case 11:
                ((C13642e) obj).mo734case();
                return Unit.INSTANCE;
            case 12:
                ((C5421e) obj).mo734case();
                return Unit.INSTANCE;
            case 13:
                C5421e c5421e = (C5421e) obj;
                AppActivity appActivity = (AppActivity) c5421e.pro();
                AudioTrack audioTrack = c5421e.m1909transient().ad.mopub;
                if (audioTrack != null) {
                    AbstractC13201e.metrica(appActivity, new C0227e(audioTrack), C0086e.billing);
                }
                return Unit.INSTANCE;
            case 14:
                ((C16341e) obj).getClass();
                return null;
            case 15:
                ((C9261e) obj).mo734case();
                return Unit.INSTANCE;
            case 16:
                ((C2160e) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C5769e c5769e = (C5769e) obj;
                c5769e.m1967private(false);
                C7546e c7546e = C11102e.ad;
                if (C11102e.purchase() != 0) {
                    AbstractC16519e.vip((AppActivity) c5769e.pro(), new C4905e(c5769e, interfaceC5083e, i2));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C5769e c5769e2 = (C5769e) obj;
                c5769e2.m1967private(false);
                AbstractC16519e.vip((AppActivity) c5769e2.pro(), new C4905e(c5769e2, interfaceC5083e, c2 == true ? 1 : 0));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C5769e) obj).m1967private(false);
                C7546e c7546e2 = C11102e.ad;
                try {
                    C10675e c10675e = C11102e.metrica;
                    if (c10675e != null) {
                        C18511e c18511e = AbstractC11062e.f21949e;
                        c18511e.Signature(c10675e);
                        c18511e.purchase(c10675e);
                    }
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            case 20:
                ((C5769e) obj).mo734case();
                return Unit.INSTANCE;
            case 21:
                ((C14197e) obj).mo734case();
                return Unit.INSTANCE;
            case 22:
                C14197e c14197e = (C14197e) obj;
                c14197e.f28051e.setValue(Boolean.TRUE);
                AbstractC5336e.purchase(c14197e, null, 0, new C3523e(c14197e, interfaceC5083e, 2), 3);
                return Unit.INSTANCE;
            case 23:
                ((C9518e) obj).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((InterfaceC5673e) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C16818e c16818e = (C16818e) obj;
                C14137e c14137e = c16818e.appmetrica;
                Unit unit = Unit.INSTANCE;
                if (c14137e.amazon(unit) instanceof C8870e) {
                    c16818e.vip.crashlytics(-1);
                }
                return unit;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C14141e) obj).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C4944e) obj).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C17312e) obj).purchase();
                return Unit.INSTANCE;
            default:
                ((C16110e) obj).ad(!((Boolean) r5.appmetrica.getValue()).booleanValue());
                return Unit.INSTANCE;
        }
    }
}
