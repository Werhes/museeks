package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۡۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10594e {
    public final String ad;
    public final String metrica;
    public final String vip;

    public C10594e(String str, String str2, String str3) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10594e)) {
            return false;
        }
        C10594e c10594e = (C10594e) obj;
        return AbstractC7890e.billing(this.ad, c10594e.ad) && AbstractC7890e.billing(this.vip, c10594e.vip) && AbstractC7890e.billing(this.metrica, c10594e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountUiState(name=");
        sb.append(this.ad);
        sb.append(", id=");
        sb.append(this.vip);
        sb.append(", avatar=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
