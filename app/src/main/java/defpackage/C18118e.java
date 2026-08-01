package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۤۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18118e {
    public final String ad;
    public String vip;
    public boolean metrica = false;
    public C9671e license = null;

    public C18118e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18118e)) {
            return false;
        }
        C18118e c18118e = (C18118e) obj;
        return AbstractC7890e.billing(this.ad, c18118e.ad) && AbstractC7890e.billing(this.vip, c18118e.vip) && this.metrica == c18118e.metrica && AbstractC7890e.billing(this.license, c18118e.license);
    }

    public final int hashCode() {
        int advert = (AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip) + (this.metrica ? 1231 : 1237)) * 31;
        C9671e c9671e = this.license;
        return advert + (c9671e == null ? 0 : c9671e.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.license);
        sb.append(", isShowingSubstitution=");
        return AbstractC1786e.isVip(sb, this.metrica, ')');
    }
}
