package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxnative.VKXNative;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8462e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17233e;

    public /* synthetic */ C8462e(int i) {
        this.f17233e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17233e) {
            case 0:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkshared.ValidationTypeConfirmation", EnumC8519e.values(), new String[]{"sms", "push", "email", "callreset"}, new Annotation[][]{null, null, null, null});
            case 1:
                return new C13758e(C3940e.ad, 0);
            case 2:
                C0308e c0308e = new C0308e();
                c0308e.ad = VKXNative.x00().ad;
                return c0308e;
            case 3:
                return Unit.INSTANCE;
            case 4:
                return Unit.INSTANCE;
            case 5:
                return new C13758e(C14238e.ad, 0);
            case 6:
                return new C13758e(C9582e.ad, 0);
            case 7:
                return new C13758e(C9582e.ad, 0);
            case 8:
                return new C13758e(C9582e.ad, 0);
            case 9:
                return new C13758e(C1321e.ad, 0);
            case 10:
                return new C13458e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC4755e.values());
            case 11:
                return new C13458e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC4755e.values());
            case 12:
                return new C13458e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC4755e.values());
            case 13:
                return new C13458e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC4755e.values());
            case 14:
                return new C13458e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC4755e.values());
            case 15:
                return new C13458e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC4755e.values());
            case 16:
                return new C13758e(C9582e.ad, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C13458e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC4755e.values());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C13458e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC4755e.values());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C9582e c9582e = C9582e.ad;
                return new C17327e(c9582e, c9582e, 1);
            case 20:
                return new C13458e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC4755e.values());
            case 21:
                C18384e c18384e = new C18384e(AbstractC3820e.ad.vip(AbstractC18159e.class));
                c18384e.vip = Arrays.asList(new Annotation[0]);
                return c18384e;
            case 22:
                throw new IllegalStateException("Install VkxApplicationGlue first!");
            case 23:
                C14808e c14808e = AbstractC11069e.Signature;
                return new C7208e(c14808e, c14808e);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C13758e(C5719e.ad, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C0353e c0353e = new C0353e();
                c0353e.ad = VKXNative.x01().ad;
                return c0353e;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C13458e("bruhcollective.itaysonlab.vkx.decompose.components.pick_audios.VkxPickAudiosSheetComponent.Config.Library", C17566e.INSTANCE, new Annotation[0]);
            default:
                return new C13458e("bruhcollective.itaysonlab.vkx.decompose.components.pick_audios.VkxPickAudiosSheetComponent.Config.MyPlaylists", C5436e.INSTANCE, new Annotation[0]);
        }
    }
}
