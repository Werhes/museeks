package ua.itaysonlab.vkapi2.methods.execute;

import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkapi2/methods/execute/SearchInProfile$SearchResponse", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchInProfile$SearchResponse {
    public final SearchInProfile$SearchPlaylistResponse ad;
    public final List vip;

    public SearchInProfile$SearchResponse(SearchInProfile$SearchPlaylistResponse searchInProfile$SearchPlaylistResponse, List list) {
        this.ad = searchInProfile$SearchPlaylistResponse;
        this.vip = list;
    }
}
