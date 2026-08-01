package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/RadioInfo;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioInfo {
    public final List ad;
    public final String appmetrica;
    public final UmaTag billing;
    public final List license;
    public final RadioCluster metrica;
    public final UmaArtist purchase;
    public final UmaTrack startapp;
    public final String vip;
    public final UmaAlbum yandex;

    public RadioInfo(List list, String str, RadioCluster radioCluster, List list2, String str2, UmaArtist umaArtist, UmaTag umaTag, UmaAlbum umaAlbum, UmaTrack umaTrack) {
        this.ad = list;
        this.vip = str;
        this.metrica = radioCluster;
        this.license = list2;
        this.appmetrica = str2;
        this.purchase = umaArtist;
        this.billing = umaTag;
        this.yandex = umaAlbum;
        this.startapp = umaTrack;
    }
}
