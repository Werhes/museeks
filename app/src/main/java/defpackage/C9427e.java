package defpackage;

import android.os.Looper;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9427e {
    public static final Object startapp = new Object();
    public final C18482e ad;
    public InterfaceC10846e billing;
    public final String metrica;
    public final long vip;
    public RunnableC16721e yandex;
    public long appmetrica = -1;
    public long purchase = 0;
    public final HandlerC9134e license = new HandlerC9134e(Looper.getMainLooper(), 6);

    public C9427e(long j, String str) {
        this.vip = j;
        this.metrica = str;
        this.ad = new C18482e("RequestTracker", str);
    }

    public final void ad(long j, InterfaceC10846e interfaceC10846e) {
        InterfaceC10846e interfaceC10846e2;
        long j2;
        long j3;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = startapp;
        synchronized (obj) {
            interfaceC10846e2 = this.billing;
            j2 = this.appmetrica;
            j3 = this.purchase;
            this.appmetrica = j;
            this.billing = interfaceC10846e;
            this.purchase = currentTimeMillis;
        }
        if (interfaceC10846e2 != null) {
            interfaceC10846e2.mopub(this.metrica, j2, j3, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                RunnableC16721e runnableC16721e = this.yandex;
                if (runnableC16721e != null) {
                    this.license.removeCallbacks(runnableC16721e);
                }
                RunnableC16721e runnableC16721e2 = new RunnableC16721e(10, this);
                this.yandex = runnableC16721e2;
                this.license.postDelayed(runnableC16721e2, this.vip);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean appmetrica(int i) {
        synchronized (startapp) {
            try {
                if (!vip()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                purchase(i, null, "clearing request " + this.appmetrica);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void license(long j, int i, C10914e c10914e) {
        synchronized (startapp) {
            try {
                if (metrica(j)) {
                    Locale locale = Locale.ROOT;
                    purchase(i, c10914e, "request " + j + " completed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean metrica(long j) {
        boolean z;
        synchronized (startapp) {
            long j2 = this.appmetrica;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final void purchase(int i, Object obj, String str) {
        this.ad.vip(str, new Object[0]);
        Object obj2 = startapp;
        synchronized (obj2) {
            try {
                if (this.billing != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    InterfaceC10846e interfaceC10846e = this.billing;
                    AbstractC9528e.startapp(interfaceC10846e);
                    interfaceC10846e.signatures(this.metrica, this.appmetrica, i, obj, this.purchase, currentTimeMillis);
                }
                this.appmetrica = -1L;
                this.billing = null;
                synchronized (obj2) {
                    RunnableC16721e runnableC16721e = this.yandex;
                    if (runnableC16721e != null) {
                        this.license.removeCallbacks(runnableC16721e);
                        this.yandex = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
    }

    public final boolean vip() {
        boolean z;
        synchronized (startapp) {
            z = this.appmetrica != -1;
        }
        return z;
    }
}
