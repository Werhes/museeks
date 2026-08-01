package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12311e extends AbstractC18174e {
    public final String ad;
    public final Map vip;

    public C12311e(String str, Map map) {
        this.ad = str;
        this.vip = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12311e)) {
            return false;
        }
        C12311e c12311e = (C12311e) obj;
        return AbstractC7890e.billing(this.ad, c12311e.ad) && AbstractC7890e.billing(this.vip, c12311e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "Url(url=" + this.ad + ", additionalHttpHeaders=" + this.vip + ')';
    }
}
