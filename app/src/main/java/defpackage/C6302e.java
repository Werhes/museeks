package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6302e {
    public final Context ad;
    public final C14193e adcel;
    public final String appmetrica;
    public final int billing;
    public final int license;
    public final int metrica;
    public final AbstractC11062e purchase;
    public final int startapp;
    public final C16320e vip;
    public final int yandex;

    public C6302e(Context context, C16320e c16320e, int i, int i2, String str, AbstractC11062e abstractC11062e, int i3, int i4, int i5, C14193e c14193e) {
        this.ad = context;
        this.vip = c16320e;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = str;
        this.purchase = abstractC11062e;
        this.billing = i3;
        this.yandex = i4;
        this.startapp = i5;
        this.adcel = c14193e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6302e)) {
            return false;
        }
        C6302e c6302e = (C6302e) obj;
        return AbstractC7890e.billing(this.ad, c6302e.ad) && AbstractC7890e.billing(this.vip, c6302e.vip) && this.metrica == c6302e.metrica && this.license == c6302e.license && AbstractC7890e.billing(this.appmetrica, c6302e.appmetrica) && AbstractC7890e.billing(this.purchase, c6302e.purchase) && this.billing == c6302e.billing && this.yandex == c6302e.yandex && this.startapp == c6302e.startapp && AbstractC7890e.billing(this.adcel, c6302e.adcel);
    }

    public final int hashCode() {
        int mopub = AbstractC1786e.mopub(this.license, AbstractC1786e.mopub(this.metrica, (this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31, 31), 31);
        String str = this.appmetrica;
        return this.adcel.ad.hashCode() + AbstractC1786e.mopub(this.startapp, AbstractC1786e.mopub(this.yandex, AbstractC1786e.mopub(this.billing, (this.purchase.hashCode() + ((mopub + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "Options(context=" + this.ad + ", size=" + this.vip + ", scale=" + AbstractC0054e.m226try(this.metrica) + ", precision=" + AbstractC1634e.isPro(this.license) + ", diskCacheKey=" + this.appmetrica + ", fileSystem=" + this.purchase + ", memoryCachePolicy=" + AbstractC10257e.ads(this.billing) + ", diskCachePolicy=" + AbstractC10257e.ads(this.yandex) + ", networkCachePolicy=" + AbstractC10257e.ads(this.startapp) + ", extras=" + this.adcel + ")";
    }
}
