package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8651e {
    public final C9577e ad;
    public final C9577e vip;

    public C8651e() {
        C9577e c9577e = C5438e.f11672e;
        this.ad = c9577e;
        this.vip = c9577e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8651e)) {
            return false;
        }
        C8651e c8651e = (C8651e) obj;
        return AbstractC7890e.billing(this.ad, c8651e.ad) && AbstractC7890e.billing(this.vip, c8651e.vip);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.vip.ad) + AbstractC1414e.license(38347, this.ad.ad, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.ad + ", expandedAlignment=" + this.vip + ')';
    }
}
