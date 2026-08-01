package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eُؖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10813e {
    public static final C1192e Companion = new Object();
    public final String ad;
    public final int appmetrica;
    public final String license;
    public final C15098e metrica;
    public final int purchase;
    public final C6902e vip;

    public /* synthetic */ C10813e(int i, String str, C6902e c6902e, C15098e c15098e, String str2, int i2, int i3) {
        if (55 != (i & 55)) {
            AbstractC5756e.billing(i, 55, C2447e.ad.appmetrica());
            throw null;
        }
        this.ad = str;
        this.vip = c6902e;
        this.metrica = c15098e;
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str2;
        }
        this.appmetrica = i2;
        this.purchase = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10813e)) {
            return false;
        }
        C10813e c10813e = (C10813e) obj;
        return AbstractC7890e.billing(this.ad, c10813e.ad) && AbstractC7890e.billing(this.vip, c10813e.vip) && AbstractC7890e.billing(this.metrica, c10813e.metrica) && AbstractC7890e.billing(this.license, c10813e.license) && this.appmetrica == c10813e.appmetrica && this.purchase == c10813e.purchase;
    }

    public final int hashCode() {
        return ((AbstractC1786e.advert((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31, 31, this.license) + this.appmetrica) * 31) + this.purchase;
    }

    public final String toString() {
        return "AuthCodeAuthInfoDto(authId=" + this.ad + ", clientInfo=" + this.vip + ", deviceInfo=" + this.metrica + ", domain=" + this.license + ", expiresIn=" + this.appmetrica + ", flowType=" + this.purchase + ")";
    }
}
