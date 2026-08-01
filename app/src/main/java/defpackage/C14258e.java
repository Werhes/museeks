package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۟ؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14258e {
    public final long ad;
    public final long vip;

    public C14258e(long j, long j2) {
        this.ad = j;
        this.vip = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14258e.class != obj.getClass()) {
            return false;
        }
        C14258e c14258e = (C14258e) obj;
        return C3618e.metrica(this.ad, c14258e.ad) && C3618e.metrica(this.vip, c14258e.vip);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.vip) + (C10994e.ad(this.ad) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceColors(containerColor=");
        AbstractC5087e.m1754try(this.ad, ", contentColor=", sb);
        sb.append((Object) C3618e.startapp(this.vip));
        sb.append(')');
        return sb.toString();
    }
}
