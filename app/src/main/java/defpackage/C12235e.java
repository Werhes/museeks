package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12235e {
    public final long ad;
    public final long appmetrica;
    public final long license;
    public final long metrica;
    public final long purchase;
    public final long vip;

    public C12235e(long j, long j2, long j3, long j4, long j5, long j6) {
        this.ad = j;
        this.vip = j2;
        this.metrica = j3;
        this.license = j4;
        this.appmetrica = j5;
        this.purchase = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12235e)) {
            return false;
        }
        C12235e c12235e = (C12235e) obj;
        return C3618e.metrica(this.ad, c12235e.ad) && C3618e.metrica(this.vip, c12235e.vip) && C3618e.metrica(this.metrica, c12235e.metrica) && C3618e.metrica(this.license, c12235e.license) && C3618e.metrica(this.appmetrica, c12235e.appmetrica) && C3618e.metrica(this.purchase, c12235e.purchase);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.purchase) + AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31), this.metrica, 31), this.license, 31), this.appmetrica, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiuiSliderColors(surfaceColor=");
        AbstractC5087e.m1754try(this.ad, ", containerColor=", sb);
        AbstractC5087e.m1754try(this.vip, ", progressColor=", sb);
        AbstractC5087e.m1754try(this.metrica, ", leadingContentColor=", sb);
        AbstractC5087e.m1754try(this.license, ", trailingContentColor=", sb);
        AbstractC5087e.m1754try(this.appmetrica, ", borderColor=", sb);
        sb.append((Object) C3618e.startapp(this.purchase));
        sb.append(')');
        return sb.toString();
    }
}
