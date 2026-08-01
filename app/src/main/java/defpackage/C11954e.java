package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11954e implements InterfaceC4547e {
    public final C15458e ad;
    public final C13155e vip;

    public C11954e(C15458e c15458e, C13155e c13155e) {
        this.ad = c15458e;
        this.vip = c13155e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11954e)) {
            return false;
        }
        C11954e c11954e = (C11954e) obj;
        return this.ad.equals(c11954e.ad) && this.vip.equals(c11954e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "Success(activeCamera=" + this.ad + ", token=" + this.vip + ')';
    }
}
