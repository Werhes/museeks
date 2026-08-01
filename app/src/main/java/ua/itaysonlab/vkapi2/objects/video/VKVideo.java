package ua.itaysonlab.vkapi2.objects.video;

import defpackage.AbstractC1786e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/video/VKVideo;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VKVideo implements InterfaceC15377e {
    public final int ad;
    public final List adcel;
    public final String advert;
    public final Integer appmetrica;
    public final Long billing;
    public final Integer license;
    public final String metrica;
    public final int mopub;
    public final List purchase;
    public final List startapp;
    public final Long vip;
    public final VKVideoFiles yandex;

    public VKVideo(int i, Long l, String str, Integer num, Integer num2, List list, Long l2, VKVideoFiles vKVideoFiles, List list2, List list3, int i2, String str2) {
        this.ad = i;
        this.vip = l;
        this.metrica = str;
        this.license = num;
        this.appmetrica = num2;
        this.purchase = list;
        this.billing = l2;
        this.yandex = vKVideoFiles;
        this.startapp = list2;
        this.adcel = list3;
        this.mopub = i2;
        this.advert = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKVideo)) {
            return false;
        }
        VKVideo vKVideo = (VKVideo) obj;
        return this.ad == vKVideo.ad && AbstractC7890e.billing(this.vip, vKVideo.vip) && AbstractC7890e.billing(this.metrica, vKVideo.metrica) && AbstractC7890e.billing(this.license, vKVideo.license) && AbstractC7890e.billing(this.appmetrica, vKVideo.appmetrica) && AbstractC7890e.billing(this.purchase, vKVideo.purchase) && AbstractC7890e.billing(this.billing, vKVideo.billing) && AbstractC7890e.billing(this.yandex, vKVideo.yandex) && AbstractC7890e.billing(this.startapp, vKVideo.startapp) && AbstractC7890e.billing(this.adcel, vKVideo.adcel) && this.mopub == vKVideo.mopub && AbstractC7890e.billing(this.advert, vKVideo.advert);
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId */
    public final String getAd() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.vip);
        sb.append('_');
        sb.append(this.ad);
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.ad * 31;
        Long l = this.vip;
        int advert = AbstractC1786e.advert((i + (l == null ? 0 : l.hashCode())) * 31, 31, this.metrica);
        Integer num = this.license;
        int hashCode = (advert + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.appmetrica;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.purchase;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.billing;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        VKVideoFiles vKVideoFiles = this.yandex;
        int hashCode5 = (hashCode4 + (vKVideoFiles == null ? 0 : vKVideoFiles.hashCode())) * 31;
        List list2 = this.startapp;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.adcel;
        int hashCode7 = (((hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.mopub) * 31;
        String str = this.advert;
        return hashCode7 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKVideo(id=");
        sb.append(this.ad);
        sb.append(", owner_id=");
        sb.append(this.vip);
        sb.append(", title=");
        sb.append(this.metrica);
        sb.append(", width=");
        sb.append(this.license);
        sb.append(", height=");
        sb.append(this.appmetrica);
        sb.append(", image=");
        sb.append(this.purchase);
        sb.append(", user_id=");
        sb.append(this.billing);
        sb.append(", files=");
        sb.append(this.yandex);
        sb.append(", main_artists=");
        sb.append(this.startapp);
        sb.append(", genres=");
        sb.append(this.adcel);
        sb.append(", duration=");
        sb.append(this.mopub);
        sb.append(", direct_url=");
        return AbstractC4653e.applovin(sb, this.advert, ')');
    }
}
