package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12377e {
    public final String ad;
    public final Long vip;

    public C12377e(long j, String str) {
        this.ad = str;
        this.vip = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12377e)) {
            return false;
        }
        C12377e c12377e = (C12377e) obj;
        Long l = c12377e.vip;
        if (!this.ad.equals(c12377e.ad)) {
            return false;
        }
        Long l2 = this.vip;
        return l2 != null ? l2.equals(l) : l == null;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        Long l = this.vip;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
