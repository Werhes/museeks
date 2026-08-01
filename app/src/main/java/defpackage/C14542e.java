package defpackage;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14542e {
    public final Function1 Signature;
    public final Context ad;
    public final InterfaceC8850e adcel;
    public final Function1 admob;
    public final int advert;
    public final C15695e amazon;
    public final Map appmetrica;
    public final InterfaceC11259e billing;
    public final C13661e isVip;
    public final String license;
    public final Function1 loadAd;
    public final InterfaceC1363e metrica;
    public final int mopub;
    public final int pro;
    public final AbstractC11062e purchase;
    public final int remoteconfig;
    public final C14193e signatures;
    public final int smaato;
    public final InterfaceC8850e startapp;
    public final InterfaceC10819e subscription;
    public final C2178e tapsense;
    public final Object vip;
    public final InterfaceC8850e yandex;

    public C14542e(Context context, Object obj, InterfaceC1363e interfaceC1363e, String str, Map map, AbstractC11062e abstractC11062e, InterfaceC11259e interfaceC11259e, InterfaceC8850e interfaceC8850e, InterfaceC8850e interfaceC8850e2, InterfaceC8850e interfaceC8850e3, int i, int i2, int i3, C15695e c15695e, Function1 function1, Function1 function12, Function1 function13, InterfaceC10819e interfaceC10819e, int i4, int i5, C14193e c14193e, C2178e c2178e, C13661e c13661e) {
        this.ad = context;
        this.vip = obj;
        this.metrica = interfaceC1363e;
        this.license = str;
        this.appmetrica = map;
        this.purchase = abstractC11062e;
        this.billing = interfaceC11259e;
        this.yandex = interfaceC8850e;
        this.startapp = interfaceC8850e2;
        this.adcel = interfaceC8850e3;
        this.mopub = i;
        this.advert = i2;
        this.smaato = i3;
        this.amazon = c15695e;
        this.loadAd = function1;
        this.Signature = function12;
        this.admob = function13;
        this.subscription = interfaceC10819e;
        this.remoteconfig = i4;
        this.pro = i5;
        this.signatures = c14193e;
        this.tapsense = c2178e;
        this.isVip = c13661e;
    }

    public static C5944e ad(C14542e c14542e) {
        Context context = c14542e.ad;
        c14542e.getClass();
        return new C5944e(c14542e, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14542e)) {
            return false;
        }
        C14542e c14542e = (C14542e) obj;
        return AbstractC7890e.billing(this.ad, c14542e.ad) && this.vip.equals(c14542e.vip) && AbstractC7890e.billing(this.metrica, c14542e.metrica) && AbstractC7890e.billing(this.license, c14542e.license) && AbstractC7890e.billing(this.appmetrica, c14542e.appmetrica) && AbstractC7890e.billing(this.purchase, c14542e.purchase) && AbstractC7890e.billing(this.billing, c14542e.billing) && AbstractC7890e.billing(this.yandex, c14542e.yandex) && AbstractC7890e.billing(this.startapp, c14542e.startapp) && AbstractC7890e.billing(this.adcel, c14542e.adcel) && this.mopub == c14542e.mopub && this.advert == c14542e.advert && this.smaato == c14542e.smaato && AbstractC7890e.billing(this.amazon, c14542e.amazon) && AbstractC7890e.billing(this.loadAd, c14542e.loadAd) && AbstractC7890e.billing(this.Signature, c14542e.Signature) && AbstractC7890e.billing(this.admob, c14542e.admob) && AbstractC7890e.billing(this.subscription, c14542e.subscription) && this.remoteconfig == c14542e.remoteconfig && this.pro == c14542e.pro && this.signatures.equals(c14542e.signatures) && this.tapsense.equals(c14542e.tapsense) && AbstractC7890e.billing(this.isVip, c14542e.isVip);
    }

    public final int hashCode() {
        int hashCode = (this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31;
        InterfaceC1363e interfaceC1363e = this.metrica;
        int hashCode2 = (hashCode + (interfaceC1363e == null ? 0 : interfaceC1363e.hashCode())) * 961;
        String str = this.license;
        int hashCode3 = (this.purchase.hashCode() + ((this.appmetrica.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 961)) * 961;
        InterfaceC11259e interfaceC11259e = this.billing;
        int mopub = AbstractC1786e.mopub(this.smaato, AbstractC1786e.mopub(this.advert, AbstractC1786e.mopub(this.mopub, (this.adcel.hashCode() + ((this.startapp.hashCode() + ((this.yandex.hashCode() + ((hashCode3 + (interfaceC11259e == null ? 0 : interfaceC11259e.hashCode())) * 31)) * 31)) * 31)) * 31, 31), 31), 31);
        C15695e c15695e = this.amazon;
        return this.isVip.hashCode() + ((this.tapsense.hashCode() + ((this.signatures.ad.hashCode() + AbstractC1786e.mopub(this.pro, AbstractC1786e.mopub(this.remoteconfig, (this.subscription.hashCode() + ((this.admob.hashCode() + ((this.Signature.hashCode() + ((this.loadAd.hashCode() + ((mopub + (c15695e != null ? c15695e.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.ad + ", data=" + this.vip + ", target=" + this.metrica + ", listener=null, memoryCacheKey=" + this.license + ", memoryCacheKeyExtras=" + this.appmetrica + ", diskCacheKey=null, fileSystem=" + this.purchase + ", fetcherFactory=null, decoderFactory=" + this.billing + ", interceptorCoroutineContext=" + this.yandex + ", fetcherCoroutineContext=" + this.startapp + ", decoderCoroutineContext=" + this.adcel + ", memoryCachePolicy=" + AbstractC10257e.ads(this.mopub) + ", diskCachePolicy=" + AbstractC10257e.ads(this.advert) + ", networkCachePolicy=" + AbstractC10257e.ads(this.smaato) + ", placeholderMemoryCacheKey=" + this.amazon + ", placeholderFactory=" + this.loadAd + ", errorFactory=" + this.Signature + ", fallbackFactory=" + this.admob + ", sizeResolver=" + this.subscription + ", scale=" + AbstractC0054e.m226try(this.remoteconfig) + ", precision=" + AbstractC1634e.isPro(this.pro) + ", extras=" + this.signatures + ", defined=" + this.tapsense + ", defaults=" + this.isVip + ")";
    }
}
