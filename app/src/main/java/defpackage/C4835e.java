package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4835e {
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

    public C4835e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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

    public static InterfaceC6512e ad(EnumC9470e enumC9470e, C13770e c13770e) {
        if (enumC9470e == EnumC9470e.f18809e) {
            c13770e.m3676strictfp(1539238463);
            InterfaceC6512e metrica = AbstractC11008e.metrica(c13770e, 5);
            c13770e.Signature(false);
            return metrica;
        }
        c13770e.m3676strictfp(1539331773);
        InterfaceC6512e metrica2 = AbstractC11008e.metrica(c13770e, 4);
        c13770e.Signature(false);
        return metrica2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4835e)) {
            return false;
        }
        C4835e c4835e = (C4835e) obj;
        return C3618e.metrica(this.ad, c4835e.ad) && C3618e.metrica(this.vip, c4835e.vip) && C3618e.metrica(this.smaato, c4835e.smaato) && C3618e.metrica(this.metrica, c4835e.metrica) && C3618e.metrica(this.license, c4835e.license) && C3618e.metrica(this.appmetrica, c4835e.appmetrica) && C3618e.metrica(this.purchase, c4835e.purchase) && C3618e.metrica(this.billing, c4835e.billing) && C3618e.metrica(this.yandex, c4835e.yandex) && C3618e.metrica(this.startapp, c4835e.startapp) && C3618e.metrica(this.adcel, c4835e.adcel) && C3618e.metrica(this.mopub, c4835e.mopub) && C3618e.metrica(this.advert, c4835e.advert);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.advert) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31), this.smaato, 31), this.metrica, 31), this.license, 31), this.appmetrica, 31), this.purchase, 31), this.billing, 31), this.yandex, 31), this.startapp, 31), this.adcel, 31), this.mopub, 31);
    }
}
