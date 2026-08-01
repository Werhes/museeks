package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8166e implements InterfaceC11096e, InterfaceC6882e, InterfaceC0325e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final String f16617e = C5401e.crashlytics("GreedyScheduler");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C14026e f16618e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C16000e f16619e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C15899e f16620e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Boolean f16621e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f16623e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f16625e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final HashSet f16622e = new HashSet();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Object f16624e = new Object();

    public C8166e(Context context, C11224e c11224e, C0912e c0912e, C15899e c15899e) {
        this.f16623e = context;
        this.f16620e = c15899e;
        this.f16619e = new C16000e(context, c0912e, this);
        this.f16618e = new C14026e(this, (C9770e) c11224e.yandex);
    }

    @Override // defpackage.InterfaceC6882e
    public final void ad(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C5401e.loadAd().smaato(f16617e, AbstractC17861e.Signature("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f16620e.mopub(str);
        }
    }

    @Override // defpackage.InterfaceC11096e
    public final void appmetrica(C13394e... c13394eArr) {
        if (this.f16621e == null) {
            this.f16621e = Boolean.valueOf(AbstractC4617e.ad(this.f16623e, this.f16620e.license));
        }
        if (!this.f16621e.booleanValue()) {
            C5401e.loadAd().premium(f16617e, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f16625e) {
            this.f16620e.yandex.ad(this);
            this.f16625e = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C13394e c13394e : c13394eArr) {
            long ad = c13394e.ad();
            long currentTimeMillis = System.currentTimeMillis();
            if (c13394e.vip == EnumC7300e.f14903e) {
                if (currentTimeMillis < ad) {
                    C14026e c14026e = this.f16618e;
                    if (c14026e != null) {
                        C9770e c9770e = c14026e.vip;
                        HashMap hashMap = c14026e.metrica;
                        Runnable runnable = (Runnable) hashMap.remove(c13394e.ad);
                        if (runnable != null) {
                            ((Handler) c9770e.f19315e).removeCallbacks(runnable);
                        }
                        RunnableC17144e runnableC17144e = new RunnableC17144e(c14026e, c13394e, false, 10);
                        hashMap.put(c13394e.ad, runnableC17144e);
                        ((Handler) c9770e.f19315e).postDelayed(runnableC17144e, c13394e.ad() - System.currentTimeMillis());
                    }
                } else if (c13394e.vip()) {
                    int i = Build.VERSION.SDK_INT;
                    C7829e c7829e = c13394e.adcel;
                    if (c7829e.metrica) {
                        C5401e.loadAd().smaato(f16617e, "Ignoring WorkSpec " + c13394e + ", Requires device idle.", new Throwable[0]);
                    } else if (i < 24 || c7829e.yandex.ad.size() <= 0) {
                        hashSet.add(c13394e);
                        hashSet2.add(c13394e.ad);
                    } else {
                        C5401e.loadAd().smaato(f16617e, "Ignoring WorkSpec " + c13394e + ", Requires ContentUri triggers.", new Throwable[0]);
                    }
                } else {
                    C5401e.loadAd().smaato(f16617e, AbstractC17861e.Signature("Starting work for ", c13394e.ad), new Throwable[0]);
                    this.f16620e.adcel(c13394e.ad, null);
                }
            }
        }
        synchronized (this.f16624e) {
            try {
                if (!hashSet.isEmpty()) {
                    C5401e.loadAd().smaato(f16617e, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f16622e.addAll(hashSet);
                    this.f16619e.metrica(this.f16622e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC11096e
    public final void license(String str) {
        Runnable runnable;
        Boolean bool = this.f16621e;
        C15899e c15899e = this.f16620e;
        if (bool == null) {
            this.f16621e = Boolean.valueOf(AbstractC4617e.ad(this.f16623e, c15899e.license));
        }
        boolean booleanValue = this.f16621e.booleanValue();
        String str2 = f16617e;
        if (!booleanValue) {
            C5401e.loadAd().premium(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f16625e) {
            c15899e.yandex.ad(this);
            this.f16625e = true;
        }
        C5401e.loadAd().smaato(str2, AbstractC17861e.Signature("Cancelling work ID ", str), new Throwable[0]);
        C14026e c14026e = this.f16618e;
        if (c14026e != null && (runnable = (Runnable) c14026e.metrica.remove(str)) != null) {
            ((Handler) c14026e.vip.f19315e).removeCallbacks(runnable);
        }
        c15899e.mopub(str);
    }

    @Override // defpackage.InterfaceC0325e
    public final void metrica(String str, boolean z) {
        synchronized (this.f16624e) {
            try {
                Iterator it = this.f16622e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C13394e c13394e = (C13394e) it.next();
                    if (c13394e.ad.equals(str)) {
                        C5401e.loadAd().smaato(f16617e, "Stopping tracking for " + str, new Throwable[0]);
                        this.f16622e.remove(c13394e);
                        this.f16619e.metrica(this.f16622e);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC6882e
    public final void purchase(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C5401e.loadAd().smaato(f16617e, AbstractC17861e.Signature("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f16620e.adcel(str, null);
        }
    }

    @Override // defpackage.InterfaceC11096e
    public final boolean vip() {
        return false;
    }
}
