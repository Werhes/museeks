package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9007e {
    public final List ad;
    public final int appmetrica;
    public final int license;
    public final int metrica;
    public final List vip;

    public C9007e(int i, int i2, int i3, List list, List list2) {
        this.ad = list;
        this.vip = list2;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9007e)) {
            return false;
        }
        C9007e c9007e = (C9007e) obj;
        return AbstractC7890e.billing(this.ad, c9007e.ad) && AbstractC7890e.billing(this.vip, c9007e.vip) && this.metrica == c9007e.metrica && this.license == c9007e.license && this.appmetrica == c9007e.appmetrica;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        List list = this.vip;
        return ((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.metrica) * 31) + this.license) * 31) + this.appmetrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BestSizesAndMaxFpsForConfigs(bestSizes=");
        sb.append(this.ad);
        sb.append(", bestSizesForStreamUseCase=");
        sb.append(this.vip);
        sb.append(", maxFpsForBestSizes=");
        sb.append(this.metrica);
        sb.append(", maxFpsForStreamUseCase=");
        sb.append(this.license);
        sb.append(", maxFpsForAllSizes=");
        return AbstractC1786e.pro(sb, this.appmetrica, ')');
    }
}
