package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۧۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4532e {
    public final C14609e ad;
    public final boolean appmetrica;
    public final long license;
    public final long metrica;
    public final InterfaceC1686e vip;

    public C4532e(C14609e c14609e, InterfaceC1686e interfaceC1686e, long j, long j2, boolean z) {
        this.ad = c14609e;
        this.vip = interfaceC1686e;
        this.metrica = j;
        this.license = j2;
        this.appmetrica = z;
    }

    public static C4532e ad(C4532e c4532e, C14609e c14609e, InterfaceC1686e interfaceC1686e, long j, long j2, boolean z, int i) {
        if ((i & 1) != 0) {
            c14609e = c4532e.ad;
        }
        C14609e c14609e2 = c14609e;
        if ((i & 2) != 0) {
            interfaceC1686e = c4532e.vip;
        }
        InterfaceC1686e interfaceC1686e2 = interfaceC1686e;
        if ((i & 4) != 0) {
            j = c4532e.metrica;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = c4532e.license;
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = c4532e.appmetrica;
        }
        c4532e.getClass();
        return new C4532e(c14609e2, interfaceC1686e2, j3, j4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4532e)) {
            return false;
        }
        C4532e c4532e = (C4532e) obj;
        return AbstractC7890e.billing(this.ad, c4532e.ad) && AbstractC7890e.billing(this.vip, c4532e.vip) && this.metrica == c4532e.metrica && this.license == c4532e.license && this.appmetrica == c4532e.appmetrica;
    }

    public final int hashCode() {
        C14609e c14609e = this.ad;
        int hashCode = (c14609e == null ? 0 : c14609e.hashCode()) * 31;
        InterfaceC1686e interfaceC1686e = this.vip;
        int hashCode2 = interfaceC1686e != null ? interfaceC1686e.hashCode() : 0;
        long j = this.metrica;
        int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.license;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.appmetrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackAnalyticsSnapshot(track=");
        sb.append(this.ad);
        sb.append(", source=");
        sb.append(this.vip);
        sb.append(", playbackStartedAt=");
        sb.append(this.metrica);
        sb.append(", totalPlayedDuration=");
        sb.append(this.license);
        sb.append(", isPlaying=");
        return AbstractC1786e.isVip(sb, this.appmetrica, ')');
    }
}
