package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8757e {
    public long Signature;
    public C0313e adcel;
    public C0313e advert;
    public int amazon;
    public final C17687e appmetrica;
    public int billing;
    public final C2399e license;
    public Object loadAd;
    public final C4174e metrica;
    public C0313e mopub;
    public long purchase;
    public C0313e smaato;
    public C0313e startapp;
    public boolean yandex;
    public final C6158e ad = new C6158e();
    public final C11501e vip = new C11501e();
    public ArrayList admob = new ArrayList();

    public C8757e(C4174e c4174e, C2399e c2399e, C17687e c17687e) {
        this.metrica = c4174e;
        this.license = c2399e;
        this.appmetrica = c17687e;
    }

    public static C18208e Signature(AbstractC6690e abstractC6690e, Object obj, long j, long j2, C11501e c11501e, C6158e c6158e) {
        abstractC6690e.billing(obj, c6158e);
        abstractC6690e.amazon(c6158e.metrica, c11501e);
        int vip = abstractC6690e.vip(obj);
        Object obj2 = obj;
        while (true) {
            int i = c6158e.billing.ad;
            if (i == 0) {
                break;
            }
            if ((i == 1 && c6158e.billing(0)) || !c6158e.yandex(c6158e.billing.license)) {
                break;
            }
            long j3 = 0;
            if (c6158e.metrica(0L) != -1) {
                break;
            }
            if (c6158e.license != 0) {
                int i2 = i - (c6158e.billing(i + (-1)) ? 2 : 1);
                for (int i3 = 0; i3 <= i2; i3++) {
                    j3 += c6158e.billing.ad(i3).adcel;
                }
                if (c6158e.license > j3) {
                    break;
                }
            }
            if (vip > c11501e.loadAd) {
                break;
            }
            abstractC6690e.purchase(vip, c6158e, true);
            obj2 = c6158e.vip;
            obj2.getClass();
            vip++;
        }
        abstractC6690e.billing(obj2, c6158e);
        int metrica = c6158e.metrica(j);
        return metrica == -1 ? new C18208e(obj2, j2, c6158e.vip(j)) : new C18208e(obj2, metrica, c6158e.purchase(metrica), j2, -1);
    }

    public final C0313e ad() {
        C0313e c0313e = this.startapp;
        if (c0313e == null) {
            return null;
        }
        if (c0313e == this.adcel) {
            this.adcel = c0313e.smaato;
        }
        if (c0313e == this.mopub) {
            this.mopub = c0313e.smaato;
        }
        c0313e.startapp();
        int i = this.amazon - 1;
        this.amazon = i;
        if (i == 0) {
            this.advert = null;
            C0313e c0313e2 = this.startapp;
            this.loadAd = c0313e2.vip;
            this.Signature = c0313e2.billing.ad.license;
        }
        this.startapp = this.startapp.smaato;
        smaato();
        return this.startapp;
    }

    public final boolean adcel(AbstractC6690e abstractC6690e, C18208e c18208e, boolean z) {
        int vip = abstractC6690e.vip(c18208e.ad);
        if (!abstractC6690e.smaato(abstractC6690e.purchase(vip, this.ad, false).metrica, this.vip, 0L).startapp) {
            if (abstractC6690e.license(vip, this.ad, this.vip, this.billing, this.yandex) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final C18208e admob(AbstractC6690e abstractC6690e, Object obj, long j) {
        long subscription;
        int vip;
        Object obj2 = obj;
        C6158e c6158e = this.ad;
        int i = abstractC6690e.billing(obj2, c6158e).metrica;
        Object obj3 = this.loadAd;
        if (obj3 == null || (vip = abstractC6690e.vip(obj3)) == -1 || abstractC6690e.purchase(vip, c6158e, false).metrica != i) {
            C0313e c0313e = this.startapp;
            while (true) {
                if (c0313e == null) {
                    C0313e c0313e2 = this.startapp;
                    while (true) {
                        if (c0313e2 != null) {
                            int vip2 = abstractC6690e.vip(c0313e2.vip);
                            if (vip2 != -1 && abstractC6690e.purchase(vip2, c6158e, false).metrica == i) {
                                subscription = c0313e2.billing.ad.license;
                                break;
                            }
                            c0313e2 = c0313e2.smaato;
                        } else {
                            subscription = subscription(obj2);
                            if (subscription == -1) {
                                subscription = this.purchase;
                                this.purchase = 1 + subscription;
                                if (this.startapp == null) {
                                    this.loadAd = obj2;
                                    this.Signature = subscription;
                                }
                            }
                        }
                    }
                } else {
                    if (c0313e.vip.equals(obj2)) {
                        subscription = c0313e.billing.ad.license;
                        break;
                    }
                    c0313e = c0313e.smaato;
                }
            }
        } else {
            subscription = this.Signature;
        }
        abstractC6690e.billing(obj2, c6158e);
        int i2 = c6158e.metrica;
        C11501e c11501e = this.vip;
        abstractC6690e.amazon(i2, c11501e);
        boolean z = false;
        for (int vip3 = abstractC6690e.vip(obj); vip3 >= c11501e.amazon; vip3--) {
            abstractC6690e.purchase(vip3, c6158e, true);
            boolean z2 = c6158e.billing.ad > 0;
            z |= z2;
            if (c6158e.metrica(c6158e.license) != -1) {
                obj2 = c6158e.vip;
                obj2.getClass();
            }
            if (z && (!z2 || c6158e.license != 0)) {
                break;
            }
        }
        return Signature(abstractC6690e, obj2, j, subscription, this.vip, this.ad);
    }

    public final void advert() {
        C0313e c0313e = this.smaato;
        if (c0313e == null || c0313e.yandex()) {
            this.smaato = null;
            for (int i = 0; i < this.admob.size(); i++) {
                C0313e c0313e2 = (C0313e) this.admob.get(i);
                if (!c0313e2.yandex()) {
                    this.smaato = c0313e2;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, eًٔ] */
    public final void amazon(long j) {
        C0313e c0313e = this.advert;
        if (c0313e != null) {
            AbstractC2301e.subscription(c0313e.smaato == null);
            if (c0313e.appmetrica) {
                c0313e.ad.tapsense(j - c0313e.Signature);
            }
        }
    }

    public final C15701e appmetrica(AbstractC6690e abstractC6690e, C18208e c18208e, long j, long j2, long j3) {
        abstractC6690e.billing(c18208e.ad, this.ad);
        return c18208e.vip() ? purchase(abstractC6690e, c18208e.ad, c18208e.vip, c18208e.metrica, j, c18208e.license, false) : billing(abstractC6690e, c18208e.ad, j2, j3, j, c18208e.license, false);
    }

    public final C15701e billing(AbstractC6690e abstractC6690e, Object obj, long j, long j2, long j3, long j4, boolean z) {
        C11768e ad;
        int i;
        boolean z2;
        long j5 = j;
        C6158e c6158e = this.ad;
        abstractC6690e.billing(obj, c6158e);
        int vip = c6158e.vip(j5);
        if (vip == -1) {
            C11541e c11541e = c6158e.billing;
            if (c11541e.ad > 0 && c6158e.yandex(c11541e.license)) {
                z2 = true;
            }
            z2 = false;
            break;
        }
        if (c6158e.yandex(vip) && c6158e.license(vip) == c6158e.license && (i = (ad = c6158e.billing.ad(vip)).vip) != -1) {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = ad.purchase[i2];
                if (i3 != 0 && i3 != 1) {
                }
            }
            z2 = true;
            vip = -1;
        }
        z2 = false;
        break;
        C18208e c18208e = new C18208e(obj, j4, vip);
        boolean z3 = !c18208e.vip() && vip == -1;
        boolean mopub = mopub(abstractC6690e, c18208e);
        boolean adcel = adcel(abstractC6690e, c18208e, z3);
        boolean z4 = (vip == -1 || !c6158e.yandex(vip) || c6158e.billing(vip)) ? false : true;
        long license = (vip == -1 || (vip != -1 && c6158e.billing(vip) && c6158e.yandex(vip))) ? z2 ? c6158e.license : -9223372036854775807L : c6158e.license(vip);
        long j6 = (license == -9223372036854775807L || license == Long.MIN_VALUE) ? c6158e.license : license;
        if (j6 != -9223372036854775807L && j5 >= j6) {
            j5 = Math.max(0L, j6 - ((adcel || !z2) ? 1 : 0));
        }
        return new C15701e(c18208e, j5, j2, j3, license, j6, z, z4, z3, mopub, adcel);
    }

    public final C15701e license(AbstractC6690e abstractC6690e, C0313e c0313e, long j) {
        AbstractC6690e abstractC6690e2;
        C15701e c15701e = c0313e.billing;
        long j2 = (c0313e.Signature + c15701e.purchase) - j;
        if (c15701e.startapp) {
            return metrica(abstractC6690e, c0313e, j2);
        }
        C18208e c18208e = c15701e.ad;
        Object obj = c18208e.ad;
        int i = c18208e.appmetrica;
        C6158e c6158e = this.ad;
        abstractC6690e.billing(obj, c6158e);
        boolean z = c15701e.yandex;
        if (!c18208e.vip()) {
            if (i != -1 && c6158e.billing(i)) {
                return metrica(abstractC6690e, c0313e, j2);
            }
            int purchase = c6158e.purchase(i);
            boolean z2 = c6158e.yandex(i) && c6158e.appmetrica(i, purchase) == 3;
            if (purchase != c6158e.billing.ad(i).vip && !z2) {
                return purchase(abstractC6690e, c18208e.ad, c18208e.appmetrica, purchase, c15701e.purchase, c18208e.license, z);
            }
            abstractC6690e.billing(obj, c6158e);
            long license = c6158e.license(i);
            return billing(abstractC6690e, c18208e.ad, license == Long.MIN_VALUE ? c6158e.license : license + c6158e.billing.ad(i).adcel, -9223372036854775807L, c15701e.purchase, c18208e.license, false);
        }
        int i2 = c18208e.vip;
        int i3 = c6158e.billing.ad(i2).vip;
        if (i3 == -1) {
            return null;
        }
        int ad = c6158e.billing.ad(i2).ad(c18208e.metrica);
        if (ad < i3) {
            return purchase(abstractC6690e, c18208e.ad, i2, ad, c15701e.license, c18208e.license, z);
        }
        long j3 = c15701e.license;
        long j4 = -9223372036854775807L;
        if (j3 == -9223372036854775807L) {
            int i4 = c6158e.metrica;
            if (c6158e.license == -9223372036854775807L) {
                C11501e c11501e = this.vip;
                abstractC6690e.amazon(i4, c11501e);
                if (c11501e.startapp && !c11501e.mopub) {
                    j4 = Math.max(0L, j2);
                }
            }
            long j5 = j4;
            abstractC6690e2 = abstractC6690e;
            Pair adcel = abstractC6690e2.adcel(this.vip, c6158e, c6158e.metrica, -9223372036854775807L, j5);
            if (adcel == null) {
                return null;
            }
            j3 = ((Long) adcel.second).longValue();
            j4 = j5;
        } else {
            abstractC6690e2 = abstractC6690e;
        }
        int i5 = c18208e.vip;
        abstractC6690e2.billing(obj, c6158e);
        long license2 = c6158e.license(i5);
        return billing(abstractC6690e2, c18208e.ad, Math.max(license2 == Long.MIN_VALUE ? c6158e.license : c6158e.billing.ad(i5).adcel + license2, j3), j4, c15701e.license, c18208e.license, z);
    }

    public final int loadAd(C0313e c0313e) {
        c0313e.getClass();
        int i = 0;
        if (c0313e.equals(this.advert)) {
            return 0;
        }
        this.advert = c0313e;
        while (true) {
            c0313e = c0313e.smaato;
            if (c0313e == null) {
                break;
            }
            if (c0313e == this.adcel) {
                C0313e c0313e2 = this.startapp;
                this.adcel = c0313e2;
                this.mopub = c0313e2;
                i = 3;
            }
            if (c0313e == this.mopub) {
                this.mopub = this.adcel;
                i |= 2;
            }
            c0313e.startapp();
            this.amazon--;
        }
        C0313e c0313e3 = this.advert;
        c0313e3.getClass();
        if (c0313e3.smaato != null) {
            c0313e3.vip();
            c0313e3.smaato = null;
            c0313e3.metrica();
        }
        smaato();
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C15701e metrica(defpackage.AbstractC6690e r21, defpackage.C0313e r22, long r23) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8757e.metrica(eؙ۠ؐ, eؑٔۢ, long):eٕۚؓ");
    }

    public final boolean mopub(AbstractC6690e abstractC6690e, C18208e c18208e) {
        boolean z = !c18208e.vip() && c18208e.appmetrica == -1;
        Object obj = c18208e.ad;
        if (z) {
            if (abstractC6690e.smaato(abstractC6690e.billing(obj, this.ad).metrica, this.vip, 0L).loadAd == abstractC6690e.vip(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int pro(defpackage.AbstractC6690e r23, long r24, long r26, long r28) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8757e.pro(eؙ۠ؐ, long, long, long):int");
    }

    public final C15701e purchase(AbstractC6690e abstractC6690e, Object obj, int i, int i2, long j, long j2, boolean z) {
        C18208e c18208e = new C18208e(obj, i, i2, j2, -1);
        C6158e c6158e = this.ad;
        long ad = abstractC6690e.billing(obj, c6158e).ad(i, i2);
        long j3 = i2 == c6158e.purchase(i) ? c6158e.billing.vip : 0L;
        boolean yandex = c6158e.yandex(i);
        if (ad != -9223372036854775807L && j3 >= ad) {
            j3 = Math.max(0L, ad - 1);
        }
        return new C15701e(c18208e, j3, -9223372036854775807L, j, -9223372036854775807L, ad, z, yandex, false, false, false);
    }

    public final int remoteconfig(AbstractC6690e abstractC6690e) {
        AbstractC6690e abstractC6690e2;
        C0313e c0313e;
        C0313e c0313e2 = this.startapp;
        if (c0313e2 == null) {
            return 0;
        }
        int vip = abstractC6690e.vip(c0313e2.vip);
        while (true) {
            abstractC6690e2 = abstractC6690e;
            vip = abstractC6690e2.license(vip, this.ad, this.vip, this.billing, this.yandex);
            while (true) {
                c0313e2.getClass();
                c0313e = c0313e2.smaato;
                if (c0313e == null || c0313e2.billing.startapp) {
                    break;
                }
                c0313e2 = c0313e;
            }
            if (vip == -1 || c0313e == null || abstractC6690e2.vip(c0313e.vip) != vip) {
                break;
            }
            c0313e2 = c0313e;
            abstractC6690e = abstractC6690e2;
        }
        int loadAd = loadAd(c0313e2);
        c0313e2.billing = startapp(abstractC6690e2, c0313e2.billing);
        return loadAd;
    }

    public final void smaato() {
        C13304e Signature = AbstractC17475e.Signature();
        for (C0313e c0313e = this.startapp; c0313e != null; c0313e = c0313e.smaato) {
            Signature.metrica(c0313e.billing.ad);
        }
        C0313e c0313e2 = this.adcel;
        this.license.license(new RunnableC4904e(28, this, Signature, c0313e2 == null ? null : c0313e2.billing.ad));
    }

    public final C15701e startapp(AbstractC6690e abstractC6690e, C15701e c15701e) {
        C18208e c18208e = c15701e.ad;
        boolean vip = c18208e.vip();
        int i = c18208e.appmetrica;
        boolean z = false;
        boolean z2 = !vip && i == -1;
        int i2 = c18208e.vip;
        boolean mopub = mopub(abstractC6690e, c18208e);
        boolean adcel = adcel(abstractC6690e, c18208e, z2);
        Object obj = c18208e.ad;
        C6158e c6158e = this.ad;
        abstractC6690e.billing(obj, c6158e);
        long license = (c18208e.vip() || i == -1) ? -9223372036854775807L : c6158e.license(i);
        long ad = c18208e.vip() ? c6158e.ad(i2, c18208e.metrica) : (license == -9223372036854775807L || license == Long.MIN_VALUE) ? c6158e.license : license;
        if (c18208e.vip()) {
            z = c6158e.yandex(i2);
        } else if (i != -1 && c6158e.yandex(i)) {
            z = true;
        }
        return new C15701e(c18208e, c15701e.vip, c15701e.metrica, c15701e.license, license, ad, c15701e.billing, z, z2, mopub, adcel);
    }

    public final long subscription(Object obj) {
        for (int i = 0; i < this.admob.size(); i++) {
            C0313e c0313e = (C0313e) this.admob.get(i);
            if (c0313e.vip.equals(obj)) {
                return c0313e.billing.ad.license;
            }
        }
        return -1L;
    }

    public final void vip() {
        if (this.amazon == 0) {
            return;
        }
        C0313e c0313e = this.startapp;
        c0313e.getClass();
        this.loadAd = c0313e.vip;
        this.Signature = c0313e.billing.ad.license;
        while (c0313e != null) {
            c0313e.startapp();
            c0313e = c0313e.smaato;
        }
        this.startapp = null;
        this.advert = null;
        this.adcel = null;
        this.mopub = null;
        this.amazon = 0;
        smaato();
    }

    public final C0313e yandex() {
        return this.mopub;
    }
}
