package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC17861e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.EnumC15939e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioContentCard;", "Leُٕؓ;", "eٖؒۤ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioContentCard implements InterfaceC15377e {
    public final String ad;
    public final String appmetrica;
    public final EnumC15939e billing;
    public final String license;
    public final List metrica;
    public final String purchase;
    public final List vip;

    public AudioContentCard(String str, List list, List list2, String str2, String str3, String str4, EnumC15939e enumC15939e) {
        this.ad = str;
        this.vip = list;
        this.metrica = list2;
        this.license = str2;
        this.appmetrica = str3;
        this.purchase = str4;
        this.billing = enumC15939e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioContentCard)) {
            return false;
        }
        AudioContentCard audioContentCard = (AudioContentCard) obj;
        return AbstractC7890e.billing(this.ad, audioContentCard.ad) && AbstractC7890e.billing(this.vip, audioContentCard.vip) && AbstractC7890e.billing(this.metrica, audioContentCard.metrica) && AbstractC7890e.billing(this.license, audioContentCard.license) && AbstractC7890e.billing(this.appmetrica, audioContentCard.appmetrica) && AbstractC7890e.billing(this.purchase, audioContentCard.purchase) && this.billing == audioContentCard.billing;
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId */
    public final String getAd() {
        return this.purchase + '_' + this.appmetrica;
    }

    public final int hashCode() {
        String str = this.ad;
        int billing = AbstractC17861e.billing(AbstractC17861e.billing((str == null ? 0 : str.hashCode()) * 31, 31, this.vip), 31, this.metrica);
        String str2 = this.license;
        return this.billing.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert((billing + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.appmetrica), 31, this.purchase);
    }

    public final String toString() {
        return "AudioContentCard(editorAnnotation=" + this.ad + ", editorBackgroundImage=" + this.vip + ", editorGradientImage=" + this.metrica + ", editorTag=" + this.license + ", entityId=" + this.appmetrica + ", entityOwnerId=" + this.purchase + ", entityType=" + this.billing + ')';
    }
}
