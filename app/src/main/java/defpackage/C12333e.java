package defpackage;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12333e extends AbstractC3317e {
    public final long Signature;
    public final C1400e adcel;
    public C15197e admob;
    public final C5401e advert;
    public final int amazon;
    public final C8938e loadAd;
    public final InterfaceC14469e mopub;
    public C1962e remoteconfig;
    public final boolean smaato;
    public final C5389e startapp;
    public InterfaceC4407e subscription;
    public final crashlytics yandex;

    static {
        AbstractC1418e.ad("media3.exoplayer.hls");
    }

    public C12333e(C1962e c1962e, C5389e c5389e, crashlytics crashlyticsVar, C1400e c1400e, InterfaceC14469e interfaceC14469e, C5401e c5401e, C8938e c8938e, long j, boolean z, int i) {
        this.remoteconfig = c1962e;
        this.admob = c1962e.metrica;
        this.startapp = c5389e;
        this.yandex = crashlyticsVar;
        this.adcel = c1400e;
        this.mopub = interfaceC14469e;
        this.advert = c5401e;
        this.loadAd = c8938e;
        this.Signature = j;
        this.smaato = z;
        this.amazon = i;
    }

    public static C12966e pro(long j, List list) {
        C12966e c12966e = null;
        for (int i = 0; i < list.size(); i++) {
            C12966e c12966e2 = (C12966e) list.get(i);
            long j2 = c12966e2.f35427e;
            if (j2 > j || !c12966e2.f25833e) {
                if (j2 > j) {
                    break;
                }
            } else {
                c12966e = c12966e2;
            }
        }
        return c12966e;
    }

    @Override // defpackage.AbstractC3317e
    public final void Signature() {
        C8938e c8938e = this.loadAd;
        c8938e.f17915e = null;
        c8938e.f17913e = null;
        c8938e.f17909e = null;
        c8938e.f17907e = null;
        c8938e.f17906e = null;
        c8938e.f17910e = null;
        c8938e.f17914e = null;
        c8938e.f17917e = null;
        c8938e.f17918e = -9223372036854775807L;
        c8938e.f17922e.m4555switch(null);
        c8938e.f17922e = null;
        HashMap hashMap = c8938e.f17919e;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C4232e) it.next()).vip.values().iterator();
            while (it2.hasNext()) {
                ((C15762e) it2.next()).f31041e.m4555switch(null);
            }
        }
        c8938e.f17916e.removeCallbacksAndMessages(null);
        c8938e.f17916e = null;
        hashMap.clear();
        this.mopub.release();
    }

    @Override // defpackage.AbstractC3317e
    public final boolean ad(C1962e c1962e) {
        C1962e yandex = yandex();
        C16914e c16914e = yandex.vip;
        c16914e.getClass();
        C16914e c16914e2 = c1962e.vip;
        return c16914e2 != null && c16914e2.ad.equals(c16914e.ad) && c16914e2.appmetrica.equals(c16914e.appmetrica) && Objects.equals(c16914e2.metrica, c16914e.metrica) && yandex.metrica.equals(c1962e.metrica);
    }

    @Override // defpackage.AbstractC3317e
    public final void adcel() {
        C8938e c8938e = this.loadAd;
        C18478e c18478e = c8938e.f17922e;
        if (c18478e != null) {
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
        }
        C15125e c15125e = c8938e.f17917e;
        if (c15125e != null) {
            throw c15125e;
        }
        Uri uri = c8938e.f17915e;
        if (uri != null) {
            c8938e.mopub(uri);
        }
    }

    @Override // defpackage.AbstractC3317e
    public final void advert(InterfaceC4407e interfaceC4407e) {
        this.subscription = interfaceC4407e;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        C5350e c5350e = this.billing;
        c5350e.getClass();
        InterfaceC14469e interfaceC14469e = this.mopub;
        interfaceC14469e.mo2041transient(myLooper, c5350e);
        interfaceC14469e.license();
        Csuper csuper = new Csuper((CopyOnWriteArrayList) this.metrica.f36471e, 0, (C18208e) null);
        C16914e c16914e = yandex().vip;
        c16914e.getClass();
        Uri uri = c16914e.ad;
        C8938e c8938e = this.loadAd;
        c8938e.getClass();
        c8938e.f17916e = AbstractC9413e.subscription(null);
        c8938e.f17923e = csuper;
        c8938e.f17920e = this;
        Map map = Collections.EMPTY_MAP;
        AbstractC2301e.amazon(uri, "The uri must be set.");
        C8532e c8532e = new C8532e(((InterfaceC15169e) c8938e.f17921e.f11540e).remoteconfig(), new C2435e(uri, 0L, 1, null, map, 0L, -1L, null, 1, null), c8938e.f17912e.adcel());
        AbstractC2301e.subscription(c8938e.f17922e == null);
        C18478e c18478e = new C18478e("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        c8938e.f17922e = c18478e;
        c18478e.m4539e(c8532e, c8938e, c8938e.f17908e.isPro(c8532e.metrica));
    }

    @Override // defpackage.AbstractC3317e
    public final void amazon(InterfaceC14239e interfaceC14239e) {
        C2247e c2247e = (C2247e) interfaceC14239e;
        c2247e.f5710e.f17905e.remove(c2247e);
        for (C2220e c2220e : c2247e.f5725e) {
            if (c2220e.f5634e) {
                for (C6939e c6939e : c2220e.f5649e) {
                    c6939e.mopub();
                    InterfaceC16612e interfaceC16612e = c6939e.yandex;
                    if (interfaceC16612e != null) {
                        interfaceC16612e.metrica(c6939e.appmetrica);
                        c6939e.yandex = null;
                        c6939e.billing = null;
                    }
                }
            }
            C0851e c0851e = c2220e.f5655e;
            int subscription = c0851e.subscription.subscription();
            C8938e c8938e = c0851e.billing;
            Uri metrica = c0851e.appmetrica[subscription].metrica();
            C4232e c4232e = (C4232e) c8938e.f17919e.get(metrica);
            if (c4232e != null) {
                C15762e c15762e = (C15762e) AbstractC0869e.signatures(c4232e.vip, metrica, metrica);
                c15762e.getClass();
                c15762e.f31040e = false;
            }
            c0851e.amazon = null;
            c2220e.f5627e.m4555switch(c2220e);
            c2220e.f5630e.removeCallbacksAndMessages(null);
            c2220e.f5651e = true;
            c2220e.f5653e.clear();
        }
        c2247e.f5711e = null;
    }

    @Override // defpackage.AbstractC3317e
    public final synchronized void remoteconfig(C1962e c1962e) {
        this.remoteconfig = c1962e;
    }

    public final void signatures(C9144e c9144e) {
        long j;
        C7635e c7635e;
        long j2;
        long j3;
        long j4;
        boolean z = c9144e.Signature;
        boolean z2 = c9144e.billing;
        AbstractC17475e abstractC17475e = c9144e.subscription;
        long j5 = c9144e.signatures;
        long j6 = c9144e.appmetrica;
        int i = c9144e.license;
        long j7 = c9144e.yandex;
        long m2567switch = z ? AbstractC9413e.m2567switch(j7) : -9223372036854775807L;
        long j8 = (i == 2 || i == 1) ? m2567switch : -9223372036854775807L;
        C8938e c8938e = this.loadAd;
        c8938e.f17909e.getClass();
        C9821e c9821e = new C9821e(1);
        long j9 = 0;
        if (c8938e.f17911e) {
            C2053e c2053e = c9144e.tapsense;
            long j10 = j7 - c8938e.f17918e;
            boolean z3 = c9144e.loadAd;
            long j11 = z3 ? j10 + j5 : -9223372036854775807L;
            long m2546case = c9144e.Signature ? AbstractC9413e.m2546case(AbstractC9413e.firebase(this.Signature)) - (j7 + j5) : 0L;
            long j12 = this.admob.ad;
            if (j12 != -9223372036854775807L) {
                j3 = AbstractC9413e.m2546case(j12);
            } else {
                if (j6 != -9223372036854775807L) {
                    j2 = j5 - j6;
                } else {
                    j2 = c2053e.license;
                    if (j2 == -9223372036854775807L || c9144e.amazon == -9223372036854775807L) {
                        j2 = c2053e.metrica;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * c9144e.smaato;
                        }
                    }
                }
                j3 = j2 + m2546case;
            }
            long j13 = j5 + m2546case;
            long mopub = AbstractC9413e.mopub(j3, m2546case, j13);
            C15197e c15197e = yandex().metrica;
            boolean z4 = c15197e.license == -3.4028235E38f && c15197e.appmetrica == -3.4028235E38f && c2053e.metrica == -9223372036854775807L && c2053e.license == -9223372036854775807L;
            C9457e ad = this.admob.ad();
            ad.ad = AbstractC9413e.m2567switch(mopub);
            ad.license = z4 ? 1.0f : this.admob.license;
            ad.appmetrica = z4 ? 1.0f : this.admob.appmetrica;
            C15197e c15197e2 = new C15197e(ad);
            this.admob = c15197e2;
            if (j6 == -9223372036854775807L) {
                j6 = j13 - AbstractC9413e.m2546case(c15197e2.ad);
            }
            if (z2) {
                j9 = j6;
            } else {
                C12966e pro = pro(j6, c9144e.remoteconfig);
                if (pro != null) {
                    j4 = pro.f35427e;
                } else if (!abstractC17475e.isEmpty()) {
                    C2720e c2720e = (C2720e) abstractC17475e.get(AbstractC9413e.license(abstractC17475e, Long.valueOf(j6), true));
                    C12966e pro2 = pro(j6, c2720e.f6606e);
                    j4 = pro2 != null ? pro2.f35427e : c2720e.f35427e;
                }
                j9 = j4;
            }
            c7635e = new C7635e(j8, m2567switch, j11, c9144e.signatures, j10, j9, true, !z3, i == 2 && c9144e.purchase, c9821e, yandex(), this.admob);
        } else {
            if (j6 == -9223372036854775807L || abstractC17475e.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && j6 != j5) {
                    j6 = ((C2720e) abstractC17475e.get(AbstractC9413e.license(abstractC17475e, Long.valueOf(j6), true))).f35427e;
                }
                j = j6;
            }
            long j14 = c9144e.signatures;
            c7635e = new C7635e(j8, m2567switch, j14, j14, 0L, j, true, false, true, c9821e, yandex(), null);
        }
        smaato(c7635e);
    }

    @Override // defpackage.AbstractC3317e
    public final InterfaceC14239e vip(C18208e c18208e, InterfaceC16970e interfaceC16970e, long j) {
        Csuper csuper = new Csuper((CopyOnWriteArrayList) this.metrica.f36471e, 0, c18208e);
        C15683e c15683e = new C15683e(this.license.metrica, 0, c18208e);
        InterfaceC4407e interfaceC4407e = this.subscription;
        C5350e c5350e = this.billing;
        c5350e.getClass();
        return new C2247e(this.yandex, this.loadAd, this.startapp, interfaceC4407e, this.mopub, c15683e, this.advert, csuper, interfaceC16970e, this.adcel, this.smaato, this.amazon, c5350e);
    }

    @Override // defpackage.AbstractC3317e
    public final synchronized C1962e yandex() {
        return this.remoteconfig;
    }
}
