package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: e٘ۡۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18072e {
    public static final C17854e Companion = new Object();
    public final int ad;
    public final String license;
    public final long metrica;
    public final int vip;

    public /* synthetic */ C18072e(int i, int i2, int i3, long j, String str) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C13286e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        if ((i & 2) == 0) {
            this.vip = 0;
        } else {
            this.vip = i3;
        }
        if ((i & 4) == 0) {
            this.metrica = 0L;
        } else {
            this.metrica = j;
        }
        if ((i & 8) == 0) {
            this.license = BuildConfig.FLAVOR;
        } else {
            this.license = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18072e)) {
            return false;
        }
        C18072e c18072e = (C18072e) obj;
        return this.ad == c18072e.ad && this.vip == c18072e.vip && this.metrica == c18072e.metrica && AbstractC7890e.billing(this.license, c18072e.license);
    }

    public final int hashCode() {
        int i = ((this.ad * 31) + this.vip) * 31;
        long j = this.metrica;
        return this.license.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder pro = AbstractC17861e.pro(this.ad, this.vip, "AuthGetAuthCodeStatusResponseDto(status=", ", expiresIn=", ", userId=");
        pro.append(this.metrica);
        pro.append(", accessToken=");
        pro.append(this.license);
        pro.append(")");
        return pro.toString();
    }
}
