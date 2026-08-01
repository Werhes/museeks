package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۣۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11364e implements InterfaceC4384e {
    public final String ad;
    public final String vip;

    public C11364e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11364e)) {
            return false;
        }
        C11364e c11364e = (C11364e) obj;
        return AbstractC7890e.billing(this.ad, c11364e.ad) && AbstractC7890e.billing(this.vip, c11364e.vip);
    }

    public final int hashCode() {
        return AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Message(title=");
        sb.append(this.ad);
        sb.append(", description=");
        return AbstractC1786e.signatures(sb, this.vip, ", action=null)");
    }
}
