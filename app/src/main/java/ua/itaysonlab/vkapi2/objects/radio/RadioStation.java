package ua.itaysonlab.vkapi2.objects.radio;

import defpackage.AbstractC16049e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC5336e;
import defpackage.AbstractC7890e;
import defpackage.C13575e;
import defpackage.C4721e;
import defpackage.InterfaceC10136e;
import defpackage.InterfaceC11810e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC5083e;
import kotlin.Metadata;
import com.werhes.museeks.R;
import com.werhes.museeks.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/radio/RadioStation;", "Leؙٖۛ;", "Leُٕؓ;", "Leِٙؕ;", "Leًَ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RadioStation extends AbstractC16049e implements InterfaceC15377e, InterfaceC11810e, InterfaceC10136e {
    public final int ad;
    public final String appmetrica;
    public final boolean billing;
    public final String license;
    public final String metrica;
    public boolean purchase;
    public final String vip;
    public final String yandex;

    public RadioStation(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = str4;
        this.purchase = z;
        this.billing = z2;
        this.yandex = str5;
    }

    @Override // defpackage.InterfaceC10136e
    /* renamed from: adcel, reason: from getter */
    public final boolean getPurchase() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC16049e
    public final C4721e admob() {
        return new C4721e("vk_radio", String.valueOf(this.ad), this.yandex);
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: advert */
    public final String getAd() {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        return vKXApplication.getString(R.string.op_radio_station);
    }

    @Override // defpackage.AbstractC16049e
    public final int amazon() {
        return 0;
    }

    @Override // defpackage.InterfaceC11810e
    public final int appmetrica() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioStation)) {
            return false;
        }
        RadioStation radioStation = (RadioStation) obj;
        return this.ad == radioStation.ad && AbstractC7890e.billing(this.vip, radioStation.vip) && AbstractC7890e.billing(this.metrica, radioStation.metrica) && AbstractC7890e.billing(this.license, radioStation.license) && AbstractC7890e.billing(this.appmetrica, radioStation.appmetrica) && this.purchase == radioStation.purchase && this.billing == radioStation.billing && AbstractC7890e.billing(this.yandex, radioStation.yandex);
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId */
    public final String getAd() {
        return String.valueOf(this.ad);
    }

    public final int hashCode() {
        return this.yandex.hashCode() + ((((AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(this.ad * 31, 31, this.vip), 31, this.metrica), 31, this.license), 31, this.appmetrica) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237)) * 31);
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: loadAd */
    public final String getAd() {
        return "vk_radio_" + this.ad;
    }

    @Override // defpackage.InterfaceC10136e
    public final void metrica(boolean z) {
        this.purchase = z;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        InterfaceC5083e interfaceC5083e = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC5336e.purchase(vKXApplication, null, 0, new C13575e(z, this, interfaceC5083e, 4), 3);
    }

    @Override // defpackage.AbstractC16049e
    public final /* bridge */ /* synthetic */ String mopub() {
        return null;
    }

    @Override // defpackage.AbstractC16049e
    public final String pro() {
        return null;
    }

    @Override // defpackage.InterfaceC11810e
    public final boolean purchase() {
        return true;
    }

    @Override // defpackage.AbstractC16049e
    public final String remoteconfig() {
        return "vk_radio";
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: smaato, reason: from getter */
    public final String getLicense() {
        return this.license;
    }

    @Override // defpackage.AbstractC16049e
    /* renamed from: subscription, reason: from getter */
    public final String getVip() {
        return this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RadioStation(id=");
        sb.append(this.ad);
        sb.append(", name=");
        sb.append(this.vip);
        sb.append(", logo_url=");
        sb.append(this.metrica);
        sb.append(", logo_png_url=");
        sb.append(this.license);
        sb.append(", background_color=");
        sb.append(this.appmetrica);
        sb.append(", is_followed=");
        sb.append(this.purchase);
        sb.append(", is_enabled=");
        sb.append(this.billing);
        sb.append(", stream_url=");
        return AbstractC4653e.applovin(sb, this.yandex, ')');
    }

    @Override // defpackage.InterfaceC11810e
    public final boolean vip() {
        return AbstractC1786e.appmetrica(this);
    }
}
