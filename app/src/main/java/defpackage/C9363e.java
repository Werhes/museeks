package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9363e {
    public final Object ad;
    public final String license;
    public final int metrica;
    public final int vip;

    public C9363e(Object obj, int i, int i2) {
        this(obj, i, i2, BuildConfig.FLAVOR);
    }

    public C9363e(Object obj, int i, int i2, String str) {
        this.ad = obj;
        this.vip = i;
        this.metrica = i2;
        this.license = str;
        if (i <= i2) {
            return;
        }
        AbstractC5525e.ad("Reversed range is not supported");
    }

    public static C9363e ad(C9363e c9363e, InterfaceC3703e interfaceC3703e, int i, int i2, int i3) {
        Object obj = interfaceC3703e;
        if ((i3 & 1) != 0) {
            obj = c9363e.ad;
        }
        if ((i3 & 2) != 0) {
            i = c9363e.vip;
        }
        if ((i3 & 4) != 0) {
            i2 = c9363e.metrica;
        }
        String str = c9363e.license;
        c9363e.getClass();
        return new C9363e(obj, i, i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9363e)) {
            return false;
        }
        C9363e c9363e = (C9363e) obj;
        return AbstractC7890e.billing(this.ad, c9363e.ad) && this.vip == c9363e.vip && this.metrica == c9363e.metrica && AbstractC7890e.billing(this.license, c9363e.license);
    }

    public final int hashCode() {
        Object obj = this.ad;
        return this.license.hashCode() + ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.vip) * 31) + this.metrica) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.ad);
        sb.append(", start=");
        sb.append(this.vip);
        sb.append(", end=");
        sb.append(this.metrica);
        sb.append(", tag=");
        return AbstractC4653e.applovin(sb, this.license, ')');
    }
}
