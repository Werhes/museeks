package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16101e {
    public final int ad;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C16101e(int i, int i2, String str) {
        this((String) null, (i2 & 1) != 0 ? 0 : i, (i2 & 4) != 0 ? BuildConfig.FLAVOR : str);
    }

    public C16101e(String str, int i, String str2) {
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16101e)) {
            return false;
        }
        C16101e c16101e = (C16101e) obj;
        return this.ad == c16101e.ad && AbstractC7890e.billing(this.vip, c16101e.vip) && AbstractC7890e.billing(this.metrica, c16101e.metrica);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        String str = this.vip;
        return this.metrica.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorState(code=");
        sb.append(this.ad);
        sb.append(", extraPkg=");
        sb.append(this.vip);
        sb.append(", errorMessage=");
        return AbstractC4653e.applovin(sb, this.metrica, ')');
    }
}
