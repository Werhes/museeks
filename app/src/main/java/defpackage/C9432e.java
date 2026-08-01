package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍّٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9432e {
    public static final C16987e Companion = new Object();
    public static final InterfaceC3477e[] loadAd = {null, null, null, null, null, null, null, null, null, AbstractC18039e.appmetrica(2, new C11689e(9)), null, null, null, null};
    public final C14086e ad;
    public final List adcel;
    public final String advert;
    public final Integer amazon;
    public final Integer appmetrica;
    public final String billing;
    public final Integer license;
    public final Boolean metrica;
    public final Boolean mopub;
    public final String purchase;
    public final Boolean smaato;
    public final C11617e startapp;
    public final String vip;
    public final String yandex;

    public /* synthetic */ C9432e(int i, C14086e c14086e, String str, Boolean bool, Integer num, Integer num2, String str2, String str3, String str4, C11617e c11617e, List list, Boolean bool2, String str5, Boolean bool3, Integer num3) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = c14086e;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = bool;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = num;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = num2;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str2;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = str3;
        }
        if ((i & 128) == 0) {
            this.yandex = null;
        } else {
            this.yandex = str4;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = null;
        } else {
            this.startapp = c11617e;
        }
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.adcel = null;
        } else {
            this.adcel = list;
        }
        if ((i & 1024) == 0) {
            this.mopub = null;
        } else {
            this.mopub = bool2;
        }
        if ((i & 2048) == 0) {
            this.advert = null;
        } else {
            this.advert = str5;
        }
        if ((i & 4096) == 0) {
            this.smaato = null;
        } else {
            this.smaato = bool3;
        }
        if ((i & 8192) == 0) {
            this.amazon = null;
        } else {
            this.amazon = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9432e)) {
            return false;
        }
        C9432e c9432e = (C9432e) obj;
        return AbstractC7890e.billing(this.ad, c9432e.ad) && AbstractC7890e.billing(this.vip, c9432e.vip) && AbstractC7890e.billing(this.metrica, c9432e.metrica) && AbstractC7890e.billing(this.license, c9432e.license) && AbstractC7890e.billing(this.appmetrica, c9432e.appmetrica) && AbstractC7890e.billing(this.purchase, c9432e.purchase) && AbstractC7890e.billing(this.billing, c9432e.billing) && AbstractC7890e.billing(this.yandex, c9432e.yandex) && AbstractC7890e.billing(this.startapp, c9432e.startapp) && AbstractC7890e.billing(this.adcel, c9432e.adcel) && AbstractC7890e.billing(this.mopub, c9432e.mopub) && AbstractC7890e.billing(this.advert, c9432e.advert) && AbstractC7890e.billing(this.smaato, c9432e.smaato) && AbstractC7890e.billing(this.amazon, c9432e.amazon);
    }

    public final int hashCode() {
        C14086e c14086e = this.ad;
        int hashCode = (c14086e == null ? 0 : c14086e.hashCode()) * 31;
        String str = this.vip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.metrica;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.license;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.appmetrica;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.purchase;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billing;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.yandex;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C11617e c11617e = this.startapp;
        int hashCode9 = (hashCode8 + (c11617e == null ? 0 : c11617e.hashCode())) * 31;
        List list = this.adcel;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.mopub;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.advert;
        int hashCode12 = (hashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool3 = this.smaato;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num3 = this.amazon;
        return hashCode13 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastInfoDto(cover=");
        sb.append(this.ad);
        sb.append(", description=");
        sb.append(this.vip);
        sb.append(", isFavorite=");
        sb.append(this.metrica);
        sb.append(", plays=");
        sb.append(this.license);
        sb.append(", position=");
        sb.append(this.appmetrica);
        sb.append(", rssGuid=");
        sb.append(this.purchase);
        sb.append(", restrictionDescription=");
        AbstractC13501e.Signature(sb, this.billing, ", restrictionText=", this.yandex, ", restrictionButton=");
        sb.append(this.startapp);
        sb.append(", friendsLiked=");
        sb.append(this.adcel);
        sb.append(", isRandom=");
        sb.append(this.mopub);
        sb.append(", post=");
        sb.append(this.advert);
        sb.append(", isDonut=");
        sb.append(this.smaato);
        sb.append(", podcastId=");
        sb.append(this.amazon);
        sb.append(")");
        return sb.toString();
    }
}
