package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًَُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10878e {
    public static final C1905e Companion = new Object();
    public final int ad;
    public final String appmetrica;
    public final String license;
    public final int metrica;
    public final int vip;

    public /* synthetic */ C10878e(int i, int i2, int i3, int i4, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C6895e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        if ((i & 2) == 0) {
            this.vip = 0;
        } else {
            this.vip = i3;
        }
        if ((i & 4) == 0) {
            this.metrica = 0;
        } else {
            this.metrica = i4;
        }
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str;
        }
        if ((i & 16) == 0) {
            this.appmetrica = BuildConfig.FLAVOR;
        } else {
            this.appmetrica = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10878e)) {
            return false;
        }
        C10878e c10878e = (C10878e) obj;
        return this.ad == c10878e.ad && this.vip == c10878e.vip && this.metrica == c10878e.metrica && AbstractC7890e.billing(this.license, c10878e.license) && AbstractC7890e.billing(this.appmetrica, c10878e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + AbstractC1786e.advert(((((this.ad * 31) + this.vip) * 31) + this.metrica) * 31, 31, this.license);
    }

    public final String toString() {
        StringBuilder pro = AbstractC17861e.pro(this.ad, this.vip, "AuthSetAuthCodeStatusResponseDto(status=", ", expiresIn=", ", pollingDelay=");
        pro.append(this.metrica);
        pro.append(", faqUrl=");
        pro.append(this.license);
        pro.append(", domain=");
        return AbstractC1786e.signatures(pro, this.appmetrica, ")");
    }
}
