package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٛؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7278e {
    public static final C7278e metrica = new C7278e(0, 0);
    public final long ad;
    public final long vip;

    public C7278e(long j, long j2) {
        this.ad = j;
        this.vip = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7278e.class == obj.getClass()) {
            C7278e c7278e = (C7278e) obj;
            if (this.ad == c7278e.ad && this.vip == c7278e.vip) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.ad) * 31) + ((int) this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.ad);
        sb.append(", position=");
        return AbstractC5087e.m1750native(this.vip, "]", sb);
    }
}
