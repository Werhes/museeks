package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eَۚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10515e {
    public static final C6049e Companion = new Object();
    public final String ad;
    public final C7887e metrica;
    public final int vip;

    public /* synthetic */ C10515e(int i, String str, int i2, C7887e c7887e) {
        this.ad = (i & 1) == 0 ? BuildConfig.FLAVOR : str;
        if ((i & 2) == 0) {
            this.vip = 1;
        } else {
            this.vip = i2;
        }
        if ((i & 4) == 0) {
            this.metrica = new C7887e();
        } else {
            this.metrica = c7887e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10515e)) {
            return false;
        }
        C10515e c10515e = (C10515e) obj;
        return AbstractC7890e.billing(this.ad, c10515e.ad) && this.vip == c10515e.vip && AbstractC7890e.billing(this.metrica, c10515e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad.hashCode() * 31) + this.vip) * 31);
    }

    public final String toString() {
        return "VkConfigNetworkProxyProduct(product=" + this.ad + ", version=" + this.vip + ", data=" + this.metrica + ')';
    }
}
