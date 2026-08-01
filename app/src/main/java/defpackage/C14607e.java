package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14607e {
    public final long ad;
    public final long adcel;
    public final long appmetrica;
    public final long billing;
    public final long license;
    public final long metrica;
    public final long purchase;
    public final long startapp;
    public final long vip;
    public final long yandex;

    public C14607e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final InterfaceC3314e ad(boolean z, boolean z2, C13770e c13770e) {
        c13770e.m3676strictfp(-1491563694);
        InterfaceC3314e mopub = AbstractC14533e.mopub(new C3618e(z ? z2 ? this.billing : this.yandex : z2 ? this.startapp : this.adcel), c13770e);
        c13770e.Signature(false);
        return mopub;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14607e.class != obj.getClass()) {
            return false;
        }
        C14607e c14607e = (C14607e) obj;
        return C3618e.metrica(this.ad, c14607e.ad) && C3618e.metrica(this.vip, c14607e.vip) && C3618e.metrica(this.metrica, c14607e.metrica) && C3618e.metrica(this.license, c14607e.license) && C3618e.metrica(this.appmetrica, c14607e.appmetrica) && C3618e.metrica(this.purchase, c14607e.purchase) && C3618e.metrica(this.billing, c14607e.billing) && C3618e.metrica(this.yandex, c14607e.yandex) && C3618e.metrica(this.startapp, c14607e.startapp) && C3618e.metrica(this.adcel, c14607e.adcel);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.adcel) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31), this.appmetrica, 31), this.purchase, 31), this.billing, 31), this.yandex, 31), this.startapp, 31);
    }

    public final InterfaceC3314e vip(boolean z, boolean z2, C13770e c13770e) {
        c13770e.m3676strictfp(1575395620);
        InterfaceC3314e mopub = AbstractC14533e.mopub(new C3618e(z ? z2 ? this.metrica : this.license : z2 ? this.appmetrica : this.purchase), c13770e);
        c13770e.Signature(false);
        return mopub;
    }
}
