package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5129e {
    public final EnumC15030e ad;
    public final String adcel;
    public final int advert;
    public final String appmetrica;
    public final boolean billing;
    public final String license;
    public final String metrica;
    public final List mopub;
    public final String purchase;
    public final boolean startapp;
    public final String vip;
    public final boolean yandex;

    public C5129e(EnumC15030e enumC15030e, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, List list, int i) {
        this.ad = enumC15030e;
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = str4;
        this.purchase = str5;
        this.billing = z;
        this.yandex = z2;
        this.startapp = z3;
        this.adcel = str6;
        this.mopub = AbstractC12534e.vip(list);
        this.advert = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5129e)) {
            return false;
        }
        C5129e c5129e = (C5129e) obj;
        return this.ad == c5129e.ad && Objects.equals(this.vip, c5129e.vip) && Objects.equals(this.metrica, c5129e.metrica) && Objects.equals(this.license, c5129e.license) && Objects.equals(this.appmetrica, c5129e.appmetrica) && Objects.equals(this.purchase, c5129e.purchase) && this.billing == c5129e.billing && this.yandex == c5129e.yandex && this.startapp == c5129e.startapp && Objects.equals(this.adcel, c5129e.adcel) && Objects.equals(this.mopub, c5129e.mopub) && this.advert == c5129e.advert;
    }

    public final int hashCode() {
        return Objects.hash(this.appmetrica, Boolean.valueOf(this.yandex), this.mopub, Boolean.valueOf(this.billing), Boolean.valueOf(this.startapp), this.metrica, this.adcel, this.license, this.purchase, this.ad, this.vip, Integer.valueOf(this.advert));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaData [mType=");
        sb.append(this.ad);
        sb.append(", mUri=");
        sb.append(this.vip);
        sb.append(", mGroupId=");
        sb.append(this.metrica);
        sb.append(", mLanguage=");
        sb.append(this.license);
        sb.append(", mAssociatedLanguage=");
        sb.append(this.appmetrica);
        sb.append(", mName=");
        sb.append(this.purchase);
        sb.append(", mDefault=");
        sb.append(this.billing);
        sb.append(", mAutoSelect=");
        sb.append(this.yandex);
        sb.append(", mForced=");
        sb.append(this.startapp);
        sb.append(", mInStreamId=");
        sb.append(this.adcel);
        sb.append(", mCharacteristics=");
        sb.append(this.mopub);
        sb.append(", mChannels=");
        return AbstractC17861e.smaato(this.advert, "]", sb);
    }
}
