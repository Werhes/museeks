package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۤٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6028e implements InterfaceC10991e {
    public final long ad;
    public final int vip;

    public C6028e(long j, int i) {
        this.ad = j;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6028e)) {
            return false;
        }
        C6028e c6028e = (C6028e) obj;
        return this.ad == c6028e.ad && this.vip == c6028e.vip;
    }

    public final int hashCode() {
        long j = this.ad;
        return (((int) (j ^ (j >>> 32))) * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Present(uid=");
        sb.append(this.ad);
        sb.append(", size=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
