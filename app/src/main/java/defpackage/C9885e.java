package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9885e {
    public static final C4078e Companion = new Object();

    /* renamed from: default, reason: not valid java name */
    public static final InterfaceC3477e[] f19484default = {null, null, AbstractC18039e.appmetrica(2, new C14561e(20)), null, null, null, null, null, null, null, null, AbstractC18039e.appmetrica(2, new C14561e(21)), null, null, AbstractC18039e.appmetrica(2, new C14561e(22)), null, null, null, null, null, null, null, null, AbstractC18039e.appmetrica(2, new C14561e(23)), null, null, null, null, null, AbstractC18039e.appmetrica(2, new C14561e(24)), AbstractC18039e.appmetrica(2, new C14561e(25)), null, AbstractC18039e.appmetrica(2, new C14561e(26)), AbstractC18039e.appmetrica(2, new C14561e(27)), null, null, null, null, null, AbstractC18039e.appmetrica(2, new C14561e(28)), null, null, null};
    public final Boolean Signature;

    /* renamed from: abstract, reason: not valid java name */
    public final String f19485abstract;
    public final int ad;
    public final int adcel;
    public final Integer admob;
    public final String ads;
    public final List advert;
    public final Boolean amazon;
    public final Integer applovin;
    public final String appmetrica;
    public final int billing;

    /* renamed from: break, reason: not valid java name */
    public final Boolean f19486break;

    /* renamed from: class, reason: not valid java name */
    public final String f19487class;
    public final List crashlytics;

    /* renamed from: extends, reason: not valid java name */
    public final String f19488extends;
    public final List firebase;

    /* renamed from: goto, reason: not valid java name */
    public final EnumC3616e f19489goto;
    public final List inmobi;

    /* renamed from: interface, reason: not valid java name */
    public final List f19490interface;
    public final String isPro;
    public final Boolean isVip;
    public final String license;
    public final List loadAd;
    public final EnumC4165e metrica;
    public final Integer mopub;

    /* renamed from: native, reason: not valid java name */
    public final C0448e f19491native;
    public final Integer premium;
    public final C18236e pro;

    /* renamed from: protected, reason: not valid java name */
    public final Float f19492protected;
    public final int purchase;
    public final C9656e remoteconfig;
    public final C4945e signatures;
    public final Boolean smaato;
    public final int startapp;
    public final Boolean subs;
    public final C9656e subscription;
    public final Boolean tapsense;

    /* renamed from: this, reason: not valid java name */
    public final C17575e f19493this;

    /* renamed from: throw, reason: not valid java name */
    public final C4742e f19494throw;

    /* renamed from: try, reason: not valid java name */
    public final List f19495try;
    public final long vip;

    /* renamed from: while, reason: not valid java name */
    public final Float f19496while;
    public final int yandex;

    public /* synthetic */ C9885e(int i, int i2, int i3, C5655e c5655e, EnumC4165e enumC4165e, String str, String str2, int i4, int i5, int i6, int i7, int i8, Integer num, List list, Boolean bool, Boolean bool2, List list2, Boolean bool3, Integer num2, C9656e c9656e, C9656e c9656e2, C18236e c18236e, C4945e c4945e, Boolean bool4, Boolean bool5, List list3, String str3, Integer num3, String str4, Integer num4, Boolean bool6, List list4, List list5, String str5, List list6, EnumC3616e enumC3616e, C17575e c17575e, C0448e c0448e, String str6, C4742e c4742e, Float f, List list7, Float f2, Boolean bool7, String str7) {
        if (1023 != (i & 1023)) {
            AbstractC5756e.purchase(new int[]{i, i2}, new int[]{1023, 0}, C1471e.ad.appmetrica());
            throw null;
        }
        this.ad = i3;
        this.vip = c5655e.ad;
        this.metrica = enumC4165e;
        this.license = str;
        this.appmetrica = str2;
        this.purchase = i4;
        this.billing = i5;
        this.yandex = i6;
        this.startapp = i7;
        this.adcel = i8;
        if ((i & 1024) == 0) {
            this.mopub = null;
        } else {
            this.mopub = num;
        }
        if ((i & 2048) == 0) {
            this.advert = null;
        } else {
            this.advert = list;
        }
        if ((i & 4096) == 0) {
            this.smaato = null;
        } else {
            this.smaato = bool;
        }
        if ((i & 8192) == 0) {
            this.amazon = null;
        } else {
            this.amazon = bool2;
        }
        if ((i & 16384) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = list2;
        }
        if ((32768 & i) == 0) {
            this.Signature = null;
        } else {
            this.Signature = bool3;
        }
        if ((65536 & i) == 0) {
            this.admob = null;
        } else {
            this.admob = num2;
        }
        if ((131072 & i) == 0) {
            this.subscription = null;
        } else {
            this.subscription = c9656e;
        }
        if ((262144 & i) == 0) {
            this.remoteconfig = null;
        } else {
            this.remoteconfig = c9656e2;
        }
        if ((524288 & i) == 0) {
            this.pro = null;
        } else {
            this.pro = c18236e;
        }
        if ((1048576 & i) == 0) {
            this.signatures = null;
        } else {
            this.signatures = c4945e;
        }
        if ((2097152 & i) == 0) {
            this.tapsense = null;
        } else {
            this.tapsense = bool4;
        }
        if ((4194304 & i) == 0) {
            this.isVip = null;
        } else {
            this.isVip = bool5;
        }
        if ((8388608 & i) == 0) {
            this.inmobi = null;
        } else {
            this.inmobi = list3;
        }
        if ((16777216 & i) == 0) {
            this.isPro = null;
        } else {
            this.isPro = str3;
        }
        if ((33554432 & i) == 0) {
            this.applovin = null;
        } else {
            this.applovin = num3;
        }
        if ((67108864 & i) == 0) {
            this.ads = null;
        } else {
            this.ads = str4;
        }
        if ((134217728 & i) == 0) {
            this.premium = null;
        } else {
            this.premium = num4;
        }
        if ((268435456 & i) == 0) {
            this.subs = null;
        } else {
            this.subs = bool6;
        }
        if ((536870912 & i) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = list4;
        }
        if ((1073741824 & i) == 0) {
            this.firebase = null;
        } else {
            this.firebase = list5;
        }
        if ((i & RecyclerView.UNDEFINED_DURATION) == 0) {
            this.f19487class = null;
        } else {
            this.f19487class = str5;
        }
        if ((i2 & 1) == 0) {
            this.f19490interface = null;
        } else {
            this.f19490interface = list6;
        }
        if ((i2 & 2) == 0) {
            this.f19489goto = null;
        } else {
            this.f19489goto = enumC3616e;
        }
        if ((i2 & 4) == 0) {
            this.f19493this = null;
        } else {
            this.f19493this = c17575e;
        }
        if ((i2 & 8) == 0) {
            this.f19491native = null;
        } else {
            this.f19491native = c0448e;
        }
        if ((i2 & 16) == 0) {
            this.f19488extends = null;
        } else {
            this.f19488extends = str6;
        }
        if ((i2 & 32) == 0) {
            this.f19494throw = null;
        } else {
            this.f19494throw = c4742e;
        }
        if ((i2 & 64) == 0) {
            this.f19496while = null;
        } else {
            this.f19496while = f;
        }
        if ((i2 & 128) == 0) {
            this.f19495try = null;
        } else {
            this.f19495try = list7;
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.f19492protected = null;
        } else {
            this.f19492protected = f2;
        }
        if ((i2 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.f19486break = null;
        } else {
            this.f19486break = bool7;
        }
        if ((i2 & 1024) == 0) {
            this.f19485abstract = null;
        } else {
            this.f19485abstract = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9885e)) {
            return false;
        }
        C9885e c9885e = (C9885e) obj;
        return this.ad == c9885e.ad && C5655e.ad(this.vip, c9885e.vip) && this.metrica == c9885e.metrica && AbstractC7890e.billing(this.license, c9885e.license) && AbstractC7890e.billing(this.appmetrica, c9885e.appmetrica) && this.purchase == c9885e.purchase && this.billing == c9885e.billing && this.yandex == c9885e.yandex && this.startapp == c9885e.startapp && this.adcel == c9885e.adcel && AbstractC7890e.billing(this.mopub, c9885e.mopub) && AbstractC7890e.billing(this.advert, c9885e.advert) && AbstractC7890e.billing(this.smaato, c9885e.smaato) && AbstractC7890e.billing(this.amazon, c9885e.amazon) && AbstractC7890e.billing(this.loadAd, c9885e.loadAd) && AbstractC7890e.billing(this.Signature, c9885e.Signature) && AbstractC7890e.billing(this.admob, c9885e.admob) && AbstractC7890e.billing(this.subscription, c9885e.subscription) && AbstractC7890e.billing(this.remoteconfig, c9885e.remoteconfig) && AbstractC7890e.billing(this.pro, c9885e.pro) && AbstractC7890e.billing(this.signatures, c9885e.signatures) && AbstractC7890e.billing(this.tapsense, c9885e.tapsense) && AbstractC7890e.billing(this.isVip, c9885e.isVip) && AbstractC7890e.billing(this.inmobi, c9885e.inmobi) && AbstractC7890e.billing(this.isPro, c9885e.isPro) && AbstractC7890e.billing(this.applovin, c9885e.applovin) && AbstractC7890e.billing(this.ads, c9885e.ads) && AbstractC7890e.billing(this.premium, c9885e.premium) && AbstractC7890e.billing(this.subs, c9885e.subs) && AbstractC7890e.billing(this.crashlytics, c9885e.crashlytics) && AbstractC7890e.billing(this.firebase, c9885e.firebase) && AbstractC7890e.billing(this.f19487class, c9885e.f19487class) && AbstractC7890e.billing(this.f19490interface, c9885e.f19490interface) && this.f19489goto == c9885e.f19489goto && AbstractC7890e.billing(this.f19493this, c9885e.f19493this) && AbstractC7890e.billing(this.f19491native, c9885e.f19491native) && AbstractC7890e.billing(this.f19488extends, c9885e.f19488extends) && AbstractC7890e.billing(this.f19494throw, c9885e.f19494throw) && AbstractC7890e.billing(this.f19496while, c9885e.f19496while) && AbstractC7890e.billing(this.f19495try, c9885e.f19495try) && AbstractC7890e.billing(this.f19492protected, c9885e.f19492protected) && AbstractC7890e.billing(this.f19486break, c9885e.f19486break) && AbstractC7890e.billing(this.f19485abstract, c9885e.f19485abstract);
    }

    public final int hashCode() {
        int advert = (((((((((AbstractC1786e.advert(AbstractC1786e.advert((this.metrica.hashCode() + ((C5655e.vip(this.vip) + (this.ad * 31)) * 31)) * 31, 31, this.license), 31, this.appmetrica) + this.purchase) * 31) + this.billing) * 31) + this.yandex) * 31) + this.startapp) * 31) + this.adcel) * 31;
        Integer num = this.mopub;
        int hashCode = (advert + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.advert;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.smaato;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.amazon;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list2 = this.loadAd;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool3 = this.Signature;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.admob;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C9656e c9656e = this.subscription;
        int hashCode8 = (hashCode7 + (c9656e == null ? 0 : c9656e.hashCode())) * 31;
        C9656e c9656e2 = this.remoteconfig;
        int hashCode9 = (hashCode8 + (c9656e2 == null ? 0 : c9656e2.hashCode())) * 31;
        C18236e c18236e = this.pro;
        int hashCode10 = (hashCode9 + (c18236e == null ? 0 : c18236e.hashCode())) * 31;
        C4945e c4945e = this.signatures;
        int hashCode11 = (hashCode10 + (c4945e == null ? 0 : c4945e.hashCode())) * 31;
        Boolean bool4 = this.tapsense;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isVip;
        int hashCode13 = (hashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List list3 = this.inmobi;
        int hashCode14 = (hashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.isPro;
        int hashCode15 = (hashCode14 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.applovin;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.ads;
        int hashCode17 = (hashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.premium;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool6 = this.subs;
        int hashCode19 = (hashCode18 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        List list4 = this.crashlytics;
        int hashCode20 = (hashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.firebase;
        int hashCode21 = (hashCode20 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str3 = this.f19487class;
        int hashCode22 = (hashCode21 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list6 = this.f19490interface;
        int hashCode23 = (hashCode22 + (list6 == null ? 0 : list6.hashCode())) * 31;
        EnumC3616e enumC3616e = this.f19489goto;
        int hashCode24 = (hashCode23 + (enumC3616e == null ? 0 : enumC3616e.hashCode())) * 31;
        C17575e c17575e = this.f19493this;
        int hashCode25 = (hashCode24 + (c17575e == null ? 0 : c17575e.hashCode())) * 31;
        C0448e c0448e = this.f19491native;
        int hashCode26 = (hashCode25 + (c0448e == null ? 0 : c0448e.hashCode())) * 31;
        String str4 = this.f19488extends;
        int hashCode27 = (hashCode26 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C4742e c4742e = this.f19494throw;
        int hashCode28 = (hashCode27 + (c4742e == null ? 0 : c4742e.hashCode())) * 31;
        Float f = this.f19496while;
        int hashCode29 = (hashCode28 + (f == null ? 0 : f.hashCode())) * 31;
        List list7 = this.f19495try;
        int hashCode30 = (hashCode29 + (list7 == null ? 0 : list7.hashCode())) * 31;
        Float f2 = this.f19492protected;
        int hashCode31 = (hashCode30 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Boolean bool7 = this.f19486break;
        int hashCode32 = (hashCode31 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str5 = this.f19485abstract;
        return hashCode32 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.vip);
        StringBuilder sb = new StringBuilder("AudioPlaylistDto(id=");
        sb.append(this.ad);
        sb.append(", ownerId=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(this.metrica);
        sb.append(", title=");
        sb.append(this.license);
        sb.append(", description=");
        sb.append(this.appmetrica);
        sb.append(", count=");
        sb.append(this.purchase);
        sb.append(", followers=");
        AbstractC10257e.signatures(sb, this.billing, ", plays=", this.yandex, ", createTime=");
        AbstractC10257e.signatures(sb, this.startapp, ", updateTime=", this.adcel, ", playlistId=");
        sb.append(this.mopub);
        sb.append(", genres=");
        sb.append(this.advert);
        sb.append(", isFollowing=");
        sb.append(this.smaato);
        sb.append(", noDiscover=");
        sb.append(this.amazon);
        sb.append(", audios=");
        sb.append(this.loadAd);
        sb.append(", isCurator=");
        sb.append(this.Signature);
        sb.append(", year=");
        sb.append(this.admob);
        sb.append(", original=");
        sb.append(this.subscription);
        sb.append(", followed=");
        sb.append(this.remoteconfig);
        sb.append(", photo=");
        sb.append(this.pro);
        sb.append(", permissions=");
        sb.append(this.signatures);
        sb.append(", subtitleBadge=");
        sb.append(this.tapsense);
        sb.append(", playButton=");
        sb.append(this.isVip);
        sb.append(", thumbs=");
        sb.append(this.inmobi);
        sb.append(", accessKey=");
        sb.append(this.isPro);
        sb.append(", umaAlbumId=");
        sb.append(this.applovin);
        sb.append(", subtitle=");
        sb.append(this.ads);
        sb.append(", originalYear=");
        sb.append(this.premium);
        sb.append(", isExplicit=");
        sb.append(this.subs);
        sb.append(", artists=");
        sb.append(this.crashlytics);
        sb.append(", mainArtists=");
        sb.append(this.firebase);
        sb.append(", mainArtist=");
        sb.append(this.f19487class);
        sb.append(", featuredArtists=");
        sb.append(this.f19490interface);
        sb.append(", albumType=");
        sb.append(this.f19489goto);
        sb.append(", meta=");
        sb.append(this.f19493this);
        sb.append(", restriction=");
        sb.append(this.f19491native);
        sb.append(", trackCode=");
        sb.append(this.f19488extends);
        sb.append(", audioChartInfo=");
        sb.append(this.f19494throw);
        sb.append(", matchScore=");
        sb.append(this.f19496while);
        sb.append(", actions=");
        sb.append(this.f19495try);
        sb.append(", audiosTotalFileSize=");
        sb.append(this.f19492protected);
        sb.append(", exclusive=");
        sb.append(this.f19486break);
        sb.append(", icon=");
        return AbstractC1786e.signatures(sb, this.f19485abstract, ")");
    }
}
