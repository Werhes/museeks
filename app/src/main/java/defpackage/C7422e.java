package defpackage;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7422e {
    public static final C18208e signatures = new C18208e(new Object());
    public final boolean Signature;
    public final AbstractC6690e ad;
    public final List adcel;
    public volatile long admob;
    public final boolean advert;
    public final int amazon;
    public final int appmetrica;
    public final boolean billing;
    public final long license;
    public final C4194e loadAd;
    public final long metrica;
    public final C18208e mopub;
    public volatile long pro;
    public final C5681e purchase;
    public volatile long remoteconfig;
    public final int smaato;
    public final C10379e startapp;
    public volatile long subscription;
    public final C18208e vip;
    public final C12931e yandex;

    public C7422e(AbstractC6690e abstractC6690e, C18208e c18208e, long j, long j2, int i, C5681e c5681e, boolean z, C12931e c12931e, C10379e c10379e, List list, C18208e c18208e2, boolean z2, int i2, int i3, C4194e c4194e, long j3, long j4, long j5, long j6, boolean z3) {
        this.ad = abstractC6690e;
        this.vip = c18208e;
        this.metrica = j;
        this.license = j2;
        this.appmetrica = i;
        this.purchase = c5681e;
        this.billing = z;
        this.yandex = c12931e;
        this.startapp = c10379e;
        this.adcel = list;
        this.mopub = c18208e2;
        this.advert = z2;
        this.smaato = i2;
        this.amazon = i3;
        this.loadAd = c4194e;
        this.admob = j3;
        this.subscription = j4;
        this.remoteconfig = j5;
        this.pro = j6;
        this.Signature = z3;
    }

    public static C7422e mopub(C10379e c10379e) {
        C12182e c12182e = AbstractC6690e.ad;
        C12931e c12931e = C12931e.license;
        C1410e c1410e = C1410e.f4222e;
        C4194e c4194e = C4194e.license;
        C18208e c18208e = signatures;
        return new C7422e(c12182e, c18208e, -9223372036854775807L, 0L, 1, null, false, c12931e, c10379e, c1410e, c18208e, false, 1, 0, c4194e, 0L, 0L, 0L, 0L, false);
    }

    public final C7422e ad() {
        return new C7422e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, this.mopub, this.advert, this.smaato, this.amazon, this.loadAd, this.admob, this.subscription, advert(), SystemClock.elapsedRealtime(), this.Signature);
    }

    public final C7422e adcel(AbstractC6690e abstractC6690e) {
        return new C7422e(abstractC6690e, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, this.mopub, this.advert, this.smaato, this.amazon, this.loadAd, this.admob, this.subscription, this.remoteconfig, this.pro, this.Signature);
    }

    public final long advert() {
        long j;
        long j2;
        if (!smaato()) {
            return this.remoteconfig;
        }
        do {
            j = this.pro;
            j2 = this.remoteconfig;
        } while (j != this.pro);
        return AbstractC9413e.m2546case(AbstractC9413e.m2567switch(j2) + (((float) (SystemClock.elapsedRealtime() - j)) * this.loadAd.ad));
    }

    public final C7422e appmetrica(int i, int i2, boolean z) {
        return new C7422e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, this.mopub, z, i, i2, this.loadAd, this.admob, this.subscription, this.remoteconfig, this.pro, this.Signature);
    }

    public final C7422e billing(C4194e c4194e) {
        return new C7422e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, this.mopub, this.advert, this.smaato, this.amazon, c4194e, this.admob, this.subscription, this.remoteconfig, this.pro, this.Signature);
    }

    public final C7422e license(C18208e c18208e, long j, long j2, long j3, long j4, C12931e c12931e, C10379e c10379e, List list) {
        return new C7422e(this.ad, c18208e, j2, j3, this.appmetrica, this.purchase, this.billing, c12931e, c10379e, list, this.mopub, this.advert, this.smaato, this.amazon, this.loadAd, this.admob, j4, j, SystemClock.elapsedRealtime(), this.Signature);
    }

    public final C7422e metrica(C18208e c18208e) {
        return new C7422e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, c18208e, this.advert, this.smaato, this.amazon, this.loadAd, this.admob, this.subscription, this.remoteconfig, this.pro, this.Signature);
    }

    public final C7422e purchase(C5681e c5681e) {
        return new C7422e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, c5681e, this.billing, this.yandex, this.startapp, this.adcel, this.mopub, this.advert, this.smaato, this.amazon, this.loadAd, this.admob, this.subscription, this.remoteconfig, this.pro, this.Signature);
    }

    public final boolean smaato() {
        return this.appmetrica == 3 && this.advert && this.amazon == 0;
    }

    public final C7422e startapp(boolean z) {
        return new C7422e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, this.mopub, this.advert, this.smaato, this.amazon, this.loadAd, this.admob, this.subscription, this.remoteconfig, this.pro, z);
    }

    public final C7422e vip(boolean z) {
        return new C7422e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, z, this.yandex, this.startapp, this.adcel, this.mopub, this.advert, this.smaato, this.amazon, this.loadAd, this.admob, this.subscription, this.remoteconfig, this.pro, this.Signature);
    }

    public final C7422e yandex(int i) {
        return new C7422e(this.ad, this.vip, this.metrica, this.license, i, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, this.mopub, this.advert, this.smaato, this.amazon, this.loadAd, this.admob, this.subscription, this.remoteconfig, this.pro, this.Signature);
    }
}
