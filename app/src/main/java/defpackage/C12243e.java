package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12243e {
    public final Integer Signature;
    public final C10675e ad;
    public final int adcel;
    public final ArrayList admob;
    public final Long advert;
    public final Integer amazon;
    public final long appmetrica;
    public final int billing;
    public final long license;
    public final Integer loadAd;
    public final String metrica;
    public final Long mopub;
    public final long purchase;
    public final Long smaato;
    public final int startapp;
    public final boolean vip;
    public final long yandex;

    public /* synthetic */ C12243e(C10675e c10675e, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, int i4) {
        this(c10675e, z, (i4 & 4) != 0 ? BuildConfig.FLAVOR : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & 128) != 0 ? -1L : j4, (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? -1 : i2, (i4 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? -1 : i3, (i4 & 1024) != 0 ? null : l, (i4 & 2048) != 0 ? null : l2, (i4 & 4096) != 0 ? null : l3, null, null, null);
    }

    public C12243e(C10675e c10675e, boolean z, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3) {
        this.ad = c10675e;
        this.vip = z;
        this.metrica = str;
        this.license = j;
        this.appmetrica = j2;
        this.purchase = j3;
        this.billing = i;
        this.yandex = j4;
        this.startapp = i2;
        this.adcel = i3;
        this.mopub = l;
        this.advert = l2;
        this.smaato = l3;
        this.amazon = num;
        this.loadAd = num2;
        this.Signature = num3;
        this.admob = new ArrayList();
    }
}
