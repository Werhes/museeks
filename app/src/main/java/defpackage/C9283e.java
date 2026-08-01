package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioChartInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9283e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18503e;

    public /* synthetic */ C9283e(int i) {
        this.f18503e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18503e) {
            case 0:
                return EnumC10609e.Companion.serializer();
            case 1:
                return EnumC6664e.Companion.serializer();
            case 2:
                return EnumC2057e.Companion.serializer();
            case 3:
                return EnumC14925e.Companion.serializer();
            case 4:
                return EnumC13802e.Companion.serializer();
            case 5:
                return new C13758e(C5992e.ad, 0);
            case 6:
                return new C13758e(C5992e.ad, 0);
            case 7:
                return new C13758e(new C13758e(C13852e.ad, 0), 0);
            case 8:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAudioDto.GenreIdDto", EnumC10609e.values(), new String[]{"1", "2", "3", "4", "5", "6", "7", "21", "8", "1001", "10", "11", "12", "13", "14", "15", "16", "17", "19", "22", "18"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 9:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAudioDto.MstcpTypeDto", EnumC2057e.values(), new String[]{"0", "1", "2"}, new Annotation[][]{null, null, null});
            case 10:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAudioDto.TrackGenreIdDto", EnumC14925e.values(), new String[]{"1", "2", "3", "5", "6", "4", "7", "8", "10", "11", "13", "14", "15", "16", "17", "21", "22", "1001"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 11:
                return EnumC10562e.Companion.serializer();
            case 12:
                return new C13758e(C13913e.ad, 0);
            case 13:
                return new C13758e(C1317e.ad, 0);
            case 14:
                return new C13758e(C16030e.ad, 0);
            case 15:
                return new C13758e(C1442e.ad, 0);
            case 16:
                return new C13758e(C13913e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C13758e(C13913e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audiobook.AudioBooksAccessStatusDto", EnumC10562e.values(), new String[]{"free", "paid", "started"}, new Annotation[][]{null, null, null});
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return EnumC8272e.Companion.serializer();
            case 20:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audiobook.AudioBooksChapterProgressStatusDto", EnumC8272e.values(), new String[]{"done", "in_progress", "unread"}, new Annotation[][]{null, null, null});
            case 21:
                return new C13758e(C7058e.ad, 0);
            case 22:
                return new C13758e(C3316e.ad, 0);
            case 23:
                C10230e c10230e = AudioChartInfo.Companion;
                return new C13458e("ua.itaysonlab.vkapi2.objects.music.AudioChartInfo.ChartState", EnumC11609e.values());
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return EnumC10057e.Companion.serializer();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioChartInfoDto.StateDto", EnumC10057e.values(), new String[]{"0", "1", "2", "3"}, new Annotation[][]{null, null, null, null});
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C13758e(C9046e.ad, 0);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C13758e(C9046e.ad, 0);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C13758e(C9046e.ad, 0);
            default:
                return new C13758e(C9582e.ad, 0);
        }
    }
}
