package defpackage;

import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eْؑؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e {
    public static final C12529e Companion = new Object();
    public static final InterfaceC3477e[] Signature = {null, null, null, null, AbstractC18039e.appmetrica(2, new C0743e(24)), AbstractC18039e.appmetrica(2, new C0743e(25)), null, null, null, AbstractC18039e.appmetrica(2, new C0743e(26)), null, AbstractC18039e.appmetrica(2, new C0743e(27)), AbstractC18039e.appmetrica(2, new C0743e(28)), AbstractC18039e.appmetrica(2, new C0743e(29)), null};
    public final String ad;
    public final List adcel;
    public final List advert;
    public final List amazon;
    public final List appmetrica;
    public final Boolean billing;
    public final Boolean license;
    public final String loadAd;
    public final String metrica;
    public final String mopub;
    public final List purchase;
    public final List smaato;
    public final Boolean startapp;
    public final String vip;
    public final Boolean yandex;

    public /* synthetic */ C0004e(int i, String str, String str2, String str3, Boolean bool, List list, List list2, Boolean bool2, Boolean bool3, Boolean bool4, List list3, String str4, List list4, List list5, List list6, String str5) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C5992e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = str2;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str3;
        }
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = bool;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = list;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = list2;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = bool2;
        }
        if ((i & 128) == 0) {
            this.yandex = null;
        } else {
            this.yandex = bool3;
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.startapp = null;
        } else {
            this.startapp = bool4;
        }
        if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
            this.adcel = null;
        } else {
            this.adcel = list3;
        }
        if ((i & 1024) == 0) {
            this.mopub = null;
        } else {
            this.mopub = str4;
        }
        if ((i & 2048) == 0) {
            this.advert = null;
        } else {
            this.advert = list4;
        }
        if ((i & 4096) == 0) {
            this.smaato = null;
        } else {
            this.smaato = list5;
        }
        if ((i & 8192) == 0) {
            this.amazon = null;
        } else {
            this.amazon = list6;
        }
        if ((i & 16384) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0004e)) {
            return false;
        }
        C0004e c0004e = (C0004e) obj;
        return AbstractC7890e.billing(this.ad, c0004e.ad) && AbstractC7890e.billing(this.vip, c0004e.vip) && AbstractC7890e.billing(this.metrica, c0004e.metrica) && AbstractC7890e.billing(this.license, c0004e.license) && AbstractC7890e.billing(this.appmetrica, c0004e.appmetrica) && AbstractC7890e.billing(this.purchase, c0004e.purchase) && AbstractC7890e.billing(this.billing, c0004e.billing) && AbstractC7890e.billing(this.yandex, c0004e.yandex) && AbstractC7890e.billing(this.startapp, c0004e.startapp) && AbstractC7890e.billing(this.adcel, c0004e.adcel) && AbstractC7890e.billing(this.mopub, c0004e.mopub) && AbstractC7890e.billing(this.advert, c0004e.advert) && AbstractC7890e.billing(this.smaato, c0004e.smaato) && AbstractC7890e.billing(this.amazon, c0004e.amazon) && AbstractC7890e.billing(this.loadAd, c0004e.loadAd);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        String str = this.vip;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metrica;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.license;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.appmetrica;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.purchase;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.billing;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.yandex;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.startapp;
        int hashCode9 = (hashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List list3 = this.adcel;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.mopub;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list4 = this.advert;
        int hashCode12 = (hashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.smaato;
        int hashCode13 = (hashCode12 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.amazon;
        int hashCode14 = (hashCode13 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str4 = this.loadAd;
        return hashCode14 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("AudioArtistDto(name=", this.ad, ", domain=", this.vip, ", id=");
        tapsense.append(this.metrica);
        tapsense.append(", isAlbumCover=");
        tapsense.append(this.license);
        tapsense.append(", photo=");
        tapsense.append(this.appmetrica);
        tapsense.append(", photos=");
        tapsense.append(this.purchase);
        tapsense.append(", isFollowed=");
        tapsense.append(this.billing);
        tapsense.append(", canFollow=");
        tapsense.append(this.yandex);
        tapsense.append(", canPlay=");
        tapsense.append(this.startapp);
        tapsense.append(", genres=");
        tapsense.append(this.adcel);
        tapsense.append(", bio=");
        tapsense.append(this.mopub);
        tapsense.append(", pages=");
        tapsense.append(this.advert);
        tapsense.append(", profiles=");
        tapsense.append(this.smaato);
        tapsense.append(", groups=");
        tapsense.append(this.amazon);
        tapsense.append(", trackCode=");
        return AbstractC1786e.signatures(tapsense, this.loadAd, ")");
    }
}
