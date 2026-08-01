package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eُِٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11782e {
    public static final C3583e Companion = new Object();
    public static final InterfaceC3477e[] billing = {null, null, null, AbstractC18039e.appmetrica(2, new C1349e(27)), null, null};
    public final String ad;
    public final C0212e appmetrica;
    public final EnumC4237e license;
    public final String metrica;
    public final String purchase;
    public final String vip;

    public /* synthetic */ C11782e(int i, String str, String str2, String str3, EnumC4237e enumC4237e, C0212e c0212e, String str4) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = str;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str2;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str3;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = enumC4237e;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = c0212e;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11782e)) {
            return false;
        }
        C11782e c11782e = (C11782e) obj;
        return AbstractC7890e.billing(this.ad, c11782e.ad) && AbstractC7890e.billing(this.vip, c11782e.vip) && AbstractC7890e.billing(this.metrica, c11782e.metrica) && this.license == c11782e.license && AbstractC7890e.billing(this.appmetrica, c11782e.appmetrica) && AbstractC7890e.billing(this.purchase, c11782e.purchase);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vip;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metrica;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC4237e enumC4237e = this.license;
        int hashCode4 = (hashCode3 + (enumC4237e == null ? 0 : enumC4237e.hashCode())) * 31;
        C0212e c0212e = this.appmetrica;
        int hashCode5 = (hashCode4 + (c0212e == null ? 0 : c0212e.hashCode())) * 31;
        String str4 = this.purchase;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("AuthSignupFieldsValuesDto(firstName=", this.ad, ", lastName=", this.vip, ", middleName=");
        tapsense.append(this.metrica);
        tapsense.append(", gender=");
        tapsense.append(this.license);
        tapsense.append(", birthday=");
        tapsense.append(this.appmetrica);
        tapsense.append(", avatar=");
        tapsense.append(this.purchase);
        tapsense.append(")");
        return tapsense.toString();
    }
}
