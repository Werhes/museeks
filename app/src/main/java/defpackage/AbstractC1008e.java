package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1008e {
    public static final C3168e ad = new C3168e("androidx.media3.session.MediaLibraryService", (Bundle) null);

    public static boolean ad(C12693e c12693e, C12693e c12693e2) {
        C0101e c0101e = c12693e.ad;
        int i = c0101e.vip;
        C0101e c0101e2 = c12693e2.ad;
        return i == c0101e2.vip && c0101e.appmetrica == c0101e2.appmetrica && c0101e.yandex == c0101e2.yandex && c0101e.startapp == c0101e2.startapp;
    }

    public static C2411e appmetrica(C2411e c2411e, C2411e c2411e2, C1120e c1120e, C5298e c5298e, boolean z, C7543e c7543e) {
        C2411e c2411e3;
        C18255e c18255e;
        boolean z2;
        if (c1120e.ad && c5298e.ad(17)) {
            AbstractC6690e abstractC6690e = c2411e.adcel;
            AbstractC4265e.yandex("Invalid PlayerInfo update, old index: " + c2411e.metrica.ad.vip + " (count=" + abstractC6690e.loadAd() + "), new index = " + c2411e2.metrica.ad.vip + ", sent from " + c7543e.ad.ads() + ", interface version=" + c7543e.ad.firebase(), abstractC6690e.Signature() || c2411e2.metrica.ad.vip < abstractC6690e.loadAd());
            c2411e3 = c2411e2.advert(abstractC6690e);
        } else {
            c2411e3 = c2411e2;
        }
        if (c1120e.vip && c5298e.ad(30)) {
            c2411e3 = c2411e3.vip(c2411e.f6185class);
        }
        if (!z || c2411e2.amazon != 0.0f) {
            return c2411e3;
        }
        float f = c2411e.loadAd;
        C8256e c8256e = c2411e3.ad;
        int i = c2411e3.vip;
        C12693e c12693e = c2411e3.metrica;
        C0101e c0101e = c2411e3.license;
        C0101e c0101e2 = c2411e3.appmetrica;
        int i2 = c2411e3.purchase;
        C4194e c4194e = c2411e3.billing;
        int i3 = c2411e3.yandex;
        boolean z3 = c2411e3.startapp;
        AbstractC6690e abstractC6690e2 = c2411e3.adcel;
        int i4 = c2411e3.mopub;
        C2351e c2351e = c2411e3.advert;
        C12053e c12053e = c2411e3.smaato;
        float f2 = c2411e3.amazon;
        int i5 = c2411e3.Signature;
        C3335e c3335e = c2411e3.admob;
        C9039e c9039e = c2411e3.subscription;
        C5251e c5251e = c2411e3.remoteconfig;
        int i6 = c2411e3.pro;
        boolean z4 = c2411e3.signatures;
        boolean z5 = c2411e3.tapsense;
        int i7 = c2411e3.isVip;
        boolean z6 = c2411e3.inmobi;
        boolean z7 = c2411e3.isPro;
        int i8 = c2411e3.applovin;
        int i9 = c2411e3.ads;
        C12053e c12053e2 = c2411e3.premium;
        long j = c2411e3.subs;
        long j2 = c2411e3.crashlytics;
        long j3 = c2411e3.firebase;
        C18255e c18255e2 = c2411e3.f6185class;
        C4491e c4491e = c2411e3.f6186interface;
        if (abstractC6690e2.Signature()) {
            c18255e = c18255e2;
        } else {
            c18255e = c18255e2;
            if (c12693e.ad.vip >= abstractC6690e2.loadAd()) {
                z2 = false;
                AbstractC2301e.subscription(z2);
                return new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z3, c2351e, abstractC6690e2, i4, c12053e, f2, f, c3335e, i5, c9039e, c5251e, i6, z4, z5, i7, i8, i9, z6, z7, c12053e2, j, j2, j3, c18255e, c4491e);
            }
        }
        z2 = true;
        AbstractC2301e.subscription(z2);
        return new C2411e(c8256e, i, c12693e, c0101e, c0101e2, i2, c4194e, i3, z3, c2351e, abstractC6690e2, i4, c12053e, f2, f, c3335e, i5, c9039e, c5251e, i6, z4, z5, i7, i8, i9, z6, z7, c12053e2, j, j2, j3, c18255e, c4491e);
    }

    public static ArrayList billing(List list) {
        ArrayList arrayList = new ArrayList();
        Parcel obtain = Parcel.obtain();
        for (int i = 0; i < list.size(); i++) {
            try {
                Parcelable parcelable = (Parcelable) list.get(i);
                obtain.writeParcelable(parcelable, 0);
                if (obtain.dataSize() >= 262144) {
                    break;
                }
                arrayList.add(parcelable);
            } finally {
                obtain.recycle();
            }
        }
        return arrayList;
    }

    public static C5298e license(C5298e c5298e, C5298e c5298e2) {
        if (c5298e != null) {
            C11715e c11715e = c5298e.ad;
            if (c5298e2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i = 0; i < c11715e.ad.size(); i++) {
                    if (c5298e2.ad(c11715e.vip(i))) {
                        int vip = c11715e.vip(i);
                        AbstractC2301e.subscription(!false);
                        sparseBooleanArray.append(vip, true);
                    }
                }
                AbstractC2301e.subscription(!false);
                return new C5298e(new C11715e(sparseBooleanArray));
            }
        }
        return C5298e.vip;
    }

    public static long metrica(C2411e c2411e, long j, long j2, long j3) {
        C12693e c12693e = c2411e.metrica;
        C12693e c12693e2 = c2411e.metrica;
        boolean z = c12693e.equals(C12693e.advert) || j2 < c12693e2.metrica;
        if (c2411e.inmobi) {
            if (z || j == -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    j3 = SystemClock.elapsedRealtime() - c12693e2.metrica;
                }
                long j4 = c12693e2.ad.purchase + (((float) j3) * c2411e.billing.ad);
                long j5 = c12693e2.license;
                return j5 != -9223372036854775807L ? Math.min(j4, j5) : j4;
            }
        } else if (z || j == -9223372036854775807L) {
            return c12693e2.ad.purchase;
        }
        return j;
    }

    public static void purchase(InterfaceC16843e interfaceC16843e, C9035e c9035e) {
        int i = c9035e.vip;
        long j = c9035e.metrica;
        AbstractC17475e abstractC17475e = c9035e.ad;
        if (i == -1) {
            if (interfaceC16843e.mo2107e(20)) {
                interfaceC16843e.mo2076e(abstractC17475e);
                return;
            } else {
                if (abstractC17475e.isEmpty()) {
                    return;
                }
                interfaceC16843e.mo2102e((C1962e) abstractC17475e.get(0));
                return;
            }
        }
        if (interfaceC16843e.mo2107e(20)) {
            interfaceC16843e.mo2094e(c9035e.vip, j, abstractC17475e);
        } else {
            if (abstractC17475e.isEmpty()) {
                return;
            }
            interfaceC16843e.mo2065class((C1962e) abstractC17475e.get(0), j);
        }
    }

    public static int vip(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return 0;
        }
        if (j2 == 0) {
            return 100;
        }
        return AbstractC9413e.adcel(AbstractC9413e.m2559new(j, j2), 0, 100);
    }
}
