package ua.itaysonlab.vkapi2.objects.video;

import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/video/VKVideoFiles;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VKVideoFiles {
    public final String ad;
    public final String appmetrica;
    public final String billing;
    public final String license;
    public final String metrica;
    public final String purchase;
    public final String vip;
    public final String yandex;

    public VKVideoFiles(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = str5;
        this.purchase = str6;
        this.billing = str7;
        this.yandex = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKVideoFiles)) {
            return false;
        }
        VKVideoFiles vKVideoFiles = (VKVideoFiles) obj;
        return AbstractC7890e.billing(this.ad, vKVideoFiles.ad) && AbstractC7890e.billing(this.vip, vKVideoFiles.vip) && AbstractC7890e.billing(this.metrica, vKVideoFiles.metrica) && AbstractC7890e.billing(this.license, vKVideoFiles.license) && AbstractC7890e.billing(this.appmetrica, vKVideoFiles.appmetrica) && AbstractC7890e.billing(this.purchase, vKVideoFiles.purchase) && AbstractC7890e.billing(this.billing, vKVideoFiles.billing) && AbstractC7890e.billing(this.yandex, vKVideoFiles.yandex);
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
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.purchase;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.billing;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.yandex;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKVideoFiles(mp4_240=");
        sb.append(this.ad);
        sb.append(", mp4_360=");
        sb.append(this.vip);
        sb.append(", mp4_480=");
        sb.append(this.metrica);
        sb.append(", mp4_720=");
        sb.append(this.license);
        sb.append(", mp4_1080=");
        sb.append(this.appmetrica);
        sb.append(", mp4_1440=");
        sb.append(this.purchase);
        sb.append(", mp4_2160=");
        sb.append(this.billing);
        sb.append(", hls=");
        return AbstractC4653e.applovin(sb, this.yandex, ')');
    }
}
