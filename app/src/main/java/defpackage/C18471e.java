package defpackage;

import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eَۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18471e {
    public static final C13279e Companion = new Object();
    public final long ad;
    public final String appmetrica;
    public final String billing;
    public final String license;
    public final long metrica;
    public final long purchase;
    public final boolean startapp;
    public final String vip;
    public final String yandex;

    public /* synthetic */ C18471e(int i, long j, String str, long j2, String str2, String str3, long j3, String str4, String str5, boolean z) {
        if ((i & 1) == 0) {
            this.ad = 0L;
        } else {
            this.ad = j;
        }
        if ((i & 2) == 0) {
            this.vip = BuildConfig.FLAVOR;
        } else {
            this.vip = str;
        }
        if ((i & 4) == 0) {
            this.metrica = 0L;
        } else {
            this.metrica = j2;
        }
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = BuildConfig.FLAVOR;
        } else {
            this.appmetrica = str3;
        }
        if ((i & 32) == 0) {
            this.purchase = 0L;
        } else {
            this.purchase = j3;
        }
        if ((i & 64) == 0) {
            this.billing = BuildConfig.FLAVOR;
        } else {
            this.billing = str4;
        }
        if ((i & 128) == 0) {
            this.yandex = BuildConfig.FLAVOR;
        } else {
            this.yandex = str5;
        }
        this.startapp = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? false : z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18471e)) {
            return false;
        }
        C18471e c18471e = (C18471e) obj;
        return this.ad == c18471e.ad && AbstractC7890e.billing(this.vip, c18471e.vip) && this.metrica == c18471e.metrica && AbstractC7890e.billing(this.license, c18471e.license) && AbstractC7890e.billing(this.appmetrica, c18471e.appmetrica) && this.purchase == c18471e.purchase && AbstractC7890e.billing(this.billing, c18471e.billing) && AbstractC7890e.billing(this.yandex, c18471e.yandex) && this.startapp == c18471e.startapp;
    }

    public final int hashCode() {
        long j = this.ad;
        int advert = AbstractC1786e.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.vip);
        long j2 = this.metrica;
        int advert2 = AbstractC1786e.advert(AbstractC1786e.advert((advert + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.license), 31, this.appmetrica);
        long j3 = this.purchase;
        return AbstractC1786e.advert(AbstractC1786e.advert((advert2 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.billing), 31, this.yandex) + (this.startapp ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegacyVkAccount(id=");
        sb.append(this.ad);
        sb.append(", accessToken=");
        sb.append(this.vip);
        sb.append(", accessTokenExpiresAt=");
        sb.append(this.metrica);
        sb.append(", trustedHash=");
        AbstractC13501e.Signature(sb, this.license, ", exchangeToken=", this.appmetrica, ", metadataExpiresAt=");
        sb.append(this.purchase);
        sb.append(", username=");
        sb.append(this.billing);
        sb.append(", avatar=");
        sb.append(this.yandex);
        sb.append(", canUseModernVkApi=");
        sb.append(this.startapp);
        sb.append(")");
        return sb.toString();
    }
}
