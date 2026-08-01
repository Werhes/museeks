package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16875e {
    public final C0939e ad;
    public final boolean adcel;
    public final boolean advert;
    public final int amazon;
    public final EnumC10286e appmetrica;
    public final boolean billing;
    public final String license;
    public final int loadAd;
    public final EnumC11342e metrica;
    public final String mopub;
    public final boolean purchase;
    public final boolean smaato;
    public final boolean startapp;
    public final int vip;
    public final boolean yandex;

    public C16875e(C0939e c0939e, int i, EnumC11342e enumC11342e, String str, EnumC10286e enumC10286e, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, boolean z6, boolean z7, int i2, int i3) {
        this.ad = c0939e;
        this.vip = i;
        this.metrica = enumC11342e;
        this.license = str;
        this.appmetrica = enumC10286e;
        this.purchase = z;
        this.billing = z2;
        this.yandex = z3;
        this.startapp = z4;
        this.adcel = z5;
        this.mopub = str2;
        this.advert = z6;
        this.smaato = z7;
        this.amazon = i2;
        this.loadAd = i3;
    }

    public static C16875e ad(C16875e c16875e, C0939e c0939e, int i, EnumC11342e enumC11342e, String str, EnumC10286e enumC10286e, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, boolean z6, boolean z7, int i2, int i3, int i4) {
        C0939e c0939e2 = (i4 & 1) != 0 ? c16875e.ad : c0939e;
        int i5 = (i4 & 2) != 0 ? c16875e.vip : i;
        EnumC11342e enumC11342e2 = (i4 & 4) != 0 ? c16875e.metrica : enumC11342e;
        String str3 = (i4 & 8) != 0 ? c16875e.license : str;
        EnumC10286e enumC10286e2 = (i4 & 16) != 0 ? c16875e.appmetrica : enumC10286e;
        boolean z8 = (i4 & 32) != 0 ? c16875e.purchase : z;
        boolean z9 = (i4 & 64) != 0 ? c16875e.billing : z2;
        boolean z10 = (i4 & 128) != 0 ? c16875e.yandex : z3;
        boolean z11 = (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c16875e.startapp : z4;
        boolean z12 = (i4 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c16875e.adcel : z5;
        String str4 = (i4 & 1024) != 0 ? c16875e.mopub : str2;
        boolean z13 = (i4 & 2048) != 0 ? c16875e.advert : z6;
        boolean z14 = (i4 & 4096) != 0 ? c16875e.smaato : z7;
        int i6 = (i4 & 8192) != 0 ? c16875e.amazon : i2;
        int i7 = (i4 & 16384) != 0 ? c16875e.loadAd : i3;
        c16875e.getClass();
        return new C16875e(c0939e2, i5, enumC11342e2, str3, enumC10286e2, z8, z9, z10, z11, z12, str4, z13, z14, i6, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16875e)) {
            return false;
        }
        C16875e c16875e = (C16875e) obj;
        return AbstractC7890e.billing(this.ad, c16875e.ad) && this.vip == c16875e.vip && this.metrica == c16875e.metrica && AbstractC7890e.billing(this.license, c16875e.license) && this.appmetrica == c16875e.appmetrica && this.purchase == c16875e.purchase && this.billing == c16875e.billing && this.yandex == c16875e.yandex && this.startapp == c16875e.startapp && this.adcel == c16875e.adcel && AbstractC7890e.billing(this.mopub, c16875e.mopub) && this.advert == c16875e.advert && this.smaato == c16875e.smaato && this.amazon == c16875e.amazon && this.loadAd == c16875e.loadAd;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.appmetrica.hashCode() + AbstractC1786e.advert((this.metrica.hashCode() + (((this.ad.hashCode() * 31) + this.vip) * 31)) * 31, 31, this.license)) * 31) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237)) * 31) + (this.yandex ? 1231 : 1237)) * 31) + (this.startapp ? 1231 : 1237)) * 31) + (this.adcel ? 1231 : 1237)) * 31;
        String str = this.mopub;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.advert ? 1231 : 1237)) * 31) + (this.smaato ? 1231 : 1237)) * 31) + this.amazon) * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowPlayingState(track=");
        sb.append(this.ad);
        sb.append(", trackIndex=");
        sb.append(this.vip);
        sb.append(", state=");
        sb.append(this.metrica);
        sb.append(", sourceDisplayName=");
        sb.append(this.license);
        sb.append(", repeatMode=");
        sb.append(this.appmetrica);
        sb.append(", shuffleMode=");
        sb.append(this.purchase);
        sb.append(", isBuffering=");
        sb.append(this.billing);
        sb.append(", isPodcast=");
        sb.append(this.yandex);
        sb.append(", isRadio=");
        sb.append(this.startapp);
        sb.append(", isInfinitePlayback=");
        sb.append(this.adcel);
        sb.append(", vkStreamMixId=");
        sb.append(this.mopub);
        sb.append(", isConfigurableVkStreamMix=");
        sb.append(this.advert);
        sb.append(", isShuffleInProgress=");
        sb.append(this.smaato);
        sb.append(", deviceVolume=");
        sb.append(this.amazon);
        sb.append(", deviceMaxVolume=");
        return AbstractC1786e.pro(sb, this.loadAd, ')');
    }
}
