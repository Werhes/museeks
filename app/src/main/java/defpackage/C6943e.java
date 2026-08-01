package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؚؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6943e {
    public static final C9943e Companion = new Object();
    public static final InterfaceC3477e[] inmobi = {AbstractC18039e.appmetrica(2, new C9283e(11)), null, AbstractC18039e.appmetrica(2, new C9283e(12)), AbstractC18039e.appmetrica(2, new C9283e(13)), null, null, AbstractC18039e.appmetrica(2, new C9283e(14)), null, null, AbstractC18039e.appmetrica(2, new C9283e(15)), null, null, null, null, null, AbstractC18039e.appmetrica(2, new C9283e(16)), null, null, null, null, null, AbstractC18039e.appmetrica(2, new C9283e(17)), null};
    public final List Signature;
    public final EnumC10562e ad;
    public final List adcel;
    public final int admob;
    public final boolean advert;
    public final C3367e amazon;
    public final String appmetrica;
    public final List billing;
    public final int isVip;
    public final List license;
    public final Integer loadAd;
    public final List metrica;
    public final int mopub;
    public final String pro;
    public final String purchase;
    public final int remoteconfig;
    public final String signatures;
    public final boolean smaato;
    public final long startapp;
    public final C7715e subscription;
    public final List tapsense;
    public final String vip;
    public final int yandex;

    public /* synthetic */ C6943e(int i, EnumC10562e enumC10562e, String str, List list, List list2, String str2, String str3, List list3, int i2, long j, List list4, int i3, boolean z, boolean z2, C3367e c3367e, Integer num, List list5, int i4, C7715e c7715e, int i5, String str4, String str5, List list6, int i6) {
        if (132481 != (i & 132481)) {
            AbstractC5756e.billing(i, 132481, C4105e.ad.appmetrica());
            throw null;
        }
        this.ad = enumC10562e;
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str;
        }
        int i7 = i & 4;
        C13664e c13664e = C13664e.f27089e;
        if (i7 == 0) {
            this.metrica = c13664e;
        } else {
            this.metrica = list;
        }
        if ((i & 8) == 0) {
            this.license = c13664e;
        } else {
            this.license = list2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = str2;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str3;
        }
        if ((i & 64) == 0) {
            this.billing = c13664e;
        } else {
            this.billing = list3;
        }
        this.yandex = i2;
        this.startapp = j;
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.adcel = c13664e;
        } else {
            this.adcel = list4;
        }
        this.mopub = i3;
        if ((i & 2048) == 0) {
            this.advert = false;
        } else {
            this.advert = z;
        }
        if ((i & 4096) == 0) {
            this.smaato = false;
        } else {
            this.smaato = z2;
        }
        if ((i & 8192) == 0) {
            this.amazon = null;
        } else {
            this.amazon = c3367e;
        }
        if ((i & 16384) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = num;
        }
        if ((32768 & i) == 0) {
            this.Signature = c13664e;
        } else {
            this.Signature = list5;
        }
        if ((65536 & i) == 0) {
            this.admob = 0;
        } else {
            this.admob = i4;
        }
        this.subscription = c7715e;
        if ((262144 & i) == 0) {
            this.remoteconfig = 0;
        } else {
            this.remoteconfig = i5;
        }
        if ((524288 & i) == 0) {
            this.pro = null;
        } else {
            this.pro = str4;
        }
        if ((1048576 & i) == 0) {
            this.signatures = null;
        } else {
            this.signatures = str5;
        }
        if ((2097152 & i) == 0) {
            this.tapsense = c13664e;
        } else {
            this.tapsense = list6;
        }
        if ((i & 4194304) == 0) {
            this.isVip = 0;
        } else {
            this.isVip = i6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6943e)) {
            return false;
        }
        C6943e c6943e = (C6943e) obj;
        return this.ad == c6943e.ad && AbstractC7890e.billing(this.vip, c6943e.vip) && AbstractC7890e.billing(this.metrica, c6943e.metrica) && AbstractC7890e.billing(this.license, c6943e.license) && AbstractC7890e.billing(this.appmetrica, c6943e.appmetrica) && AbstractC7890e.billing(this.purchase, c6943e.purchase) && AbstractC7890e.billing(this.billing, c6943e.billing) && this.yandex == c6943e.yandex && this.startapp == c6943e.startapp && AbstractC7890e.billing(this.adcel, c6943e.adcel) && this.mopub == c6943e.mopub && this.advert == c6943e.advert && this.smaato == c6943e.smaato && AbstractC7890e.billing(this.amazon, c6943e.amazon) && AbstractC7890e.billing(this.loadAd, c6943e.loadAd) && AbstractC7890e.billing(this.Signature, c6943e.Signature) && this.admob == c6943e.admob && AbstractC7890e.billing(this.subscription, c6943e.subscription) && this.remoteconfig == c6943e.remoteconfig && AbstractC7890e.billing(this.pro, c6943e.pro) && AbstractC7890e.billing(this.signatures, c6943e.signatures) && AbstractC7890e.billing(this.tapsense, c6943e.tapsense) && this.isVip == c6943e.isVip;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        int billing = AbstractC17861e.billing(AbstractC17861e.billing((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.metrica), 31, this.license);
        String str2 = this.appmetrica;
        int hashCode2 = (billing + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purchase;
        int billing2 = (AbstractC17861e.billing((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.billing) + this.yandex) * 31;
        long j = this.startapp;
        int billing3 = (((((AbstractC17861e.billing((billing2 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.adcel) + this.mopub) * 31) + (this.advert ? 1231 : 1237)) * 31) + (this.smaato ? 1231 : 1237)) * 31;
        C3367e c3367e = this.amazon;
        int hashCode3 = (billing3 + (c3367e == null ? 0 : c3367e.hashCode())) * 31;
        Integer num = this.loadAd;
        int hashCode4 = (((this.subscription.hashCode() + ((AbstractC17861e.billing((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.Signature) + this.admob) * 31)) * 31) + this.remoteconfig) * 31;
        String str4 = this.pro;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.signatures;
        return AbstractC17861e.billing((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.tapsense) + this.isVip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookDto(accessStatus=");
        sb.append(this.ad);
        sb.append(", annotation=");
        sb.append(this.vip);
        sb.append(", authors=");
        sb.append(this.metrica);
        sb.append(", chapters=");
        sb.append(this.license);
        sb.append(", code=");
        AbstractC13501e.Signature(sb, this.appmetrica, ", copyright=", this.purchase, ", cover=");
        sb.append(this.billing);
        sb.append(", duration=");
        sb.append(this.yandex);
        sb.append(", fileSize=");
        sb.append(this.startapp);
        sb.append(", genres=");
        sb.append(this.adcel);
        sb.append(", id=");
        sb.append(this.mopub);
        sb.append(", inFavorites=");
        sb.append(this.advert);
        sb.append(", isExplicit=");
        sb.append(this.smaato);
        sb.append(", mainGenre=");
        sb.append(this.amazon);
        sb.append(", minimumAge=");
        sb.append(this.loadAd);
        sb.append(", narrators=");
        sb.append(this.Signature);
        sb.append(", progressPercentage=");
        sb.append(this.admob);
        sb.append(", publisher=");
        sb.append(this.subscription);
        sb.append(", releaseDate=");
        sb.append(this.remoteconfig);
        sb.append(", title=");
        sb.append(this.pro);
        sb.append(", trackCode=");
        sb.append(this.signatures);
        sb.append(", translators=");
        sb.append(this.tapsense);
        sb.append(", updatedAt=");
        sb.append(this.isVip);
        sb.append(")");
        return sb.toString();
    }
}
