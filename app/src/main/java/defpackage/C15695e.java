package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15695e {
    public final String ad;
    public final Map vip;

    public C15695e(String str, Map map) {
        this.ad = str;
        this.vip = AbstractC18467e.license(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15695e)) {
            return false;
        }
        C15695e c15695e = (C15695e) obj;
        return AbstractC7890e.billing(this.ad, c15695e.ad) && AbstractC7890e.billing(this.vip, c15695e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.ad + ", extras=" + this.vip + ")";
    }
}
