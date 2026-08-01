package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4950e {
    public final long Signature;
    public final long ad;
    public final long adcel;
    public final long advert;
    public final long amazon;
    public final long appmetrica;
    public final long billing;
    public final long license;
    public final long loadAd;
    public final long metrica;
    public final long mopub;
    public final long purchase;
    public final long smaato;
    public final long startapp;
    public final long vip;
    public final long yandex;

    public C4950e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = j4;
        this.appmetrica = j5;
        this.purchase = j6;
        this.billing = j7;
        this.yandex = j8;
        this.startapp = j9;
        this.adcel = j10;
        this.mopub = j11;
        this.advert = j12;
        this.smaato = j13;
        this.amazon = j14;
        this.loadAd = j15;
        this.Signature = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4950e)) {
            return false;
        }
        C4950e c4950e = (C4950e) obj;
        return C3618e.metrica(this.ad, c4950e.ad) && C3618e.metrica(this.vip, c4950e.vip) && C3618e.metrica(this.metrica, c4950e.metrica) && C3618e.metrica(this.license, c4950e.license) && C3618e.metrica(this.appmetrica, c4950e.appmetrica) && C3618e.metrica(this.purchase, c4950e.purchase) && C3618e.metrica(this.billing, c4950e.billing) && C3618e.metrica(this.yandex, c4950e.yandex) && C3618e.metrica(this.startapp, c4950e.startapp) && C3618e.metrica(this.adcel, c4950e.adcel) && C3618e.metrica(this.mopub, c4950e.mopub) && C3618e.metrica(this.advert, c4950e.advert) && C3618e.metrica(this.smaato, c4950e.smaato) && C3618e.metrica(this.amazon, c4950e.amazon) && C3618e.metrica(this.loadAd, c4950e.loadAd) && C3618e.metrica(this.Signature, c4950e.Signature);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.Signature) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31), this.appmetrica, 31), this.purchase, 31), this.billing, 31), this.yandex, 31), this.startapp, 31), this.adcel, 31), this.mopub, 31), this.advert, 31), this.smaato, 31), this.amazon, 31), this.loadAd, 31);
    }
}
