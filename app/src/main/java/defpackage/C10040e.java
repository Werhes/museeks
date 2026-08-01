package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.os.UserManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10040e {
    public static final Object adcel = new Object();
    public static final Object mopub = new Object();
    public final Context ad;
    public final InterfaceC6823e appmetrica;
    public final Uri billing;
    public final InterfaceC6823e license;
    public final InterfaceC6823e metrica;
    public final InterfaceC6823e purchase;
    public final Uri startapp;
    public final InterfaceC6823e vip;
    public volatile C10909e yandex;

    public C10040e(Context context, InterfaceC6823e interfaceC6823e, InterfaceC6823e interfaceC6823e2, InterfaceC6823e interfaceC6823e3) {
        this.ad = context;
        this.metrica = interfaceC6823e;
        this.vip = interfaceC6823e3;
        this.license = interfaceC6823e2;
        Pattern pattern = AbstractC0481e.ad;
        C2532e c2532e = new C2532e(context);
        c2532e.m917e("phenotype_storage_info");
        c2532e.m901e("storage-info.pb");
        this.billing = c2532e.m902e();
        C2532e c2532e2 = new C2532e(context);
        c2532e2.m917e("phenotype_storage_info");
        c2532e2.m901e("device-encrypted-storage-info.pb");
        UserManager userManager = AbstractC16603e.ad;
        int i = 1;
        if (Build.VERSION.SDK_INT >= 24) {
            Set set = AbstractC0481e.license;
            AbstractC4511e.pro(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
            c2532e2.f6386e = "directboot-files";
        }
        this.startapp = c2532e2.m902e();
        this.appmetrica = AbstractC5209e.billing(new C1715e(i, this));
        this.purchase = AbstractC5209e.billing(new C4934e(interfaceC6823e, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (defpackage.AbstractC16603e.metrica(r5.ad) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad() {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lf
            android.content.Context r0 = r5.ad
            boolean r0 = defpackage.AbstractC16603e.metrica(r0)
            if (r0 != 0) goto L11
            goto L5a
        Lf:
            android.os.UserManager r0 = defpackage.AbstractC16603e.ad
        L11:
            eٍُ۟ r0 = r5.metrica()
            long r0 = r0.isPro()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r3 = 24
            long r2 = r2.toMillis(r3)
            long r2 = r2 + r0
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5a
            eؙۨٔ r0 = r5.metrica
            java.lang.Object r0 = r0.get()
            eًؙؓ r0 = (defpackage.InterfaceScheduledExecutorServiceC1678e) r0
            r0.getClass()
            eؙۨٔ r1 = r5.purchase
            java.lang.Object r1 = r1.get()
            com.google.common.util.concurrent.ListenableFuture r1 = (com.google.common.util.concurrent.ListenableFuture) r1
            com.google.common.util.concurrent.ListenableFuture r1 = defpackage.AbstractC2017e.appmetrica(r1)
            int r2 = defpackage.AbstractC6906e.f14154e
            boolean r2 = r1 instanceof defpackage.AbstractC6906e
            if (r2 == 0) goto L4a
            eؚؕؑ r1 = (defpackage.AbstractC6906e) r1
            goto L50
        L4a:
            eٍُٔ r2 = new eٍُٔ
            r2.<init>(r1)
            r1 = r2
        L50:
            eَؓۢ r2 = new eَؓۢ
            r3 = 2
            r2.<init>(r3, r5)
            defpackage.AbstractC2017e.billing(r1, r2, r0)
            return
        L5a:
            eٓؔ٘ r0 = defpackage.C13747e.f27231e
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10040e.ad():void");
    }

    public final C10909e metrica() {
        C10909e c10909e;
        C10909e c10909e2 = this.yandex;
        if (c10909e2 != null) {
            return c10909e2;
        }
        synchronized (adcel) {
            c10909e = this.yandex;
            if (c10909e == null) {
                c10909e = C10909e.m2939this();
                if (AbstractC16603e.ad(this.ad)) {
                    InterfaceC11283e interfaceC11283e = (InterfaceC11283e) c10909e.pro(7);
                    C17268e c17268e = C17268e.ad;
                    int i = AbstractC3433e.ad;
                    C17268e c17268e2 = C17268e.vip;
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                    try {
                        InputStream isPro = AbstractC17181e.isPro(((C6843e) this.license.get()).vip(this.billing));
                        try {
                            AbstractC15319e ad = ((C3466e) interfaceC11283e).ad(isPro, c17268e2);
                            if (isPro != null) {
                                isPro.close();
                            }
                            c10909e = (C10909e) ad;
                        } catch (Throwable th) {
                            if (isPro != null) {
                                try {
                                    isPro.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    this.yandex = c10909e;
                }
            }
        }
        return c10909e;
    }

    public final C3992e vip() {
        C10909e metrica = metrica();
        return new C3992e(metrica.isVip(), AbstractC17475e.remoteconfig(metrica.premium()), metrica.tapsense(), metrica.inmobi(), (metrica.subs() && metrica.crashlytics().tapsense() == ((long) Build.VERSION.SDK_INT)) ? metrica.crashlytics().signatures() : BuildConfig.FLAVOR, AbstractC17475e.remoteconfig(metrica.applovin()), AbstractC17475e.remoteconfig(metrica.ads()), metrica.signatures(), metrica.m2940class(), metrica.firebase(), metrica.m2941interface());
    }
}
