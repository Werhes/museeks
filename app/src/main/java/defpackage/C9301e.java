package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9301e extends AbstractC16510e {
    public C6122e inmobi;
    public C12417e isPro;
    public C4753e isVip;
    public Executor pro;
    public InterfaceC13777e remoteconfig;
    public C16990e signatures;
    public C1385e tapsense;
    public static final C14418e applovin = new Object();
    public static final ScheduledExecutorServiceC5380e ads = AbstractC3062e.amazon();

    @Override // defpackage.AbstractC16510e
    public final void ads() {
        m2541goto();
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC16100e advert(InterfaceC12330e interfaceC12330e) {
        return new C3186e(C4069e.purchase(interfaceC12330e), 2);
    }

    @Override // defpackage.AbstractC16510e
    public final C6884e applovin(C6884e c6884e, C6884e c6884e2) {
        AbstractC9464e.yandex("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + c6884e + ", secondaryStreamSpec " + c6884e2);
        m2542this((C5450e) this.yandex, c6884e);
        return c6884e;
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC12438e billing(boolean z, InterfaceC4311e interfaceC4311e) {
        applovin.getClass();
        C5450e c5450e = C14418e.ad;
        c5450e.getClass();
        InterfaceC12330e ad = interfaceC4311e.ad(AbstractC8647e.ad(c5450e), 1);
        if (z) {
            ad = AbstractC13501e.remoteconfig(ad, c5450e);
        }
        if (ad == null) {
            return null;
        }
        return new C5450e(C17015e.vip(((C3186e) advert(ad)).f7297e));
    }

    @Override // defpackage.AbstractC16510e
    public final void crashlytics(Rect rect) {
        this.mopub = rect;
        InterfaceC2881e license = license();
        C4753e c4753e = this.isVip;
        if (license == null || c4753e == null) {
            return;
        }
        AbstractC13062e.billing(new RunnableC2490e(c4753e, startapp(license, amazon(license)), ((InterfaceC13842e) this.yandex).mo1770switch()));
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m2541goto() {
        C12417e c12417e = this.isPro;
        if (c12417e != null) {
            c12417e.vip();
            this.isPro = null;
        }
        C1385e c1385e = this.tapsense;
        if (c1385e != null) {
            c1385e.ad();
            this.tapsense = null;
        }
        C4753e c4753e = this.isVip;
        if (c4753e != null) {
            c4753e.metrica();
            this.isVip = null;
        }
        C6122e c6122e = this.inmobi;
        if (c6122e != null) {
            synchronized (c6122e.ad) {
                c6122e.loadAd = null;
                c6122e.Signature = null;
            }
        }
        this.inmobi = null;
    }

    @Override // defpackage.AbstractC16510e
    public final C6884e isPro(InterfaceC12330e interfaceC12330e) {
        this.signatures.ad(interfaceC12330e);
        Object[] objArr = {this.signatures.metrica()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4158class(DesugarCollections.unmodifiableList(arrayList));
        C10017e vip = this.startapp.vip();
        vip.f19790e = interfaceC12330e;
        return vip.ad();
    }

    @Override // defpackage.AbstractC16510e
    public final Set mopub() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.AbstractC16510e
    public final InterfaceC12438e signatures(InterfaceC12424e interfaceC12424e, InterfaceC16100e interfaceC16100e) {
        ((C4069e) interfaceC16100e.isVip()).yandex(InterfaceC14405e.isPro, 34);
        return interfaceC16100e.mo819interface();
    }

    /* renamed from: this, reason: not valid java name */
    public final void m2542this(C5450e c5450e, C6884e c6884e) {
        AbstractC13062e.metrica();
        InterfaceC2881e license = license();
        Objects.requireNonNull(license);
        m2541goto();
        int i = 1;
        AbstractC4265e.yandex(null, this.isVip == null);
        Matrix matrix = this.advert;
        boolean loadAd = license.loadAd();
        Size size = c6884e.ad;
        Rect rect = this.mopub;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        C4753e c4753e = new C4753e(1, 34, c6884e, matrix, loadAd, rect, startapp(license, amazon(license)), ((InterfaceC13842e) this.yandex).mo1770switch(), license.loadAd() && amazon(license));
        this.isVip = c4753e;
        c4753e.ad(new RunnableC2783e(24, this));
        C6122e license2 = this.isVip.license(license, true);
        this.inmobi = license2;
        this.tapsense = license2.smaato;
        if (this.remoteconfig != null) {
            InterfaceC2881e license3 = license();
            C4753e c4753e2 = this.isVip;
            if (license3 != null && c4753e2 != null) {
                AbstractC13062e.billing(new RunnableC2490e(c4753e2, startapp(license3, amazon(license3)), ((InterfaceC13842e) this.yandex).mo1770switch()));
            }
            InterfaceC13777e interfaceC13777e = this.remoteconfig;
            interfaceC13777e.getClass();
            C6122e c6122e = this.inmobi;
            c6122e.getClass();
            this.pro.execute(new RunnableC11247e(interfaceC13777e, c6122e, i));
        }
        C16990e license4 = C16990e.license(c5450e, c6884e.ad);
        C10379e c10379e = license4.vip;
        license4.yandex = c6884e.license;
        ad(license4, c6884e);
        int purchase = AbstractC8647e.purchase(c5450e);
        if (purchase != 0) {
            c10379e.getClass();
            if (purchase != 0) {
                ((C4069e) c10379e.f20510e).yandex(InterfaceC12438e.f24900e, Integer.valueOf(purchase));
            }
        }
        InterfaceC12330e interfaceC12330e = c6884e.purchase;
        if (interfaceC12330e != null) {
            c10379e.pro(interfaceC12330e);
        }
        if (this.remoteconfig != null) {
            license4.vip(this.tapsense, c6884e.metrica, ((InterfaceC13842e) this.yandex).amazon());
        }
        C12417e c12417e = this.isPro;
        if (c12417e != null) {
            c12417e.vip();
        }
        C12417e c12417e2 = new C12417e(new C3084e(i, this));
        this.isPro = c12417e2;
        license4.purchase = c12417e2;
        this.signatures = license4;
        Object[] objArr = {license4.metrica()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4158class(DesugarCollections.unmodifiableList(arrayList));
    }

    public final String toString() {
        return "Preview:".concat(yandex());
    }
}
