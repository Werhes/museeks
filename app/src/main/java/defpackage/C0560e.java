package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۛٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0560e {
    public Object appmetrica;
    public volatile boolean license;
    public boolean metrica;
    public Exception purchase;
    public final Object ad = new Object();
    public final C12309e vip = new C12309e(17);

    public final void Signature(Exception exc) {
        AbstractC9528e.adcel(exc, "Exception must not be null");
        synchronized (this.ad) {
            subscription();
            this.metrica = true;
            this.purchase = exc;
        }
        this.vip.firebase(this);
    }

    public final void ad(InterfaceC12765e interfaceC12765e) {
        this.vip.crashlytics(new C1173e(AbstractC10468e.ad, interfaceC12765e));
        remoteconfig();
    }

    public final Object adcel() {
        Object obj;
        synchronized (this.ad) {
            try {
                AbstractC9528e.mopub("Task is not yet complete", this.metrica);
                if (this.license) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.purchase;
                if (exc != null) {
                    throw new RuntimeException(exc);
                }
                obj = this.appmetrica;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final void admob() {
        synchronized (this.ad) {
            try {
                if (this.metrica) {
                    return;
                }
                this.metrica = true;
                this.license = true;
                this.vip.firebase(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean advert() {
        boolean z;
        synchronized (this.ad) {
            try {
                z = false;
                if (this.metrica && !this.license && this.purchase == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final void amazon(Object obj) {
        synchronized (this.ad) {
            subscription();
            this.metrica = true;
            this.appmetrica = obj;
        }
        this.vip.firebase(this);
    }

    public final void appmetrica(InterfaceC7898e interfaceC7898e) {
        purchase(AbstractC10468e.ad, interfaceC7898e);
    }

    public final C0560e billing(Executor executor, InterfaceC0771e interfaceC0771e) {
        C0560e c0560e = new C0560e();
        this.vip.crashlytics(new C6212e(executor, interfaceC0771e, c0560e, 0));
        remoteconfig();
        return c0560e;
    }

    public final void license(Executor executor, InterfaceC9307e interfaceC9307e) {
        this.vip.crashlytics(new C1173e(executor, interfaceC9307e));
        remoteconfig();
    }

    public final boolean loadAd(Object obj) {
        synchronized (this.ad) {
            try {
                if (this.metrica) {
                    return false;
                }
                this.metrica = true;
                this.appmetrica = obj;
                this.vip.firebase(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void metrica(InterfaceC9307e interfaceC9307e) {
        license(AbstractC10468e.ad, interfaceC9307e);
    }

    public final boolean mopub() {
        boolean z;
        synchronized (this.ad) {
            z = this.metrica;
        }
        return z;
    }

    public final void purchase(Executor executor, InterfaceC7898e interfaceC7898e) {
        this.vip.crashlytics(new C1173e(executor, interfaceC7898e));
        remoteconfig();
    }

    public final void remoteconfig() {
        synchronized (this.ad) {
            try {
                if (this.metrica) {
                    this.vip.firebase(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0560e smaato(Executor executor, InterfaceC16794e interfaceC16794e) {
        C0560e c0560e = new C0560e();
        this.vip.crashlytics(new C1173e(executor, interfaceC16794e, c0560e));
        remoteconfig();
        return c0560e;
    }

    public final Exception startapp() {
        Exception exc;
        synchronized (this.ad) {
            exc = this.purchase;
        }
        return exc;
    }

    public final void subscription() {
        if (this.metrica) {
            int i = C9442e.f18784e;
            if (!mopub()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception startapp = startapp();
        }
    }

    public final void vip(Executor executor, InterfaceC12765e interfaceC12765e) {
        this.vip.crashlytics(new C1173e(executor, interfaceC12765e));
        remoteconfig();
    }

    public final C0560e yandex(Executor executor, InterfaceC0771e interfaceC0771e) {
        C0560e c0560e = new C0560e();
        this.vip.crashlytics(new C6212e(executor, interfaceC0771e, c0560e, 1));
        remoteconfig();
        return c0560e;
    }
}
