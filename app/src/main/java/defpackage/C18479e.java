package defpackage;

import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eۤۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18479e {
    public static final C12071e Companion = new Object();
    public static final C18479e advert;
    public final long ad;
    public final String adcel;
    public final String appmetrica;
    public final String billing;
    public final String license;
    public final C5471e metrica;
    public final boolean mopub;
    public final C5471e purchase;
    public final String startapp;
    public final String vip;
    public final String yandex;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣۖ, java.lang.Object] */
    static {
        C5471e c5471e = C5471e.f11744e;
        long j = 999999999;
        advert = new C18479e(0L, BuildConfig.FLAVOR, C13023e.metrica(-3217862419201L, j), BuildConfig.FLAVOR, BuildConfig.FLAVOR, C13023e.metrica(-3217862419201L, j), BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, true);
    }

    public /* synthetic */ C18479e(int i, long j, String str, C5471e c5471e, String str2, String str3, C5471e c5471e2, String str4, String str5, String str6, String str7, boolean z) {
        if (2047 != (i & 2047)) {
            AbstractC5756e.billing(i, 2047, C3940e.ad.appmetrica());
            throw null;
        }
        this.ad = j;
        this.vip = str;
        this.metrica = c5471e;
        this.license = str2;
        this.appmetrica = str3;
        this.purchase = c5471e2;
        this.billing = str4;
        this.yandex = str5;
        this.startapp = str6;
        this.adcel = str7;
        this.mopub = z;
    }

    public C18479e(long j, String str, C5471e c5471e, String str2, String str3, C5471e c5471e2, String str4, String str5, String str6, String str7, boolean z) {
        this.ad = j;
        this.vip = str;
        this.metrica = c5471e;
        this.license = str2;
        this.appmetrica = str3;
        this.purchase = c5471e2;
        this.billing = str4;
        this.yandex = str5;
        this.startapp = str6;
        this.adcel = str7;
        this.mopub = z;
    }

    public static C18479e ad(C18479e c18479e, long j, String str, C5471e c5471e, String str2, String str3, C5471e c5471e2, String str4, String str5, String str6, String str7, boolean z, int i) {
        if ((i & 1) != 0) {
            j = c18479e.ad;
        }
        long j2 = j;
        String str8 = (i & 2) != 0 ? c18479e.vip : str;
        C5471e c5471e3 = (i & 4) != 0 ? c18479e.metrica : c5471e;
        String str9 = (i & 8) != 0 ? c18479e.license : str2;
        String str10 = (i & 16) != 0 ? c18479e.appmetrica : str3;
        C5471e c5471e4 = (i & 32) != 0 ? c18479e.purchase : c5471e2;
        String str11 = (i & 64) != 0 ? c18479e.billing : str4;
        String str12 = (i & 128) != 0 ? c18479e.yandex : str5;
        String str13 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c18479e.startapp : str6;
        String str14 = (i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c18479e.adcel : str7;
        boolean z2 = (i & 1024) != 0 ? c18479e.mopub : z;
        c18479e.getClass();
        return new C18479e(j2, str8, c5471e3, str9, str10, c5471e4, str11, str12, str13, str14, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18479e)) {
            return false;
        }
        C18479e c18479e = (C18479e) obj;
        return this.ad == c18479e.ad && AbstractC7890e.billing(this.vip, c18479e.vip) && AbstractC7890e.billing(this.metrica, c18479e.metrica) && AbstractC7890e.billing(this.license, c18479e.license) && AbstractC7890e.billing(this.appmetrica, c18479e.appmetrica) && AbstractC7890e.billing(this.purchase, c18479e.purchase) && AbstractC7890e.billing(this.billing, c18479e.billing) && AbstractC7890e.billing(this.yandex, c18479e.yandex) && AbstractC7890e.billing(this.startapp, c18479e.startapp) && AbstractC7890e.billing(this.adcel, c18479e.adcel) && this.mopub == c18479e.mopub;
    }

    public final int hashCode() {
        long j = this.ad;
        return AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert((this.purchase.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert((this.metrica.hashCode() + AbstractC1786e.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.vip)) * 31, 31, this.license), 31, this.appmetrica)) * 31, 31, this.billing), 31, this.yandex), 31, this.startapp), 31, this.adcel) + (this.mopub ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAccount(id=");
        sb.append(this.ad);
        sb.append(", accessToken=");
        sb.append(this.vip);
        sb.append(", accessTokenExpiresAt=");
        sb.append(this.metrica);
        sb.append(", trustedHash=");
        sb.append(this.license);
        sb.append(", exchangeToken=");
        sb.append(this.appmetrica);
        sb.append(", metadataExpiresAt=");
        sb.append(this.purchase);
        AbstractC13501e.Signature(sb, ", username=", this.billing, ", firstName=", this.yandex);
        AbstractC13501e.Signature(sb, ", lastName=", this.startapp, ", avatar=", this.adcel);
        sb.append(", usesLatestApi=");
        sb.append(this.mopub);
        sb.append(")");
        return sb.toString();
    }
}
