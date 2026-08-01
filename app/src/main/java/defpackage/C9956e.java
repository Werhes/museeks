package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9956e implements InterfaceC5374e {
    public Boolean ad;
    public Integer license;
    public Integer metrica;
    public Integer vip;

    public C9956e(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.ad = bool;
        this.vip = num;
        this.metrica = num2;
        this.license = num3;
    }

    @Override // defpackage.InterfaceC5374e
    public final Object ad() {
        return new C9956e(this.ad, this.vip, this.metrica, this.license);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9956e)) {
            return false;
        }
        C9956e c9956e = (C9956e) obj;
        return AbstractC7890e.billing(this.ad, c9956e.ad) && AbstractC7890e.billing(this.vip, c9956e.vip) && AbstractC7890e.billing(this.metrica, c9956e.metrica) && AbstractC7890e.billing(this.license, c9956e.license);
    }

    public final int hashCode() {
        Boolean bool = this.ad;
        int hashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.vip;
        int hashCode2 = hashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.metrica;
        int hashCode3 = hashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.license;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Boolean bool = this.ad;
        sb.append(bool != null ? bool.booleanValue() ? "-" : "+" : " ");
        Object obj = this.vip;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.metrica;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.license;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }
}
