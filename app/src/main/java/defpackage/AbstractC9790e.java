package defpackage;

import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ۟ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9790e {
    public static final Object mopub = new Object();
    public final Object ad;
    public final RunnableC12991e adcel;
    public volatile Object appmetrica;
    public int billing;
    public boolean license;
    public int metrica;
    public volatile Object purchase;
    public boolean startapp;
    public final C13615e vip;
    public boolean yandex;

    public AbstractC9790e() {
        this.ad = new Object();
        this.vip = new C13615e();
        this.metrica = 0;
        Object obj = mopub;
        this.purchase = obj;
        this.adcel = new RunnableC12991e(17, this);
        this.appmetrica = obj;
        this.billing = -1;
    }

    public AbstractC9790e(Object obj) {
        this.ad = new Object();
        this.vip = new C13615e();
        this.metrica = 0;
        this.purchase = mopub;
        this.adcel = new RunnableC12991e(17, this);
        this.appmetrica = obj;
        this.billing = 0;
    }

    public static void ad(String str) {
        C9129e.m2520class().adcel.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC5087e.m1746extends("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void appmetrica(InterfaceC2994e interfaceC2994e) {
        Object obj;
        ad("observeForever");
        AbstractC2710e abstractC2710e = new AbstractC2710e(this, interfaceC2994e);
        C13615e c13615e = this.vip;
        C18091e appmetrica = c13615e.appmetrica(interfaceC2994e);
        if (appmetrica != null) {
            obj = appmetrica.f35478e;
        } else {
            C18091e c18091e = new C18091e(interfaceC2994e, abstractC2710e);
            c13615e.f27009e++;
            C18091e c18091e2 = c13615e.f27008e;
            if (c18091e2 == null) {
                c13615e.f27010e = c18091e;
                c13615e.f27008e = c18091e;
            } else {
                c18091e2.f35477e = c18091e;
                c18091e.f35479e = c18091e2;
                c13615e.f27008e = c18091e;
            }
            obj = null;
        }
        AbstractC2710e abstractC2710e2 = (AbstractC2710e) obj;
        if (abstractC2710e2 instanceof AbstractC8762e) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC2710e2 != null) {
            return;
        }
        abstractC2710e.ad(true);
    }

    public void billing() {
    }

    public Object license() {
        Object obj = this.appmetrica;
        if (obj != mopub) {
            return obj;
        }
        return null;
    }

    public final void metrica(AbstractC2710e abstractC2710e) {
        if (this.yandex) {
            this.startapp = true;
            return;
        }
        this.yandex = true;
        do {
            this.startapp = false;
            if (abstractC2710e != null) {
                vip(abstractC2710e);
                abstractC2710e = null;
            } else {
                C13615e c13615e = this.vip;
                c13615e.getClass();
                C17598e c17598e = new C17598e(c13615e);
                c13615e.f27007e.put(c17598e, Boolean.FALSE);
                while (c17598e.hasNext()) {
                    vip((AbstractC2710e) ((Map.Entry) c17598e.next()).getValue());
                    if (this.startapp) {
                        break;
                    }
                }
            }
        } while (this.startapp);
        this.yandex = false;
    }

    public void purchase() {
    }

    public abstract void startapp(Object obj);

    public final void vip(AbstractC2710e abstractC2710e) {
        if (abstractC2710e.f6587e) {
            if (!abstractC2710e.metrica()) {
                abstractC2710e.ad(false);
                return;
            }
            int i = abstractC2710e.f6586e;
            int i2 = this.billing;
            if (i >= i2) {
                return;
            }
            abstractC2710e.f6586e = i2;
            abstractC2710e.f6589e.ad(this.appmetrica);
        }
    }

    public final void yandex(InterfaceC2994e interfaceC2994e) {
        ad("removeObserver");
        AbstractC2710e abstractC2710e = (AbstractC2710e) this.vip.billing(interfaceC2994e);
        if (abstractC2710e == null) {
            return;
        }
        abstractC2710e.getClass();
        abstractC2710e.ad(false);
    }
}
