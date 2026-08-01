package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UmaPlaylist;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UmaPlaylist {
    public final String ad;
    public final boolean license;
    public final UmaCover metrica;
    public final String vip;

    public UmaPlaylist(String str, String str2, UmaCover umaCover, boolean z) {
        this.ad = str;
        this.vip = str2;
        this.metrica = umaCover;
        this.license = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UmaPlaylist)) {
            return false;
        }
        UmaPlaylist umaPlaylist = (UmaPlaylist) obj;
        return AbstractC7890e.billing(this.ad, umaPlaylist.ad) && AbstractC7890e.billing(this.vip, umaPlaylist.vip) && AbstractC7890e.billing(this.metrica, umaPlaylist.metrica) && this.license == umaPlaylist.license;
    }

    public final int hashCode() {
        return ((this.metrica.hashCode() + AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip)) * 31) + (this.license ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UmaPlaylist(name=");
        sb.append(this.ad);
        sb.append(", apiId=");
        sb.append(this.vip);
        sb.append(", cover=");
        sb.append(this.metrica);
        sb.append(", isRadioCapable=");
        return AbstractC1786e.isVip(sb, this.license, ')');
    }
}
