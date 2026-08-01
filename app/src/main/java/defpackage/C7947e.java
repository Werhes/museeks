package defpackage;

import android.content.SharedPreferences;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7947e {
    public static final C7947e ad;
    public static final C17974e appmetrica;
    public static final C12309e billing;
    public static final C1733e license;
    public static final C1733e metrica;
    public static final C12309e purchase;
    public static final /* synthetic */ InterfaceC8614e[] vip;
    public static final C12309e yandex;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, eًًٕ] */
    static {
        boolean z = false;
        C13506e c13506e = new C13506e(C7947e.class, "startupIndex", "getStartupIndex()I", 0);
        C12232e c12232e = AbstractC3820e.ad;
        int i = 3;
        vip = new InterfaceC8614e[]{c12232e.purchase(c13506e), AbstractC10257e.billing(C7947e.class, "startupOrbit", "getStartupOrbit()Z", 0, c12232e), AbstractC4653e.tapsense(C7947e.class, "isFullNumbersEnabled", "isFullNumbersEnabled()Z", 0, c12232e), AbstractC4653e.tapsense(C7947e.class, "hideSystemBarsOnNpSlide", "getHideSystemBarsOnNpSlide()Z", 0, c12232e), AbstractC4653e.tapsense(C7947e.class, "animReduceNavigation", "getAnimReduceNavigation()Z", 0, c12232e)};
        ad = new Object();
        metrica = new C1733e("ctg_classic", R.string.catalog_classic, Integer.valueOf(R.string.catalog_classic_text), false);
        license = new C1733e("ctg_cache_classic", R.string.catalog_classic_cache, Integer.valueOf(R.string.catalog_classic_cache_text), false);
        SharedPreferences sharedPreferences = AbstractC16082e.license;
        appmetrica = new C17974e(13, sharedPreferences != null ? sharedPreferences : null);
        purchase = new C12309e(sharedPreferences != null ? sharedPreferences : null, "startup_orbit", z, i);
        billing = new C12309e(sharedPreferences != null ? sharedPreferences : null, "interface_fullnumbers", z, i);
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        yandex = new C12309e(sharedPreferences, "animreduce_nav", z, i);
    }

    public final int ad() {
        InterfaceC8614e interfaceC8614e = vip[0];
        return Integer.valueOf(((SharedPreferences) appmetrica.f35233e).getInt("startup_index", 0)).intValue();
    }

    public final boolean vip() {
        InterfaceC8614e interfaceC8614e = vip[1];
        return ((Boolean) purchase.tapsense(this)).booleanValue();
    }
}
