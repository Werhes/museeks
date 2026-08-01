package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9485e {
    public final String ad;
    public final C1239e adcel;
    public final List advert;
    public final C17796e amazon;
    public final C2740e appmetrica;
    public final LinkedHashMap billing;
    public final ArrayList license;
    public final C14955e loadAd;
    public final List metrica;
    public final List mopub;
    public final int purchase;
    public final Map smaato;
    public final int startapp;
    public final List vip;
    public final int yandex;

    public C9485e(String str, List list, List list2, ArrayList arrayList, C2740e c2740e, int i, LinkedHashMap linkedHashMap, int i2, C1239e c1239e, List list3, List list4, C14955e c14955e) {
        C17796e c17796e = new C17796e();
        this.ad = str;
        this.vip = list;
        this.metrica = list2;
        this.license = arrayList;
        this.appmetrica = c2740e;
        this.purchase = i;
        this.billing = linkedHashMap;
        this.yandex = i2;
        this.startapp = 1;
        this.adcel = c1239e;
        this.mopub = list3;
        this.advert = list4;
        this.smaato = C9139e.f18290e;
        this.amazon = c17796e;
        this.loadAd = c14955e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9485e)) {
            return false;
        }
        C9485e c9485e = (C9485e) obj;
        return AbstractC7890e.billing(this.ad, c9485e.ad) && AbstractC7890e.billing(this.vip, c9485e.vip) && AbstractC7890e.billing(this.metrica, c9485e.metrica) && AbstractC7890e.billing(this.license, c9485e.license) && AbstractC7890e.billing(this.appmetrica, c9485e.appmetrica) && this.purchase == c9485e.purchase && AbstractC7890e.billing(this.billing, c9485e.billing) && this.yandex == c9485e.yandex && this.startapp == c9485e.startapp && AbstractC7890e.billing(this.adcel, c9485e.adcel) && AbstractC7890e.billing(this.mopub, c9485e.mopub) && AbstractC7890e.billing(this.advert, c9485e.advert) && AbstractC7890e.billing(this.smaato, c9485e.smaato) && AbstractC7890e.billing(this.amazon, c9485e.amazon) && AbstractC7890e.billing(this.loadAd, c9485e.loadAd);
    }

    public final int hashCode() {
        int billing = AbstractC17861e.billing(AbstractC17861e.billing(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica);
        ArrayList arrayList = this.license;
        int hashCode = (billing + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        C2740e c2740e = this.appmetrica;
        return (this.loadAd.hashCode() + ((this.amazon.ad.hashCode() + ((this.smaato.hashCode() + AbstractC17861e.billing(AbstractC17861e.billing((this.adcel.hashCode() + ((((AbstractC17861e.yandex(this.billing, (((hashCode + (c2740e != null ? c2740e.hashCode() : 0)) * 31) + this.purchase) * 31, 31) + this.yandex) * 31) + this.startapp) * 31)) * 31, 31, this.mopub), 31, this.advert)) * 29791)) * 31)) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) C5060e.vip(this.ad)) + ", streams=" + this.vip + ", exclusiveStreamGroups=" + this.metrica + ", input=" + this.license + ", postviewStream=" + this.appmetrica + ", sessionTemplate=" + ((Object) C18217e.vip(this.purchase)) + ", sessionParameters=" + this.billing + ", sessionMode=" + ((Object) AbstractC7291e.adcel(this.yandex)) + ", defaultTemplate=" + ((Object) C18217e.vip(this.startapp)) + ", defaultParameters=" + this.adcel + ", defaultListeners=" + this.mopub + ", graphStateListeners=" + this.advert + ", requiredParameters=" + this.smaato + ", cameraBackendId=" + ((Object) "null") + ", customCameraBackend=null, metadataTransform=" + this.amazon + ", flags=" + this.loadAd + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
