package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘٟۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5809e {
    public static final C10587e Companion = new Object();
    public final String ad;
    public final String appmetrica;
    public final Boolean billing;
    public final String license;
    public final String metrica;
    public final String purchase;
    public final boolean vip;
    public final Boolean yandex;

    public /* synthetic */ C5809e(int i, String str, boolean z, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2) {
        if (15 != (i & 15)) {
            AbstractC5756e.billing(i, 15, C5798e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = z;
        this.metrica = str2;
        this.license = str3;
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str4;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str5;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = bool;
        }
        if ((i & 128) == 0) {
            this.yandex = null;
        } else {
            this.yandex = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5809e)) {
            return false;
        }
        C5809e c5809e = (C5809e) obj;
        return AbstractC7890e.billing(this.ad, c5809e.ad) && this.vip == c5809e.vip && AbstractC7890e.billing(this.metrica, c5809e.metrica) && AbstractC7890e.billing(this.license, c5809e.license) && AbstractC7890e.billing(this.appmetrica, c5809e.appmetrica) && AbstractC7890e.billing(this.purchase, c5809e.purchase) && AbstractC7890e.billing(this.billing, c5809e.billing) && AbstractC7890e.billing(this.yandex, c5809e.yandex);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(AbstractC1786e.advert(((this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237)) * 31, 31, this.metrica), 31, this.license);
        String str = this.appmetrica;
        int hashCode = (advert + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.purchase;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.billing;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.yandex;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthUserDto(firstName=");
        sb.append(this.ad);
        sb.append(", has2fa=");
        sb.append(this.vip);
        sb.append(", lastName=");
        AbstractC13501e.Signature(sb, this.metrica, ", photo200=", this.license, ", deactivated=");
        AbstractC13501e.Signature(sb, this.appmetrica, ", phone=", this.purchase, ", hasPassword=");
        sb.append(this.billing);
        sb.append(", canUnbindPhone=");
        sb.append(this.yandex);
        sb.append(")");
        return sb.toString();
    }
}
