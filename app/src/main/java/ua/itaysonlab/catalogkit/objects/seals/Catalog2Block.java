package ua.itaysonlab.catalogkit.objects.seals;

import defpackage.AbstractC0746e;
import defpackage.AbstractC17861e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.C13664e;
import defpackage.C3675e;
import defpackage.C9139e;
import defpackage.InterfaceC3919e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Badge;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001c\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001c !\"#$%&'()*+,-./0123456789\u001f:¨\u0006;"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", BuildConfig.FLAVOR, "<init>", "()V", "NoDataBlock", "ArtistBannerBlock", "MusicAudiosBlock", "MusicPlaylistsBlock", "LinksBlock", "SearchSuggestionsBlock", "VideosBlock", "ArtistVideosBlock", "CatalogBannersBlock", "CuratorBannerBlock", "CuratorGroupBlock", "TextsBlock", "PodcastEpisodesBlock", "PodcastSliderItemsBlock", "LongreadsBlock", "ActionsBlock", "PlaceholdersBlock", "RecommendedPlaylistsBlock", "MusicOwnersBlock", "AudioFollowingsUpdateInfoBlock", "PodcastsBlock", "RadioStationsBlock", "AudioBooksBlock", "AudioBooksPersonsBlock", "AudioStreamMixesBlock", "AudioContentCardsBlock", "EmptyBlock", "eٍؗۘ", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ActionsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ArtistBannerBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ArtistVideosBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioBooksBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioBooksPersonsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioContentCardsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioFollowingsUpdateInfoBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioStreamMixesBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CatalogBannersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CuratorBannerBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CuratorGroupBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$EmptyBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$LinksBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$LongreadsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicAudiosBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicOwnersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicPlaylistsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$NoDataBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PlaceholdersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastEpisodesBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastSliderItemsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$RadioStationsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$RecommendedPlaylistsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$SearchSuggestionsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$TextsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$VideosBlock;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Catalog2Block {

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ActionsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ActionsBlock extends Catalog2Block {
        public final String ad;
        public final String appmetrica;
        public final List license;
        public final List metrica;
        public final Catalog2Layout vip;

        public ActionsBlock(String str, String str2, List list, List list2, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = list2;
            this.appmetrica = str2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ ActionsBlock(java.lang.String r3, ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout r4, java.util.List r5, java.util.List r6, java.lang.String r7, int r8) {
            /*
                r2 = this;
                r0 = r8 & 4
                r1 = 0
                if (r0 == 0) goto L6
                r5 = r1
            L6:
                r0 = r8 & 8
                if (r0 == 0) goto Lb
                r6 = r1
            Lb:
                r8 = r8 & 16
                if (r8 == 0) goto L16
                r7 = r6
                r6 = r5
                r5 = r1
            L12:
                r8 = r4
                r4 = r3
                r3 = r2
                goto L1b
            L16:
                r8 = r6
                r6 = r5
                r5 = r7
                r7 = r8
                goto L12
            L1b:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.catalogkit.objects.seals.Catalog2Block.ActionsBlock.<init>(java.lang.String, ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout, java.util.List, java.util.List, java.lang.String, int):void");
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            ArrayList arrayList;
            List list = this.metrica;
            if (list != null) {
                arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Catalog2Button) it.next()).getItemId());
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? C13664e.f27089e : arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionsBlock)) {
                return false;
            }
            ActionsBlock actionsBlock = (ActionsBlock) obj;
            return AbstractC7890e.billing(this.ad, actionsBlock.ad) && AbstractC7890e.billing(this.vip, actionsBlock.vip) && AbstractC7890e.billing(this.metrica, actionsBlock.metrica) && AbstractC7890e.billing(this.license, actionsBlock.license) && AbstractC7890e.billing(this.appmetrica, actionsBlock.appmetrica);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.license;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.appmetrica;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return C9139e.f18290e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionsBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", listen_events=");
            sb.append(this.license);
            sb.append(", next_from=");
            return AbstractC4653e.applovin(sb, this.appmetrica, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ArtistBannerBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ArtistBannerBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public ArtistBannerBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArtistBannerBlock)) {
                return false;
            }
            ArtistBannerBlock artistBannerBlock = (ArtistBannerBlock) obj;
            return AbstractC7890e.billing(this.ad, artistBannerBlock.ad) && AbstractC7890e.billing(this.vip, artistBannerBlock.vip) && AbstractC7890e.billing(this.metrica, artistBannerBlock.metrica) && AbstractC7890e.billing(this.license, artistBannerBlock.license) && AbstractC7890e.billing(this.appmetrica, artistBannerBlock.appmetrica) && AbstractC7890e.billing(this.purchase, artistBannerBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.billing;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArtistBannerBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", artists_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$ArtistVideosBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ArtistVideosBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public ArtistVideosBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArtistVideosBlock)) {
                return false;
            }
            ArtistVideosBlock artistVideosBlock = (ArtistVideosBlock) obj;
            return AbstractC7890e.billing(this.ad, artistVideosBlock.ad) && AbstractC7890e.billing(this.vip, artistVideosBlock.vip) && AbstractC7890e.billing(this.metrica, artistVideosBlock.metrica) && AbstractC7890e.billing(this.license, artistVideosBlock.license) && AbstractC7890e.billing(this.appmetrica, artistVideosBlock.appmetrica) && AbstractC7890e.billing(this.purchase, artistVideosBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.license;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArtistVideosBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", artist_videos_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioBooksBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class AudioBooksBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public AudioBooksBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            if (list == null) {
                return C13664e.f27089e;
            }
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioBooksBlock)) {
                return false;
            }
            AudioBooksBlock audioBooksBlock = (AudioBooksBlock) obj;
            return AbstractC7890e.billing(this.ad, audioBooksBlock.ad) && AbstractC7890e.billing(this.vip, audioBooksBlock.vip) && AbstractC7890e.billing(this.metrica, audioBooksBlock.metrica) && AbstractC7890e.billing(this.license, audioBooksBlock.license) && AbstractC7890e.billing(this.appmetrica, audioBooksBlock.appmetrica) && AbstractC7890e.billing(this.purchase, audioBooksBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.signatures;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioBooksBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", audio_book_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioBooksPersonsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class AudioBooksPersonsBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public AudioBooksPersonsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            if (list == null) {
                return C13664e.f27089e;
            }
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioBooksPersonsBlock)) {
                return false;
            }
            AudioBooksPersonsBlock audioBooksPersonsBlock = (AudioBooksPersonsBlock) obj;
            return AbstractC7890e.billing(this.ad, audioBooksPersonsBlock.ad) && AbstractC7890e.billing(this.vip, audioBooksPersonsBlock.vip) && AbstractC7890e.billing(this.metrica, audioBooksPersonsBlock.metrica) && AbstractC7890e.billing(this.license, audioBooksPersonsBlock.license) && AbstractC7890e.billing(this.appmetrica, audioBooksPersonsBlock.appmetrica) && AbstractC7890e.billing(this.purchase, audioBooksPersonsBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.isVip;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioBooksPersonsBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", audio_books_person_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioContentCardsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class AudioContentCardsBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public AudioContentCardsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioContentCardsBlock)) {
                return false;
            }
            AudioContentCardsBlock audioContentCardsBlock = (AudioContentCardsBlock) obj;
            return AbstractC7890e.billing(this.ad, audioContentCardsBlock.ad) && AbstractC7890e.billing(this.vip, audioContentCardsBlock.vip) && AbstractC7890e.billing(this.metrica, audioContentCardsBlock.metrica) && AbstractC7890e.billing(this.license, audioContentCardsBlock.license) && AbstractC7890e.billing(this.appmetrica, audioContentCardsBlock.appmetrica) && AbstractC7890e.billing(this.purchase, audioContentCardsBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.inmobi;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioContentCardsBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", audio_content_card_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioFollowingsUpdateInfoBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class AudioFollowingsUpdateInfoBlock extends Catalog2Block {
        public final String ad;
        public final String appmetrica;
        public final List license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public AudioFollowingsUpdateInfoBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = list2;
            this.appmetrica = str2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFollowingsUpdateInfoBlock)) {
                return false;
            }
            AudioFollowingsUpdateInfoBlock audioFollowingsUpdateInfoBlock = (AudioFollowingsUpdateInfoBlock) obj;
            return AbstractC7890e.billing(this.ad, audioFollowingsUpdateInfoBlock.ad) && AbstractC7890e.billing(this.vip, audioFollowingsUpdateInfoBlock.vip) && AbstractC7890e.billing(this.metrica, audioFollowingsUpdateInfoBlock.metrica) && AbstractC7890e.billing(this.license, audioFollowingsUpdateInfoBlock.license) && AbstractC7890e.billing(this.appmetrica, audioFollowingsUpdateInfoBlock.appmetrica) && AbstractC7890e.billing(this.purchase, audioFollowingsUpdateInfoBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.license;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.appmetrica;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.remoteconfig;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFollowingsUpdateInfoBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", listen_events=");
            sb.append(this.license);
            sb.append(", next_from=");
            sb.append(this.appmetrica);
            sb.append(", audio_followings_update_info_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$AudioStreamMixesBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class AudioStreamMixesBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public AudioStreamMixesBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioStreamMixesBlock)) {
                return false;
            }
            AudioStreamMixesBlock audioStreamMixesBlock = (AudioStreamMixesBlock) obj;
            return AbstractC7890e.billing(this.ad, audioStreamMixesBlock.ad) && AbstractC7890e.billing(this.vip, audioStreamMixesBlock.vip) && AbstractC7890e.billing(this.metrica, audioStreamMixesBlock.metrica) && AbstractC7890e.billing(this.license, audioStreamMixesBlock.license) && AbstractC7890e.billing(this.appmetrica, audioStreamMixesBlock.appmetrica) && AbstractC7890e.billing(this.purchase, audioStreamMixesBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.tapsense;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioStreamMixesBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", audio_stream_mixes_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CatalogBannersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class CatalogBannersBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public CatalogBannersBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CatalogBannersBlock)) {
                return false;
            }
            CatalogBannersBlock catalogBannersBlock = (CatalogBannersBlock) obj;
            return AbstractC7890e.billing(this.ad, catalogBannersBlock.ad) && AbstractC7890e.billing(this.vip, catalogBannersBlock.vip) && AbstractC7890e.billing(this.metrica, catalogBannersBlock.metrica) && AbstractC7890e.billing(this.license, catalogBannersBlock.license) && AbstractC7890e.billing(this.appmetrica, catalogBannersBlock.appmetrica) && AbstractC7890e.billing(this.purchase, catalogBannersBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.startapp;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CatalogBannersBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", catalog_banner_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CuratorBannerBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class CuratorBannerBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public CuratorBannerBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CuratorBannerBlock)) {
                return false;
            }
            CuratorBannerBlock curatorBannerBlock = (CuratorBannerBlock) obj;
            return AbstractC7890e.billing(this.ad, curatorBannerBlock.ad) && AbstractC7890e.billing(this.vip, curatorBannerBlock.vip) && AbstractC7890e.billing(this.metrica, curatorBannerBlock.metrica) && AbstractC7890e.billing(this.license, curatorBannerBlock.license) && AbstractC7890e.billing(this.appmetrica, curatorBannerBlock.appmetrica) && AbstractC7890e.billing(this.purchase, curatorBannerBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.adcel;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CuratorBannerBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", curators_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$CuratorGroupBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class CuratorGroupBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public CuratorGroupBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            if (list == null) {
                return C13664e.f27089e;
            }
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add("-" + ((String) it.next()));
            }
            return arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CuratorGroupBlock)) {
                return false;
            }
            CuratorGroupBlock curatorGroupBlock = (CuratorGroupBlock) obj;
            return AbstractC7890e.billing(this.ad, curatorGroupBlock.ad) && AbstractC7890e.billing(this.vip, curatorGroupBlock.vip) && AbstractC7890e.billing(this.metrica, curatorGroupBlock.metrica) && AbstractC7890e.billing(this.license, curatorGroupBlock.license) && AbstractC7890e.billing(this.appmetrica, curatorGroupBlock.appmetrica) && AbstractC7890e.billing(this.purchase, curatorGroupBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.yandex;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CuratorGroupBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", group_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$EmptyBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class EmptyBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final Catalog2Layout vip;

        public EmptyBlock(String str, String str2, List list, List list2, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            return C13664e.f27089e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmptyBlock)) {
                return false;
            }
            EmptyBlock emptyBlock = (EmptyBlock) obj;
            return AbstractC7890e.billing(this.ad, emptyBlock.ad) && AbstractC7890e.billing(this.vip, emptyBlock.vip) && AbstractC7890e.billing(this.metrica, emptyBlock.metrica) && AbstractC7890e.billing(this.license, emptyBlock.license) && AbstractC7890e.billing(this.appmetrica, emptyBlock.appmetrica);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            return hashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            throw new IllegalStateException("EmptyBlock can't have data");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EmptyBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            return AbstractC1786e.tapsense(sb, this.appmetrica, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$LinksBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class LinksBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public List purchase;
        public final Catalog2Layout vip;

        public LinksBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinksBlock)) {
                return false;
            }
            LinksBlock linksBlock = (LinksBlock) obj;
            return AbstractC7890e.billing(this.ad, linksBlock.ad) && AbstractC7890e.billing(this.vip, linksBlock.vip) && AbstractC7890e.billing(this.metrica, linksBlock.metrica) && AbstractC7890e.billing(this.license, linksBlock.license) && AbstractC7890e.billing(this.appmetrica, linksBlock.appmetrica) && AbstractC7890e.billing(this.purchase, linksBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.appmetrica;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LinksBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", links_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$LongreadsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class LongreadsBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public LongreadsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LongreadsBlock)) {
                return false;
            }
            LongreadsBlock longreadsBlock = (LongreadsBlock) obj;
            return AbstractC7890e.billing(this.ad, longreadsBlock.ad) && AbstractC7890e.billing(this.vip, longreadsBlock.vip) && AbstractC7890e.billing(this.metrica, longreadsBlock.metrica) && AbstractC7890e.billing(this.license, longreadsBlock.license) && AbstractC7890e.billing(this.appmetrica, longreadsBlock.appmetrica) && AbstractC7890e.billing(this.purchase, longreadsBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.loadAd;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LongreadsBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", longreads_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicAudiosBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class MusicAudiosBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public /* synthetic */ MusicAudiosBlock(int i, String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this(str, (i & 8) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, catalog2Layout);
        }

        public MusicAudiosBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicAudiosBlock)) {
                return false;
            }
            MusicAudiosBlock musicAudiosBlock = (MusicAudiosBlock) obj;
            return AbstractC7890e.billing(this.ad, musicAudiosBlock.ad) && AbstractC7890e.billing(this.vip, musicAudiosBlock.vip) && AbstractC7890e.billing(this.metrica, musicAudiosBlock.metrica) && AbstractC7890e.billing(this.license, musicAudiosBlock.license) && AbstractC7890e.billing(this.appmetrica, musicAudiosBlock.appmetrica) && AbstractC7890e.billing(this.purchase, musicAudiosBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.ad;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicAudiosBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", audios_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicOwnersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class MusicOwnersBlock extends Catalog2Block {
        public final String ad;
        public final String appmetrica;
        public final List license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public MusicOwnersBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = list2;
            this.appmetrica = str2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicOwnersBlock)) {
                return false;
            }
            MusicOwnersBlock musicOwnersBlock = (MusicOwnersBlock) obj;
            return AbstractC7890e.billing(this.ad, musicOwnersBlock.ad) && AbstractC7890e.billing(this.vip, musicOwnersBlock.vip) && AbstractC7890e.billing(this.metrica, musicOwnersBlock.metrica) && AbstractC7890e.billing(this.license, musicOwnersBlock.license) && AbstractC7890e.billing(this.appmetrica, musicOwnersBlock.appmetrica) && AbstractC7890e.billing(this.purchase, musicOwnersBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.license;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.appmetrica;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.subscription;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicOwnersBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", listen_events=");
            sb.append(this.license);
            sb.append(", next_from=");
            sb.append(this.appmetrica);
            sb.append(", music_owners_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$MusicPlaylistsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class MusicPlaylistsBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public /* synthetic */ MusicPlaylistsBlock(int i, String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this(str, (i & 8) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, catalog2Layout);
        }

        public MusicPlaylistsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MusicPlaylistsBlock)) {
                return false;
            }
            MusicPlaylistsBlock musicPlaylistsBlock = (MusicPlaylistsBlock) obj;
            return AbstractC7890e.billing(this.ad, musicPlaylistsBlock.ad) && AbstractC7890e.billing(this.vip, musicPlaylistsBlock.vip) && AbstractC7890e.billing(this.metrica, musicPlaylistsBlock.metrica) && AbstractC7890e.billing(this.license, musicPlaylistsBlock.license) && AbstractC7890e.billing(this.appmetrica, musicPlaylistsBlock.appmetrica) && AbstractC7890e.billing(this.purchase, musicPlaylistsBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.vip;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MusicPlaylistsBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", playlists_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$NoDataBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class NoDataBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final Catalog2Badge purchase;
        public final Catalog2Layout vip;

        public NoDataBlock(String str, Catalog2Layout catalog2Layout, List list, String str2, List list2, Catalog2Badge catalog2Badge) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = catalog2Badge;
        }

        public /* synthetic */ NoDataBlock(String str, Catalog2Layout catalog2Layout, List list, String str2, List list2, Catalog2Badge catalog2Badge, int i) {
            this(str, catalog2Layout, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : catalog2Badge);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            return C13664e.f27089e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoDataBlock)) {
                return false;
            }
            NoDataBlock noDataBlock = (NoDataBlock) obj;
            return AbstractC7890e.billing(this.ad, noDataBlock.ad) && AbstractC7890e.billing(this.vip, noDataBlock.vip) && AbstractC7890e.billing(this.metrica, noDataBlock.metrica) && AbstractC7890e.billing(this.license, noDataBlock.license) && AbstractC7890e.billing(this.appmetrica, noDataBlock.appmetrica) && AbstractC7890e.billing(this.purchase, noDataBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Catalog2Badge catalog2Badge = this.purchase;
            return hashCode3 + (catalog2Badge != null ? catalog2Badge.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            throw new IllegalStateException("NoDataBlock can't have data");
        }

        public final String toString() {
            return "NoDataBlock(id=" + this.ad + ", layout=" + this.vip + ", actions=" + this.metrica + ", next_from=" + this.license + ", listen_events=" + this.appmetrica + ", badge=" + this.purchase + ')';
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PlaceholdersBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class PlaceholdersBlock extends Catalog2Block {
        public final String ad;
        public final String appmetrica;
        public final List license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public /* synthetic */ PlaceholdersBlock(int i, String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this(str, (i & 16) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 32) != 0 ? null : list3, catalog2Layout);
        }

        public PlaceholdersBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = list2;
            this.appmetrica = str2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaceholdersBlock)) {
                return false;
            }
            PlaceholdersBlock placeholdersBlock = (PlaceholdersBlock) obj;
            return AbstractC7890e.billing(this.ad, placeholdersBlock.ad) && AbstractC7890e.billing(this.vip, placeholdersBlock.vip) && AbstractC7890e.billing(this.metrica, placeholdersBlock.metrica) && AbstractC7890e.billing(this.license, placeholdersBlock.license) && AbstractC7890e.billing(this.appmetrica, placeholdersBlock.appmetrica) && AbstractC7890e.billing(this.purchase, placeholdersBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.license;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.appmetrica;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.Signature;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaceholdersBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", listen_events=");
            sb.append(this.license);
            sb.append(", next_from=");
            sb.append(this.appmetrica);
            sb.append(", placeholder_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastEpisodesBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class PodcastEpisodesBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public PodcastEpisodesBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PodcastEpisodesBlock)) {
                return false;
            }
            PodcastEpisodesBlock podcastEpisodesBlock = (PodcastEpisodesBlock) obj;
            return AbstractC7890e.billing(this.ad, podcastEpisodesBlock.ad) && AbstractC7890e.billing(this.vip, podcastEpisodesBlock.vip) && AbstractC7890e.billing(this.metrica, podcastEpisodesBlock.metrica) && AbstractC7890e.billing(this.license, podcastEpisodesBlock.license) && AbstractC7890e.billing(this.appmetrica, podcastEpisodesBlock.appmetrica) && AbstractC7890e.billing(this.purchase, podcastEpisodesBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.advert;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PodcastEpisodesBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", podcast_episodes_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastSliderItemsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class PodcastSliderItemsBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public PodcastSliderItemsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PodcastSliderItemsBlock)) {
                return false;
            }
            PodcastSliderItemsBlock podcastSliderItemsBlock = (PodcastSliderItemsBlock) obj;
            return AbstractC7890e.billing(this.ad, podcastSliderItemsBlock.ad) && AbstractC7890e.billing(this.vip, podcastSliderItemsBlock.vip) && AbstractC7890e.billing(this.metrica, podcastSliderItemsBlock.metrica) && AbstractC7890e.billing(this.license, podcastSliderItemsBlock.license) && AbstractC7890e.billing(this.appmetrica, podcastSliderItemsBlock.appmetrica) && AbstractC7890e.billing(this.purchase, podcastSliderItemsBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.smaato;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PodcastSliderItemsBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", podcast_slider_items_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$PodcastsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class PodcastsBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public PodcastsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PodcastsBlock)) {
                return false;
            }
            PodcastsBlock podcastsBlock = (PodcastsBlock) obj;
            return AbstractC7890e.billing(this.ad, podcastsBlock.ad) && AbstractC7890e.billing(this.vip, podcastsBlock.vip) && AbstractC7890e.billing(this.metrica, podcastsBlock.metrica) && AbstractC7890e.billing(this.license, podcastsBlock.license) && AbstractC7890e.billing(this.appmetrica, podcastsBlock.appmetrica) && AbstractC7890e.billing(this.purchase, podcastsBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.amazon;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PodcastsBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", podcast_items_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$RadioStationsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class RadioStationsBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public RadioStationsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            if (list == null) {
                return C13664e.f27089e;
            }
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            return arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RadioStationsBlock)) {
                return false;
            }
            RadioStationsBlock radioStationsBlock = (RadioStationsBlock) obj;
            return AbstractC7890e.billing(this.ad, radioStationsBlock.ad) && AbstractC7890e.billing(this.vip, radioStationsBlock.vip) && AbstractC7890e.billing(this.metrica, radioStationsBlock.metrica) && AbstractC7890e.billing(this.license, radioStationsBlock.license) && AbstractC7890e.billing(this.appmetrica, radioStationsBlock.appmetrica) && AbstractC7890e.billing(this.purchase, radioStationsBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.pro;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RadioStationsBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", radio_stations_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$RecommendedPlaylistsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class RecommendedPlaylistsBlock extends Catalog2Block {
        public final String ad;
        public final String appmetrica;
        public final List billing;
        public final List license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public RecommendedPlaylistsBlock(String str, Catalog2Layout catalog2Layout, List list, List list2, String str2, List list3, List list4) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = list2;
            this.appmetrica = str2;
            this.purchase = list3;
            this.billing = list4;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.billing;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecommendedPlaylistsBlock)) {
                return false;
            }
            RecommendedPlaylistsBlock recommendedPlaylistsBlock = (RecommendedPlaylistsBlock) obj;
            return AbstractC7890e.billing(this.ad, recommendedPlaylistsBlock.ad) && AbstractC7890e.billing(this.vip, recommendedPlaylistsBlock.vip) && AbstractC7890e.billing(this.metrica, recommendedPlaylistsBlock.metrica) && AbstractC7890e.billing(this.license, recommendedPlaylistsBlock.license) && AbstractC7890e.billing(this.appmetrica, recommendedPlaylistsBlock.appmetrica) && AbstractC7890e.billing(this.purchase, recommendedPlaylistsBlock.purchase) && AbstractC7890e.billing(this.billing, recommendedPlaylistsBlock.billing);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.license;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.appmetrica;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List list3 = this.purchase;
            int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List list4 = this.billing;
            return hashCode4 + (list4 != null ? list4.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.admob;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecommendedPlaylistsBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", listen_events=");
            sb.append(this.license);
            sb.append(", next_from=");
            sb.append(this.appmetrica);
            sb.append(", audios_ids=");
            sb.append(this.purchase);
            sb.append(", playlists_ids=");
            return AbstractC1786e.tapsense(sb, this.billing, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$SearchSuggestionsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class SearchSuggestionsBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public /* synthetic */ SearchSuggestionsBlock(int i, String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this(str, (i & 8) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, catalog2Layout);
        }

        public SearchSuggestionsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchSuggestionsBlock)) {
                return false;
            }
            SearchSuggestionsBlock searchSuggestionsBlock = (SearchSuggestionsBlock) obj;
            return AbstractC7890e.billing(this.ad, searchSuggestionsBlock.ad) && AbstractC7890e.billing(this.vip, searchSuggestionsBlock.vip) && AbstractC7890e.billing(this.metrica, searchSuggestionsBlock.metrica) && AbstractC7890e.billing(this.license, searchSuggestionsBlock.license) && AbstractC7890e.billing(this.appmetrica, searchSuggestionsBlock.appmetrica) && AbstractC7890e.billing(this.purchase, searchSuggestionsBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.purchase;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchSuggestionsBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", suggestions_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$TextsBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class TextsBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public /* synthetic */ TextsBlock(int i, String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            this(str, (i & 8) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, catalog2Layout);
        }

        public TextsBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextsBlock)) {
                return false;
            }
            TextsBlock textsBlock = (TextsBlock) obj;
            return AbstractC7890e.billing(this.ad, textsBlock.ad) && AbstractC7890e.billing(this.vip, textsBlock.vip) && AbstractC7890e.billing(this.metrica, textsBlock.metrica) && AbstractC7890e.billing(this.license, textsBlock.license) && AbstractC7890e.billing(this.appmetrica, textsBlock.appmetrica) && AbstractC7890e.billing(this.purchase, textsBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.mopub;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextsBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", text_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block$VideosBlock;", "Lua/itaysonlab/catalogkit/objects/seals/Catalog2Block;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class VideosBlock extends Catalog2Block {
        public final String ad;
        public final List appmetrica;
        public final String license;
        public final List metrica;
        public final List purchase;
        public final Catalog2Layout vip;

        public VideosBlock(String str, String str2, List list, List list2, List list3, Catalog2Layout catalog2Layout) {
            super(0);
            this.ad = str;
            this.vip = catalog2Layout;
            this.metrica = list;
            this.license = str2;
            this.appmetrica = list2;
            this.purchase = list3;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: ad, reason: from getter */
        public final List getMetrica() {
            return this.metrica;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final List appmetrica() {
            List list = this.purchase;
            return list == null ? C13664e.f27089e : list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideosBlock)) {
                return false;
            }
            VideosBlock videosBlock = (VideosBlock) obj;
            return AbstractC7890e.billing(this.ad, videosBlock.ad) && AbstractC7890e.billing(this.vip, videosBlock.vip) && AbstractC7890e.billing(this.metrica, videosBlock.metrica) && AbstractC7890e.billing(this.license, videosBlock.license) && AbstractC7890e.billing(this.appmetrica, videosBlock.appmetrica) && AbstractC7890e.billing(this.purchase, videosBlock.purchase);
        }

        public final int hashCode() {
            int startapp = AbstractC17861e.startapp(this.vip, this.ad.hashCode() * 31, 31);
            List list = this.metrica;
            int hashCode = (startapp + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.license;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List list2 = this.appmetrica;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.purchase;
            return hashCode3 + (list3 != null ? list3.hashCode() : 0);
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: license, reason: from getter */
        public final Catalog2Layout getVip() {
            return this.vip;
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        public final Map metrica(C3675e c3675e) {
            return c3675e.metrica;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideosBlock(id=");
            sb.append(this.ad);
            sb.append(", layout=");
            sb.append(this.vip);
            sb.append(", actions=");
            sb.append(this.metrica);
            sb.append(", next_from=");
            sb.append(this.license);
            sb.append(", listen_events=");
            sb.append(this.appmetrica);
            sb.append(", videos_ids=");
            return AbstractC1786e.tapsense(sb, this.purchase, ')');
        }

        @Override // ua.itaysonlab.catalogkit.objects.seals.Catalog2Block
        /* renamed from: vip, reason: from getter */
        public final String getAd() {
            return this.ad;
        }
    }

    private Catalog2Block() {
    }

    public /* synthetic */ Catalog2Block(int i) {
        this();
    }

    /* renamed from: ad */
    public abstract List getMetrica();

    public abstract List appmetrica();

    /* renamed from: license */
    public abstract Catalog2Layout getVip();

    public abstract Map metrica(C3675e c3675e);

    /* renamed from: vip */
    public abstract String getAd();
}
