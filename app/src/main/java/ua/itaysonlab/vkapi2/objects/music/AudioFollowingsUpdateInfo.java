package ua.itaysonlab.vkapi2.objects.music;

import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioFollowingsUpdateInfo;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioFollowingsUpdateInfo implements InterfaceC15377e {
    public final long ad;
    public final List metrica;
    public final String vip;

    public AudioFollowingsUpdateInfo(long j, String str, List list) {
        this.ad = j;
        this.vip = str;
        this.metrica = list;
    }

    @Override // defpackage.InterfaceC15377e
    public final String getItemId() {
        return String.valueOf(this.ad);
    }
}
