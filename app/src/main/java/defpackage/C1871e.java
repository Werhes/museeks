package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1871e {
    public final AbstractC3424e ad;
    public final InterfaceC17838e vip;

    public C1871e(AbstractC3424e abstractC3424e, InterfaceC17838e interfaceC17838e) {
        this.ad = abstractC3424e;
        this.vip = interfaceC17838e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1871e)) {
            return false;
        }
        C1871e c1871e = (C1871e) obj;
        return AbstractC7890e.billing(this.ad, c1871e.ad) && AbstractC7890e.billing(this.vip, c1871e.vip);
    }

    public final int hashCode() {
        return (this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.ad + ", easing=" + this.vip + ", arcMode=ArcMode(value=0))";
    }
}
