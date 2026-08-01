package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًّؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7887e {
    public static final C13576e Companion = new Object();
    public static final InterfaceC3477e[] license = {AbstractC18039e.appmetrica(2, new C8462e(6)), AbstractC18039e.appmetrica(2, new C8462e(7)), AbstractC18039e.appmetrica(2, new C8462e(8))};
    public final List ad;
    public final List metrica;
    public final List vip;

    public C7887e() {
        C13664e c13664e = C13664e.f27089e;
        this.ad = c13664e;
        this.vip = c13664e;
        this.metrica = c13664e;
    }

    public /* synthetic */ C7887e(int i, List list, List list2, List list3) {
        int i2 = i & 1;
        C13664e c13664e = C13664e.f27089e;
        if (i2 == 0) {
            this.ad = c13664e;
        } else {
            this.ad = list;
        }
        if ((i & 2) == 0) {
            this.vip = c13664e;
        } else {
            this.vip = list2;
        }
        if ((i & 4) == 0) {
            this.metrica = c13664e;
        } else {
            this.metrica = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7887e)) {
            return false;
        }
        C7887e c7887e = (C7887e) obj;
        return AbstractC7890e.billing(this.ad, c7887e.ad) && AbstractC7890e.billing(this.vip, c7887e.vip) && AbstractC7890e.billing(this.metrica, c7887e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC17861e.billing(this.ad.hashCode() * 31, 31, this.vip);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkConfigNetworkProxy(ip=");
        sb.append(this.ad);
        sb.append(", weight=");
        sb.append(this.vip);
        sb.append(", domains=");
        return AbstractC1786e.tapsense(sb, this.metrica, ')');
    }
}
