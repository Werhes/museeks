package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Locale;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۨۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12930e {
    public static final C17519e ad = new C17519e(0);
    public static Locale vip;

    public static String ad(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
                Log.e("GoogleApiAvailability", "Sign-in is required to use this API.");
                return resources.getString(R.string.common_google_play_services_signin_required_title);
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return appmetrica(context, "common_google_play_services_invalid_account_title");
            case 6:
                Log.e("GoogleApiAvailability", "Google Play services requires resolution.");
                return appmetrica(context, "common_google_play_services_resolution_required_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return appmetrica(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(R.string.common_google_play_services_unsupported_title);
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return appmetrica(context, "common_google_play_services_sign_in_failed_title");
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Log.e("GoogleApiAvailability", "Google Play services is updating.");
                return resources.getString(R.string.common_google_play_services_updating_client_title);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Log.e("GoogleApiAvailability", "Google Play services is missing a required permission.");
                return appmetrica(context, "common_google_play_services_resolution_required_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return appmetrica(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String appmetrica(Context context, String str) {
        Resources resources;
        C17519e c17519e = ad;
        synchronized (c17519e) {
            try {
                Locale locale = AbstractC18039e.license(context.getResources().getConfiguration()).ad.get(0);
                if (!locale.equals(vip)) {
                    c17519e.clear();
                    vip = locale;
                }
                String str2 = (String) c17519e.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = AbstractC18410e.appmetrica;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(str.length() + 18);
                        sb.append("Missing resource: ");
                        sb.append(str);
                        Log.w("GoogleApiAvailability", sb.toString());
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            c17519e.put(str, string);
                            return string;
                        }
                        StringBuilder sb2 = new StringBuilder(str.length() + 20);
                        sb2.append("Got empty resource: ");
                        sb2.append(str);
                        Log.w("GoogleApiAvailability", sb2.toString());
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public static String license(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String appmetrica = appmetrica(context, str);
        if (appmetrica == null) {
            appmetrica = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, appmetrica, str2);
    }

    public static String metrica(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) C5277e.ad(context).ad;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String vip(Context context, int i) {
        Resources resources = context.getResources();
        String metrica = metrica(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, metrica);
        }
        if (i == 2) {
            return AbstractC12684e.ad(context) ? resources.getString(R.string.common_google_play_services_wear_update_text, metrica) : resources.getString(R.string.common_google_play_services_update_text, metrica);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, metrica);
        }
        if (i == 4) {
            return resources.getString(R.string.common_google_play_services_signin_required_text, metrica);
        }
        if (i == 5) {
            return license(context, "common_google_play_services_invalid_account_text", metrica);
        }
        if (i == 7) {
            return license(context, "common_google_play_services_network_error_text", metrica);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, metrica);
        }
        if (i == 20) {
            return license(context, "common_google_play_services_restricted_profile_text", metrica);
        }
        switch (i) {
            case 16:
                return license(context, "common_google_play_services_api_unavailable_text", metrica);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return license(context, "common_google_play_services_sign_in_failed_text", metrica);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return resources.getString(R.string.common_google_play_services_updating_text, metrica);
            default:
                return resources.getString(R.string.common_google_play_services_try_again_text, metrica);
        }
    }
}
