package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٞٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14864e {
    public static boolean adcel = false;
    public static final Object billing = new Object();
    public static HandlerThread startapp;
    public static C14864e yandex;
    public final HashMap ad = new HashMap();
    public final long appmetrica;
    public final C5459e license;
    public volatile HandlerC9134e metrica;
    public final long purchase;
    public final Context vip;

    /* JADX WARN: Type inference failed for: r3v2, types: [eٌۧؗ, android.os.Handler] */
    public C14864e(Context context, Looper looper) {
        C14369e c14369e = new C14369e(2, this);
        this.vip = context.getApplicationContext();
        ?? handler = new Handler(looper, c14369e);
        Looper.getMainLooper();
        this.metrica = handler;
        this.license = C5459e.vip();
        this.appmetrica = 5000L;
        this.purchase = 300000L;
    }

    public static C14864e ad(Context context) {
        synchronized (billing) {
            try {
                if (yandex == null) {
                    if (!adcel) {
                        context.getPackageName();
                        adcel = true;
                    }
                    yandex = new C14864e(context.getApplicationContext(), adcel ? vip().getLooper() : context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yandex;
    }

    public static HandlerThread vip() {
        synchronized (billing) {
            try {
                HandlerThread handlerThread = startapp;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return startapp;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                startapp = handlerThread2;
                handlerThread2.start();
                return startapp;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void license(C5605e c5605e, ServiceConnection serviceConnection) {
        AbstractC9528e.adcel(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.ad;
        synchronized (hashMap) {
            try {
                ServiceConnectionC11808e serviceConnectionC11808e = (ServiceConnectionC11808e) hashMap.get(c5605e);
                if (serviceConnectionC11808e == null) {
                    String c5605e2 = c5605e.toString();
                    StringBuilder sb = new StringBuilder(c5605e2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(c5605e2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!serviceConnectionC11808e.f23686e.containsKey(serviceConnection)) {
                    String c5605e3 = c5605e.toString();
                    StringBuilder sb2 = new StringBuilder(c5605e3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(c5605e3);
                    throw new IllegalStateException(sb2.toString());
                }
                serviceConnectionC11808e.f23686e.remove(serviceConnection);
                if (serviceConnectionC11808e.f23686e.isEmpty()) {
                    this.metrica.sendMessageDelayed(this.metrica.obtainMessage(0, c5605e), this.appmetrica);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C14758e metrica(C5605e c5605e, ServiceConnectionC8375e serviceConnectionC8375e, String str, Executor executor) {
        C14758e c14758e;
        HashMap hashMap = this.ad;
        synchronized (hashMap) {
            try {
                ServiceConnectionC11808e serviceConnectionC11808e = (ServiceConnectionC11808e) hashMap.get(c5605e);
                if (executor == null) {
                    executor = null;
                }
                if (serviceConnectionC11808e == null) {
                    serviceConnectionC11808e = new ServiceConnectionC11808e(this, c5605e);
                    serviceConnectionC11808e.f23686e.put(serviceConnectionC8375e, serviceConnectionC8375e);
                    c14758e = serviceConnectionC11808e.ad(str, executor);
                    hashMap.put(c5605e, serviceConnectionC11808e);
                } else {
                    this.metrica.removeMessages(0, c5605e);
                    if (serviceConnectionC11808e.f23686e.containsKey(serviceConnectionC8375e)) {
                        String c5605e2 = c5605e.toString();
                        StringBuilder sb = new StringBuilder(c5605e2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(c5605e2);
                        throw new IllegalStateException(sb.toString());
                    }
                    serviceConnectionC11808e.f23686e.put(serviceConnectionC8375e, serviceConnectionC8375e);
                    int i = serviceConnectionC11808e.f23684e;
                    if (i == 1) {
                        serviceConnectionC8375e.onServiceConnected(serviceConnectionC11808e.f23688e, serviceConnectionC11808e.f23685e);
                    } else if (i == 2) {
                        c14758e = serviceConnectionC11808e.ad(str, executor);
                    }
                    c14758e = null;
                }
                if (serviceConnectionC11808e.f23683e) {
                    return C14758e.f29187e;
                }
                if (c14758e == null) {
                    c14758e = new C14758e(-1, null, null);
                }
                return c14758e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
