package ua.itaysonlab.vkapi2.objects.music.playlist;

import defpackage.InterfaceC3919e;
import defpackage.InterfaceC7685e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/AudioPlaylistPermissions;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "canClone", "canFollow", "canDelete", "canEdit", "canShare", "canPlay", "<init>", "(ZZZZZZ)V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioPlaylistPermissions {
    public final boolean ad;
    public final boolean appmetrica;
    public final boolean license;
    public final boolean metrica;
    public final boolean purchase;
    public final boolean vip;

    public AudioPlaylistPermissions(@InterfaceC7685e(name = "save_as_copy") boolean z, @InterfaceC7685e(name = "follow") boolean z2, @InterfaceC7685e(name = "delete") boolean z3, @InterfaceC7685e(name = "edit") boolean z4, @InterfaceC7685e(name = "share") boolean z5, @InterfaceC7685e(name = "play") boolean z6) {
        this.ad = z;
        this.vip = z2;
        this.metrica = z3;
        this.license = z4;
        this.appmetrica = z5;
        this.purchase = z6;
    }
}
