package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٛ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4218e {
    public final int ad;
    public final String metrica;
    public final String vip;

    public C4218e(String str, int i, String str2) {
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("FormatCombo must have at least one valid track. Both videoMime and audioMime cannot be null.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4218e)) {
            return false;
        }
        C4218e c4218e = (C4218e) obj;
        return this.ad == c4218e.ad && AbstractC7890e.billing(this.vip, c4218e.vip) && AbstractC7890e.billing(this.metrica, c4218e.metrica);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        String str = this.vip;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metrica;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormatCombo(container=");
        sb.append(this.ad);
        sb.append(", videoMime=");
        sb.append(this.vip);
        sb.append(", audioMime=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
