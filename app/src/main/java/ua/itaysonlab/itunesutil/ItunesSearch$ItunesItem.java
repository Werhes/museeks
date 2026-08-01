package ua.itaysonlab.itunesutil;

import defpackage.AbstractC1815e;
import defpackage.InterfaceC3919e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/itunesutil/ItunesSearch$ItunesItem", BuildConfig.FLAVOR, "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItunesSearch$ItunesItem {
    public static final ItunesSearch$ItunesItem smaato = new ItunesSearch$ItunesItem(null, null, null, null, null, null, null, null, null, null, null, null, 4095);
    public final String ad;
    public final Integer adcel;
    public final String advert;
    public final String appmetrica;
    public final String billing;
    public final String license;
    public final String metrica;
    public final Integer mopub;
    public final Integer purchase;
    public final Integer startapp;
    public final String vip;
    public final Integer yandex;

    public ItunesSearch$ItunesItem(String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2, Integer num3, Integer num4, Integer num5, String str7) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = str5;
        this.purchase = num;
        this.billing = str6;
        this.yandex = num2;
        this.startapp = num3;
        this.adcel = num4;
        this.mopub = num5;
        this.advert = str7;
    }

    public /* synthetic */ ItunesSearch$ItunesItem(String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2, Integer num3, Integer num4, Integer num5, String str7, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? BuildConfig.FLAVOR : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : num2, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : num3, (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : num4, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : str7);
    }
}
