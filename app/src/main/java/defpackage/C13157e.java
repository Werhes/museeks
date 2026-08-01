package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٍْٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13157e {
    public static final C3287e Companion = new Object();
    public final int ad;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C13157e(int i, int i2, String str, String str2) {
        this.ad = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.vip = BuildConfig.FLAVOR;
        } else {
            this.vip = str;
        }
        if ((i & 4) == 0) {
            this.metrica = BuildConfig.FLAVOR;
        } else {
            this.metrica = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13157e)) {
            return false;
        }
        C13157e c13157e = (C13157e) obj;
        return this.ad == c13157e.ad && AbstractC7890e.billing(this.vip, c13157e.vip) && AbstractC7890e.billing(this.metrica, c13157e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC1786e.advert(this.ad * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkConfigNetworkCertificate(id=");
        sb.append(this.ad);
        sb.append(", hpkp=");
        sb.append(this.vip);
        sb.append(", cert=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
