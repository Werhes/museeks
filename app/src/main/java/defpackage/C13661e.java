package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۨٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13661e {
    public static final C13661e loadAd;
    public final AbstractC11062e ad;
    public final Function1 adcel;
    public final int advert;
    public final C14193e amazon;
    public final int appmetrica;
    public final int billing;
    public final InterfaceC8850e license;
    public final InterfaceC8850e metrica;
    public final InterfaceC10819e mopub;
    public final int purchase;
    public final int smaato;
    public final Function1 startapp;
    public final InterfaceC8850e vip;
    public final Function1 yandex;

    static {
        C15146e c15146e = C15146e.f29954e;
        C18511e c18511e = AbstractC11062e.f21949e;
        C15420e c15420e = AbstractC6731e.ad;
        ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
        loadAd = new C13661e(c18511e, C2693e.f6576e, executorC3603e, executorC3603e, 1, 1, 1, c15146e, c15146e, c15146e, InterfaceC10819e.f21455e, 2, 1, C14193e.vip);
    }

    public C13661e(AbstractC11062e abstractC11062e, InterfaceC8850e interfaceC8850e, InterfaceC8850e interfaceC8850e2, InterfaceC8850e interfaceC8850e3, int i, int i2, int i3, Function1 function1, Function1 function12, Function1 function13, InterfaceC10819e interfaceC10819e, int i4, int i5, C14193e c14193e) {
        this.ad = abstractC11062e;
        this.vip = interfaceC8850e;
        this.metrica = interfaceC8850e2;
        this.license = interfaceC8850e3;
        this.appmetrica = i;
        this.purchase = i2;
        this.billing = i3;
        this.yandex = function1;
        this.startapp = function12;
        this.adcel = function13;
        this.mopub = interfaceC10819e;
        this.advert = i4;
        this.smaato = i5;
        this.amazon = c14193e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13661e)) {
            return false;
        }
        C13661e c13661e = (C13661e) obj;
        return AbstractC7890e.billing(this.ad, c13661e.ad) && AbstractC7890e.billing(this.vip, c13661e.vip) && AbstractC7890e.billing(this.metrica, c13661e.metrica) && AbstractC7890e.billing(this.license, c13661e.license) && this.appmetrica == c13661e.appmetrica && this.purchase == c13661e.purchase && this.billing == c13661e.billing && AbstractC7890e.billing(this.yandex, c13661e.yandex) && AbstractC7890e.billing(this.startapp, c13661e.startapp) && AbstractC7890e.billing(this.adcel, c13661e.adcel) && AbstractC7890e.billing(this.mopub, c13661e.mopub) && this.advert == c13661e.advert && this.smaato == c13661e.smaato && AbstractC7890e.billing(this.amazon, c13661e.amazon);
    }

    public final int hashCode() {
        return this.amazon.ad.hashCode() + AbstractC1786e.mopub(this.smaato, AbstractC1786e.mopub(this.advert, (this.mopub.hashCode() + ((this.adcel.hashCode() + ((this.startapp.hashCode() + ((this.yandex.hashCode() + AbstractC1786e.mopub(this.billing, AbstractC1786e.mopub(this.purchase, AbstractC1786e.mopub(this.appmetrica, (this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.ad + ", interceptorCoroutineContext=" + this.vip + ", fetcherCoroutineContext=" + this.metrica + ", decoderCoroutineContext=" + this.license + ", memoryCachePolicy=" + AbstractC10257e.ads(this.appmetrica) + ", diskCachePolicy=" + AbstractC10257e.ads(this.purchase) + ", networkCachePolicy=" + AbstractC10257e.ads(this.billing) + ", placeholderFactory=" + this.yandex + ", errorFactory=" + this.startapp + ", fallbackFactory=" + this.adcel + ", sizeResolver=" + this.mopub + ", scale=" + AbstractC0054e.m226try(this.advert) + ", precision=" + AbstractC1634e.isPro(this.smaato) + ", extras=" + this.amazon + ")";
    }
}
