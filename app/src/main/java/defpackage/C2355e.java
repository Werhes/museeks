package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2355e {
    public final long ad;
    public final long adcel;
    public final long advert;
    public final long appmetrica;
    public final long billing;
    public final long license;
    public final long metrica;
    public final long mopub;
    public final long purchase;
    public final long startapp;
    public final long vip;
    public final long yandex;

    public C2355e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2355e.class != obj.getClass()) {
            return false;
        }
        C2355e c2355e = (C2355e) obj;
        return C3618e.metrica(this.metrica, c2355e.metrica) && C3618e.metrica(this.vip, c2355e.vip) && C3618e.metrica(this.ad, c2355e.ad) && C3618e.metrica(this.purchase, c2355e.purchase) && C3618e.metrica(this.appmetrica, c2355e.appmetrica) && C3618e.metrica(this.license, c2355e.license) && C3618e.metrica(this.startapp, c2355e.startapp) && C3618e.metrica(this.yandex, c2355e.yandex) && C3618e.metrica(this.billing, c2355e.billing) && C3618e.metrica(this.advert, c2355e.advert) && C3618e.metrica(this.mopub, c2355e.mopub) && C3618e.metrica(this.adcel, c2355e.adcel);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.adcel) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.metrica) * 31, this.vip, 31), this.ad, 31), this.purchase, 31), this.appmetrica, 31), this.license, 31), this.startapp, 31), this.yandex, 31), this.billing, 31), this.advert, 31), this.mopub, 31);
    }
}
