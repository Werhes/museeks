package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogLongread;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastCatalogLongread implements InterfaceC15377e {
    public final int ad;
    public final int adcel;
    public final int appmetrica;
    public final String billing;
    public final PodcastCover license;
    public final String metrica;
    public final int mopub;
    public final String purchase;
    public final String startapp;
    public final long vip;
    public final String yandex;

    public PodcastCatalogLongread(int i, long j, String str, PodcastCover podcastCover, int i2, String str2, String str3, String str4, String str5, int i3, int i4) {
        this.ad = i;
        this.vip = j;
        this.metrica = str;
        this.license = podcastCover;
        this.appmetrica = i2;
        this.purchase = str2;
        this.billing = str3;
        this.yandex = str4;
        this.startapp = str5;
        this.adcel = i3;
        this.mopub = i4;
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
