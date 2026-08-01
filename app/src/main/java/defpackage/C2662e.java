package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؔٙؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2662e {
    public static final C15795e Companion = new Object();
    public static final InterfaceC3477e[] billing = {null, null, null, null, AbstractC18039e.appmetrica(2, new C9283e(21)), AbstractC18039e.appmetrica(2, new C9283e(22))};
    public final String ad;
    public final List appmetrica;
    public final String license;
    public final C18243e metrica;
    public final List purchase;
    public final Integer vip;

    public /* synthetic */ C2662e(int i, String str, Integer num, C18243e c18243e, String str2, List list, List list2) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = str;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = num;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = c18243e;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = str2;
        }
        int i2 = i & 16;
        C13664e c13664e = C13664e.f27089e;
        if (i2 == 0) {
            this.appmetrica = c13664e;
        } else {
            this.appmetrica = list;
        }
        if ((i & 32) == 0) {
            this.purchase = c13664e;
        } else {
            this.purchase = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2662e)) {
            return false;
        }
        C2662e c2662e = (C2662e) obj;
        return AbstractC7890e.billing(this.ad, c2662e.ad) && AbstractC7890e.billing(this.vip, c2662e.vip) && AbstractC7890e.billing(this.metrica, c2662e.metrica) && AbstractC7890e.billing(this.license, c2662e.license) && AbstractC7890e.billing(this.appmetrica, c2662e.appmetrica) && AbstractC7890e.billing(this.purchase, c2662e.purchase);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.vip;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        C18243e c18243e = this.metrica;
        int hashCode3 = (hashCode2 + (c18243e == null ? 0 : c18243e.hashCode())) * 31;
        String str2 = this.license;
        return this.purchase.hashCode() + AbstractC17861e.billing((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.appmetrica);
    }

    public final String toString() {
        return "AudioBooksItemPersonDto(description=" + this.ad + ", id=" + this.vip + ", legalNotice=" + this.metrica + ", name=" + this.license + ", photo=" + this.appmetrica + ", roles=" + this.purchase + ")";
    }
}
