package ua.itaysonlab.vkapi2.objects.music.playlist;

import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/RecommendedPlaylist;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecommendedPlaylist implements InterfaceC15377e {
    public final int ad;
    public final List appmetrica;
    public final String license;
    public final Float metrica;
    public final String purchase;
    public final long vip;

    public RecommendedPlaylist(int i, long j, Float f, String str, List list, String str2) {
        this.ad = i;
        this.vip = j;
        this.metrica = f;
        this.license = str;
        this.appmetrica = list;
        this.purchase = str2;
    }

    @Override // defpackage.InterfaceC15377e
    public final String getItemId() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.vip);
        sb.append('_');
        sb.append(this.ad);
        return sb.toString();
    }
}
