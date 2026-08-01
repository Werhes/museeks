package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237e {
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

    public C0237e(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = C3618e.adcel;
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = j4;
        this.appmetrica = j5;
        this.purchase = j6;
        this.billing = j7;
        this.yandex = j7;
        this.startapp = j7;
        this.adcel = j7;
        this.mopub = j7;
        this.advert = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0237e)) {
            return false;
        }
        C0237e c0237e = (C0237e) obj;
        return C3618e.metrica(this.ad, c0237e.ad) && C3618e.metrica(this.billing, c0237e.billing) && C3618e.metrica(this.vip, c0237e.vip) && C3618e.metrica(this.metrica, c0237e.metrica) && C3618e.metrica(this.license, c0237e.license) && C3618e.metrica(this.appmetrica, c0237e.appmetrica) && C3618e.metrica(this.purchase, c0237e.purchase) && C3618e.metrica(this.yandex, c0237e.yandex) && C3618e.metrica(this.startapp, c0237e.startapp) && C3618e.metrica(this.adcel, c0237e.adcel) && C3618e.metrica(this.mopub, c0237e.mopub) && C3618e.metrica(this.advert, c0237e.advert);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.advert) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.billing, 31), this.vip, 31), this.metrica, 31), this.license, 31), this.appmetrica, 31), this.purchase, 31), this.yandex, 31), this.startapp, 31), this.adcel, 31), this.mopub, 31);
    }
}
