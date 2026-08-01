package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍؒۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479e implements InterfaceC8399e {
    public static final C13638e Companion = new Object();
    public final long ad;
    public final String license;
    public final int metrica;
    public final String vip;

    public /* synthetic */ C1479e(int i, int i2, long j, String str, String str2) {
        this.ad = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.vip = BuildConfig.FLAVOR;
        } else {
            this.vip = str;
        }
        this.metrica = (i & 4) == 0 ? 0 : i2;
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str2;
        }
    }

    public C1479e(long j, String str, int i) {
        this.ad = j;
        this.vip = str;
        this.metrica = i;
        this.license = BuildConfig.FLAVOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1479e)) {
            return false;
        }
        C1479e c1479e = (C1479e) obj;
        return this.ad == c1479e.ad && AbstractC7890e.billing(this.vip, c1479e.vip) && this.metrica == c1479e.metrica && AbstractC7890e.billing(this.license, c1479e.license);
    }

    public final int hashCode() {
        long j = this.ad;
        return this.license.hashCode() + ((AbstractC1786e.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.vip) + this.metrica) * 31);
    }

    public final String toString() {
        return "Success(userId=" + this.ad + ", accessToken=" + this.vip + ", accessTokenExpiresIn=" + this.metrica + ", trustedHash=" + this.license + ")";
    }
}
