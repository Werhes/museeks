package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9551e extends AbstractC9166e {
    public static final String adcel = C5401e.crashlytics("NetworkStateTracker");
    public final ConnectivityManager billing;
    public final C13264e startapp;
    public final C7149e yandex;

    public C9551e(C0912e c0912e, Context context) {
        super(c0912e, context);
        this.billing = (ConnectivityManager) this.vip.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.yandex = new C7149e(0, this);
        } else {
            this.startapp = new C13264e(6, this);
        }
    }

    @Override // defpackage.AbstractC9166e
    public final Object ad() {
        return purchase();
    }

    @Override // defpackage.AbstractC9166e
    public final void appmetrica() {
        int i = Build.VERSION.SDK_INT;
        String str = adcel;
        if (i < 24) {
            C5401e.loadAd().smaato(str, "Unregistering broadcast receiver", new Throwable[0]);
            this.vip.unregisterReceiver(this.startapp);
            return;
        }
        try {
            C5401e.loadAd().smaato(str, "Unregistering network callback", new Throwable[0]);
            this.billing.unregisterNetworkCallback(this.yandex);
        } catch (IllegalArgumentException | SecurityException e) {
            C5401e.loadAd().amazon(str, "Received exception while unregistering network callback", e);
        }
    }

    @Override // defpackage.AbstractC9166e
    public final void license() {
        int i = Build.VERSION.SDK_INT;
        String str = adcel;
        if (i < 24) {
            C5401e.loadAd().smaato(str, "Registering broadcast receiver", new Throwable[0]);
            this.vip.registerReceiver(this.startapp, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            C5401e.loadAd().smaato(str, "Registering network callback", new Throwable[0]);
            this.billing.registerDefaultNetworkCallback(this.yandex);
        } catch (IllegalArgumentException | SecurityException e) {
            C5401e.loadAd().amazon(str, "Received exception while registering network callback", e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eِؚؐ, java.lang.Object] */
    public final C11584e purchase() {
        boolean z;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.billing;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z2 = false;
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e) {
            C5401e.loadAd().amazon(adcel, "Unable to validate active network", e);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z = true;
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                    z2 = true;
                }
                ?? obj = new Object();
                obj.ad = z3;
                obj.vip = z;
                obj.metrica = isActiveNetworkMetered;
                obj.license = z2;
                return obj;
            }
        }
        z = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z2 = true;
        }
        ?? obj2 = new Object();
        obj2.ad = z3;
        obj2.vip = z;
        obj2.metrica = isActiveNetworkMetered2;
        obj2.license = z2;
        return obj2;
    }
}
