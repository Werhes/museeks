package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘؙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5485e {
    public static final C17950e Companion = new Object();
    public final String ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C5485e(int i, String str, String str2, String str3, String str4, String str5) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C2627e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str3;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = str4;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5485e)) {
            return false;
        }
        C5485e c5485e = (C5485e) obj;
        return AbstractC7890e.billing(this.ad, c5485e.ad) && AbstractC7890e.billing(this.vip, c5485e.vip) && AbstractC7890e.billing(this.metrica, c5485e.metrica) && AbstractC7890e.billing(this.license, c5485e.license) && AbstractC7890e.billing(this.appmetrica, c5485e.appmetrica);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
        String str = this.metrica;
        int hashCode = (advert + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.license;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appmetrica;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("AuthCodeAuthUserDto(firstName=", this.ad, ", lastName=", this.vip, ", phone=");
        AbstractC13501e.Signature(tapsense, this.metrica, ", photo200=", this.license, ", photo50=");
        return AbstractC1786e.signatures(tapsense, this.appmetrica, ")");
    }
}
