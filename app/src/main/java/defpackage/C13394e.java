package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13394e {
    public static final C10215e remoteconfig;
    public long Signature;
    public String ad;
    public C7829e adcel;
    public boolean admob;
    public int advert;
    public long amazon;
    public C13198e appmetrica;
    public long billing;
    public String license;
    public long loadAd;
    public String metrica;
    public int mopub;
    public C13198e purchase;
    public long smaato;
    public long startapp;
    public int subscription;
    public EnumC7300e vip = EnumC7300e.f14903e;
    public long yandex;

    static {
        C5401e.crashlytics("WorkSpec");
        remoteconfig = new C10215e(13);
    }

    public C13394e(String str, String str2) {
        C13198e c13198e = C13198e.metrica;
        this.appmetrica = c13198e;
        this.purchase = c13198e;
        this.adcel = C7829e.startapp;
        this.advert = 1;
        this.smaato = 30000L;
        this.Signature = -1L;
        this.subscription = 1;
        this.ad = str;
        this.metrica = str2;
    }

    public final long ad() {
        int i;
        if (this.vip == EnumC7300e.f14903e && (i = this.mopub) > 0) {
            return Math.min(18000000L, this.advert == 2 ? this.smaato * i : Math.scalb((float) this.smaato, i - 1)) + this.amazon;
        }
        if (!metrica()) {
            long j = this.amazon;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            return j + this.billing;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.amazon;
        if (j2 == 0) {
            j2 = this.billing + currentTimeMillis;
        }
        long j3 = this.startapp;
        long j4 = this.yandex;
        if (j3 != j4) {
            return j2 + j4 + (j2 == 0 ? j3 * (-1) : 0L);
        }
        return j2 + (j2 != 0 ? j4 : 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13394e.class != obj.getClass()) {
            return false;
        }
        C13394e c13394e = (C13394e) obj;
        if (this.billing != c13394e.billing || this.yandex != c13394e.yandex || this.startapp != c13394e.startapp || this.mopub != c13394e.mopub || this.smaato != c13394e.smaato || this.amazon != c13394e.amazon || this.loadAd != c13394e.loadAd || this.Signature != c13394e.Signature || this.admob != c13394e.admob || !this.ad.equals(c13394e.ad) || this.vip != c13394e.vip || !this.metrica.equals(c13394e.metrica)) {
            return false;
        }
        String str = this.license;
        if (str != null) {
            if (!str.equals(c13394e.license)) {
                return false;
            }
        } else if (c13394e.license != null) {
            return false;
        }
        return this.appmetrica.equals(c13394e.appmetrica) && this.purchase.equals(c13394e.purchase) && this.adcel.equals(c13394e.adcel) && this.advert == c13394e.advert && this.subscription == c13394e.subscription;
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31, 31, this.metrica);
        String str = this.license;
        int hashCode = (this.purchase.hashCode() + ((this.appmetrica.hashCode() + ((advert + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.billing;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.yandex;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.startapp;
        int mopub = AbstractC1786e.mopub(this.advert, (((this.adcel.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.mopub) * 31, 31);
        long j4 = this.smaato;
        int i3 = (mopub + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.amazon;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.loadAd;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.Signature;
        return AbstractC8703e.m2467class(this.subscription) + ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.admob ? 1 : 0)) * 31);
    }

    public final boolean metrica() {
        return this.yandex != 0;
    }

    public final String toString() {
        return AbstractC1786e.signatures(new StringBuilder("{WorkSpec: "), this.ad, "}");
    }

    public final boolean vip() {
        return !C7829e.startapp.equals(this.adcel);
    }
}
