package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6475e {
    public final long ad;
    public final String metrica;
    public final String vip;

    public C6475e(long j, String str, String str2) {
        this.ad = j;
        this.vip = str;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6475e)) {
            return false;
        }
        C6475e c6475e = (C6475e) obj;
        return this.ad == c6475e.ad && AbstractC7890e.billing(this.vip, c6475e.vip) && AbstractC7890e.billing(this.metrica, c6475e.metrica);
    }

    public final int hashCode() {
        long j = this.ad;
        return this.metrica.hashCode() + AbstractC1786e.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Profile(id=");
        sb.append(this.ad);
        sb.append(", avatarUrl=");
        sb.append(this.vip);
        sb.append(", displayName=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
