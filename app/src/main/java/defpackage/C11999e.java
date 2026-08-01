package defpackage;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۜؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11999e {
    public static final C11999e ad;
    public static final C12309e appmetrica;
    public static final C12309e billing;
    public static final C12309e license;
    public static final C12309e metrica;
    public static final C12309e purchase;
    public static final /* synthetic */ InterfaceC8614e[] vip;

    /* JADX WARN: Type inference failed for: r1v2, types: [eِۜؓ, java.lang.Object] */
    static {
        boolean z = false;
        C12156e c12156e = new C12156e(C11999e.class, "isAlertOpened", "isAlertOpened()Z", 0);
        C12232e c12232e = AbstractC3820e.ad;
        boolean z2 = true;
        int i = 3;
        vip = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(C11999e.class, "preferExternal", "getPreferExternal()Z", 0, c12232e), AbstractC4653e.tapsense(C11999e.class, "preferWifi", "getPreferWifi()Z", 0, c12232e), AbstractC4653e.tapsense(C11999e.class, "downloadSepCover", "getDownloadSepCover()Z", 0, c12232e), AbstractC4653e.tapsense(C11999e.class, "downloadSepFolder", "getDownloadSepFolder()Z", 0, c12232e), AbstractC4653e.tapsense(C11999e.class, "analyticsVK", "getAnalyticsVK()Z", 0, c12232e), AbstractC10257e.billing(C11999e.class, "migrated", "getMigrated()Z", 0, c12232e), AbstractC10257e.billing(C11999e.class, "skipStartupSaf", "getSkipStartupSaf()Z", 0, c12232e), AbstractC10257e.billing(C11999e.class, "forceFallbackForProfile", "getForceFallbackForProfile()Z", 0, c12232e), AbstractC10257e.billing(C11999e.class, "forceFallbackForProfileTestMark", "getForceFallbackForProfileTestMark()Z", 0, c12232e)};
        ad = new Object();
        SharedPreferences sharedPreferences = AbstractC16082e.license;
        metrica = new C12309e(sharedPreferences != null ? sharedPreferences : null, "misc_donatepopup", z, i);
        license = new C12309e(sharedPreferences != null ? sharedPreferences : null, "dl_sp_folder", z2, i);
        appmetrica = new C12309e(sharedPreferences != null ? sharedPreferences : null, "global_vk", z2, i);
        purchase = new C12309e(sharedPreferences != null ? sharedPreferences : null, "oc_forceFallbackProfile", z, i);
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        billing = new C12309e(sharedPreferences, "oc_forceFallbackProfile_testMark", z, i);
    }

    public final boolean ad() {
        InterfaceC8614e interfaceC8614e = vip[5];
        return ((Boolean) appmetrica.tapsense(this)).booleanValue();
    }

    public final void metrica(boolean z) {
        billing.applovin(vip[9], Boolean.valueOf(z));
    }

    public final void vip(boolean z) {
        purchase.applovin(vip[8], Boolean.valueOf(z));
    }
}
