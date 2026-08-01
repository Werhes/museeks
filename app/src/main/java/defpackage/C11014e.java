package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11014e implements InterfaceC3330e {
    public final ConnectivityManager metrica;
    public final /* synthetic */ int vip;

    public /* synthetic */ C11014e(ConnectivityManager connectivityManager, int i) {
        this.vip = i;
        this.metrica = connectivityManager;
    }

    @Override // defpackage.InterfaceC3330e
    public final boolean ad() {
        switch (this.vip) {
            case 0:
                NetworkInfo activeNetworkInfo = this.metrica.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
            default:
                ConnectivityManager connectivityManager = this.metrica;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                return networkCapabilities != null && networkCapabilities.hasCapability(12);
        }
    }
}
