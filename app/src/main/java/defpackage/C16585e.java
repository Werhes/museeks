package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۢۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16585e {
    public final C17013e ad;
    public final C2025e vip;

    public C16585e(C17013e c17013e, C2025e c2025e) {
        this.ad = c17013e;
        this.vip = c2025e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16585e)) {
            return false;
        }
        C16585e c16585e = (C16585e) obj;
        return AbstractC7890e.billing(this.ad, c16585e.ad) && AbstractC7890e.billing(this.vip, c16585e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.ad) + ", offsetMapping=" + this.vip + ')';
    }
}
