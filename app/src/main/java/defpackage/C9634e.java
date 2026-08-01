package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9634e {
    public final Object ad;
    public final String license;
    public int metrica;
    public final int vip;

    public /* synthetic */ C9634e(InterfaceC3703e interfaceC3703e, int i, int i2, int i3) {
        this(interfaceC3703e, i, (i3 & 4) != 0 ? RecyclerView.UNDEFINED_DURATION : i2, BuildConfig.FLAVOR);
    }

    public C9634e(Object obj, int i, int i2, String str) {
        this.ad = obj;
        this.vip = i;
        this.metrica = i2;
        this.license = str;
    }

    public final C9363e ad(int i) {
        int i2 = this.metrica;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            AbstractC5525e.vip("Item.end should be set first");
        }
        return new C9363e(this.ad, this.vip, i, this.license);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9634e)) {
            return false;
        }
        C9634e c9634e = (C9634e) obj;
        return AbstractC7890e.billing(this.ad, c9634e.ad) && this.vip == c9634e.vip && this.metrica == c9634e.metrica && AbstractC7890e.billing(this.license, c9634e.license);
    }

    public final int hashCode() {
        Object obj = this.ad;
        return this.license.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.vip) * 31) + this.metrica) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.ad);
        sb.append(", start=");
        sb.append(this.vip);
        sb.append(", end=");
        sb.append(this.metrica);
        sb.append(", tag=");
        return AbstractC4653e.applovin(sb, this.license, ')');
    }
}
