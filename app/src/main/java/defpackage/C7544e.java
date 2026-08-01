package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۢۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7544e {
    public long ad;
    public float vip;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7544e)) {
            return false;
        }
        C7544e c7544e = (C7544e) obj;
        return this.ad == c7544e.ad && Float.compare(this.vip, c7544e.vip) == 0;
    }

    public final int hashCode() {
        long j = this.ad;
        return Float.floatToIntBits(this.vip) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.ad);
        sb.append(", dataPoint=");
        return AbstractC17861e.remoteconfig(sb, this.vip, ')');
    }
}
