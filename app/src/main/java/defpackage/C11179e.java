package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11179e {
    public final long ad;
    public final C16005e vip;

    public C11179e() {
        long license = AbstractC6532e.license(4284900966L);
        C16005e metrica = AbstractC12220e.metrica(0.0f, 0.0f, 3);
        this.ad = license;
        this.vip = metrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C11179e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C11179e c11179e = (C11179e) obj;
        return C3618e.metrica(this.ad, c11179e.ad) && AbstractC7890e.billing(this.vip, c11179e.vip);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return this.vip.hashCode() + (C10994e.ad(this.ad) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC5087e.m1754try(this.ad, ", drawPadding=", sb);
        sb.append(this.vip);
        sb.append(')');
        return sb.toString();
    }
}
