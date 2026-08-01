package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eْ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13306e {
    public static final C7450e Companion = new Object();
    public final int ad;
    public final C16495e appmetrica;
    public final C7496e billing;
    public final C3984e license;
    public final boolean metrica;
    public final C3503e purchase;
    public final long vip;

    public /* synthetic */ C13306e(int i, int i2, C5655e c5655e, boolean z, C3984e c3984e, C16495e c16495e, C3503e c3503e, C7496e c7496e) {
        if (7 != (i & 7)) {
            AbstractC5756e.billing(i, 7, C7946e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = c5655e.ad;
        this.metrica = z;
        if ((i & 8) == 0) {
            this.license = null;
        } else {
            this.license = c3984e;
        }
        if ((i & 16) == 0) {
            this.appmetrica = null;
        } else {
            this.appmetrica = c16495e;
        }
        if ((i & 32) == 0) {
            this.purchase = null;
        } else {
            this.purchase = c3503e;
        }
        if ((i & 64) == 0) {
            this.billing = null;
        } else {
            this.billing = c7496e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13306e)) {
            return false;
        }
        C13306e c13306e = (C13306e) obj;
        return this.ad == c13306e.ad && C5655e.ad(this.vip, c13306e.vip) && this.metrica == c13306e.metrica && AbstractC7890e.billing(this.license, c13306e.license) && AbstractC7890e.billing(this.appmetrica, c13306e.appmetrica) && AbstractC7890e.billing(this.purchase, c13306e.purchase) && AbstractC7890e.billing(this.billing, c13306e.billing);
    }

    public final int hashCode() {
        int vip = (((C5655e.vip(this.vip) + (this.ad * 31)) * 31) + (this.metrica ? 1231 : 1237)) * 31;
        C3984e c3984e = this.license;
        int hashCode = (vip + (c3984e == null ? 0 : c3984e.hashCode())) * 31;
        C16495e c16495e = this.appmetrica;
        int hashCode2 = (hashCode + (c16495e == null ? 0 : c16495e.hashCode())) * 31;
        C3503e c3503e = this.purchase;
        int hashCode3 = (hashCode2 + (c3503e == null ? 0 : c3503e.hashCode())) * 31;
        C7496e c7496e = this.billing;
        return hashCode3 + (c7496e != null ? c7496e.hashCode() : 0);
    }

    public final String toString() {
        return "AuthRefreshTokenDto(index=" + this.ad + ", userId=" + String.valueOf(this.vip) + ", banned=" + this.metrica + ", accessToken=" + this.license + ", webviewAccessToken=" + this.appmetrica + ", webviewRefreshToken=" + this.purchase + ", silentToken=" + this.billing + ")";
    }
}
