package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ۠ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3675e {
    public final LinkedHashMap Signature;
    public final LinkedHashMap ad;
    public final LinkedHashMap adcel;
    public final LinkedHashMap admob;
    public final LinkedHashMap advert;
    public final LinkedHashMap amazon;
    public final LinkedHashMap appmetrica;
    public final LinkedHashMap billing;
    public final LinkedHashMap inmobi;
    public final LinkedHashMap isVip;
    public final LinkedHashMap license;
    public final LinkedHashMap loadAd;
    public final LinkedHashMap metrica;
    public final LinkedHashMap mopub;
    public final LinkedHashMap pro;
    public final LinkedHashMap purchase;
    public final LinkedHashMap remoteconfig;
    public final LinkedHashMap signatures;
    public final LinkedHashMap smaato;
    public final LinkedHashMap startapp;
    public final LinkedHashMap subscription;
    public final LinkedHashMap tapsense;
    public final LinkedHashMap vip;
    public final LinkedHashMap yandex;

    public C3675e(Catalog2Response catalog2Response) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap ad = AbstractC13925e.ad(catalog2Response.adcel);
        LinkedHashMap ad2 = AbstractC13925e.ad(catalog2Response.mopub);
        LinkedHashMap ad3 = AbstractC13925e.ad(catalog2Response.yandex);
        LinkedHashMap ad4 = AbstractC13925e.ad(catalog2Response.billing);
        LinkedHashMap ad5 = AbstractC13925e.ad(catalog2Response.startapp);
        LinkedHashMap ad6 = AbstractC13925e.ad(catalog2Response.smaato);
        LinkedHashMap ad7 = AbstractC13925e.ad(catalog2Response.advert);
        LinkedHashMap ad8 = catalog2Response.ad();
        LinkedHashMap ad9 = AbstractC13925e.ad(AbstractC13925e.vip(catalog2Response.amazon));
        List list = catalog2Response.loadAd;
        if (list != null) {
            int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(list, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(appmetrica < 16 ? 16 : appmetrica);
            for (Object obj : list) {
                linkedHashMap2.put(String.valueOf(((VKProfile) obj).ad), obj);
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        LinkedHashMap ad10 = AbstractC13925e.ad(catalog2Response.Signature);
        LinkedHashMap ad11 = AbstractC13925e.ad(catalog2Response.admob);
        LinkedHashMap ad12 = AbstractC13925e.ad(catalog2Response.subscription);
        LinkedHashMap ad13 = AbstractC13925e.ad(catalog2Response.remoteconfig);
        LinkedHashMap ad14 = AbstractC13925e.ad(catalog2Response.pro);
        LinkedHashMap ad15 = AbstractC13925e.ad(catalog2Response.signatures);
        LinkedHashMap ad16 = AbstractC13925e.ad(catalog2Response.tapsense);
        LinkedHashMap ad17 = AbstractC13925e.ad(catalog2Response.isVip);
        LinkedHashMap ad18 = AbstractC13925e.ad(catalog2Response.inmobi);
        LinkedHashMap ad19 = AbstractC13925e.ad(catalog2Response.isPro);
        LinkedHashMap ad20 = AbstractC13925e.ad(catalog2Response.applovin);
        LinkedHashMap ad21 = AbstractC13925e.ad(catalog2Response.ads);
        LinkedHashMap ad22 = AbstractC13925e.ad(catalog2Response.premium);
        LinkedHashMap ad23 = AbstractC13925e.ad(catalog2Response.subs);
        this.ad = ad;
        this.vip = ad2;
        this.metrica = ad3;
        this.license = ad4;
        this.appmetrica = ad5;
        this.purchase = ad6;
        this.billing = ad7;
        this.yandex = ad8;
        this.startapp = ad9;
        this.adcel = linkedHashMap;
        this.mopub = ad10;
        this.advert = ad11;
        this.smaato = ad12;
        this.amazon = ad18;
        this.loadAd = ad13;
        this.Signature = ad14;
        this.admob = ad15;
        this.subscription = ad16;
        this.remoteconfig = ad17;
        this.pro = ad19;
        this.signatures = ad20;
        this.tapsense = ad21;
        this.isVip = ad22;
        this.inmobi = ad23;
    }

    public final void ad(Catalog2Response catalog2Response) {
        LinkedHashMap linkedHashMap;
        this.ad.putAll(AbstractC13925e.ad(catalog2Response.adcel));
        this.vip.putAll(AbstractC13925e.ad(catalog2Response.mopub));
        this.metrica.putAll(AbstractC13925e.ad(catalog2Response.yandex));
        this.license.putAll(AbstractC13925e.ad(catalog2Response.billing));
        this.appmetrica.putAll(AbstractC13925e.ad(catalog2Response.startapp));
        this.purchase.putAll(AbstractC13925e.ad(catalog2Response.smaato));
        this.billing.putAll(AbstractC13925e.ad(catalog2Response.advert));
        this.yandex.putAll(catalog2Response.ad());
        List list = catalog2Response.loadAd;
        if (list != null) {
            int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(list, 10));
            if (appmetrica < 16) {
                appmetrica = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(appmetrica);
            for (Object obj : list) {
                linkedHashMap2.put(String.valueOf(((VKProfile) obj).ad), obj);
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.adcel.putAll(linkedHashMap);
        this.startapp.putAll(AbstractC13925e.ad(AbstractC13925e.vip(catalog2Response.amazon)));
        this.mopub.putAll(AbstractC13925e.ad(catalog2Response.Signature));
        this.advert.putAll(AbstractC13925e.ad(catalog2Response.admob));
        this.smaato.putAll(AbstractC13925e.ad(catalog2Response.subscription));
        this.amazon.putAll(AbstractC13925e.ad(catalog2Response.inmobi));
        this.loadAd.putAll(AbstractC13925e.ad(catalog2Response.remoteconfig));
        this.Signature.putAll(AbstractC13925e.ad(catalog2Response.pro));
        this.admob.putAll(AbstractC13925e.ad(catalog2Response.signatures));
        this.subscription.putAll(AbstractC13925e.ad(catalog2Response.tapsense));
        this.remoteconfig.putAll(AbstractC13925e.ad(catalog2Response.isVip));
        this.pro.putAll(AbstractC13925e.ad(catalog2Response.isPro));
        this.signatures.putAll(AbstractC13925e.ad(catalog2Response.applovin));
        this.tapsense.putAll(AbstractC13925e.ad(catalog2Response.ads));
        this.isVip.putAll(AbstractC13925e.ad(catalog2Response.premium));
        this.inmobi.putAll(AbstractC13925e.ad(catalog2Response.subs));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3675e)) {
            return false;
        }
        C3675e c3675e = (C3675e) obj;
        return AbstractC7890e.billing(this.ad, c3675e.ad) && AbstractC7890e.billing(this.vip, c3675e.vip) && AbstractC7890e.billing(this.metrica, c3675e.metrica) && AbstractC7890e.billing(this.license, c3675e.license) && AbstractC7890e.billing(this.appmetrica, c3675e.appmetrica) && AbstractC7890e.billing(this.purchase, c3675e.purchase) && AbstractC7890e.billing(this.billing, c3675e.billing) && AbstractC7890e.billing(this.yandex, c3675e.yandex) && AbstractC7890e.billing(this.startapp, c3675e.startapp) && AbstractC7890e.billing(this.adcel, c3675e.adcel) && AbstractC7890e.billing(this.mopub, c3675e.mopub) && AbstractC7890e.billing(this.advert, c3675e.advert) && AbstractC7890e.billing(this.smaato, c3675e.smaato) && AbstractC7890e.billing(this.amazon, c3675e.amazon) && AbstractC7890e.billing(this.loadAd, c3675e.loadAd) && AbstractC7890e.billing(this.Signature, c3675e.Signature) && AbstractC7890e.billing(this.admob, c3675e.admob) && AbstractC7890e.billing(this.subscription, c3675e.subscription) && AbstractC7890e.billing(this.remoteconfig, c3675e.remoteconfig) && AbstractC7890e.billing(this.pro, c3675e.pro) && AbstractC7890e.billing(this.signatures, c3675e.signatures) && AbstractC7890e.billing(this.tapsense, c3675e.tapsense) && AbstractC7890e.billing(this.isVip, c3675e.isVip) && AbstractC7890e.billing(this.inmobi, c3675e.inmobi);
    }

    public final int hashCode() {
        return this.inmobi.hashCode() + AbstractC17861e.yandex(this.isVip, AbstractC17861e.yandex(this.tapsense, AbstractC17861e.yandex(this.signatures, AbstractC17861e.yandex(this.pro, AbstractC17861e.yandex(this.remoteconfig, AbstractC17861e.yandex(this.subscription, AbstractC17861e.yandex(this.admob, AbstractC17861e.yandex(this.Signature, AbstractC17861e.yandex(this.loadAd, AbstractC17861e.yandex(this.amazon, AbstractC17861e.yandex(this.smaato, AbstractC17861e.yandex(this.advert, AbstractC17861e.yandex(this.mopub, AbstractC17861e.yandex(this.adcel, AbstractC17861e.yandex(this.startapp, AbstractC17861e.yandex(this.yandex, AbstractC17861e.yandex(this.billing, AbstractC17861e.yandex(this.purchase, AbstractC17861e.yandex(this.appmetrica, AbstractC17861e.yandex(this.license, AbstractC17861e.yandex(this.metrica, AbstractC17861e.yandex(this.vip, this.ad.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "CatalogDataHolder(audios=" + this.ad + ", playlists=" + this.vip + ", videos=" + this.metrica + ", artist_videos=" + this.license + ", links=" + this.appmetrica + ", suggestions=" + this.purchase + ", artists=" + this.billing + ", profiles=" + this.yandex + ", catalog_banners=" + this.startapp + ", curators=" + this.adcel + ", texts=" + this.mopub + ", podcast_episodes=" + this.advert + ", podcast_slider_items=" + this.smaato + ", podcasts=" + this.amazon + ", longreads=" + this.loadAd + ", placeholders=" + this.Signature + ", recommended_playlists=" + this.admob + ", music_owners=" + this.subscription + ", audio_followings_update_infos=" + this.remoteconfig + ", radio_stations=" + this.pro + ", audio_books=" + this.signatures + ", audio_stream_mixes=" + this.tapsense + ", audio_books_persons=" + this.isVip + ", audio_content_cards=" + this.inmobi + ')';
    }

    public final void vip() {
        this.ad.clear();
        this.vip.clear();
        this.metrica.clear();
        this.license.clear();
        this.appmetrica.clear();
        this.purchase.clear();
        this.billing.clear();
        this.yandex.clear();
        this.adcel.clear();
        this.startapp.clear();
        this.mopub.clear();
        this.advert.clear();
        this.smaato.clear();
        this.loadAd.clear();
        this.Signature.clear();
        this.admob.clear();
        this.subscription.clear();
        this.remoteconfig.clear();
        this.pro.clear();
        this.signatures.clear();
        this.tapsense.clear();
        this.isVip.clear();
        this.inmobi.clear();
    }
}
