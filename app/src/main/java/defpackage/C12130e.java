package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12130e {
    public final long ad;
    public final long metrica;
    public final long vip;

    public C12130e() {
        long vip = AbstractC17673e.vip();
        long vip2 = AbstractC17673e.vip();
        long vip3 = AbstractC17673e.vip();
        this.ad = vip;
        this.vip = vip2;
        this.metrica = vip3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12130e)) {
            return false;
        }
        C12130e c12130e = (C12130e) obj;
        return C3618e.metrica(this.ad, c12130e.ad) && C3618e.metrica(this.vip, c12130e.vip) && C3618e.metrica(this.metrica, c12130e.metrica);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.metrica) + AbstractC5087e.m1744class(C10994e.ad(this.ad) * 31, this.vip, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorContainer(colorOne=");
        AbstractC5087e.m1754try(this.ad, ", colorTwo=", sb);
        AbstractC5087e.m1754try(this.vip, ", colorThree=", sb);
        sb.append((Object) C3618e.startapp(this.metrica));
        sb.append(')');
        return sb.toString();
    }
}
