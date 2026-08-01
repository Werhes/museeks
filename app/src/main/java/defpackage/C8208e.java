package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۛؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8208e {
    public final String ad;
    public final C12025e vip;

    public C8208e(String str, C12025e c12025e) {
        this.ad = str;
        this.vip = c12025e;
        if (AbstractC5304e.m1866native(str)) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8208e)) {
            return false;
        }
        C8208e c8208e = (C8208e) obj;
        return AbstractC7890e.billing(this.ad, c8208e.ad) && AbstractC7890e.billing(this.vip, c8208e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: " + this.ad;
    }
}
