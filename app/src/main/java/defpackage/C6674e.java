package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۜۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6674e {
    public final String ad;
    public final C17580e vip;

    public C6674e(String str, C17580e c17580e) {
        this.ad = str;
        this.vip = c17580e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6674e)) {
            return false;
        }
        C6674e c6674e = (C6674e) obj;
        return AbstractC7890e.billing(this.ad, c6674e.ad) && AbstractC7890e.billing(this.vip, c6674e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return this.ad;
    }
}
