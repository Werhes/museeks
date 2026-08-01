package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؘٞٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5789e {
    public static final C7797e Companion = new Object();
    public static final InterfaceC3477e[] yandex = {null, null, null, null, AbstractC18039e.appmetrica(2, new C10673e(21)), null, null};
    public final int ad;
    public final InterfaceC5615e appmetrica;
    public final boolean billing;
    public final String license;
    public final boolean metrica;
    public final C5471e purchase;
    public final String vip;

    public /* synthetic */ C5789e(int i, int i2, String str, boolean z, String str2, InterfaceC5615e interfaceC5615e, C5471e c5471e, boolean z2) {
        if (59 != (i & 59)) {
            AbstractC5756e.billing(i, 59, C15261e.ad.appmetrica());
            throw null;
        }
        this.ad = i2;
        this.vip = str;
        if ((i & 4) == 0) {
            this.metrica = false;
        } else {
            this.metrica = z;
        }
        this.license = str2;
        this.appmetrica = interfaceC5615e;
        this.purchase = c5471e;
        if ((i & 64) == 0) {
            this.billing = false;
        } else {
            this.billing = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5789e)) {
            return false;
        }
        C5789e c5789e = (C5789e) obj;
        return this.ad == c5789e.ad && AbstractC7890e.billing(this.vip, c5789e.vip) && this.metrica == c5789e.metrica && AbstractC7890e.billing(this.license, c5789e.license) && AbstractC7890e.billing(this.appmetrica, c5789e.appmetrica) && AbstractC7890e.billing(this.purchase, c5789e.purchase) && this.billing == c5789e.billing;
    }

    public final int hashCode() {
        return ((this.purchase.hashCode() + ((this.appmetrica.hashCode() + AbstractC1786e.advert((AbstractC1786e.advert(this.ad * 31, 31, this.vip) + (this.metrica ? 1231 : 1237)) * 31, 31, this.license)) * 31)) * 31) + (this.billing ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SparkAppUpdate(versionCode=");
        sb.append(this.ad);
        sb.append(", versionName=");
        sb.append(this.vip);
        sb.append(", beta=");
        sb.append(this.metrica);
        sb.append(", changelog=");
        sb.append(this.license);
        sb.append(", downloadSource=");
        sb.append(this.appmetrica);
        sb.append(", releaseDate=");
        sb.append(this.purchase);
        sb.append(", forceUpdate=");
        return AbstractC1786e.isVip(sb, this.billing, ')');
    }
}
