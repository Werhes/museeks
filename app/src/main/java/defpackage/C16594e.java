package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16594e {
    public static C16594e mopub;
    public final C0140e ad;
    public final String metrica;
    public final SharedPreferences vip;
    public long yandex;
    public static final C18482e startapp = new C18482e("FeatureUsageAnalytics", null);
    public static final String adcel = "22.2.0";
    public final HashSet purchase = new HashSet();
    public final HashSet billing = new HashSet();
    public final HandlerC9134e appmetrica = new HandlerC9134e(Looper.getMainLooper(), 6);
    public final RunnableC16721e license = new RunnableC16721e(22, this);

    public C16594e(SharedPreferences sharedPreferences, C0140e c0140e, String str) {
        this.vip = sharedPreferences;
        this.ad = c0140e;
        this.metrica = str;
    }

    public static void ad(EnumC3848e enumC3848e) {
        C16594e c16594e;
        if (!C0140e.mopub || (c16594e = mopub) == null) {
            return;
        }
        SharedPreferences sharedPreferences = c16594e.vip;
        String num = Integer.toString(enumC3848e.f8567e);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String Signature = AbstractC17861e.Signature("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(Signature)) {
            Signature = AbstractC17861e.Signature("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(Signature, System.currentTimeMillis()).apply();
        c16594e.purchase.add(enumC3848e);
        c16594e.appmetrica.post(c16594e.license);
    }

    public static EnumC3848e metrica(String str) {
        EnumC3848e enumC3848e = EnumC3848e.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        switch (Integer.parseInt(str)) {
            case 0:
                return enumC3848e;
            case 1:
                return EnumC3848e.CAF_CAST_BUTTON;
            case 2:
                return EnumC3848e.CAF_EXPANDED_CONTROLLER;
            case 3:
                return EnumC3848e.CAF_MINI_CONTROLLER;
            case 4:
                return EnumC3848e.CAF_CONTAINER_CONTROLLER;
            case 5:
                return EnumC3848e.CAST_CONTEXT;
            case 6:
                return EnumC3848e.IMAGE_CACHE;
            case 7:
                return EnumC3848e.IMAGE_PICKER;
            case 8:
                return EnumC3848e.AD_BREAK_PARSER;
            case 9:
                return EnumC3848e.UI_STYLE;
            case 10:
                return EnumC3848e.HARDWARE_VOLUME_BUTTON;
            case 11:
                return EnumC3848e.NON_CAST_DEVICE_PROVIDER;
            case 12:
                return EnumC3848e.PAUSE_CONTROLLER;
            case 13:
                return EnumC3848e.SEEK_CONTROLLER;
            case 14:
                return EnumC3848e.STREAM_VOLUME;
            case 15:
                return EnumC3848e.UI_MEDIA_CONTROLLER;
            case 16:
                return EnumC3848e.PLAYBACK_RATE_CONTROLLER;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return EnumC3848e.PRECACHE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return EnumC3848e.INSTRUCTIONS_VIEW;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return EnumC3848e.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
            case 20:
                return EnumC3848e.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
            case 21:
                return EnumC3848e.OPTION_DISABLE_DISCOVERY_AUTOSTART;
            case 22:
                return EnumC3848e.OPTION_DISABLE_ANALYTICS_LOGGING;
            case 23:
                return EnumC3848e.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return EnumC3848e.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return EnumC3848e.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return EnumC3848e.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return EnumC3848e.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return EnumC3848e.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return EnumC3848e.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
            case 30:
                return EnumC3848e.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
            case 31:
                return EnumC3848e.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
            case 32:
                return EnumC3848e.CAST_UNAVAILABLE_BUTTON_VISIBLE;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return EnumC3848e.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return EnumC3848e.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return EnumC3848e.CAST_OUTPUT_SWITCHER_ENABLED;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                return EnumC3848e.CAST_TRANSFER_TO_LOCAL_ENABLED;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                return EnumC3848e.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                return EnumC3848e.CAST_BUTTON_DELEGATE;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return EnumC3848e.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return EnumC3848e.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return EnumC3848e.CAST_TRANSFER_TO_LOCAL_USED;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return EnumC3848e.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return EnumC3848e.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return EnumC3848e.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return EnumC3848e.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return EnumC3848e.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return EnumC3848e.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
            case 48:
                return EnumC3848e.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return EnumC3848e.CAF_NOTIFICATION_SERVICE;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return EnumC3848e.HARDWARE_VOLUME_BUTTON_PRESS;
            case 51:
                return EnumC3848e.CAST_SDK_DEFAULT_DEVICE_DIALOG;
            case 52:
                return EnumC3848e.CAST_SDK_CUSTOM_DEVICE_DIALOG;
            case 53:
                return EnumC3848e.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
            case 54:
                return EnumC3848e.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
            case 55:
                return EnumC3848e.CAF_MEDIA_NOTIFICATION_PROXY;
            case 56:
                return EnumC3848e.REMOTE_CONNECTION_MANAGER_ACQUIRED;
            case 57:
                return EnumC3848e.REMOTE_CONNECTION_CALLBACK_SET;
            default:
                return null;
        }
    }

    public final void vip(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.vip.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }
}
