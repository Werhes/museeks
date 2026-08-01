package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eُۘؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11209e implements InterfaceC8399e {
    public static final C4348e Companion = new Object();
    public static final InterfaceC3477e[] billing = {AbstractC18039e.appmetrica(2, new C11689e(28)), null, null, null, null, null};
    public final EnumC16168e ad;
    public final String appmetrica;
    public final int license;
    public final String metrica;
    public final String purchase;
    public final String vip;

    public /* synthetic */ C11209e(int i, EnumC16168e enumC16168e, String str, String str2, int i2, String str3, String str4) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C2600e.ad.appmetrica());
            throw null;
        }
        this.ad = enumC16168e;
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
        if ((i & 8) == 0) {
            this.license = 4;
        } else {
            this.license = i2;
        }
        if ((i & 16) == 0) {
            this.appmetrica = BuildConfig.FLAVOR;
        } else {
            this.appmetrica = str3;
        }
        if ((i & 32) == 0) {
            this.purchase = BuildConfig.FLAVOR;
        } else {
            this.purchase = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11209e)) {
            return false;
        }
        C11209e c11209e = (C11209e) obj;
        return this.ad == c11209e.ad && AbstractC7890e.billing(this.vip, c11209e.vip) && AbstractC7890e.billing(this.metrica, c11209e.metrica) && this.license == c11209e.license && AbstractC7890e.billing(this.appmetrica, c11209e.appmetrica) && AbstractC7890e.billing(this.purchase, c11209e.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + AbstractC1786e.advert((AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica) + this.license) * 31, 31, this.appmetrica);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoFactorRequired(validationType=");
        sb.append(this.ad);
        sb.append(", phoneMask=");
        sb.append(this.vip);
        sb.append(", maskedEmail=");
        sb.append(this.metrica);
        sb.append(", codeLength=");
        sb.append(this.license);
        sb.append(", deviceName=");
        return AbstractC4653e.ads(sb, this.appmetrica, ", validationSid=", this.purchase, ")");
    }
}
