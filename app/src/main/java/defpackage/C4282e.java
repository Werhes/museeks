package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4282e implements InterfaceC3703e {
    public final AbstractC4970e Signature;
    public final InterfaceC16522e ad;
    public final C3759e adcel;
    public final long advert;
    public final C13973e amazon;
    public final C5208e appmetrica;
    public final String billing;
    public final C6277e license;
    public final C4521e loadAd;
    public final C1812e metrica;
    public final C4622e mopub;
    public final AbstractC16845e purchase;
    public final C11964e smaato;
    public final C8065e startapp;
    public final long vip;
    public final long yandex;

    public C4282e(long j, long j2, C1812e c1812e, C6277e c6277e, C5208e c5208e, AbstractC16845e abstractC16845e, String str, long j3, C8065e c8065e, C3759e c3759e, C4622e c4622e, long j4, C11964e c11964e, C13973e c13973e, int i) {
        this((i & 1) != 0 ? C3618e.adcel : j, (i & 2) != 0 ? C12973e.metrica : j2, (i & 4) != 0 ? null : c1812e, (i & 8) != 0 ? null : c6277e, (i & 16) != 0 ? null : c5208e, (i & 32) != 0 ? null : abstractC16845e, (i & 64) != 0 ? null : str, (i & 128) != 0 ? C12973e.metrica : j3, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : c8065e, (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : c3759e, (i & 1024) != 0 ? null : c4622e, (i & 2048) != 0 ? C3618e.adcel : j4, (i & 4096) != 0 ? null : c11964e, (i & 8192) != 0 ? null : c13973e, (C4521e) null, (AbstractC4970e) null);
    }

    public C4282e(long j, long j2, C1812e c1812e, C6277e c6277e, C5208e c5208e, AbstractC16845e abstractC16845e, String str, long j3, C8065e c8065e, C3759e c3759e, C4622e c4622e, long j4, C11964e c11964e, C13973e c13973e, C4521e c4521e, AbstractC4970e abstractC4970e) {
        this(j != 16 ? new C10198e(j) : C0925e.ad, j2, c1812e, c6277e, c5208e, abstractC16845e, str, j3, c8065e, c3759e, c4622e, j4, c11964e, c13973e, c4521e, abstractC4970e);
    }

    public C4282e(InterfaceC16522e interfaceC16522e, long j, C1812e c1812e, C6277e c6277e, C5208e c5208e, AbstractC16845e abstractC16845e, String str, long j2, C8065e c8065e, C3759e c3759e, C4622e c4622e, long j3, C11964e c11964e, C13973e c13973e, C4521e c4521e, AbstractC4970e abstractC4970e) {
        this.ad = interfaceC16522e;
        this.vip = j;
        this.metrica = c1812e;
        this.license = c6277e;
        this.appmetrica = c5208e;
        this.purchase = abstractC16845e;
        this.billing = str;
        this.yandex = j2;
        this.startapp = c8065e;
        this.adcel = c3759e;
        this.mopub = c4622e;
        this.advert = j3;
        this.smaato = c11964e;
        this.amazon = c13973e;
        this.loadAd = c4521e;
        this.Signature = abstractC4970e;
    }

    public final boolean ad(C4282e c4282e) {
        if (this == c4282e) {
            return true;
        }
        return C12973e.ad(this.vip, c4282e.vip) && AbstractC7890e.billing(this.metrica, c4282e.metrica) && AbstractC7890e.billing(this.license, c4282e.license) && AbstractC7890e.billing(this.appmetrica, c4282e.appmetrica) && AbstractC7890e.billing(this.purchase, c4282e.purchase) && AbstractC7890e.billing(this.billing, c4282e.billing) && C12973e.ad(this.yandex, c4282e.yandex) && AbstractC7890e.billing(this.startapp, c4282e.startapp) && AbstractC7890e.billing(this.adcel, c4282e.adcel) && AbstractC7890e.billing(this.mopub, c4282e.mopub) && C3618e.metrica(this.advert, c4282e.advert) && AbstractC7890e.billing(this.loadAd, c4282e.loadAd);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4282e)) {
            return false;
        }
        C4282e c4282e = (C4282e) obj;
        return ad(c4282e) && vip(c4282e);
    }

    public final int hashCode() {
        InterfaceC16522e interfaceC16522e = this.ad;
        long vip = interfaceC16522e.vip();
        int i = C3618e.mopub;
        int ad = C10994e.ad(vip) * 31;
        AbstractC4457e appmetrica = interfaceC16522e.appmetrica();
        int license = (C12973e.license(this.vip) + ((Float.floatToIntBits(interfaceC16522e.ad()) + ((ad + (appmetrica != null ? appmetrica.hashCode() : 0)) * 31)) * 31)) * 31;
        C1812e c1812e = this.metrica;
        int i2 = (license + (c1812e != null ? c1812e.f4894e : 0)) * 31;
        C6277e c6277e = this.license;
        int i3 = (i2 + (c6277e != null ? c6277e.ad : 0)) * 31;
        C5208e c5208e = this.appmetrica;
        int i4 = (i3 + (c5208e != null ? c5208e.ad : 0)) * 31;
        AbstractC16845e abstractC16845e = this.purchase;
        int hashCode = (i4 + (abstractC16845e != null ? abstractC16845e.hashCode() : 0)) * 31;
        String str = this.billing;
        int license2 = (C12973e.license(this.yandex) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        C8065e c8065e = this.startapp;
        int floatToIntBits = (license2 + (c8065e != null ? Float.floatToIntBits(c8065e.ad) : 0)) * 31;
        C3759e c3759e = this.adcel;
        int hashCode2 = (floatToIntBits + (c3759e != null ? c3759e.hashCode() : 0)) * 31;
        C4622e c4622e = this.mopub;
        int m1744class = AbstractC5087e.m1744class((hashCode2 + (c4622e != null ? c4622e.f9951e.hashCode() : 0)) * 31, this.advert, 31);
        C11964e c11964e = this.smaato;
        int i5 = (m1744class + (c11964e != null ? c11964e.ad : 0)) * 31;
        C13973e c13973e = this.amazon;
        int hashCode3 = (i5 + (c13973e != null ? c13973e.hashCode() : 0)) * 31;
        C4521e c4521e = this.loadAd;
        int hashCode4 = (hashCode3 + (c4521e != null ? c4521e.hashCode() : 0)) * 31;
        AbstractC4970e abstractC4970e = this.Signature;
        return hashCode4 + (abstractC4970e != null ? abstractC4970e.hashCode() : 0);
    }

    public final C4282e metrica(C4282e c4282e) {
        if (c4282e == null) {
            return this;
        }
        InterfaceC16522e interfaceC16522e = c4282e.ad;
        return AbstractC3300e.ad(this, interfaceC16522e.vip(), interfaceC16522e.appmetrica(), interfaceC16522e.ad(), c4282e.vip, c4282e.metrica, c4282e.license, c4282e.appmetrica, c4282e.purchase, c4282e.billing, c4282e.yandex, c4282e.startapp, c4282e.adcel, c4282e.mopub, c4282e.advert, c4282e.smaato, c4282e.amazon, c4282e.loadAd, c4282e.Signature);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        InterfaceC16522e interfaceC16522e = this.ad;
        sb.append((Object) C3618e.startapp(interfaceC16522e.vip()));
        sb.append(", brush=");
        sb.append(interfaceC16522e.appmetrica());
        sb.append(", alpha=");
        sb.append(interfaceC16522e.ad());
        sb.append(", fontSize=");
        sb.append((Object) C12973e.appmetrica(this.vip));
        sb.append(", fontWeight=");
        sb.append(this.metrica);
        sb.append(", fontStyle=");
        sb.append(this.license);
        sb.append(", fontSynthesis=");
        sb.append(this.appmetrica);
        sb.append(", fontFamily=");
        sb.append(this.purchase);
        sb.append(", fontFeatureSettings=");
        sb.append(this.billing);
        sb.append(", letterSpacing=");
        sb.append((Object) C12973e.appmetrica(this.yandex));
        sb.append(", baselineShift=");
        sb.append(this.startapp);
        sb.append(", textGeometricTransform=");
        sb.append(this.adcel);
        sb.append(", localeList=");
        sb.append(this.mopub);
        sb.append(", background=");
        AbstractC5087e.m1754try(this.advert, ", textDecoration=", sb);
        sb.append(this.smaato);
        sb.append(", shadow=");
        sb.append(this.amazon);
        sb.append(", platformStyle=");
        sb.append(this.loadAd);
        sb.append(", drawStyle=");
        sb.append(this.Signature);
        sb.append(')');
        return sb.toString();
    }

    public final boolean vip(C4282e c4282e) {
        return AbstractC7890e.billing(this.ad, c4282e.ad) && AbstractC7890e.billing(this.smaato, c4282e.smaato) && AbstractC7890e.billing(this.amazon, c4282e.amazon) && AbstractC7890e.billing(this.Signature, c4282e.Signature);
    }
}
