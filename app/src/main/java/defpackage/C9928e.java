package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۧۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9928e implements InterfaceC6175e {
    public AbstractC17475e ad;
    public int appmetrica;
    public long license;
    public long metrica;
    public final /* synthetic */ C10767e purchase;
    public C16975e vip;

    public C9928e(C10767e c10767e, Context context) {
        this.purchase = c10767e;
        AbstractC9413e.m2562protected(context);
        C2171e c2171e = AbstractC17475e.f34223e;
        this.ad = C1410e.f4222e;
        this.license = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC6175e
    public final void Signature(long j, long j2) {
        this.purchase.appmetrica.Signature(j + this.metrica, j2);
    }

    @Override // defpackage.InterfaceC6175e
    public final boolean ad() {
        return false;
    }

    @Override // defpackage.InterfaceC6175e
    public final void adcel(int i) {
        this.purchase.appmetrica.adcel(i);
    }

    @Override // defpackage.InterfaceC6175e
    public final void admob(boolean z) {
        C10767e c10767e = this.purchase;
        if (c10767e.license) {
            c10767e.appmetrica.admob(z);
        }
    }

    @Override // defpackage.InterfaceC6175e
    public final boolean advert(long j, C11418e c11418e) {
        int i;
        AbstractC2301e.subscription(false);
        long j2 = j + this.metrica;
        C10767e c10767e = this.purchase;
        C8034e c8034e = c10767e.startapp;
        long j3 = c8034e.ad == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - r3) * c8034e.metrica) + c8034e.vip);
        if (j3 != -9223372036854775807L) {
            long j4 = c10767e.yandex;
            if (j4 != -9223372036854775807L && j3 < j4 && (i = this.appmetrica) < 2) {
                this.appmetrica = i + 1;
                C15960e c15960e = c11418e.metrica;
                InterfaceC5827e interfaceC5827e = c11418e.ad;
                int i2 = c11418e.vip;
                Trace.beginSection("dropVideoBuffer");
                interfaceC5827e.billing(i2);
                Trace.endSection();
                c15960e.m4081e(0, 1);
                return true;
            }
        }
        int i3 = c10767e.Signature;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.InterfaceC6175e
    public final void amazon(boolean z) {
        this.license = -9223372036854775807L;
        C10767e c10767e = this.purchase;
        C17075e c17075e = c10767e.appmetrica;
        if (c10767e.amazon == 1) {
            c10767e.smaato++;
            c17075e.amazon(z);
            while (c10767e.adcel.m2709switch() > 1) {
                c10767e.adcel.m2707strictfp();
            }
            if (c10767e.adcel.m2709switch() == 1) {
                ((AbstractC18404e) c10767e.adcel.m2707strictfp()).getClass();
                throw null;
            }
            c10767e.loadAd = -9223372036854775807L;
            C2399e c2399e = c10767e.mopub;
            c2399e.getClass();
            c2399e.license(new RunnableC2783e(23, c10767e));
        }
    }

    @Override // defpackage.InterfaceC6175e
    public final void appmetrica(C16089e c16089e) {
    }

    @Override // defpackage.InterfaceC6175e
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.InterfaceC6175e
    public final Surface getInputSurface() {
        AbstractC2301e.subscription(false);
        throw null;
    }

    @Override // defpackage.InterfaceC6175e
    public final void license(C16975e c16975e, long j, int i, List list) {
        AbstractC2301e.subscription(false);
        this.ad = AbstractC17475e.remoteconfig(list);
        this.vip = c16975e;
        C11445e ad = c16975e.ad();
        C14754e c14754e = c16975e.firebase;
        if (c14754e == null || !c14754e.license()) {
            c14754e = C14754e.yandex;
        }
        ad.crashlytics = c14754e;
        ad.ad();
        throw null;
    }

    @Override // defpackage.InterfaceC6175e
    public final void loadAd(List list) {
        if (this.ad.equals(list)) {
            return;
        }
        this.ad = AbstractC17475e.remoteconfig(list);
        C16975e c16975e = this.vip;
        if (c16975e == null) {
            return;
        }
        C11445e ad = c16975e.ad();
        C14754e c14754e = c16975e.firebase;
        if (c14754e == null || !c14754e.license()) {
            c14754e = C14754e.yandex;
        }
        ad.crashlytics = c14754e;
        ad.ad();
        throw null;
    }

    @Override // defpackage.InterfaceC6175e
    public final void metrica() {
        C10767e c10767e = this.purchase;
        if (c10767e.license) {
            c10767e.appmetrica.metrica();
        }
    }

    @Override // defpackage.InterfaceC6175e
    public final void mopub() {
        int i = C8795e.metrica.ad;
        this.purchase.advert = null;
    }

    @Override // defpackage.InterfaceC6175e
    public final void pro() {
    }

    @Override // defpackage.InterfaceC6175e
    public final void purchase(float f) {
        C10767e c10767e = this.purchase;
        c10767e.startapp.metrica(f);
        c10767e.appmetrica.purchase(f);
    }

    @Override // defpackage.InterfaceC6175e
    public final void release() {
        C10767e c10767e = this.purchase;
        if (c10767e.amazon == 2) {
            return;
        }
        C2399e c2399e = c10767e.mopub;
        if (c2399e != null) {
            c2399e.appmetrica();
        }
        c10767e.advert = null;
        c10767e.amazon = 2;
    }

    @Override // defpackage.InterfaceC6175e
    public final void remoteconfig(InterfaceC17077e interfaceC17077e) {
        this.purchase.appmetrica.adcel = interfaceC17077e;
    }

    @Override // defpackage.InterfaceC6175e
    public final void signatures(Surface surface, C8795e c8795e) {
        C10767e c10767e = this.purchase;
        Pair pair = c10767e.advert;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C8795e) c10767e.advert.second).equals(c8795e)) {
            return;
        }
        c10767e.advert = Pair.create(surface, c8795e);
        int i = c8795e.ad;
    }

    @Override // defpackage.InterfaceC6175e
    public final boolean smaato(C16975e c16975e) {
        C10767e c10767e = this.purchase;
        boolean z = true;
        AbstractC2301e.subscription(c10767e.amazon == 0);
        C14754e c14754e = c16975e.firebase;
        if (c14754e == null || !c14754e.license()) {
            c14754e = C14754e.yandex;
        }
        int i = c14754e.metrica;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 34) {
                    if (i2 >= 33 && AbstractC17352e.purchase("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        c14754e = new C14754e(c14754e.ad, c14754e.vip, 6, c14754e.license, c14754e.appmetrica, c14754e.purchase);
                        C17381e c17381e = c10767e.purchase;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        C2399e ad = c17381e.ad(myLooper, null);
                        c10767e.mopub = ad;
                        c10767e.vip.ad(c10767e.ad, c14754e, c10767e, new ExecutorC17160e(2, ad));
                        throw null;
                    }
                }
            } catch (C5234e e) {
                throw new C4087e(e, c16975e);
            }
        }
        if (i == 6) {
            if (Build.VERSION.SDK_INT < 33 || !AbstractC17352e.purchase("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z = false;
            }
        } else if (i == 7) {
            z = AbstractC17352e.purchase("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            AbstractC2803e.smaato("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
            c14754e = C14754e.yandex;
            C17381e c17381e2 = c10767e.purchase;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            C2399e ad2 = c17381e2.ad(myLooper2, null);
            c10767e.mopub = ad2;
            c10767e.vip.ad(c10767e.ad, c14754e, c10767e, new ExecutorC17160e(2, ad2));
            throw null;
        }
        if (i == 2 || i == 10) {
            c14754e = C14754e.yandex;
        }
        C17381e c17381e22 = c10767e.purchase;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        C2399e ad22 = c17381e22.ad(myLooper22, null);
        c10767e.mopub = ad22;
        c10767e.vip.ad(c10767e.ad, c14754e, c10767e, new ExecutorC17160e(2, ad22));
        throw null;
    }

    @Override // defpackage.InterfaceC6175e
    public final void startapp() {
        long j = this.license;
        C10767e c10767e = this.purchase;
        if (c10767e.loadAd >= j) {
            c10767e.appmetrica.startapp();
        }
    }

    @Override // defpackage.InterfaceC6175e
    public final boolean subscription(boolean z) {
        return this.purchase.appmetrica.ad.vip(false);
    }

    @Override // defpackage.InterfaceC6175e
    public final void tapsense() {
        C10767e c10767e = this.purchase;
        if (c10767e.adcel.m2709switch() == 0) {
            c10767e.appmetrica.tapsense();
            return;
        }
        C9831e c9831e = new C9831e();
        if (c10767e.adcel.m2709switch() <= 0) {
            c10767e.adcel = c9831e;
        } else {
            ((AbstractC18404e) c10767e.adcel.m2707strictfp()).getClass();
            throw null;
        }
    }

    @Override // defpackage.InterfaceC6175e
    public final void vip() {
        C10767e c10767e = this.purchase;
        if (c10767e.license) {
            c10767e.appmetrica.vip();
        }
    }

    @Override // defpackage.InterfaceC6175e
    public final void yandex(long j) {
        this.metrica = j;
    }
}
