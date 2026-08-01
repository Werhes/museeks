package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؑۙۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535e implements InterfaceC8399e {
    public static final C18176e Companion = new Object();
    public final String ad;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C0535e(int i, String str, String str2, String str3) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0535e)) {
            return false;
        }
        C0535e c0535e = (C0535e) obj;
        return AbstractC7890e.billing(this.ad, c0535e.ad) && AbstractC7890e.billing(this.vip, c0535e.vip) && AbstractC7890e.billing(this.metrica, c0535e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip);
    }

    public final String toString() {
        return AbstractC1786e.signatures(AbstractC17861e.tapsense("ClientError(error=", this.ad, ", errorDescription=", this.vip, ", errorType="), this.metrica, ")");
    }
}
