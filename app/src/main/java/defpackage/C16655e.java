package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۦۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16655e {
    public final long ad;
    public final String metrica;
    public final String vip;

    public C16655e(long j, String str, String str2) {
        this.ad = j;
        this.vip = str;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16655e)) {
            return false;
        }
        C16655e c16655e = (C16655e) obj;
        return this.ad == c16655e.ad && AbstractC7890e.billing(this.vip, c16655e.vip) && AbstractC7890e.billing(this.metrica, c16655e.metrica);
    }

    public final int hashCode() {
        long j = this.ad;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.vip;
        return this.metrica.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(id=");
        sb.append(this.ad);
        sb.append(", photo=");
        sb.append(this.vip);
        sb.append(", name=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
