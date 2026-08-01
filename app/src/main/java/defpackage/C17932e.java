package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17932e {
    public final Object ad;
    public final C2892e vip;

    public C17932e(C18362e c18362e, C2892e c2892e) {
        this.ad = c18362e;
        this.vip = c2892e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17932e)) {
            return false;
        }
        C17932e c17932e = (C17932e) obj;
        return AbstractC7890e.billing(this.ad, c17932e.ad) && this.vip.equals(c17932e.vip);
    }

    public final int hashCode() {
        Object obj = this.ad;
        return this.vip.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.ad + ", transition=" + this.vip + ')';
    }
}
