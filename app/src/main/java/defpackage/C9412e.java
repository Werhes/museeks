package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9412e {
    public static int smaato;
    public C10621e ad;
    public final C12344e advert;
    public double billing;
    public final String metrica;
    public boolean vip;
    public double yandex;
    public final C9232e license = new Object();
    public final C9232e appmetrica = new Object();
    public final C9232e purchase = new Object();
    public boolean startapp = true;
    public final CopyOnWriteArraySet adcel = new CopyOnWriteArraySet();
    public double mopub = 0.0d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eٍؕؕ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eٍؕؕ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eٍؕؕ] */
    public C9412e(C12344e c12344e) {
        this.advert = c12344e;
        StringBuilder sb = new StringBuilder("spring:");
        int i = smaato;
        smaato = i + 1;
        sb.append(i);
        this.metrica = sb.toString();
        C10621e c10621e = C10621e.metrica;
        if (c10621e == null) {
            throw new IllegalArgumentException("springConfig is required");
        }
        this.ad = c10621e;
    }

    public final void ad() {
        this.adcel.clear();
        C12344e c12344e = this.advert;
        ((CopyOnWriteArraySet) c12344e.f24751e).remove(this);
        ((HashMap) c12344e.f24749e).remove(this.metrica);
    }

    public final void license(double d) {
        if (this.yandex == d && vip()) {
            return;
        }
        this.billing = this.license.ad;
        this.yandex = d;
        this.advert.loadAd(this.metrica);
        Iterator it = this.adcel.iterator();
        while (it.hasNext()) {
            ((InterfaceC5222e) it.next()).getClass();
        }
    }

    public final void metrica(double d) {
        this.billing = d;
        C9232e c9232e = this.license;
        c9232e.ad = d;
        this.advert.loadAd(this.metrica);
        Iterator it = this.adcel.iterator();
        while (it.hasNext()) {
            ((InterfaceC5222e) it.next()).ad(this);
        }
        double d2 = c9232e.ad;
        this.yandex = d2;
        this.purchase.ad = d2;
        c9232e.vip = 0.0d;
    }

    public final boolean vip() {
        C9232e c9232e = this.license;
        if (Math.abs(c9232e.vip) <= 0.005d) {
            return Math.abs(this.yandex - c9232e.ad) <= 0.005d || this.ad.vip == 0.0d;
        }
        return false;
    }
}
