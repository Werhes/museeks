package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۤۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676e {
    public final C10566e ad;
    public final long adcel;
    public final boolean appmetrica;
    public final InterfaceC14388e billing;
    public final int license;
    public final List metrica;
    public final int purchase;
    public final InterfaceC2141e startapp;
    public final C1839e vip;
    public final EnumC7792e yandex;

    public C0676e(C10566e c10566e, C1839e c1839e, List list, int i, boolean z, int i2, InterfaceC14388e interfaceC14388e, EnumC7792e enumC7792e, InterfaceC2141e interfaceC2141e, long j) {
        this.ad = c10566e;
        this.vip = c1839e;
        this.metrica = list;
        this.license = i;
        this.appmetrica = z;
        this.purchase = i2;
        this.billing = interfaceC14388e;
        this.yandex = enumC7792e;
        this.startapp = interfaceC2141e;
        this.adcel = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0676e)) {
            return false;
        }
        C0676e c0676e = (C0676e) obj;
        return AbstractC7890e.billing(this.ad, c0676e.ad) && AbstractC7890e.billing(this.vip, c0676e.vip) && AbstractC7890e.billing(this.metrica, c0676e.metrica) && this.license == c0676e.license && this.appmetrica == c0676e.appmetrica && this.purchase == c0676e.purchase && AbstractC7890e.billing(this.billing, c0676e.billing) && this.yandex == c0676e.yandex && AbstractC7890e.billing(this.startapp, c0676e.startapp) && C5602e.vip(this.adcel, c0676e.adcel);
    }

    public final int hashCode() {
        int hashCode = (this.startapp.hashCode() + ((this.yandex.hashCode() + ((this.billing.hashCode() + ((((((AbstractC17861e.billing(AbstractC1786e.smaato(this.vip, this.ad.hashCode() * 31, 31), 31, this.metrica) + this.license) * 31) + (this.appmetrica ? 1231 : 1237)) * 31) + this.purchase) * 31)) * 31)) * 31)) * 31;
        long j = this.adcel;
        return ((int) ((j >>> 32) ^ j)) + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.ad);
        sb.append(", style=");
        sb.append(this.vip);
        sb.append(", placeholders=");
        sb.append(this.metrica);
        sb.append(", maxLines=");
        sb.append(this.license);
        sb.append(", softWrap=");
        sb.append(this.appmetrica);
        sb.append(", overflow=");
        int i = this.purchase;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.billing);
        sb.append(", layoutDirection=");
        sb.append(this.yandex);
        sb.append(", fontFamilyResolver=");
        sb.append(this.startapp);
        sb.append(", constraints=");
        sb.append((Object) C5602e.advert(this.adcel));
        sb.append(')');
        return sb.toString();
    }
}
