package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۜۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1349e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4145e;

    public /* synthetic */ C1349e(int i) {
        this.f4145e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4145e) {
            case 0:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistDto.PlaylistTypeDto", EnumC4165e.values(), new String[]{"0", "1", "2", "3", "4", "5", "6"}, new Annotation[][]{null, new Annotation[]{new C6134e(new String[]{"album"})}, new Annotation[]{new C6134e(new String[]{"ep"})}, new Annotation[]{new C6134e(new String[]{"collection"})}, new Annotation[]{new C6134e(new String[]{"single"})}, new Annotation[]{new C6134e(new String[]{"chat"})}, new Annotation[]{new C6134e(new String[]{"ugc"})}});
            case 1:
                return EnumC6024e.Companion.serializer();
            case 2:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistViewDto", EnumC6024e.values(), new String[]{"compact"}, new Annotation[][]{null});
            case 3:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioRestrictionDto", EnumC13802e.values(), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "21", "22", "23"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 4:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioSearchFilterDto", EnumC5195e.values(), new String[]{"all", "global", "owned"}, new Annotation[][]{null, null, null});
            case 5:
                return C8641e.Companion.serializer(C1471e.ad);
            case 6:
                return C8641e.Companion.serializer(C14729e.ad);
            case 7:
                return C8641e.Companion.serializer(C5992e.ad);
            case 8:
                return C8641e.Companion.serializer(C1471e.ad);
            case 9:
                return C8641e.Companion.serializer(C14729e.ad);
            case 10:
                return C8641e.Companion.serializer(C1471e.ad);
            case 11:
                return C8641e.Companion.serializer(C1471e.ad);
            case 12:
                return new C13758e(C14729e.ad, 0);
            case 13:
                return new C13758e(C15663e.ad, 0);
            case 14:
                return new C13758e(C14713e.ad, 0);
            case 15:
                C17058e c17058e = AudioTrack.Companion;
                return new C13758e(C3194e.ad, 0);
            case 16:
                C17058e c17058e2 = AudioTrack.Companion;
                return new C13758e(C3194e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C13758e(C14563e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C13758e(C3891e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C13758e(C12881e.ad, 0);
            case 20:
                return new C5619e();
            case 21:
                return new LinkedHashMap();
            case 22:
                return new C5619e();
            case 23:
                return new LinkedHashMap();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C13758e(C8782e.ad, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C13758e(C7946e.ad, 0);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C13758e(C0494e.ad, 0);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.auth.AuthSignupFieldsValuesDto.GenderDto", EnumC4237e.values(), new String[]{"0", "1", "2"}, new Annotation[][]{null, null, null});
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.user.UsersUserProfileTypeDto", EnumC7830e.values(), new String[]{"0", "2"}, new Annotation[][]{null, null});
            default:
                return new C13758e(C5911e.ad, 0);
        }
    }
}
