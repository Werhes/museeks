package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؚۧؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7610e {
    public static final C12023e Companion = new Object();
    public static final InterfaceC3477e[] license = {null, null, AbstractC18039e.appmetrica(2, new C8462e(5))};
    public final String ad;
    public final List metrica;
    public final int vip;

    public /* synthetic */ C7610e(int i, int i2, String str, List list) {
        this.ad = (i & 1) == 0 ? BuildConfig.FLAVOR : str;
        this.vip = (i & 2) == 0 ? 1 : i2;
        if ((i & 4) == 0) {
            this.metrica = C13664e.f27089e;
        } else {
            this.metrica = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7610e)) {
            return false;
        }
        C7610e c7610e = (C7610e) obj;
        return AbstractC7890e.billing(this.ad, c7610e.ad) && this.vip == c7610e.vip && AbstractC7890e.billing(this.metrica, c7610e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad.hashCode() * 31) + this.vip) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkConfigNetworkProxyCertificatesProduct(product=");
        sb.append(this.ad);
        sb.append(", version=");
        sb.append(this.vip);
        sb.append(", certs=");
        return AbstractC1786e.tapsense(sb, this.metrica, ')');
    }
}
