package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13973e {
    public static final C13973e license = new C13973e(AbstractC6532e.license(4278190080L), 0, 0.0f);
    public final long ad;
    public final float metrica;
    public final long vip;

    public C13973e(long j, long j2, float f) {
        this.ad = j;
        this.vip = j2;
        this.metrica = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13973e)) {
            return false;
        }
        C13973e c13973e = (C13973e) obj;
        return C3618e.metrica(this.ad, c13973e.ad) && C2152e.vip(this.vip, c13973e.vip) && this.metrica == c13973e.metrica;
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return Float.floatToIntBits(this.metrica) + ((C2152e.billing(this.vip) + (C10994e.ad(this.ad) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        AbstractC5087e.m1754try(this.ad, ", offset=", sb);
        sb.append((Object) C2152e.mopub(this.vip));
        sb.append(", blurRadius=");
        return AbstractC17861e.remoteconfig(sb, this.metrica, ')');
    }
}
