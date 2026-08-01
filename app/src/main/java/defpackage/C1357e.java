package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؒ۟٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1357e {
    public static final C10000e Companion = new Object();
    public static final InterfaceC3477e[] signatures = {null, null, null, null, null, null, null, null, null, AbstractC18039e.appmetrica(2, new C9283e(26)), AbstractC18039e.appmetrica(2, new C9283e(27)), AbstractC18039e.appmetrica(2, new C9283e(28)), AbstractC18039e.appmetrica(2, new C9283e(29)), null, null, AbstractC18039e.appmetrica(2, new C14561e(0)), null, null, null, null};
    public final List Signature;
    public final String ad;
    public final List adcel;
    public final String admob;
    public final List advert;
    public final String amazon;
    public final boolean appmetrica;
    public final String billing;
    public final boolean license;
    public final String loadAd;
    public final int metrica;
    public final List mopub;
    public final C2035e pro;
    public final String purchase;
    public final String remoteconfig;
    public final List smaato;
    public final String startapp;
    public final String subscription;
    public final String vip;
    public final String yandex;

    public /* synthetic */ C1357e(int i, String str, String str2, int i2, boolean z, boolean z2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, String str7, String str8, List list5, String str9, String str10, String str11, C2035e c2035e) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C16093e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = str2;
        if ((i & 4) == 0) {
            this.metrica = 0;
        } else {
            this.metrica = i2;
        }
        if ((i & 8) == 0) {
            this.license = false;
        } else {
            this.license = z;
        }
        if ((i & 16) == 0) {
            this.appmetrica = false;
        } else {
            this.appmetrica = z2;
        }
        if ((i & 32) == 0) {
            this.purchase = BuildConfig.FLAVOR;
        } else {
            this.purchase = str3;
        }
        if ((i & 64) == 0) {
            this.billing = BuildConfig.FLAVOR;
        } else {
            this.billing = str4;
        }
        if ((i & 128) == 0) {
            this.yandex = BuildConfig.FLAVOR;
        } else {
            this.yandex = str5;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = BuildConfig.FLAVOR;
        } else {
            this.startapp = str6;
        }
        int i3 = i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
        C13664e c13664e = C13664e.f27089e;
        if (i3 == 0) {
            this.adcel = c13664e;
        } else {
            this.adcel = list;
        }
        if ((i & 1024) == 0) {
            this.mopub = c13664e;
        } else {
            this.mopub = list2;
        }
        if ((i & 2048) == 0) {
            this.advert = c13664e;
        } else {
            this.advert = list3;
        }
        if ((i & 4096) == 0) {
            this.smaato = c13664e;
        } else {
            this.smaato = list4;
        }
        if ((i & 8192) == 0) {
            this.amazon = BuildConfig.FLAVOR;
        } else {
            this.amazon = str7;
        }
        if ((i & 16384) == 0) {
            this.loadAd = BuildConfig.FLAVOR;
        } else {
            this.loadAd = str8;
        }
        if ((32768 & i) == 0) {
            this.Signature = c13664e;
        } else {
            this.Signature = list5;
        }
        if ((65536 & i) == 0) {
            this.admob = BuildConfig.FLAVOR;
        } else {
            this.admob = str9;
        }
        if ((131072 & i) == 0) {
            this.subscription = BuildConfig.FLAVOR;
        } else {
            this.subscription = str10;
        }
        if ((262144 & i) == 0) {
            this.remoteconfig = BuildConfig.FLAVOR;
        } else {
            this.remoteconfig = str11;
        }
        if ((i & 524288) == 0) {
            this.pro = null;
        } else {
            this.pro = c2035e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1357e)) {
            return false;
        }
        C1357e c1357e = (C1357e) obj;
        return AbstractC7890e.billing(this.ad, c1357e.ad) && AbstractC7890e.billing(this.vip, c1357e.vip) && this.metrica == c1357e.metrica && this.license == c1357e.license && this.appmetrica == c1357e.appmetrica && AbstractC7890e.billing(this.purchase, c1357e.purchase) && AbstractC7890e.billing(this.billing, c1357e.billing) && AbstractC7890e.billing(this.yandex, c1357e.yandex) && AbstractC7890e.billing(this.startapp, c1357e.startapp) && AbstractC7890e.billing(this.adcel, c1357e.adcel) && AbstractC7890e.billing(this.mopub, c1357e.mopub) && AbstractC7890e.billing(this.advert, c1357e.advert) && AbstractC7890e.billing(this.smaato, c1357e.smaato) && AbstractC7890e.billing(this.amazon, c1357e.amazon) && AbstractC7890e.billing(this.loadAd, c1357e.loadAd) && AbstractC7890e.billing(this.Signature, c1357e.Signature) && AbstractC7890e.billing(this.admob, c1357e.admob) && AbstractC7890e.billing(this.subscription, c1357e.subscription) && AbstractC7890e.billing(this.remoteconfig, c1357e.remoteconfig) && AbstractC7890e.billing(this.pro, c1357e.pro);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC17861e.billing(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC17861e.billing(AbstractC17861e.billing(AbstractC17861e.billing(AbstractC17861e.billing(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert((((((AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip) + this.metrica) * 31) + (this.license ? 1231 : 1237)) * 31) + (this.appmetrica ? 1231 : 1237)) * 31, 31, this.purchase), 31, this.billing), 31, this.yandex), 31, this.startapp), 31, this.adcel), 31, this.mopub), 31, this.advert), 31, this.smaato), 31, this.amazon), 31, this.loadAd), 31, this.Signature), 31, this.admob), 31, this.subscription), 31, this.remoteconfig);
        C2035e c2035e = this.pro;
        return advert + (c2035e == null ? 0 : c2035e.hashCode());
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("AudioGetAnnualResultBlockDto(name=", this.ad, ", type=", this.vip, ", order=");
        tapsense.append(this.metrica);
        tapsense.append(", isVisible=");
        tapsense.append(this.license);
        tapsense.append(", isSharingEnabled=");
        tapsense.append(this.appmetrica);
        tapsense.append(", backgroundUrl=");
        tapsense.append(this.purchase);
        tapsense.append(", storyBg=");
        AbstractC13501e.Signature(tapsense, this.billing, ", fallbackBackgroundUrl=", this.yandex, ", audioPreviewUrl=");
        tapsense.append(this.startapp);
        tapsense.append(", titles=");
        tapsense.append(this.adcel);
        tapsense.append(", subtitles=");
        tapsense.append(this.mopub);
        tapsense.append(", metrics=");
        tapsense.append(this.advert);
        tapsense.append(", photoUrls=");
        tapsense.append(this.smaato);
        tapsense.append(", playlistPhotoUrl=");
        tapsense.append(this.amazon);
        tapsense.append(", playlistTitle=");
        tapsense.append(this.loadAd);
        tapsense.append(", playlistAudioRawIds=");
        tapsense.append(this.Signature);
        tapsense.append(", screenCaption=");
        AbstractC13501e.Signature(tapsense, this.admob, ", screenTitle=", this.subscription, ", screenSubtitle=");
        tapsense.append(this.remoteconfig);
        tapsense.append(", artist=");
        tapsense.append(this.pro);
        tapsense.append(")");
        return tapsense.toString();
    }
}
