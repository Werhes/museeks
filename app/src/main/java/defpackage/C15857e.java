package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15857e {
    public final AbstractC13445e ad;
    public final int vip;

    public C15857e(AbstractC13445e abstractC13445e, int i) {
        this.ad = abstractC13445e;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15857e)) {
            return false;
        }
        C15857e c15857e = (C15857e) obj;
        return AbstractC7890e.billing(this.ad, c15857e.ad) && this.vip == c15857e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KindWithArity(kind=");
        sb.append(this.ad);
        sb.append(", arity=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
