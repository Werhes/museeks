package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۜٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342e {
    public final C5306e ad;
    public final ScheduledExecutorServiceC5380e vip;

    public C1342e(C5306e c5306e, ScheduledExecutorServiceC5380e scheduledExecutorServiceC5380e) {
        this.ad = c5306e;
        this.vip = scheduledExecutorServiceC5380e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1342e)) {
            return false;
        }
        C1342e c1342e = (C1342e) obj;
        return this.ad.equals(c1342e.ad) && this.vip.equals(c1342e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "ListenerWrapper(listener=" + this.ad + ", executor=" + this.vip + ')';
    }
}
