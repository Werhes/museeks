package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1372e {
    public final C15566e ad;
    public final long vip;

    public C1372e(C15566e c15566e, long j) {
        this.ad = c15566e;
        this.vip = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1372e)) {
            return false;
        }
        C1372e c1372e = (C1372e) obj;
        return AbstractC7890e.billing(this.ad, c1372e.ad) && this.vip == c1372e.vip;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long j = this.vip;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CookieWithTimestamp(cookie=");
        sb.append(this.ad);
        sb.append(", createdAt=");
        return AbstractC10257e.mopub(sb, this.vip, ')');
    }
}
