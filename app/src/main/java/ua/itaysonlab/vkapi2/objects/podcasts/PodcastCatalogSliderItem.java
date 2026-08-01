package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem;", "Leُٕؓ;", "<init>", "()V", "EpisodeItem", "RandomButtonItem", "Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem$EpisodeItem;", "Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem$RandomButtonItem;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PodcastCatalogSliderItem implements InterfaceC15377e {

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem$EpisodeItem;", "Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class EpisodeItem extends PodcastCatalogSliderItem {
        public final String ad;
        public final AudioTrack vip;

        public EpisodeItem(String str, AudioTrack audioTrack) {
            super(0);
            this.ad = str;
            this.vip = audioTrack;
        }

        @Override // ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogSliderItem
        /* renamed from: ad, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem$RandomButtonItem;", "Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogSliderItem;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RandomButtonItem extends PodcastCatalogSliderItem {
        public final String ad;

        public RandomButtonItem(String str) {
            super(0);
            this.ad = str;
        }

        @Override // ua.itaysonlab.vkapi2.objects.podcasts.PodcastCatalogSliderItem
        /* renamed from: ad, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    private PodcastCatalogSliderItem() {
    }

    public /* synthetic */ PodcastCatalogSliderItem(int i) {
        this();
    }

    /* renamed from: ad */
    public abstract String getAd();

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId */
    public final String getVip() {
        return getAd();
    }
}
