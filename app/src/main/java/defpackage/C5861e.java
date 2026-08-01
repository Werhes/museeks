package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۘۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5861e {
    public final long ad;
    public final long adcel;
    public final long advert;
    public final long amazon;
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

    public C5861e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5861e.class != obj.getClass()) {
            return false;
        }
        C5861e c5861e = (C5861e) obj;
        return C3618e.metrica(this.ad, c5861e.ad) && C3618e.metrica(this.vip, c5861e.vip) && C3618e.metrica(this.metrica, c5861e.metrica) && C3618e.metrica(this.license, c5861e.license) && C3618e.metrica(this.appmetrica, c5861e.appmetrica) && C3618e.metrica(this.purchase, c5861e.purchase) && C3618e.metrica(this.billing, c5861e.billing) && C3618e.metrica(this.yandex, c5861e.yandex) && C3618e.metrica(this.startapp, c5861e.startapp) && C3618e.metrica(this.adcel, c5861e.adcel) && C3618e.metrica(this.mopub, c5861e.mopub) && C3618e.metrica(this.advert, c5861e.advert) && C3618e.metrica(this.smaato, c5861e.smaato) && C3618e.metrica(this.amazon, c5861e.amazon);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.amazon) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31), this.appmetrica, 31), this.purchase, 31), this.billing, 31), this.yandex, 31), this.startapp, 31), this.adcel, 31), this.mopub, 31), this.advert, 31), this.smaato, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListItemColors(containerColor=");
        AbstractC5087e.m1754try(this.ad, ", contentColor=", sb);
        AbstractC5087e.m1754try(this.vip, ", focusedContainerColor=", sb);
        AbstractC5087e.m1754try(this.metrica, ", focusedContentColor=", sb);
        AbstractC5087e.m1754try(this.license, ", pressedContainerColor=", sb);
        AbstractC5087e.m1754try(this.appmetrica, ", pressedContentColor=", sb);
        AbstractC5087e.m1754try(this.purchase, ", selectedContainerColor=", sb);
        AbstractC5087e.m1754try(this.billing, ", selectedContentColor=", sb);
        AbstractC5087e.m1754try(this.yandex, ", disabledContainerColor=", sb);
        AbstractC5087e.m1754try(this.startapp, ", disabledContentColor=", sb);
        AbstractC5087e.m1754try(this.adcel, ", focusedSelectedContainerColor=", sb);
        AbstractC5087e.m1754try(this.mopub, ", focusedSelectedContentColor=", sb);
        AbstractC5087e.m1754try(this.advert, ", pressedSelectedContainerColor=", sb);
        AbstractC5087e.m1754try(this.smaato, ", pressedSelectedContentColor=", sb);
        sb.append((Object) C3618e.startapp(this.amazon));
        sb.append(')');
        return sb.toString();
    }
}
