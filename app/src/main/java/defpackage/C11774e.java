package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11774e extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C7988e ad;
    public final /* synthetic */ C13578e vip;

    public C11774e(C7988e c7988e, C13578e c13578e) {
        this.ad = c7988e;
        this.vip = c13578e;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ((ConnectivityManager) this.ad.f16176e).unregisterNetworkCallback(this);
        C13578e c13578e = this.vip;
        if (c13578e.premium()) {
            return;
        }
        c13578e.billing(Unit.INSTANCE);
    }
}
