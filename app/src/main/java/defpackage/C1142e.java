package defpackage;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1142e {
    public long ad;
    public int appmetrica;
    public int license;
    public TimeInterpolator metrica;
    public long vip;

    public final TimeInterpolator ad() {
        TimeInterpolator timeInterpolator = this.metrica;
        return timeInterpolator != null ? timeInterpolator : AbstractC16664e.vip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1142e)) {
            return false;
        }
        C1142e c1142e = (C1142e) obj;
        if (this.ad == c1142e.ad && this.vip == c1142e.vip && this.license == c1142e.license && this.appmetrica == c1142e.appmetrica) {
            return ad().getClass().equals(c1142e.ad().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ad;
        long j2 = this.vip;
        return ((((ad().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.license) * 31) + this.appmetrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C1142e.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.ad);
        sb.append(" duration: ");
        sb.append(this.vip);
        sb.append(" interpolator: ");
        sb.append(ad().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.license);
        sb.append(" repeatMode: ");
        return AbstractC17861e.smaato(this.appmetrica, "}\n", sb);
    }
}
