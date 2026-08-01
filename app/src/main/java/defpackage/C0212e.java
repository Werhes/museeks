package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212e {
    public static final C16541e Companion = new Object();
    public final Integer ad;
    public final Integer metrica;
    public final Integer vip;

    public /* synthetic */ C0212e(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = num;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = num2;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0212e)) {
            return false;
        }
        C0212e c0212e = (C0212e) obj;
        return AbstractC7890e.billing(this.ad, c0212e.ad) && AbstractC7890e.billing(this.vip, c0212e.vip) && AbstractC7890e.billing(this.metrica, c0212e.metrica);
    }

    public final int hashCode() {
        Integer num = this.ad;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.vip;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.metrica;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "AuthBirthdayDto(year=" + this.ad + ", month=" + this.vip + ", day=" + this.metrica + ")";
    }
}
