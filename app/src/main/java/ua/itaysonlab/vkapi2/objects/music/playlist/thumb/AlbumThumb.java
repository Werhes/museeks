package ua.itaysonlab.vkapi2.objects.music.playlist.thumb;

import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.C10925e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC5413e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@InterfaceC5413e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/thumb/AlbumThumb;", BuildConfig.FLAVOR, "Companion", "eْۡۙ", "eَُ۟", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AlbumThumb {
    public static final C10925e Companion = new Object();
    public final String ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public /* synthetic */ AlbumThumb(int i, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = str;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str2;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str3;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = str4;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str5;
        }
    }

    public AlbumThumb(String str, String str2, String str3, String str4, String str5) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = str5;
    }

    public /* synthetic */ AlbumThumb(String str, String str2, String str3, String str4, String str5, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumThumb)) {
            return false;
        }
        AlbumThumb albumThumb = (AlbumThumb) obj;
        return AbstractC7890e.billing(this.ad, albumThumb.ad) && AbstractC7890e.billing(this.vip, albumThumb.vip) && AbstractC7890e.billing(this.metrica, albumThumb.metrica) && AbstractC7890e.billing(this.license, albumThumb.license) && AbstractC7890e.billing(this.appmetrica, albumThumb.appmetrica);
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
        StringBuilder sb = new StringBuilder("AlbumThumb(photo_135=");
        sb.append(this.ad);
        sb.append(", photo_270=");
        sb.append(this.vip);
        sb.append(", photo_300=");
        sb.append(this.metrica);
        sb.append(", photo_600=");
        sb.append(this.license);
        sb.append(", photo_1200=");
        return AbstractC4653e.applovin(sb, this.appmetrica, ')');
    }
}
