package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC1786e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioPlaylistSnippetEntry;", BuildConfig.FLAVOR, "StreamUrl", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioPlaylistSnippetEntry {
    public final AudioTrack ad;
    public final StreamUrl vip;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioPlaylistSnippetEntry$StreamUrl;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class StreamUrl {
        public final String ad;
        public final int metrica;
        public final int vip;

        public StreamUrl(String str, int i, int i2) {
            this.ad = str;
            this.vip = i;
            this.metrica = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StreamUrl)) {
                return false;
            }
            StreamUrl streamUrl = (StreamUrl) obj;
            return AbstractC7890e.billing(this.ad, streamUrl.ad) && this.vip == streamUrl.vip && this.metrica == streamUrl.metrica;
        }

        public final int hashCode() {
            return (((this.ad.hashCode() * 31) + this.vip) * 31) + this.metrica;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StreamUrl(url=");
            sb.append(this.ad);
            sb.append(", clip_from=");
            sb.append(this.vip);
            sb.append(", clip_to=");
            return AbstractC1786e.pro(sb, this.metrica, ')');
        }
    }

    public AudioPlaylistSnippetEntry(AudioTrack audioTrack, StreamUrl streamUrl) {
        this.ad = audioTrack;
        this.vip = streamUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPlaylistSnippetEntry)) {
            return false;
        }
        AudioPlaylistSnippetEntry audioPlaylistSnippetEntry = (AudioPlaylistSnippetEntry) obj;
        return AbstractC7890e.billing(this.ad, audioPlaylistSnippetEntry.ad) && AbstractC7890e.billing(this.vip, audioPlaylistSnippetEntry.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "AudioPlaylistSnippetEntry(track=" + this.ad + ", stream_url=" + this.vip + ')';
    }
}
