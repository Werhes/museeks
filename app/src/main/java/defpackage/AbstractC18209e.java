package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18209e {
    public static final C2892e ad = new C2892e(1372584573, false, new C2916e(4));
    public static Boolean adcel;
    public static Boolean advert;
    public static final C1032e appmetrica;
    public static Boolean billing;
    public static final C1032e license;
    public static final C1032e metrica;
    public static Boolean mopub;
    public static final C1032e[] purchase;
    public static Boolean smaato;
    public static Boolean startapp;
    public static final C1032e vip;
    public static Boolean yandex;

    static {
        C1032e c1032e = new C1032e(-1, 1L, "client_side_logging", true);
        C1032e c1032e2 = new C1032e(-1, 1L, "cxless_client_minimal", true);
        vip = c1032e2;
        C1032e c1032e3 = new C1032e(-1, 1L, "cxless_caf_control", true);
        C1032e c1032e4 = new C1032e(-1, 1L, "module_flag_control", true);
        metrica = c1032e4;
        C1032e c1032e5 = new C1032e(-1, 1L, "discovery_hint_supply", true);
        C1032e c1032e6 = new C1032e(-1, 1L, "relay_casting_set_active_account", true);
        C1032e c1032e7 = new C1032e(-1, 1L, "analytics_proto_enum_translation", true);
        license = c1032e7;
        C1032e c1032e8 = new C1032e(-1, 1L, "integer_to_integer_map", true);
        appmetrica = c1032e8;
        purchase = new C1032e[]{c1032e, c1032e2, c1032e3, c1032e4, c1032e5, c1032e6, c1032e7, c1032e8, new C1032e(-1, 1L, "relay_casting_set_remote_casting_mode", true), new C1032e(-1, 1L, "get_relay_access_token", true), new C1032e(-1, 1L, "get_cast_settings", true), new C1032e(-1, 1L, "set_bundle_setting", true), new C1032e(-1, 1L, "get_client_updated_info", true), new C1032e(-1, 1L, "device_suggestions", true)};
    }

    public static void ad(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static boolean appmetrica(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (smaato == null) {
            smaato = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
        }
        return smaato.booleanValue();
    }

    public static boolean license(Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        if (yandex == null) {
            yandex = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || metrica(resources));
        }
        return yandex.booleanValue();
    }

    public static boolean metrica(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        if (adcel == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            adcel = Boolean.valueOf(z);
        }
        return adcel.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, eْؓۢ] */
    public static Object purchase(boolean z, AbstractC7185e abstractC7185e) {
        C15409e.ad.getClass();
        int ordinal = ((EnumC12505e) C15409e.signatures.ad()).ordinal();
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (ordinal == 0) {
            Object appmetrica2 = C10301e.f20325e.appmetrica(abstractC7185e);
            return appmetrica2 == enumC2821e ? appmetrica2 : Unit.INSTANCE;
        }
        InterfaceC5083e interfaceC5083e = null;
        if (ordinal == 1) {
            C8515e.Companion.getClass();
            C14027e.ad.getClass();
            Object advert2 = AbstractC5336e.advert(AbstractC6731e.ad, new C6046e(new C0086e(null, 0L, null, false, false, z, 95), new C8515e(String.valueOf(C14027e.metrica()), C14027e.license()), interfaceC5083e, 1), abstractC7185e);
            if (advert2 != enumC2821e) {
                advert2 = Unit.INSTANCE;
            }
            return advert2 == enumC2821e ? advert2 : Unit.INSTANCE;
        }
        if (ordinal == 2) {
            Object crashlytics = C1400e.f4214e.crashlytics(new Object(), abstractC7185e);
            return crashlytics == enumC2821e ? crashlytics : Unit.INSTANCE;
        }
        if (ordinal != 3) {
            throw new C14803e(10);
        }
        Object advert3 = AbstractC5336e.advert(AbstractC6731e.ad, new C6046e(new C0086e(null, 0L, null, false, false, z, 95), new C10757e(), interfaceC5083e, 1), abstractC7185e);
        if (advert3 != enumC2821e) {
            advert3 = Unit.INSTANCE;
        }
        return advert3 == enumC2821e ? advert3 : Unit.INSTANCE;
    }

    public static boolean vip(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (advert == null) {
            advert = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        return advert.booleanValue();
    }
}
