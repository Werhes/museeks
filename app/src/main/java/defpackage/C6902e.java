package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؚؔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6902e {
    public static final C9370e Companion = new Object();
    public static final InterfaceC3477e[] yandex = {AbstractC18039e.appmetrica(2, new C1349e(17)), null, null, null, null, null, AbstractC18039e.appmetrica(2, new C1349e(18))};
    public final List ad;
    public final boolean appmetrica;
    public final List billing;
    public final int license;
    public final String metrica;
    public final String purchase;
    public final String vip;

    public /* synthetic */ C6902e(int i, List list, String str, String str2, int i2, boolean z, String str3, List list2) {
        if (40 != (i & 40)) {
            AbstractC5756e.billing(i, 40, C18313e.ad.appmetrica());
            throw null;
        }
        int i3 = i & 1;
        C13664e c13664e = C13664e.f27089e;
        if (i3 == 0) {
            this.ad = c13664e;
        } else {
            this.ad = list;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str2;
        }
        this.license = i2;
        if ((i & 16) == 0) {
            this.appmetrica = false;
        } else {
            this.appmetrica = z;
        }
        this.purchase = str3;
        if ((i & 64) == 0) {
            this.billing = c13664e;
        } else {
            this.billing = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6902e)) {
            return false;
        }
        C6902e c6902e = (C6902e) obj;
        return AbstractC7890e.billing(this.ad, c6902e.ad) && AbstractC7890e.billing(this.vip, c6902e.vip) && AbstractC7890e.billing(this.metrica, c6902e.metrica) && this.license == c6902e.license && this.appmetrica == c6902e.appmetrica && AbstractC7890e.billing(this.purchase, c6902e.purchase) && AbstractC7890e.billing(this.billing, c6902e.billing);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metrica;
        return this.billing.hashCode() + AbstractC1786e.advert((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.license) * 31) + (this.appmetrica ? 1231 : 1237)) * 31, 31, this.purchase);
    }

    public final String toString() {
        return "AuthCodeAuthClientInfoDto(agreements=" + this.ad + ", icon150=" + this.vip + ", icon75=" + this.metrica + ", id=" + this.license + ", isOfficial=" + this.appmetrica + ", name=" + this.purchase + ", scopes=" + this.billing + ")";
    }
}
