package defpackage;

import android.content.SharedPreferences;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15409e {
    public static final C12309e Signature;
    public static final C15409e ad;
    public static final C12309e adcel;
    public static final C1733e admob;
    public static final C12309e advert;
    public static final C12309e amazon;
    public static final C1733e appmetrica;
    public static final C12309e billing;
    public static final C1733e license;
    public static final C12309e loadAd;
    public static final C1733e metrica;
    public static final C12309e mopub;
    public static final C1733e pro;
    public static final C12309e purchase;
    public static final C1733e remoteconfig;
    public static final C8063e signatures;
    public static final C12309e smaato;
    public static final C12309e startapp;
    public static final C1733e subscription;
    public static final /* synthetic */ InterfaceC8614e[] vip;
    public static final C12309e yandex;

    /* JADX WARN: Type inference failed for: r0v3, types: [eْْۜ, eًٜؗ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eِٕٞ, java.lang.Object] */
    static {
        boolean z = false;
        C12156e c12156e = new C12156e(C15409e.class, "shuffleShortcuts", "getShuffleShortcuts()Z", 0);
        C12232e c12232e = AbstractC3820e.ad;
        String str = "libvkx_enable";
        boolean z2 = true;
        int i = 3;
        vip = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(C15409e.class, "downloadID3", "getDownloadID3()Z", 0, c12232e), AbstractC4653e.tapsense(C15409e.class, "downloadCounter", "getDownloadCounter()Z", 0, c12232e), AbstractC4653e.tapsense(C15409e.class, "invertDownloadOrder", "getInvertDownloadOrder()Z", 0, c12232e), AbstractC4653e.tapsense(C15409e.class, "blockRussianTracks", "getBlockRussianTracks()Z", 0, c12232e), AbstractC4653e.tapsense(C15409e.class, "blockRussianArtists", "getBlockRussianArtists()Z", 0, c12232e), AbstractC4653e.tapsense(C15409e.class, "blockRussianAlbums", "getBlockRussianAlbums()Z", 0, c12232e), AbstractC4653e.tapsense(C15409e.class, "blockExplicitTracks", "getBlockExplicitTracks()Z", 0, c12232e), AbstractC4653e.tapsense(C15409e.class, "blockLegalNotices", "getBlockLegalNotices()Z", 0, c12232e), AbstractC10257e.billing(C15409e.class, "libvkx_enable", "getLibvkx_enable()Z", 0, c12232e), AbstractC4653e.tapsense(C15409e.class, "libvkx_preferLibrary", "getLibvkx_preferLibrary()Z", 0, c12232e)};
        ad = new Object();
        metrica = AbstractC13510e.purchase("onstop_queue_saving", true, R.string.settings_preserve_queue);
        license = new C1733e("resume_after_call", R.string.call_resume, Integer.valueOf(R.string.call_resume_desc), false);
        appmetrica = new C1733e("headset_pause_on_plug", R.string.st_hs_pause, Integer.valueOf(R.string.st_hs_pause_desc), false);
        SharedPreferences sharedPreferences = AbstractC16082e.license;
        purchase = new C12309e(sharedPreferences != null ? sharedPreferences : null, "shortcuts_shuffle", z, i);
        billing = new C12309e(sharedPreferences != null ? sharedPreferences : null, "download_add_id3", z2, i);
        yandex = new C12309e(sharedPreferences != null ? sharedPreferences : null, "download_add_counter", z2, i);
        startapp = new C12309e(sharedPreferences != null ? sharedPreferences : null, "downloader_invorder_pl", z, i);
        adcel = new C12309e(sharedPreferences != null ? sharedPreferences : null, "meme_block_names", z, i);
        mopub = new C12309e(sharedPreferences != null ? sharedPreferences : null, "meme_block_art", z, i);
        advert = new C12309e(sharedPreferences != null ? sharedPreferences : null, "meme_block_alb", z, i);
        smaato = new C12309e(sharedPreferences != null ? sharedPreferences : null, "meme_block_explicit", z, i);
        amazon = new C12309e(sharedPreferences != null ? sharedPreferences : null, "meme_block_legal_notices", z, i);
        loadAd = new C12309e(sharedPreferences != null ? sharedPreferences : null, str, z2, i);
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        Signature = new C12309e(sharedPreferences, "libvkx_libcatalog", z, i);
        admob = new C1733e("queue_autorestore", R.string.settings_autostart_startup, Integer.valueOf(R.string.settings_autostart_startup_desc), false);
        subscription = new C1733e("autostart_bluetooth", R.string.settings_autostart_bt, Integer.valueOf(R.string.settings_autostart_bt_desc), false);
        remoteconfig = new C1733e("autostart_wired", R.string.settings_autostart_wired, Integer.valueOf(R.string.settings_autostart_wired_desc), false);
        pro = new C1733e("headset_notify_on_plug", R.string.settings_autostart_notification_instead, Integer.valueOf(R.string.settings_autostart_notification_instead_desc), true);
        signatures = new AbstractC13518e("autostart_source", new C6594e(21, EnumC12505e.values()), EnumC12505e.f25046e);
    }

    public final void ad(boolean z) {
        loadAd.applovin(vip[9], Boolean.valueOf(z));
    }
}
