package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/SmartSuggestion;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SmartSuggestion implements InterfaceC15377e {
    public final String ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public SmartSuggestion(String str, String str2, String str3, String str4, String str5) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartSuggestion)) {
            return false;
        }
        SmartSuggestion smartSuggestion = (SmartSuggestion) obj;
        return AbstractC7890e.billing(this.ad, smartSuggestion.ad) && AbstractC7890e.billing(this.vip, smartSuggestion.vip) && AbstractC7890e.billing(this.metrica, smartSuggestion.metrica) && AbstractC7890e.billing(this.license, smartSuggestion.license) && AbstractC7890e.billing(this.appmetrica, smartSuggestion.appmetrica);
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId, reason: from getter */
    public final String getAd() {
        return this.appmetrica;
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vip;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metrica;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.license;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appmetrica;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmartSuggestion(title=");
        sb.append(this.ad);
        sb.append(", subtitle=");
        sb.append(this.vip);
        sb.append(", type=");
        sb.append(this.metrica);
        sb.append(", context=");
        sb.append(this.license);
        sb.append(", id=");
        return AbstractC4653e.applovin(sb, this.appmetrica, ')');
    }
}
