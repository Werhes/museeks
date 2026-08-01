package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۘۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8938e implements InterfaceC6901e {

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C12582e f17904e = new C12582e(24);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public AbstractC17475e f17906e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public AbstractC17475e f17907e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C5401e f17908e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C5833e f17909e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public AbstractC17475e f17910e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f17911e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC5368e f17912e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C9144e f17913e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public AbstractC17475e f17914e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public Uri f17915e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Handler f17916e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C15125e f17917e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C12333e f17920e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5389e f17921e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C18478e f17922e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Csuper f17923e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f17905e = new CopyOnWriteArrayList();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final HashMap f17919e = new HashMap();

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public long f17918e = -9223372036854775807L;

    public C8938e(C5389e c5389e, C5401e c5401e, InterfaceC5368e interfaceC5368e) {
        this.f17921e = c5389e;
        this.f17912e = interfaceC5368e;
        this.f17908e = c5401e;
    }

    public final void ad(List list) {
        for (int i = 0; i < list.size(); i++) {
            C15214e c15214e = (C15214e) list.get(i);
            C4232e c4232e = new C4232e(this, c15214e);
            AbstractC7014e it = AbstractC12614e.admob(c15214e.vip.values()).iterator();
            while (it.hasNext()) {
                this.f17919e.put((Uri) it.next(), c4232e);
            }
        }
    }

    @Override // defpackage.InterfaceC6901e
    public final void adcel(InterfaceC15834e interfaceC15834e, long j, long j2, int i) {
        C6913e c6913e;
        C8532e c8532e = (C8532e) interfaceC15834e;
        if (i == 0) {
            long j3 = c8532e.ad;
            c6913e = new C6913e(c8532e.vip, j);
        } else {
            long j4 = c8532e.ad;
            C2435e c2435e = c8532e.vip;
            C9344e c9344e = c8532e.license;
            c6913e = new C6913e(c2435e, c9344e.f18614e, c9344e.f18616e, j, j2, c9344e.f18615e);
        }
        this.f17923e.m4641break(c6913e, c8532e.metrica, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final Uri appmetrica(Uri uri) {
        C14205e c14205e;
        C9144e c9144e = this.f17913e;
        if (c9144e == null || !c9144e.tapsense.appmetrica || (c14205e = (C14205e) c9144e.pro.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c14205e.vip));
        int i = c14205e.metrica;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    public final boolean billing(C15214e c15214e, long j) {
        C4232e c4232e = (C4232e) this.f17919e.get(c15214e.metrica());
        if (c4232e == null) {
            return false;
        }
        Iterator it = c4232e.vip.values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= j <= ((C15762e) it.next()).f31047e;
        }
        return z;
    }

    public final AbstractC17475e license(int i) {
        if (i == 0) {
            return this.f17907e;
        }
        if (i == 1) {
            return this.f17906e;
        }
        if (i == 2) {
            return this.f17910e;
        }
        if (i != 3) {
            return null;
        }
        return this.f17914e;
    }

    public final C9144e metrica(boolean z, Uri uri) {
        HashMap hashMap = this.f17919e;
        C4232e c4232e = (C4232e) hashMap.get(uri);
        if (c4232e == null) {
            return null;
        }
        C9144e ad = C4232e.ad(c4232e, uri);
        if (ad != null && z) {
            startapp(uri);
            C4232e c4232e2 = (C4232e) hashMap.get(uri);
            c4232e2.getClass();
            HashMap hashMap2 = c4232e2.vip;
            C15762e c15762e = (C15762e) AbstractC0869e.signatures(hashMap2, uri, uri);
            c15762e.getClass();
            if (!c15762e.f31040e) {
                C15762e c15762e2 = (C15762e) AbstractC0869e.signatures(hashMap2, uri, uri);
                c15762e2.getClass();
                c15762e2.f31040e = true;
                C9144e ad2 = C4232e.ad(c4232e2, uri);
                if (ad2 != null && !ad2.loadAd) {
                    C4232e.vip(c4232e2, uri, true);
                }
            }
        }
        return ad;
    }

    public final void mopub(Uri uri) {
        C4232e c4232e = (C4232e) this.f17919e.get(uri);
        if (c4232e != null) {
            C15762e c15762e = (C15762e) AbstractC0869e.signatures(c4232e.vip, uri, uri);
            c15762e.getClass();
            C18478e c18478e = c15762e.f31041e;
            IOException iOException = (IOException) c18478e.f36229e;
            if (iOException != null) {
                throw iOException;
            }
            HandlerC14624e handlerC14624e = (HandlerC14624e) c18478e.f36227e;
            if (handlerC14624e != null) {
                int i = handlerC14624e.f28854e;
                IOException iOException2 = handlerC14624e.f28847e;
                if (iOException2 != null && handlerC14624e.f28856e > i) {
                    throw iOException2;
                }
            }
            IOException iOException3 = c15762e.f31045e;
            if (iOException3 != null) {
                throw iOException3;
            }
        }
    }

    @Override // defpackage.InterfaceC6901e
    public final void purchase(InterfaceC15834e interfaceC15834e, long j, long j2) {
        C5833e c5833e;
        C8532e c8532e = (C8532e) interfaceC15834e;
        AbstractC15363e abstractC15363e = (AbstractC15363e) c8532e.purchase;
        boolean z = abstractC15363e instanceof C9144e;
        if (z) {
            String str = abstractC15363e.ad;
            C5833e c5833e2 = C5833e.advert;
            Uri parse = Uri.parse(str);
            C11445e c11445e = new C11445e();
            c11445e.ad = "0";
            c11445e.smaato = AbstractC8542e.amazon("application/x-mpegURL");
            List singletonList = Collections.singletonList(new C18371e(parse, new C16975e(c11445e), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            c5833e = new C5833e(BuildConfig.FLAVOR, list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            c5833e = (C5833e) abstractC15363e;
        }
        this.f17909e = c5833e;
        try {
            this.f17907e = C15214e.vip(c5833e.license);
            this.f17906e = C15214e.ad(c5833e.appmetrica);
            this.f17910e = C15214e.ad(c5833e.purchase);
            this.f17914e = C15214e.ad(c5833e.billing);
            this.f17915e = ((C15214e) this.f17907e.get(0)).metrica();
            this.f17905e.add(new C17179e(this));
            ad(this.f17907e);
            ad(this.f17906e);
            ad(this.f17910e);
            ad(this.f17914e);
            C2435e c2435e = c8532e.vip;
            C9344e c9344e = c8532e.license;
            C6913e c6913e = new C6913e(c2435e, c9344e.f18614e, c9344e.f18616e, j, j2, c9344e.f18615e);
            C4232e c4232e = (C4232e) this.f17919e.get(this.f17915e);
            c4232e.getClass();
            if (z) {
                Uri uri = c8532e.license.f18614e;
                C15762e c15762e = (C15762e) AbstractC0869e.signatures(c4232e.vip, uri, uri);
                c15762e.getClass();
                c15762e.appmetrica((C9144e) abstractC15363e, c6913e);
            } else {
                C4232e.vip(c4232e, this.f17915e, false);
            }
            this.f17908e.getClass();
            this.f17923e.m4660while(c6913e, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (C15125e e) {
            this.f17917e = e;
        }
    }

    @Override // defpackage.InterfaceC6901e
    public final C9436e signatures(InterfaceC15834e interfaceC15834e, long j, long j2, IOException iOException, int i) {
        long min;
        C8532e c8532e = (C8532e) interfaceC15834e;
        long j3 = c8532e.ad;
        C2435e c2435e = c8532e.vip;
        C9344e c9344e = c8532e.license;
        C6913e c6913e = new C6913e(c2435e, c9344e.f18614e, c9344e.f18616e, j, j2, c9344e.f18615e);
        int i2 = c8532e.metrica;
        C5401e c5401e = this.f17908e;
        c5401e.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof C15125e) || (th instanceof FileNotFoundException) || (th instanceof C15585e) || (th instanceof C11705e) || ((th instanceof C18297e) && ((C18297e) th).f35943e == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i - 1) * 1000, 5000);
        boolean z = min == -9223372036854775807L;
        long j4 = min;
        this.f17923e.m4659try(c6913e, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        if (z) {
            c5401e.getClass();
        }
        return z ? C18478e.f36222e : new C9436e(0, j4, false);
    }

    public final void startapp(Uri uri) {
        if (uri.equals(this.f17915e)) {
            return;
        }
        List list = this.f17909e.license;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(((C18371e) list.get(i)).ad)) {
                C9144e c9144e = this.f17913e;
                if (c9144e == null || !c9144e.loadAd) {
                    this.f17915e = uri;
                    C4232e c4232e = (C4232e) this.f17919e.get(uri);
                    c4232e.getClass();
                    C9144e ad = C4232e.ad(c4232e, uri);
                    if (ad != null && ad.loadAd) {
                        this.f17913e = ad;
                        this.f17920e.signatures(ad);
                        return;
                    } else {
                        Uri appmetrica = appmetrica(uri);
                        C15762e c15762e = (C15762e) AbstractC0869e.signatures(c4232e.vip, uri, uri);
                        c15762e.getClass();
                        c15762e.license(appmetrica);
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC6901e
    public final void vip(InterfaceC15834e interfaceC15834e, long j, long j2, boolean z) {
        C8532e c8532e = (C8532e) interfaceC15834e;
        long j3 = c8532e.ad;
        C2435e c2435e = c8532e.vip;
        C9344e c9344e = c8532e.license;
        C6913e c6913e = new C6913e(c2435e, c9344e.f18614e, c9344e.f18616e, j, j2, c9344e.f18615e);
        this.f17908e.getClass();
        this.f17923e.m4657throw(c6913e, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final boolean yandex(Uri uri) {
        int i;
        C4232e c4232e = (C4232e) this.f17919e.get(uri);
        if (c4232e == null) {
            return false;
        }
        C15762e c15762e = (C15762e) AbstractC0869e.signatures(c4232e.vip, uri, uri);
        c15762e.getClass();
        if (c15762e.f31038e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, AbstractC9413e.m2567switch(c15762e.f31038e.signatures));
        C9144e c9144e = c15762e.f31038e;
        return c9144e.loadAd || (i = c9144e.license) == 2 || i == 1 || c15762e.f31050e + max > elapsedRealtime;
    }
}
