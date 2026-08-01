package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eْٛؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13356e implements InterfaceC12391e {
    public static final C3412e Companion = new Object();
    public final long ad;
    public final long vip;

    public /* synthetic */ C13356e(int i, long j, long j2) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C16817e.ad.appmetrica());
            throw null;
        }
        this.ad = j;
        this.vip = j2;
    }

    public C13356e(long j, long j2) {
        this.ad = j;
        this.vip = j2;
    }

    @Override // defpackage.InterfaceC12391e
    public final long ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13356e)) {
            return false;
        }
        C13356e c13356e = (C13356e) obj;
        return this.ad == c13356e.ad && this.vip == c13356e.vip;
    }

    public final int hashCode() {
        long j = this.ad;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.vip;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interlude(beginMs=");
        sb.append(this.ad);
        sb.append(", endMs=");
        return AbstractC10257e.mopub(sb, this.vip, ')');
    }

    @Override // defpackage.InterfaceC12391e
    public final long vip() {
        return this.vip;
    }
}
