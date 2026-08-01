package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC10257e;
import defpackage.AbstractC17861e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC4653e;
import defpackage.AbstractC7890e;
import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBook;", "Leُٕؓ;", "Link", "Chapter", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AudioBook implements InterfaceC15377e {
    public final String Signature;
    public final int ad;
    public final int adcel;
    public final List admob;
    public final boolean advert;
    public final int amazon;
    public final List appmetrica;
    public final String billing;
    public final List license;
    public final String loadAd;
    public final List metrica;
    public final boolean mopub;
    public final List purchase;
    public final String remoteconfig;
    public final int smaato;
    public final int startapp;
    public final List subscription;
    public final Link vip;
    public final String yandex;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBook$Chapter;", BuildConfig.FLAVOR, "AudioFile", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Chapter {
        public final String ad;
        public final String appmetrica;
        public final int license;
        public final String metrica;
        public final AudioFile purchase;
        public final String vip;

        /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
        @InterfaceC3919e(generateAdapter = true)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBook$Chapter$AudioFile;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class AudioFile {
            public final String ad;
            public final long metrica;
            public final int vip;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public /* synthetic */ AudioFile(int r2, int r3, long r4, java.lang.String r6) {
                /*
                    r1 = this;
                    r0 = r3 & 1
                    if (r0 == 0) goto L6
                    java.lang.String r6 = ""
                L6:
                    r0 = r3 & 2
                    if (r0 == 0) goto Lb
                    r2 = 0
                Lb:
                    r3 = r3 & 4
                    if (r3 == 0) goto L11
                    r4 = 0
                L11:
                    r1.<init>(r4, r2, r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ua.itaysonlab.vkapi2.objects.music.AudioBook.Chapter.AudioFile.<init>(int, int, long, java.lang.String):void");
            }

            public AudioFile(long j, int i, String str) {
                this.ad = str;
                this.vip = i;
                this.metrica = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AudioFile)) {
                    return false;
                }
                AudioFile audioFile = (AudioFile) obj;
                return AbstractC7890e.billing(this.ad, audioFile.ad) && this.vip == audioFile.vip && this.metrica == audioFile.metrica;
            }

            public final int hashCode() {
                int hashCode = ((this.ad.hashCode() * 31) + this.vip) * 31;
                long j = this.metrica;
                return hashCode + ((int) (j ^ (j >>> 32)));
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AudioFile(url=");
                sb.append(this.ad);
                sb.append(", duration=");
                sb.append(this.vip);
                sb.append(", file_size=");
                return AbstractC10257e.mopub(sb, this.metrica, ')');
            }
        }

        public Chapter(String str, String str2, String str3, int i, String str4, AudioFile audioFile) {
            this.ad = str;
            this.vip = str2;
            this.metrica = str3;
            this.license = i;
            this.appmetrica = str4;
            this.purchase = audioFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chapter)) {
                return false;
            }
            Chapter chapter = (Chapter) obj;
            return AbstractC7890e.billing(this.ad, chapter.ad) && AbstractC7890e.billing(this.vip, chapter.vip) && AbstractC7890e.billing(this.metrica, chapter.metrica) && this.license == chapter.license && AbstractC7890e.billing(this.appmetrica, chapter.appmetrica) && AbstractC7890e.billing(this.purchase, chapter.purchase);
        }

        public final int hashCode() {
            return this.purchase.hashCode() + AbstractC1786e.advert((AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica) + this.license) * 31, 31, this.appmetrica);
        }

        public final String toString() {
            return "Chapter(id=" + this.ad + ", title=" + this.vip + ", progress_status=" + this.metrica + ", progress_time=" + this.license + ", track_code=" + this.appmetrica + ", audio_file=" + this.purchase + ')';
        }
    }

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @InterfaceC3919e(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBook$Link;", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Link {
        public final int ad;
        public final String vip;

        public Link(int i, String str) {
            this.ad = i;
            this.vip = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return this.ad == link.ad && AbstractC7890e.billing(this.vip, link.vip);
        }

        public final int hashCode() {
            return this.vip.hashCode() + (this.ad * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Link(id=");
            sb.append(this.ad);
            sb.append(", name=");
            return AbstractC4653e.applovin(sb, this.vip, ')');
        }
    }

    public AudioBook(int i, Link link, List list, List list2, List list3, List list4, String str, String str2, int i2, int i3, boolean z, boolean z2, int i4, int i5, String str3, String str4, List list5, List list6, String str5) {
        this.ad = i;
        this.vip = link;
        this.metrica = list;
        this.license = list2;
        this.appmetrica = list3;
        this.purchase = list4;
        this.billing = str;
        this.yandex = str2;
        this.startapp = i2;
        this.adcel = i3;
        this.mopub = z;
        this.advert = z2;
        this.smaato = i4;
        this.amazon = i5;
        this.loadAd = str3;
        this.Signature = str4;
        this.admob = list5;
        this.subscription = list6;
        this.remoteconfig = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBook)) {
            return false;
        }
        AudioBook audioBook = (AudioBook) obj;
        return this.ad == audioBook.ad && AbstractC7890e.billing(this.vip, audioBook.vip) && AbstractC7890e.billing(this.metrica, audioBook.metrica) && AbstractC7890e.billing(this.license, audioBook.license) && AbstractC7890e.billing(this.appmetrica, audioBook.appmetrica) && AbstractC7890e.billing(this.purchase, audioBook.purchase) && AbstractC7890e.billing(this.billing, audioBook.billing) && AbstractC7890e.billing(this.yandex, audioBook.yandex) && this.startapp == audioBook.startapp && this.adcel == audioBook.adcel && this.mopub == audioBook.mopub && this.advert == audioBook.advert && this.smaato == audioBook.smaato && this.amazon == audioBook.amazon && AbstractC7890e.billing(this.loadAd, audioBook.loadAd) && AbstractC7890e.billing(this.Signature, audioBook.Signature) && AbstractC7890e.billing(this.admob, audioBook.admob) && AbstractC7890e.billing(this.subscription, audioBook.subscription) && AbstractC7890e.billing(this.remoteconfig, audioBook.remoteconfig);
    }

    @Override // defpackage.InterfaceC15377e
    /* renamed from: getItemId */
    public final String getAd() {
        return String.valueOf(this.ad);
    }

    public final int hashCode() {
        return this.remoteconfig.hashCode() + AbstractC17861e.billing(AbstractC17861e.billing(AbstractC1786e.advert(AbstractC1786e.advert((((((((((((AbstractC1786e.advert(AbstractC1786e.advert(AbstractC17861e.billing(AbstractC17861e.billing(AbstractC17861e.billing(AbstractC17861e.billing((this.vip.hashCode() + (this.ad * 31)) * 31, 31, this.metrica), 31, this.license), 31, this.appmetrica), 31, this.purchase), 31, this.billing), 31, this.yandex) + this.startapp) * 31) + this.adcel) * 31) + (this.mopub ? 1231 : 1237)) * 31) + (this.advert ? 1231 : 1237)) * 31) + this.smaato) * 31) + this.amazon) * 31, 31, this.loadAd), 31, this.Signature), 31, this.admob), 31, this.subscription);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBook(id=");
        sb.append(this.ad);
        sb.append(", publisher=");
        sb.append(this.vip);
        sb.append(", narrators=");
        sb.append(this.metrica);
        sb.append(", translators=");
        sb.append(this.license);
        sb.append(", genres=");
        sb.append(this.appmetrica);
        sb.append(", authors=");
        sb.append(this.purchase);
        sb.append(", code=");
        sb.append(this.billing);
        sb.append(", title=");
        sb.append(this.yandex);
        sb.append(", duration=");
        sb.append(this.startapp);
        sb.append(", minimum_age=");
        sb.append(this.adcel);
        sb.append(", is_explicit=");
        sb.append(this.mopub);
        sb.append(", in_favorites=");
        sb.append(this.advert);
        sb.append(", progress_percentage=");
        sb.append(this.smaato);
        sb.append(", release_date=");
        sb.append(this.amazon);
        sb.append(", copyright=");
        sb.append(this.loadAd);
        sb.append(", access_status=");
        sb.append(this.Signature);
        sb.append(", cover=");
        sb.append(this.admob);
        sb.append(", chapters=");
        sb.append(this.subscription);
        sb.append(", track_code=");
        return AbstractC4653e.applovin(sb, this.remoteconfig, ')');
    }
}
