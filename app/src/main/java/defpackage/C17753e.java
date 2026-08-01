package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17753e {
    public final String ad;
    public final String vip;

    public C17753e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17753e)) {
            return false;
        }
        C17753e c17753e = (C17753e) obj;
        return AbstractC7890e.billing(this.ad, c17753e.ad) && AbstractC7890e.billing(this.vip, c17753e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Section(id=");
        sb.append(this.ad);
        sb.append(", title=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
