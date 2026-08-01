package defpackage;

import android.content.SharedPreferences;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٞؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5775e {
    public static final C5775e ad;
    public static final C8063e adcel;
    public static final C12309e appmetrica;
    public static final C12309e billing;
    public static final C12309e license;
    public static final C12309e metrica;
    public static final C8063e mopub;
    public static final C12309e purchase;
    public static final C8063e startapp;
    public static final /* synthetic */ InterfaceC8614e[] vip;
    public static final C15024e yandex;

    /* JADX WARN: Type inference failed for: r0v4, types: [eْْۜ, eًٜؗ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [eْْۜ, eًٜؗ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [eْْۜ, eًٜؗ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eؘٞؐ, java.lang.Object] */
    static {
        boolean z = false;
        C12156e c12156e = new C12156e(C5775e.class, "invertCacheAddOrder", "getInvertCacheAddOrder()Z", 0);
        C12232e c12232e = AbstractC3820e.ad;
        InterfaceC0716e yandex2 = c12232e.yandex(c12156e);
        InterfaceC0716e tapsense = AbstractC4653e.tapsense(C5775e.class, "skipErrors", "getSkipErrors()Z", 0, c12232e);
        InterfaceC0716e tapsense2 = AbstractC4653e.tapsense(C5775e.class, "useSAF", "getUseSAF()Z", 0, c12232e);
        InterfaceC0716e tapsense3 = AbstractC4653e.tapsense(C5775e.class, "overwriteExisting", "getOverwriteExisting()Z", 0, c12232e);
        InterfaceC0716e tapsense4 = AbstractC4653e.tapsense(C5775e.class, "addAlbumToFn", "getAddAlbumToFn()Z", 0, c12232e);
        InterfaceC0662e billing2 = AbstractC10257e.billing(C5775e.class, "downloadPath", "getDownloadPath()Ljava/lang/String;", 0, c12232e);
        int i = 6;
        boolean z2 = true;
        int i2 = 3;
        vip = new InterfaceC8614e[]{yandex2, tapsense, tapsense2, tapsense3, tapsense4, billing2};
        ad = new Object();
        SharedPreferences sharedPreferences = AbstractC16082e.license;
        metrica = new C12309e(sharedPreferences != null ? sharedPreferences : null, "cache_invert_add_order", z, i2);
        license = new C12309e(sharedPreferences != null ? sharedPreferences : null, "unified_skip_errors", z, i2);
        appmetrica = new C12309e(sharedPreferences != null ? sharedPreferences : null, "download_useSAF", z2, i2);
        purchase = new C12309e(sharedPreferences != null ? sharedPreferences : null, "downloader_overwrite_existing", z2, i2);
        billing = new C12309e(sharedPreferences != null ? sharedPreferences : null, "downloader_add_album_to_fn", z2, i2);
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        yandex = new C15024e(i, sharedPreferences, "download_path", BuildConfig.FLAVOR);
        startapp = new AbstractC13518e("cache_path_storageIdx", new C6607e(5), 0);
        adcel = new AbstractC13518e("skyline_last_sort", new C6594e(21, EnumC9603e.values()), EnumC9603e.f19049e);
        mopub = new AbstractC13518e("skyline_last_source", new C6594e(21, EnumC2502e.values()), EnumC2502e.f6349e);
    }

    public final String ad() {
        InterfaceC8614e interfaceC8614e = vip[5];
        return (String) yandex.tapsense(this);
    }

    public final void metrica(String str) {
        InterfaceC8614e interfaceC8614e = vip[5];
        C15024e c15024e = yandex;
        ((SharedPreferences) c15024e.f29788e).edit().putString((String) c15024e.f29787e, str).apply();
    }

    public final boolean vip() {
        InterfaceC8614e interfaceC8614e = vip[3];
        return ((Boolean) purchase.tapsense(this)).booleanValue();
    }
}
