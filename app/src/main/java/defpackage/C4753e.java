package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4753e {
    public final int ad;
    public C16887e advert;
    public final boolean appmetrica;
    public final C6884e billing;
    public final Rect license;
    public final boolean metrica;
    public C6122e mopub;
    public final int purchase;
    public int startapp;
    public final Matrix vip;
    public int yandex;
    public boolean adcel = false;
    public final HashSet smaato = new HashSet();
    public boolean amazon = false;
    public final ArrayList loadAd = new ArrayList();

    public C4753e(int i, int i2, C6884e c6884e, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.purchase = i;
        this.ad = i2;
        this.billing = c6884e;
        this.vip = matrix;
        this.metrica = z;
        this.license = rect;
        this.startapp = i3;
        this.yandex = i4;
        this.appmetrica = z2;
        this.advert = new C16887e(i2, c6884e.ad);
    }

    public final void ad(Runnable runnable) {
        AbstractC13062e.metrica();
        vip();
        this.smaato.add(runnable);
    }

    public final void appmetrica() {
        boolean z;
        AbstractC13062e.metrica();
        vip();
        C16887e c16887e = this.advert;
        c16887e.getClass();
        AbstractC13062e.metrica();
        if (c16887e.Signature == null) {
            synchronized (c16887e.ad) {
                z = c16887e.metrica;
            }
            if (!z) {
                return;
            }
        }
        this.adcel = false;
        this.advert.ad();
        this.advert = new C16887e(this.ad, this.billing.ad);
        Iterator it = this.smaato.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final C6122e license(InterfaceC2881e interfaceC2881e, boolean z) {
        AbstractC13062e.metrica();
        vip();
        C6884e c6884e = this.billing;
        C6122e c6122e = new C6122e(c6884e.ad, interfaceC2881e, z, c6884e.metrica, c6884e.license, c6884e.appmetrica, new RunnableC2275e(this, 0));
        try {
            C1385e c1385e = c6122e.smaato;
            C16887e c16887e = this.advert;
            Objects.requireNonNull(c16887e);
            if (c16887e.billing(c1385e, new RunnableC10022e(c16887e, 0))) {
                AbstractC15792e.smaato(c16887e.appmetrica).ad(new RunnableC14447e(c1385e, 0), AbstractC3062e.billing());
            }
            this.mopub = c6122e;
            purchase();
            return c6122e;
        } catch (C3720e e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            c6122e.metrica();
            throw e2;
        }
    }

    public final void metrica() {
        AbstractC13062e.metrica();
        this.advert.ad();
        this.amazon = true;
        this.loadAd.clear();
        this.smaato.clear();
    }

    public final void purchase() {
        InterfaceC16996e interfaceC16996e;
        Executor executor;
        AbstractC13062e.metrica();
        C0167e c0167e = new C0167e(this.license, this.startapp, this.yandex, this.metrica, this.vip, this.appmetrica);
        C6122e c6122e = this.mopub;
        if (c6122e != null) {
            synchronized (c6122e.ad) {
                c6122e.amazon = c0167e;
                interfaceC16996e = c6122e.loadAd;
                executor = c6122e.Signature;
            }
            if (interfaceC16996e != null && executor != null) {
                executor.execute(new RunnableC13809e(interfaceC16996e, c0167e, 0));
            }
        }
        Iterator it = this.loadAd.iterator();
        while (it.hasNext()) {
            ((InterfaceC0867e) it.next()).accept(c0167e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.purchase);
        sb.append(", format=");
        sb.append(this.ad);
        sb.append(", resolution=");
        sb.append(this.billing.ad);
        sb.append(", cropRect=");
        sb.append(this.license);
        sb.append(", rotationDegrees=");
        sb.append(this.startapp);
        sb.append(", mirroring=");
        sb.append(this.appmetrica);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.vip;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(AbstractC8261e.vip(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(AbstractC8261e.appmetrica(matrix));
        sb.append(", isClosed=");
        return AbstractC1786e.isVip(sb, this.amazon, '}');
    }

    public final void vip() {
        AbstractC4265e.yandex("Edge is already closed.", !this.amazon);
    }
}
