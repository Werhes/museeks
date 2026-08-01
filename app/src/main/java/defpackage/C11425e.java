package defpackage;

import android.content.SharedPreferences;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11425e {
    public static final C11425e ad;
    public static final C12309e appmetrica;
    public static final C12309e billing;
    public static final C12309e license;
    public static final C12309e metrica;
    public static final C12309e purchase;
    public static final C1733e startapp;
    public static final /* synthetic */ InterfaceC8614e[] vip;
    public static final C1733e yandex;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, eِ] */
    static {
        boolean z = false;
        C13506e c13506e = new C13506e(C11425e.class, "enableItunes", "getEnableItunes()Z", 0);
        C12232e c12232e = AbstractC3820e.ad;
        int i = 3;
        vip = new InterfaceC8614e[]{c12232e.purchase(c13506e), AbstractC10257e.billing(C11425e.class, "enableItunesInTags", "getEnableItunesInTags()Z", 0, c12232e), AbstractC10257e.billing(C11425e.class, "enableLyricsIntoTags", "getEnableLyricsIntoTags()Z", 0, c12232e), AbstractC4653e.tapsense(C11425e.class, "lastFmEnabled", "getLastFmEnabled()Z", 0, c12232e), AbstractC4653e.tapsense(C11425e.class, "lastFmBroadcastEnabled", "getLastFmBroadcastEnabled()Z", 0, c12232e)};
        ad = new Object();
        SharedPreferences sharedPreferences = AbstractC16082e.license;
        metrica = new C12309e(sharedPreferences != null ? sharedPreferences : null, "download_use_itunes", z, i);
        license = new C12309e(sharedPreferences != null ? sharedPreferences : null, "download_use_itunes_tagging", z, i);
        appmetrica = new C12309e(sharedPreferences != null ? sharedPreferences : null, "download_use_genius_tagging", z, i);
        purchase = new C12309e(sharedPreferences != null ? sharedPreferences : null, "playback_allowlastfm", z, i);
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        billing = new C12309e(sharedPreferences, "playback_allowlastfm_broadcast", z, i);
        yandex = AbstractC13510e.purchase("integrations_lfm_add_subtitle", false, R.string.lfm_add_subtitle);
        startapp = AbstractC13510e.purchase("integrations_lfm_use_only_one_artist", false, R.string.lfm_use_one_artist);
    }

    public final boolean ad() {
        InterfaceC8614e interfaceC8614e = vip[0];
        return ((Boolean) metrica.tapsense(this)).booleanValue();
    }
}
