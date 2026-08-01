package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12684e {
    public static Boolean admob;
    public static Boolean pro;
    public static Boolean remoteconfig;
    public static Boolean subscription;
    public static final C2892e ad = new C2892e(-234126695, false, new C5029e(27));
    public static final C2892e vip = new C2892e(738804440, false, new C5029e(28));
    public static final C2892e metrica = new C2892e(830810942, false, new C5029e(29));
    public static final C2892e license = new C2892e(2053413567, false, new C2916e(0));
    public static final C2892e appmetrica = new C2892e(1744383897, false, new C2916e(1));
    public static final C2892e purchase = new C2892e(-1764232742, false, new C2916e(2));
    public static final C1032e billing = new C1032e(3, "nearby_connections");
    public static final C1032e yandex = new C1032e(2, "nearby_connections_v2");
    public static final C1032e startapp = new C1032e(1, "nearby_connections_v3");
    public static final C1032e adcel = new C1032e(1, "nearby_connections_get_local_endpoint_id");
    public static final C1032e mopub = new C1032e(2, "nearby_connections_register_device_provider");
    public static final C1032e advert = new C1032e(1, "nearby_connections_update_advertising_options");
    public static final C1032e smaato = new C1032e(1, "nearby_connections_update_connection_options");
    public static final C1032e amazon = new C1032e(1, "nearby_connections_update_discovery_options");
    public static final C1032e loadAd = new C1032e(1, "nearby_connections_setting");
    public static final C1032e Signature = new C1032e(1, "nearby_connections_set_downloads_directory");

    public static boolean ad(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (admob == null) {
            admob = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (admob.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (subscription == null) {
            subscription = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (subscription.booleanValue()) {
            return !AbstractC11765e.metrica() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static String metrica(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static Integer vip(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                return str.equals("REPEAT_ALL_AND_SHUFFLE") ? 3 : null;
            case -962896020:
                return str.equals("REPEAT_SINGLE") ? 2 : null;
            case 1645938909:
                return str.equals("REPEAT_ALL") ? 1 : null;
            case 1645952171:
                return str.equals("REPEAT_OFF") ? 0 : null;
            default:
                return null;
        }
    }
}
