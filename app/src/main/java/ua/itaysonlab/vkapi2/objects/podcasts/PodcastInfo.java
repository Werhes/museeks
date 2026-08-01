package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.AbstractC5756e;
import defpackage.C10248e;
import defpackage.C8744e;
import defpackage.InterfaceC3919e;
import defpackage.InterfaceC5413e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@InterfaceC5413e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastInfo;", BuildConfig.FLAVOR, "Companion", "eَِٓ", "eٌٖٗ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastInfo {
    public static final C8744e Companion = new Object();
    public final PodcastCover ad;
    public final Integer appmetrica;
    public final String license;
    public final Boolean metrica;
    public final transient AlbumThumb purchase;
    public final int vip;

    public PodcastInfo(int i, PodcastCover podcastCover, int i2, Boolean bool, String str, Integer num, AlbumThumb albumThumb) {
        if (31 != (i & 31)) {
            AbstractC5756e.billing(i, 31, C10248e.ad.appmetrica());
            throw null;
        }
        this.ad = podcastCover;
        this.vip = i2;
        this.metrica = bool;
        this.license = str;
        this.appmetrica = num;
        if ((i & 32) == 0) {
            this.purchase = new AlbumThumb((String) null, (String) null, podcastCover.ad("c"), ad(), vip(), 3);
        } else {
            this.purchase = albumThumb;
        }
    }

    public PodcastInfo(PodcastCover podcastCover, int i, Boolean bool, String str, Integer num) {
        this.ad = podcastCover;
        this.vip = i;
        this.metrica = bool;
        this.license = str;
        this.appmetrica = num;
        this.purchase = new AlbumThumb((String) null, (String) null, podcastCover.ad("c"), ad(), vip(), 3);
    }

    public final String ad() {
        PodcastCover podcastCover = this.ad;
        String ad = podcastCover.ad("a");
        return ad.length() == 0 ? podcastCover.ad("c") : ad;
    }

    public final String vip() {
        String ad = this.ad.ad("x");
        return ad.length() == 0 ? ad() : ad;
    }
}
