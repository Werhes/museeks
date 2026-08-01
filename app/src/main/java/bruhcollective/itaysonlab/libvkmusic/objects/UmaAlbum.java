package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UmaAlbum;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UmaAlbum {
    public final String ad;
    public final List appmetrica;
    public final List license;
    public final UmaCover metrica;
    public final long vip;

    public UmaAlbum(String str, long j, UmaCover umaCover, List list, List list2) {
        this.ad = str;
        this.vip = j;
        this.metrica = umaCover;
        this.license = list;
        this.appmetrica = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UmaAlbum)) {
            return false;
        }
        UmaAlbum umaAlbum = (UmaAlbum) obj;
        return AbstractC7890e.billing(this.ad, umaAlbum.ad) && this.vip == umaAlbum.vip && AbstractC7890e.billing(this.metrica, umaAlbum.metrica) && AbstractC7890e.billing(this.license, umaAlbum.license) && AbstractC7890e.billing(this.appmetrica, umaAlbum.appmetrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long j = this.vip;
        int hashCode2 = (this.metrica.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        List list = this.license;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.appmetrica;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UmaAlbum(name=");
        sb.append(this.ad);
        sb.append(", apiId=");
        sb.append(this.vip);
        sb.append(", cover=");
        sb.append(this.metrica);
        sb.append(", artists=");
        sb.append(this.license);
        sb.append(", tags=");
        return AbstractC1786e.tapsense(sb, this.appmetrica, ')');
    }
}
