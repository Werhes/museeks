package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18421e {
    public final long ad;
    public final long adcel;
    public final long advert;
    public final long appmetrica;
    public final long billing;
    public final long license;
    public final long metrica;
    public final long mopub;
    public final long purchase;
    public final long smaato;
    public final long startapp;
    public final long vip;
    public final long yandex;

    public C18421e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C18421e)) {
            return false;
        }
        C18421e c18421e = (C18421e) obj;
        return C3618e.metrica(this.ad, c18421e.ad) && C3618e.metrica(this.vip, c18421e.vip) && C3618e.metrica(this.metrica, c18421e.metrica) && C3618e.metrica(this.license, c18421e.license) && C3618e.metrica(this.appmetrica, c18421e.appmetrica) && C3618e.metrica(this.purchase, c18421e.purchase) && C3618e.metrica(this.billing, c18421e.billing) && C3618e.metrica(this.yandex, c18421e.yandex) && C3618e.metrica(this.startapp, c18421e.startapp) && C3618e.metrica(this.adcel, c18421e.adcel) && C3618e.metrica(this.mopub, c18421e.mopub) && C3618e.metrica(this.advert, c18421e.advert) && C3618e.metrica(this.smaato, c18421e.smaato);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.smaato) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31), this.appmetrica, 31), this.purchase, 31), this.billing, 31), this.yandex, 31), this.startapp, 31), this.adcel, 31), this.mopub, 31), this.advert, 31);
    }
}
