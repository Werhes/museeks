package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3881e implements InterfaceC6145e {
    public final C16667e ad;
    public AbstractC1762e adcel;
    public boolean advert;
    public final C7507e[] appmetrica;
    public int billing;
    public boolean mopub;
    public final AbstractC11254e[] purchase;
    public C7507e startapp;
    public int yandex;
    public final Object vip = new Object();
    public long smaato = -9223372036854775807L;
    public final ArrayDeque metrica = new ArrayDeque();
    public final ArrayDeque license = new ArrayDeque();

    public AbstractC3881e(C7507e[] c7507eArr, AbstractC11254e[] abstractC11254eArr) {
        this.appmetrica = c7507eArr;
        this.billing = c7507eArr.length;
        for (int i = 0; i < this.billing; i++) {
            this.appmetrica[i] = purchase();
        }
        this.purchase = abstractC11254eArr;
        this.yandex = abstractC11254eArr.length;
        for (int i2 = 0; i2 < this.yandex; i2++) {
            this.purchase[i2] = billing();
        }
        C16667e c16667e = new C16667e(this);
        this.ad = c16667e;
        c16667e.start();
    }

    @Override // defpackage.InterfaceC6145e
    public final void ad(long j) {
        boolean z;
        synchronized (this.vip) {
            try {
                if (this.billing != this.appmetrica.length && !this.mopub) {
                    z = false;
                    AbstractC2301e.subscription(z);
                    this.smaato = j;
                }
                z = true;
                AbstractC2301e.subscription(z);
                this.smaato = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean adcel() {
        AbstractC1762e yandex;
        synchronized (this.vip) {
            while (!this.advert) {
                try {
                    if (!this.metrica.isEmpty() && this.yandex > 0) {
                        break;
                    }
                    this.vip.wait();
                } finally {
                }
            }
            if (this.advert) {
                return false;
            }
            C7507e c7507e = (C7507e) this.metrica.removeFirst();
            AbstractC11254e[] abstractC11254eArr = this.purchase;
            int i = this.yandex - 1;
            this.yandex = i;
            AbstractC11254e abstractC11254e = abstractC11254eArr[i];
            boolean z = this.mopub;
            this.mopub = false;
            if (c7507e.metrica(4)) {
                abstractC11254e.ad(4);
            } else {
                abstractC11254e.f22622e = c7507e.f15301e;
                if (c7507e.metrica(134217728)) {
                    abstractC11254e.ad(134217728);
                }
                if (!advert(c7507e.f15301e)) {
                    abstractC11254e.f22623e = true;
                }
                try {
                    yandex = startapp(c7507e, abstractC11254e, z);
                } catch (OutOfMemoryError e) {
                    yandex = yandex(e);
                } catch (RuntimeException e2) {
                    yandex = yandex(e2);
                }
                if (yandex != null) {
                    synchronized (this.vip) {
                        this.adcel = yandex;
                    }
                    return false;
                }
            }
            synchronized (this.vip) {
                try {
                    if (this.mopub) {
                        abstractC11254e.Signature();
                    } else if (abstractC11254e.f22623e) {
                        abstractC11254e.Signature();
                    } else {
                        this.license.addLast(abstractC11254e);
                    }
                    c7507e.amazon();
                    C7507e[] c7507eArr = this.appmetrica;
                    int i2 = this.billing;
                    this.billing = i2 + 1;
                    c7507eArr[i2] = c7507e;
                } finally {
                }
            }
            return true;
        }
    }

    public final boolean advert(long j) {
        boolean z;
        synchronized (this.vip) {
            long j2 = this.smaato;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    public final void amazon(AbstractC11254e abstractC11254e) {
        synchronized (this.vip) {
            abstractC11254e.amazon();
            AbstractC11254e[] abstractC11254eArr = this.purchase;
            int i = this.yandex;
            this.yandex = i + 1;
            abstractC11254eArr[i] = abstractC11254e;
            if (!this.metrica.isEmpty() && this.yandex > 0) {
                this.vip.notify();
            }
        }
    }

    public abstract AbstractC11254e billing();

    @Override // defpackage.InterfaceC6145e
    public final void flush() {
        synchronized (this.vip) {
            try {
                this.mopub = true;
                C7507e c7507e = this.startapp;
                if (c7507e != null) {
                    c7507e.amazon();
                    C7507e[] c7507eArr = this.appmetrica;
                    int i = this.billing;
                    this.billing = i + 1;
                    c7507eArr[i] = c7507e;
                    this.startapp = null;
                }
                while (!this.metrica.isEmpty()) {
                    C7507e c7507e2 = (C7507e) this.metrica.removeFirst();
                    c7507e2.amazon();
                    C7507e[] c7507eArr2 = this.appmetrica;
                    int i2 = this.billing;
                    this.billing = i2 + 1;
                    c7507eArr2[i2] = c7507e2;
                }
                while (!this.license.isEmpty()) {
                    ((AbstractC11254e) this.license.removeFirst()).Signature();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6145e
    public final Object license() {
        C7507e c7507e;
        synchronized (this.vip) {
            try {
                AbstractC1762e abstractC1762e = this.adcel;
                if (abstractC1762e != null) {
                    throw abstractC1762e;
                }
                AbstractC2301e.subscription(this.startapp == null);
                int i = this.billing;
                if (i == 0) {
                    c7507e = null;
                } else {
                    C7507e[] c7507eArr = this.appmetrica;
                    int i2 = i - 1;
                    this.billing = i2;
                    c7507e = c7507eArr[i2];
                }
                this.startapp = c7507e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7507e;
    }

    @Override // defpackage.InterfaceC6145e
    /* renamed from: mopub, reason: merged with bridge method [inline-methods] */
    public final AbstractC11254e metrica() {
        synchronized (this.vip) {
            try {
                AbstractC1762e abstractC1762e = this.adcel;
                if (abstractC1762e != null) {
                    throw abstractC1762e;
                }
                if (this.license.isEmpty()) {
                    return null;
                }
                return (AbstractC11254e) this.license.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract C7507e purchase();

    @Override // defpackage.InterfaceC6145e
    public final void release() {
        synchronized (this.vip) {
            this.advert = true;
            this.vip.notify();
        }
        try {
            this.ad.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.InterfaceC6145e
    /* renamed from: smaato, reason: merged with bridge method [inline-methods] */
    public final void appmetrica(C7507e c7507e) {
        synchronized (this.vip) {
            try {
                AbstractC1762e abstractC1762e = this.adcel;
                if (abstractC1762e != null) {
                    throw abstractC1762e;
                }
                AbstractC2301e.billing(c7507e == this.startapp);
                this.metrica.addLast(c7507e);
                if (!this.metrica.isEmpty() && this.yandex > 0) {
                    this.vip.notify();
                }
                this.startapp = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract AbstractC1762e startapp(C7507e c7507e, AbstractC11254e abstractC11254e, boolean z);

    public abstract AbstractC1762e yandex(Throwable th);
}
