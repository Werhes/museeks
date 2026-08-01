package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14582e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28794e;

    public /* synthetic */ C14582e(int i) {
        this.f28794e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 2;
        switch (this.f28794e) {
            case 0:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountSupportedWaysDto", EnumC10783e.values(), new String[]{"callreset", "codegen", "email", "libverify", "passkey", "password", "push", "qr_code", "reserve_code", "sms"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null});
            case 1:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountNextStepDto.ServiceCodeDto", EnumC6059e.values(), new String[]{"1", "2"}, new Annotation[][]{null, null});
            case 2:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountResponseDto.FlowNameDto", EnumC8985e.values(), new String[]{"need_password_and_validation", "need_validation", "need_password", "need_registration", "need_login_validation", "need_passkey", "need_passkey_otp", "need_webauthn"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 3:
                return new C13758e(C9582e.ad, 0);
            case 4:
                return new C18466e(AbstractC6532e.vip(1308617531));
            case 5:
                C5363e c5363e = BackportedFixQuirk.ad;
                return new C3501e();
            case 6:
                ConnectivityManager connectivityManager = VKXApplication.f36537e;
                return Boolean.valueOf(AbstractC17305e.m4289native(connectivityManager != null ? connectivityManager : null));
            case 7:
                return new Handler(Looper.getMainLooper());
            case 8:
                return new Object();
            case 9:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.base.BaseBoolIntDto", EnumC6664e.values(), new String[]{"0", "1"}, new Annotation[][]{null, null});
            case 10:
                return EnumC11077e.Companion.serializer();
            case 11:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.base.BaseImageDto.ThemeDto", EnumC11077e.values(), new String[]{"light", "dark"}, new Annotation[][]{null, null});
            case 12:
                return EnumC8621e.Companion.serializer();
            case 13:
                return EnumC8450e.Companion.serializer();
            case 14:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.base.BaseLinkButtonActionTypeDto", EnumC8621e.values(), new String[]{"open_url", "open_amp", "join_group_and_open_url", "user_subscribe_and_open_url", "open_section", "follow", "upload_video", "create_playlist", "create_album", "friends_lists", "friends_sort_modes", "add_friend", "block_filter", "qr_camera", "friends_requests", "open_screen", "open_screen_large", "friends_message", "friends_call", "friends_send_gift", "friends_label", "play_audios_from_block", "play_audio", "open_challenge", "play_videos_from_block", "play_shuffled_audios_from_block", "unfollow_artist", "create_group", "close_notification", "switch_section", "clear_recent_groups", "close_catalog_banner", "enable_top_newsfeed", "groups_advertisement", "owner_button", "enter_edit_mode", "playlists_lists", "unfollow_curator", "unfollow_music_owner", "reorder_items", "edit_items", "select_sorting", "market_clear_recent_queries", "market_abandoned_carts", "market_write", "call", "close_web_app", "modal_page", "live_categories", "movie_categories", "toggle_video_album_subscription", "clear_video_history", "help_hint", "open_vkapp", "open_game", "open_internal_vkui", "specials_perform_action", "open_birthday_modal", "share", "perform_action_with_url", "open_search_tab", "hide_block", "market_edit", "market_delete", "toggle_curator_subscription", "toggle_artist_subscription", "toggle_album_subscription", "music_follow_owner", "upload_audio", "subscribe_ads_acceptance", "sync_contacts", "import_contacts", "add_friends", "close_popup", "onboarding", "groups_my_groups_tabs"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 15:
                return EnumC11398e.Companion.serializer();
            case 16:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.base.BaseLinkButtonStyleDto", EnumC11398e.values(), new String[]{"primary", "secondary"}, new Annotation[][]{null, null});
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.base.BaseOwnerButtonActionTargetDto", EnumC8450e.values(), new String[]{"internal", "external", "authorize"}, new Annotation[][]{null, null, null});
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return EnumC6664e.Companion.serializer();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C15492e c15492e = AbstractC12600e.ad;
                return null;
            case 20:
                C1169e license = AbstractC6874e.license();
                license.add(new C14986e());
                C17770e c17770e = new C17770e();
                if (c17770e.license) {
                    license.add(c17770e);
                }
                return AbstractC6874e.metrica(license);
            case 21:
                VKXApplication vKXApplication = VKXApplication.f36528e;
                return (vKXApplication != null ? vKXApplication : null).getDir("cache_v2", 0);
            case 22:
                VKXApplication vKXApplication2 = VKXApplication.f36528e;
                return (vKXApplication2 != null ? vKXApplication2 : null).getDir("cdcm_temp", 0);
            case 23:
                return new C13458e("cps_all", C4561e.INSTANCE, new Annotation[0]);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C13758e(C9582e.ad, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new CameraCaptureSession();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                VKXApplication.Companion companion = VKXApplication.f36531e;
                return new AbstractC9194e(VKXApplication.Companion.vip(R.string.menu_history), C14611e.ad);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C0963e((String) null, new C9837e("updates", i));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C0963e((String) null, new C9837e("recoms_friends", i));
            default:
                return new C0963e((String) null, new C9837e("recommended_groups", i));
        }
    }
}
