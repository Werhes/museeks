package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC1786e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioStreamMix;", "Leُٕؓ;", "Link", "Titles", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioStreamMix implements InterfaceC15377e {
    public final String ad;
    public final Boolean appmetrica;
    public final Link license;
    public final String metrica;
    public final Titles purchase;
    public final String vip;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioStreamMix$Link;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Link {
        public final String ad;
        public final String vip;

        public Link(String str, String str2) {
            this.ad = str;
            this.vip = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return AbstractC7890e.billing(this.ad, link.ad) && AbstractC7890e.billing(this.vip, link.vip);
        }

        public final int hashCode() {
            return this.vip.hashCode() + (this.ad.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Link(id=");
            sb.append(this.ad);
            sb.append(", title=");
            return AbstractC4653e.applovin(sb, this.vip, ')');
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioStreamMix$Titles;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Titles {
        public final String ad;
        public final String vip;

        public Titles(String str, String str2) {
            this.ad = str;
            this.vip = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Titles)) {
                return false;
            }
            Titles titles = (Titles) obj;
            return AbstractC7890e.billing(this.ad, titles.ad) && AbstractC7890e.billing(this.vip, titles.vip);
        }

        public final int hashCode() {
            return this.vip.hashCode() + (this.ad.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Titles(common_state=");
            sb.append(this.ad);
            sb.append(", playing_state=");
            return AbstractC4653e.applovin(sb, this.vip, ')');
        }
    }

    public AudioStreamMix(String str, String str2, String str3, Link link, Boolean bool, Titles titles) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = link;
        this.appmetrica = bool;
        this.purchase = titles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioStreamMix)) {
            return false;
        }
        AudioStreamMix audioStreamMix = (AudioStreamMix) obj;
        return AbstractC7890e.billing(this.ad, audioStreamMix.ad) && AbstractC7890e.billing(this.vip, audioStreamMix.vip) && AbstractC7890e.billing(this.metrica, audioStreamMix.metrica) && AbstractC7890e.billing(this.license, audioStreamMix.license) && AbstractC7890e.billing(this.appmetrica, audioStreamMix.appmetrica) && AbstractC7890e.billing(this.purchase, audioStreamMix.purchase);
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId, reason: from getter */
    public final String getAppmetrica() {
        return this.ad;
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica);
        Link link = this.license;
        int hashCode = (advert + (link == null ? 0 : link.hashCode())) * 31;
        Boolean bool = this.appmetrica;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Titles titles = this.purchase;
        return hashCode2 + (titles != null ? titles.hashCode() : 0);
    }

    public final String toString() {
        return "AudioStreamMix(id=" + this.ad + ", title=" + this.vip + ", description=" + this.metrica + ", stream_mix=" + this.license + ", is_tunable=" + this.appmetrica + ", titles=" + this.purchase + ')';
    }
}
