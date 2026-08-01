package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1126e {
    public static final C18482e advert = new C18482e("ConnectivityMonitor", null);
    public final InterfaceExecutorServiceC17461e ad;
    public final C13264e adcel;
    public final Context billing;
    public final ConnectivityManager metrica;
    public final HashSet mopub;
    public boolean purchase;
    public final boolean startapp;
    public final C7149e vip = new C7149e(1, this);
    public final HashMap license = new HashMap();
    public final ArrayList appmetrica = new ArrayList();
    public final Object yandex = new Object();

    public C1126e(Context context, InterfaceExecutorServiceC17461e interfaceExecutorServiceC17461e) {
        this.startapp = Build.VERSION.SDK_INT >= 31;
        this.adcel = new C13264e(10, this);
        this.mopub = new HashSet();
        this.ad = interfaceExecutorServiceC17461e;
        this.billing = context;
        this.metrica = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void ad() {
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        advert.vip("Start monitoring connectivity changes", new Object[0]);
        if (this.purchase || (connectivityManager = this.metrica) == null) {
            return;
        }
        Context context = this.billing;
        if (AbstractC10077e.appmetrica(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                vip(activeNetwork, linkProperties);
            }
            NetworkRequest.Builder addTransportType = new NetworkRequest.Builder().addTransportType(1);
            if (this.startapp) {
                addTransportType.setIncludeOtherUidNetworks(true);
            } else {
                context.registerReceiver(this.adcel, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            }
            connectivityManager.registerNetworkCallback(addTransportType.build(), this.vip);
            this.purchase = true;
        }
    }

    public final void metrica() {
        InterfaceExecutorServiceC17461e interfaceExecutorServiceC17461e = this.ad;
        if (interfaceExecutorServiceC17461e == null) {
            return;
        }
        HashSet hashSet = this.mopub;
        synchronized (hashSet) {
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    C8013e c8013e = (C8013e) interfaceExecutorServiceC17461e;
                    if (!c8013e.f16265e.isShutdown()) {
                        c8013e.execute(new RunnableC16721e(11, this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vip(Network network, LinkProperties linkProperties) {
        synchronized (this.yandex) {
            try {
                advert.vip("a new network is available", new Object[0]);
                HashMap hashMap = this.license;
                if (hashMap.containsKey(network)) {
                    this.appmetrica.remove(network);
                }
                hashMap.put(network, linkProperties);
                this.appmetrica.add(network);
            } catch (Throwable th) {
                throw th;
            }
        }
        metrica();
    }
}
