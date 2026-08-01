package defpackage;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9407e {
    public final C11922e adcel;
    public BasePendingResult advert;
    public final SparseIntArray appmetrica;
    public final ArrayList billing;
    public ArrayList license;
    public final C5710e metrica;
    public BasePendingResult mopub;
    public final C17606e purchase;
    public final HandlerC9134e startapp;
    public long vip;
    public final ArrayDeque yandex;
    public final Set smaato = DesugarCollections.synchronizedSet(new HashSet());
    public final C18482e ad = new C18482e("MediaQueue", null);

    public C9407e(C5710e c5710e) {
        this.metrica = c5710e;
        Math.max(20, 1);
        this.license = new ArrayList();
        this.appmetrica = new SparseIntArray();
        this.billing = new ArrayList();
        this.yandex = new ArrayDeque(20);
        this.startapp = new HandlerC9134e(Looper.getMainLooper(), 6);
        this.adcel = new C11922e(this);
        C8327e c8327e = new C8327e(0, this);
        AbstractC9528e.appmetrica();
        c5710e.yandex.add(c8327e);
        this.purchase = new C17606e(this);
        this.vip = appmetrica();
        vip();
    }

    public final void ad() {
        purchase();
        this.license.clear();
        this.appmetrica.clear();
        this.purchase.evictAll();
        this.billing.clear();
        this.startapp.removeCallbacks(this.adcel);
        this.yandex.clear();
        BasePendingResult basePendingResult = this.advert;
        if (basePendingResult != null) {
            basePendingResult.appmetrica();
            this.advert = null;
        }
        BasePendingResult basePendingResult2 = this.mopub;
        if (basePendingResult2 != null) {
            basePendingResult2.appmetrica();
            this.mopub = null;
        }
        yandex();
        billing();
    }

    public final long appmetrica() {
        C0849e metrica = this.metrica.metrica();
        if (metrica == null) {
            return 0L;
        }
        MediaInfo mediaInfo = metrica.f3251e;
        int i = mediaInfo == null ? -1 : mediaInfo.f691e;
        int i2 = metrica.f3231e;
        int i3 = metrica.f3253e;
        int i4 = metrica.f3233e;
        if (i2 == 1) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return 0L;
                    }
                } else if (i != 2) {
                    return 0L;
                }
            }
            if (i4 == 0) {
                return 0L;
            }
        }
        return metrica.f3239e;
    }

    public final void billing() {
        Set set = this.smaato;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void license() {
        Set set = this.smaato;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void metrica() {
        SparseIntArray sparseIntArray = this.appmetrica;
        sparseIntArray.clear();
        for (int i = 0; i < this.license.size(); i++) {
            sparseIntArray.put(((Integer) this.license.get(i)).intValue(), i);
        }
    }

    public final void purchase() {
        Set set = this.smaato;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vip() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        AbstractC9528e.appmetrica();
        if (this.vip != 0 && (basePendingResult = this.advert) == null) {
            if (basePendingResult != null) {
                basePendingResult.appmetrica();
                this.advert = null;
            }
            BasePendingResult basePendingResult3 = this.mopub;
            if (basePendingResult3 != null) {
                basePendingResult3.appmetrica();
                this.mopub = null;
            }
            C5710e c5710e = this.metrica;
            c5710e.getClass();
            AbstractC9528e.appmetrica();
            if (c5710e.admob()) {
                C9883e c9883e = new C9883e(c5710e, 2);
                C5710e.subscription(c9883e);
                basePendingResult2 = c9883e;
            } else {
                basePendingResult2 = C5710e.Signature();
            }
            this.advert = basePendingResult2;
            basePendingResult2.mopub(new C12075e(this, 1));
        }
    }

    public final void yandex() {
        Set set = this.smaato;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
