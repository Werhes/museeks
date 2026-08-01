package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11227e {
    public final Integer ad;
    public final Integer adcel;
    public final Integer advert;
    public final Integer amazon;
    public boolean appmetrica;
    public final Integer billing;
    public final Integer license;
    public final Integer metrica;
    public final Integer mopub;
    public final CharSequence purchase;
    public final Integer smaato;
    public final Integer startapp;
    public final Integer vip;
    public final Integer yandex;

    public C11227e(Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i) {
        num = (i & 1) != 0 ? null : num;
        Integer num13 = (i & 2) != 0 ? null : num2;
        Integer num14 = (i & 4) != 0 ? null : num3;
        Integer num15 = (i & 8) != 0 ? null : num4;
        String str2 = (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? BuildConfig.FLAVOR : str;
        Integer num16 = (i & 1024) != 0 ? null : num5;
        Integer num17 = (i & 2048) != 0 ? null : num6;
        Integer num18 = (i & 4096) != 0 ? null : num7;
        Integer num19 = (i & 8192) != 0 ? null : num8;
        Integer num20 = (32768 & i) != 0 ? null : num10;
        Integer num21 = (65536 & i) != 0 ? null : num11;
        Integer num22 = (i & 131072) == 0 ? num12 : null;
        this.ad = num;
        this.vip = num13;
        this.metrica = num14;
        this.license = num15;
        this.appmetrica = false;
        this.purchase = str2;
        this.billing = num16;
        this.yandex = num17;
        this.startapp = num18;
        this.adcel = num19;
        this.mopub = num9;
        this.advert = num20;
        this.smaato = num21;
        this.amazon = num22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11227e)) {
            return false;
        }
        C11227e c11227e = (C11227e) obj;
        return AbstractC7890e.billing(this.ad, c11227e.ad) && AbstractC7890e.billing(this.vip, c11227e.vip) && AbstractC7890e.billing(this.metrica, c11227e.metrica) && AbstractC7890e.billing(this.license, c11227e.license) && this.appmetrica == c11227e.appmetrica && AbstractC7890e.billing(this.purchase, c11227e.purchase) && AbstractC7890e.billing(this.billing, c11227e.billing) && AbstractC7890e.billing(this.yandex, c11227e.yandex) && AbstractC7890e.billing(this.startapp, c11227e.startapp) && AbstractC7890e.billing(this.adcel, c11227e.adcel) && AbstractC7890e.billing(this.mopub, c11227e.mopub) && AbstractC7890e.billing(this.advert, c11227e.advert) && AbstractC7890e.billing(this.smaato, c11227e.smaato) && AbstractC7890e.billing(this.amazon, c11227e.amazon);
    }

    public final int hashCode() {
        Integer num = this.ad;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.vip;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.metrica;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.license;
        int hashCode4 = (this.purchase.hashCode() + ((((hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 28629151) + (this.appmetrica ? 1231 : 1237)) * 31)) * 31;
        Integer num5 = this.billing;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.yandex;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.startapp;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.adcel;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.mopub;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.advert;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.smaato;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.amazon;
        return hashCode11 + (num12 != null ? num12.hashCode() : 0);
    }

    public final String toString() {
        return "VectorTextViewParams(drawableStartRes=" + this.ad + ", drawableEndRes=" + this.vip + ", drawableBottomRes=" + this.metrica + ", drawableTopRes=" + this.license + ", drawableStart=null, drawableEnd=null, drawableBottom=null, drawableTop=null, isRtlLayout=" + this.appmetrica + ", contentDescription=" + ((Object) this.purchase) + ", compoundDrawablePadding=" + this.billing + ", iconWidth=" + this.yandex + ", iconHeight=" + this.startapp + ", compoundDrawablePaddingRes=" + this.adcel + ", tintColor=" + this.mopub + ", widthRes=" + this.advert + ", heightRes=" + this.smaato + ", squareSizeRes=" + this.amazon + ")";
    }
}
