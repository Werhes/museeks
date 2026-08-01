package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7149e extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C7149e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    private final void ad(Network network) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.ad) {
            case 1:
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.ad) {
            case 0:
                C5401e.loadAd().smaato(C9551e.adcel, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                C9551e c9551e = (C9551e) this.vip;
                c9551e.metrica(c9551e.purchase());
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.ad) {
            case 1:
                ((C1126e) this.vip).vip(network, linkProperties);
                return;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.ad) {
            case 0:
                C5401e.loadAd().smaato(C9551e.adcel, "Network connection lost", new Throwable[0]);
                C9551e c9551e = (C9551e) this.vip;
                c9551e.metrica(c9551e.purchase());
                return;
            default:
                C1126e c1126e = (C1126e) this.vip;
                synchronized (c1126e.yandex) {
                    try {
                        C1126e.advert.vip("the network is lost", new Object[0]);
                        if (c1126e.appmetrica.remove(network)) {
                            c1126e.license.remove(network);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c1126e.metrica();
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.ad) {
            case 1:
                C1126e c1126e = (C1126e) this.vip;
                synchronized (c1126e.yandex) {
                    C1126e.advert.vip("all networks are unavailable.", new Object[0]);
                    c1126e.license.clear();
                    c1126e.appmetrica.clear();
                }
                c1126e.metrica();
                return;
            default:
                super.onUnavailable();
                return;
        }
    }
}
