package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eّٙٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12560e {
    public static final C6120e Companion = new Object();
    public static final InterfaceC3477e[] billing = {null, null, null, null, null, AbstractC18039e.appmetrica(2, new C0996e(29))};
    public final int ad;
    public final int appmetrica;
    public final boolean license;
    public final String metrica;
    public final Map purchase;
    public final String vip;

    public /* synthetic */ C12560e(int i, int i2, String str, String str2, boolean z, int i3, Map map) {
        if (35 != (i & 35)) {
            AbstractC5756e.billing(i, 35, C11780e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = str;
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = str2;
        }
        if ((i & 8) == 0) {
            this.license = false;
        } else {
            this.license = z;
        }
        if ((i & 16) == 0) {
            this.appmetrica = 0;
        } else {
            this.appmetrica = i3;
        }
        this.purchase = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12560e)) {
            return false;
        }
        C12560e c12560e = (C12560e) obj;
        return this.ad == c12560e.ad && AbstractC7890e.billing(this.vip, c12560e.vip) && AbstractC7890e.billing(this.metrica, c12560e.metrica) && this.license == c12560e.license && this.appmetrica == c12560e.appmetrica && AbstractC7890e.billing(this.purchase, c12560e.purchase);
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(this.ad * 31, 31, this.vip);
        String str = this.metrica;
        return this.purchase.hashCode() + ((((((advert + (str == null ? 0 : str.hashCode())) * 31) + (this.license ? 1231 : 1237)) * 31) + this.appmetrica) * 31);
    }

    public final String toString() {
        return "EngineTheme(id=" + this.ad + ", name=" + this.vip + ", author=" + this.metrica + ", light=" + this.license + ", associatedAccent=" + this.appmetrica + ", themeAttributes=" + this.purchase + ')';
    }
}
