package ua.itaysonlab.vkapi2.objects.music.playlist.album;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.C9990e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC5413e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@InterfaceC5413e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/album/AudioAlbum;", BuildConfig.FLAVOR, "Companion", "eٔۖٝ", "eَؑۡ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioAlbum {
    public static final C9990e Companion = new Object();
    public Integer ad;
    public AlbumThumb appmetrica;
    public transient boolean billing;
    public String license;
    public String metrica;
    public String purchase;
    public Long vip;

    public AudioAlbum(Integer num, Long l, String str, String str2, AlbumThumb albumThumb, String str3, boolean z) {
        this.ad = num;
        this.vip = l;
        this.metrica = str;
        this.license = str2;
        this.appmetrica = albumThumb;
        this.purchase = str3;
        this.billing = z;
    }

    public static AudioAlbum ad(AudioAlbum audioAlbum) {
        Integer num = audioAlbum.ad;
        Long l = audioAlbum.vip;
        String str = audioAlbum.metrica;
        String str2 = audioAlbum.license;
        String str3 = audioAlbum.purchase;
        boolean z = audioAlbum.billing;
        audioAlbum.getClass();
        return new AudioAlbum(num, l, str, str2, null, str3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAlbum)) {
            return false;
        }
        AudioAlbum audioAlbum = (AudioAlbum) obj;
        return AbstractC7890e.billing(this.ad, audioAlbum.ad) && AbstractC7890e.billing(this.vip, audioAlbum.vip) && AbstractC7890e.billing(this.metrica, audioAlbum.metrica) && AbstractC7890e.billing(this.license, audioAlbum.license) && AbstractC7890e.billing(this.appmetrica, audioAlbum.appmetrica) && AbstractC7890e.billing(this.purchase, audioAlbum.purchase) && this.billing == audioAlbum.billing;
    }

    public final int hashCode() {
        Integer num = this.ad;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.vip;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.metrica;
        int advert = AbstractC1786e.advert((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.license);
        AlbumThumb albumThumb = this.appmetrica;
        int hashCode3 = (advert + (albumThumb == null ? 0 : albumThumb.hashCode())) * 31;
        String str2 = this.purchase;
        return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.billing ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAlbum(id=");
        sb.append(this.ad);
        sb.append(", owner_id=");
        sb.append(this.vip);
        sb.append(", access_key=");
        sb.append(this.metrica);
        sb.append(", title=");
        sb.append(this.license);
        sb.append(", thumb=");
        sb.append(this.appmetrica);
        sb.append(", main_color=");
        sb.append(this.purchase);
        sb.append(", isCached=");
        return AbstractC1786e.isVip(sb, this.billing, ')');
    }

    public final String vip() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.vip);
        sb.append('_');
        sb.append(this.ad);
        return sb.toString();
    }
}
