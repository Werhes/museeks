package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11061e extends AbstractC10385e {
    public final String ad;
    public final String vip;

    public C11061e(String str, String str2) {
        this.ad = str;
        this.vip = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11061e)) {
            return false;
        }
        C11061e c11061e = (C11061e) obj;
        return AbstractC7890e.billing(this.ad, c11061e.ad) && AbstractC7890e.billing(this.vip, c11061e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.ad);
        sb.append('.');
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
