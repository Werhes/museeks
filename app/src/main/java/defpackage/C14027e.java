package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Stack;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14027e {
    public static final C14027e ad;
    public static final C15024e license;
    public static final C12309e metrica;
    public static final /* synthetic */ InterfaceC8614e[] vip;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, eٖٓٗ] */
    static {
        C13506e c13506e = new C13506e(C14027e.class, "otaAllowBetas", "getOtaAllowBetas()Z", 0);
        C12232e c12232e = AbstractC3820e.ad;
        vip = new InterfaceC8614e[]{c12232e.purchase(c13506e), AbstractC10257e.billing(C14027e.class, "deviceID", "getDeviceID()Ljava/lang/String;", 0, c12232e)};
        ad = new Object();
        SharedPreferences sharedPreferences = AbstractC16082e.appmetrica;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        C5363e c5363e = C0353e.startapp;
        metrica = new C12309e(sharedPreferences, "ota_allow_beta", true ^ AbstractC15792e.billing().vip.tapsense(), 3);
        SharedPreferences sharedPreferences2 = AbstractC16082e.appmetrica;
        license = new C15024e(6, sharedPreferences2 != null ? sharedPreferences2 : null, "device_id_v2", BuildConfig.FLAVOR);
    }

    public static boolean ad() {
        C8221e c8221e = VKXApplication.f36536e;
        if (c8221e == null) {
            c8221e = null;
        }
        return ((C18479e) c8221e.billing).ad != 0;
    }

    public static void appmetrica(Activity activity) {
        AbstractC1831e.ad().ad();
        C15959e c15959e = C15959e.ad;
        C15959e.vip.vip();
        C8221e c8221e = VKXApplication.f36536e;
        if (c8221e == null) {
            c8221e = null;
        }
        c8221e.getClass();
        c8221e.metrica = new C7862e();
        C18479e.Companion.getClass();
        c8221e.billing = C18479e.advert;
        C6594e c6594e = (C6594e) c8221e.purchase;
        C13614e appmetrica = AbstractC7291e.appmetrica(c6594e);
        if (appmetrica != null) {
            AbstractC7291e.startapp(c6594e, new C13614e(0L, appmetrica.vip));
        }
        C7838e c7838e = VKXApplication.f36530e;
        if (c7838e == null) {
            c7838e = null;
        }
        c7838e.subscription();
        if (!(activity instanceof AppActivity)) {
            activity.finish();
            return;
        }
        AppActivity appActivity = (AppActivity) activity;
        C10279e c10279e = appActivity.f36542e;
        C6703e c6703e = appActivity.f36546e;
        c6703e.metrica.yandex();
        c6703e.metrica();
        ((FrameLayout) c10279e.ad.f36547e.f10515e).removeAllViews();
        FrameLayout[] frameLayoutArr = c10279e.appmetrica;
        int length = frameLayoutArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            FrameLayout frameLayout = frameLayoutArr[i];
            int i3 = i2 + 1;
            if (frameLayout != null) {
                ((C1059e) frameLayout.getChildAt(0)).amazon(new Stack(), true);
                frameLayoutArr[i2] = null;
            }
            i++;
            i2 = i3;
        }
        c10279e.vip(false);
        AppActivity appActivity2 = c10279e.ad;
        AbstractC17680e.mopub((LinearLayout) appActivity2.f36547e.f10511e);
        AbstractC17680e.mopub((CoordinatorLayout) appActivity2.f36547e.f10516e);
        c10279e.appmetrica(EnumC16729e.f32799e, false);
    }

    public static String license() {
        C8221e c8221e = VKXApplication.f36536e;
        if (c8221e == null) {
            c8221e = null;
        }
        return ((C18479e) c8221e.billing).billing;
    }

    public static long metrica() {
        C8221e c8221e = VKXApplication.f36536e;
        if (c8221e == null) {
            c8221e = null;
        }
        return ((C18479e) c8221e.billing).ad;
    }

    public final boolean vip() {
        InterfaceC8614e interfaceC8614e = vip[0];
        return ((Boolean) metrica.tapsense(this)).booleanValue();
    }
}
