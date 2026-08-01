package ua.itaysonlab.vkapi2.objects.music;

import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioWidgetItem;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioWidgetItem {
    public final AlbumThumb ad;
    public final String appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public AudioWidgetItem(AlbumThumb albumThumb, String str, String str2, String str3, String str4) {
        this.ad = albumThumb;
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = str4;
    }
}
