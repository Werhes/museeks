package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۘۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0521e implements InterfaceC14414e {
    public long ad = -1;
    public long vip = 1;
    public long metrica = -1;
    public int license = -1;
    public int appmetrica = -1;
    public int purchase = -1;
    public int billing = -1;
    public String yandex = BuildConfig.FLAVOR;
    public boolean startapp = false;
    public boolean adcel = false;
    public double mopub = 0.0d;
    public long advert = -1;
    public int smaato = -1;

    public C12894e ad() {
        C12894e billing = AbstractC1749e.billing(this);
        billing.vip(this.ad, "audioDataLength");
        billing.vip(this.vip, "audioDataStartPosition");
        billing.vip(this.metrica, "audioDataEndPosition");
        billing.ad(this.license, "bitRate");
        billing.ad(this.appmetrica, "noOfChannels");
        billing.ad(this.purchase, "samplingRate");
        billing.ad(this.billing, "bitsPerSample");
        billing.metrica(this.yandex, "encodingType");
        billing.license("isVbr", String.valueOf(this.startapp));
        billing.license("isLossless", String.valueOf(this.adcel));
        billing.license("trackLength", String.valueOf(this.mopub));
        billing.vip(this.advert, "noOfSamples");
        billing.ad(this.smaato, "byteRate");
        return billing;
    }

    public final String toString() {
        return ad().toString();
    }
}
