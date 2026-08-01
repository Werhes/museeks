package defpackage;

import android.util.Log;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5113e {
    public static final AtomicInteger advert;
    public static final boolean mopub;
    public static final AtomicInteger smaato;
    public Class adcel;
    public final C9689e appmetrica;
    public final C9689e billing;
    public C7169e license;
    public C7169e purchase;
    public final int startapp;
    public final Size yandex;
    public final Object ad = new Object();
    public int vip = 0;
    public boolean metrica = false;

    static {
        new Size(0, 0);
        mopub = AbstractC9464e.smaato("DeferrableSurface");
        advert = new AtomicInteger(0);
        smaato = new AtomicInteger(0);
    }

    public AbstractC5113e(int i, Size size) {
        this.yandex = size;
        this.startapp = i;
        final int i2 = 0;
        C9689e purchase = AbstractC5750e.purchase(new InterfaceC12523e(this) { // from class: eُِۤ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC5113e f21684e;

            {
                this.f21684e = this;
            }

            private final Object ad(C7169e c7169e) {
                AbstractC5113e abstractC5113e = this.f21684e;
                synchronized (abstractC5113e.ad) {
                    abstractC5113e.license = c7169e;
                }
                return "DeferrableSurface-termination(" + abstractC5113e + ")";
            }

            @Override // defpackage.InterfaceC12523e
            public final Object amazon(C7169e c7169e) {
                switch (i2) {
                    case 0:
                        return ad(c7169e);
                    default:
                        AbstractC5113e abstractC5113e = this.f21684e;
                        synchronized (abstractC5113e.ad) {
                            abstractC5113e.purchase = c7169e;
                        }
                        return "DeferrableSurface-close(" + abstractC5113e + ")";
                }
            }
        });
        this.appmetrica = purchase;
        final int i3 = 1;
        this.billing = AbstractC5750e.purchase(new InterfaceC12523e(this) { // from class: eُِۤ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC5113e f21684e;

            {
                this.f21684e = this;
            }

            private final Object ad(C7169e c7169e) {
                AbstractC5113e abstractC5113e = this.f21684e;
                synchronized (abstractC5113e.ad) {
                    abstractC5113e.license = c7169e;
                }
                return "DeferrableSurface-termination(" + abstractC5113e + ")";
            }

            @Override // defpackage.InterfaceC12523e
            public final Object amazon(C7169e c7169e) {
                switch (i3) {
                    case 0:
                        return ad(c7169e);
                    default:
                        AbstractC5113e abstractC5113e = this.f21684e;
                        synchronized (abstractC5113e.ad) {
                            abstractC5113e.purchase = c7169e;
                        }
                        return "DeferrableSurface-close(" + abstractC5113e + ")";
                }
            }
        });
        if (AbstractC9464e.smaato("DeferrableSurface")) {
            appmetrica(smaato.incrementAndGet(), advert.get(), "Surface created");
            purchase.f19184e.ad(new RunnableC2623e(this, Log.getStackTraceString(new Exception()), 6), AbstractC3062e.billing());
        }
    }

    public void ad() {
        C7169e c7169e;
        synchronized (this.ad) {
            try {
                if (this.metrica) {
                    c7169e = null;
                } else {
                    this.metrica = true;
                    this.purchase.ad(null);
                    if (this.vip == 0) {
                        c7169e = this.license;
                        this.license = null;
                    } else {
                        c7169e = null;
                    }
                    if (AbstractC9464e.smaato("DeferrableSurface")) {
                        AbstractC9464e.yandex("DeferrableSurface", "surface closed,  useCount=" + this.vip + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c7169e != null) {
            c7169e.ad(null);
        }
    }

    public final void appmetrica(int i, int i2, String str) {
        if (!mopub && AbstractC9464e.smaato("DeferrableSurface")) {
            AbstractC9464e.yandex("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        AbstractC9464e.yandex("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public final void license() {
        synchronized (this.ad) {
            try {
                int i = this.vip;
                if (i == 0 && this.metrica) {
                    throw new C3720e("Cannot begin use on a closed surface.", this);
                }
                this.vip = i + 1;
                if (AbstractC9464e.smaato("DeferrableSurface")) {
                    if (this.vip == 1) {
                        appmetrica(smaato.get(), advert.incrementAndGet(), "New surface in use");
                    }
                    AbstractC9464e.yandex("DeferrableSurface", "use count+1, useCount=" + this.vip + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ListenableFuture metrica() {
        synchronized (this.ad) {
            try {
                if (this.metrica) {
                    return new C4065e(1, new C3720e("DeferrableSurface already closed.", this));
                }
                return purchase();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ListenableFuture purchase();

    public final void vip() {
        C7169e c7169e;
        synchronized (this.ad) {
            try {
                int i = this.vip;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.vip = i2;
                if (i2 == 0 && this.metrica) {
                    c7169e = this.license;
                    this.license = null;
                } else {
                    c7169e = null;
                }
                if (AbstractC9464e.smaato("DeferrableSurface")) {
                    AbstractC9464e.yandex("DeferrableSurface", "use count-1,  useCount=" + this.vip + " closed=" + this.metrica + " " + this);
                    if (this.vip == 0) {
                        appmetrica(smaato.get(), advert.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c7169e != null) {
            c7169e.ad(null);
        }
    }
}
