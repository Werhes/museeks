package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4123e {
    public final InterfaceC4082e ad;
    public final Map vip;

    public C4123e(InterfaceC4082e interfaceC4082e, Map map) {
        this.ad = interfaceC4082e;
        this.vip = AbstractC18467e.license(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4123e)) {
            return false;
        }
        C4123e c4123e = (C4123e) obj;
        return AbstractC7890e.billing(this.ad, c4123e.ad) && AbstractC7890e.billing(this.vip, c4123e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.ad + ", extras=" + this.vip + ")";
    }
}
