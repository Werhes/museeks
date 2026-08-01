package defpackage;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۦۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10675e implements Comparable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final String f21023e = File.separator;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0193e f21024e;

    public C10675e(C0193e c0193e) {
        this.f21024e = c0193e;
    }

    public final ArrayList ad() {
        ArrayList arrayList = new ArrayList();
        int ad = purchase.ad(this);
        C0193e c0193e = this.f21024e;
        if (ad == -1) {
            ad = 0;
        } else if (ad < c0193e.license() && c0193e.startapp(ad) == 92) {
            ad++;
        }
        int license = c0193e.license();
        int i = ad;
        while (ad < license) {
            if (c0193e.startapp(ad) == 47 || c0193e.startapp(ad) == 92) {
                arrayList.add(c0193e.loadAd(i, ad));
                i = ad + 1;
            }
            ad++;
        }
        if (i < c0193e.license()) {
            arrayList.add(c0193e.loadAd(i, c0193e.license()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِٖۢ, java.lang.Object] */
    public final C10675e appmetrica(String str) {
        ?? obj = new Object();
        obj.m4126e(str);
        return purchase.vip(this, purchase.license(obj, false), false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21024e.compareTo(((C10675e) obj).f21024e);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10675e) && AbstractC7890e.billing(((C10675e) obj).f21024e, this.f21024e);
    }

    public final int hashCode() {
        return this.f21024e.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [eِٖۢ, java.lang.Object] */
    public final C10675e license(C10675e c10675e) {
        C0193e c0193e = c10675e.f21024e;
        int ad = purchase.ad(this);
        C0193e c0193e2 = this.f21024e;
        C10675e c10675e2 = ad == -1 ? null : new C10675e(c0193e2.loadAd(0, ad));
        int ad2 = purchase.ad(c10675e);
        if (!AbstractC7890e.billing(c10675e2, ad2 != -1 ? new C10675e(c10675e.f21024e.loadAd(0, ad2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + c10675e).toString());
        }
        ArrayList ad3 = ad();
        ArrayList ad4 = c10675e.ad();
        int min = Math.min(ad3.size(), ad4.size());
        int i = 0;
        while (i < min && AbstractC7890e.billing(ad3.get(i), ad4.get(i))) {
            i++;
        }
        if (i == min && c0193e2.license() == c0193e.license()) {
            return C10215e.license(".", false);
        }
        if (ad4.subList(i, ad4.size()).indexOf(purchase.appmetrica) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + c10675e).toString());
        }
        if (AbstractC7890e.billing(c0193e, purchase.license)) {
            return this;
        }
        ?? obj = new Object();
        C0193e metrica = purchase.metrica(c10675e);
        if (metrica == null && (metrica = purchase.metrica(this)) == null) {
            metrica = purchase.purchase(f21023e);
        }
        int size = ad4.size();
        for (int i2 = i; i2 < size; i2++) {
            obj.m4122catch(purchase.appmetrica);
            obj.m4122catch(metrica);
        }
        int size2 = ad3.size();
        while (i < size2) {
            obj.m4122catch((C0193e) ad3.get(i));
            obj.m4122catch(metrica);
            i++;
        }
        return purchase.license(obj, false);
    }

    public final C10675e metrica() {
        C0193e c0193e = purchase.license;
        C0193e c0193e2 = this.f21024e;
        if (AbstractC7890e.billing(c0193e2, c0193e)) {
            return null;
        }
        C0193e c0193e3 = purchase.ad;
        if (AbstractC7890e.billing(c0193e2, c0193e3)) {
            return null;
        }
        C0193e c0193e4 = purchase.vip;
        if (AbstractC7890e.billing(c0193e2, c0193e4)) {
            return null;
        }
        C0193e c0193e5 = purchase.appmetrica;
        int license = c0193e2.license();
        byte[] bArr = c0193e5.f1412e;
        if (c0193e2.smaato(license - bArr.length, bArr.length, c0193e5) && (c0193e2.license() == 2 || c0193e2.smaato(c0193e2.license() - 3, 1, c0193e3) || c0193e2.smaato(c0193e2.license() - 3, 1, c0193e4))) {
            return null;
        }
        int mopub = C0193e.mopub(c0193e2, c0193e3);
        if (mopub == -1) {
            mopub = C0193e.mopub(c0193e2, c0193e4);
        }
        if (mopub == 2 && purchase() != null) {
            if (c0193e2.license() == 3) {
                return null;
            }
            return new C10675e(C0193e.Signature(c0193e2, 0, 3, 1));
        }
        if (mopub == 1 && c0193e2.smaato(0, c0193e4.license(), c0193e4)) {
            return null;
        }
        if (mopub != -1 || purchase() == null) {
            return mopub == -1 ? new C10675e(c0193e) : mopub == 0 ? new C10675e(C0193e.Signature(c0193e2, 0, 1, 1)) : new C10675e(C0193e.Signature(c0193e2, 0, mopub, 1));
        }
        if (c0193e2.license() == 2) {
            return null;
        }
        return new C10675e(C0193e.Signature(c0193e2, 0, 2, 1));
    }

    public final Character purchase() {
        C0193e c0193e = purchase.ad;
        C0193e c0193e2 = this.f21024e;
        if (C0193e.billing(c0193e2, c0193e) != -1 || c0193e2.license() < 2 || c0193e2.startapp(1) != 58) {
            return null;
        }
        char startapp = (char) c0193e2.startapp(0);
        if (('a' > startapp || startapp >= '{') && ('A' > startapp || startapp >= '[')) {
            return null;
        }
        return Character.valueOf(startapp);
    }

    public final File toFile() {
        return new File(this.f21024e.remoteconfig());
    }

    public final String toString() {
        return this.f21024e.remoteconfig();
    }

    public final String vip() {
        C0193e c0193e = purchase.ad;
        C0193e c0193e2 = this.f21024e;
        int mopub = C0193e.mopub(c0193e2, c0193e);
        if (mopub == -1) {
            mopub = C0193e.mopub(c0193e2, purchase.vip);
        }
        if (mopub != -1) {
            c0193e2 = C0193e.Signature(c0193e2, mopub + 1, 0, 2);
        } else if (purchase() != null && c0193e2.license() == 2) {
            c0193e2 = C0193e.f1409e;
        }
        return c0193e2.remoteconfig();
    }
}
