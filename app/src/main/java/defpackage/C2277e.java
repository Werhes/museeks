package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؔؐؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2277e {
    public static final C17703e Companion = new Object();
    public final String ad;
    public final C5767e appmetrica;
    public final String license;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C2277e(int i, String str, String str2, String str3, String str4, C5767e c5767e) {
        if ((i & 1) == 0) {
            this.ad = BuildConfig.FLAVOR;
        } else {
            this.ad = str;
        }
        if ((i & 2) == 0) {
            this.vip = BuildConfig.FLAVOR;
        } else {
            this.vip = str2;
        }
        if ((i & 4) == 0) {
            this.metrica = BuildConfig.FLAVOR;
        } else {
            this.metrica = str3;
        }
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str4;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = c5767e;
        }
    }

    public C2277e(String str, String str2, String str3, C5767e c5767e, int i) {
        int i2 = i & 2;
        String str4 = BuildConfig.FLAVOR;
        str2 = i2 != 0 ? BuildConfig.FLAVOR : str2;
        str3 = (i & 4) != 0 ? BuildConfig.FLAVOR : str3;
        str4 = (i & 8) == 0 ? "artist" : str4;
        c5767e = (i & 16) != 0 ? null : c5767e;
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = c5767e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2277e)) {
            return false;
        }
        C2277e c2277e = (C2277e) obj;
        return AbstractC7890e.billing(this.ad, c2277e.ad) && AbstractC7890e.billing(this.vip, c2277e.vip) && AbstractC7890e.billing(this.metrica, c2277e.metrica) && AbstractC7890e.billing(this.license, c2277e.license) && AbstractC7890e.billing(this.appmetrica, c2277e.appmetrica);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica), 31, this.license);
        C5767e c5767e = this.appmetrica;
        return advert + (c5767e == null ? 0 : c5767e.hashCode());
    }

    public final String toString() {
        StringBuilder tapsense = AbstractC17861e.tapsense("Y25Title(title=", this.ad, ", value=", this.vip, ", caption=");
        AbstractC13501e.Signature(tapsense, this.metrica, ", resource=", this.license, ", content=");
        tapsense.append(this.appmetrica);
        tapsense.append(")");
        return tapsense.toString();
    }
}
