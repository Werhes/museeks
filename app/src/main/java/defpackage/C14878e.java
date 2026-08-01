package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14878e {
    public static final C14878e metrica = new C14878e(0, C3618e.startapp);
    public final long ad;
    public final float vip;

    public C14878e(float f, long j) {
        this.ad = j;
        this.vip = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14878e.class != obj.getClass()) {
            return false;
        }
        C14878e c14878e = (C14878e) obj;
        return C3618e.metrica(this.ad, c14878e.ad) && C15765e.vip(this.vip, c14878e.vip);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return Float.floatToIntBits(this.vip) + (C10994e.ad(this.ad) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Glow(elevationColor=");
        AbstractC5087e.m1754try(this.ad, ", elevation=", sb);
        sb.append((Object) C15765e.metrica(this.vip));
        sb.append(')');
        return sb.toString();
    }
}
