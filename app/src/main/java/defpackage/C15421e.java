package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15421e {
    public final InterfaceC6512e ad;

    public C15421e(InterfaceC6512e interfaceC6512e) {
        this.ad = interfaceC6512e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15421e) {
            return Float.compare(0.0f, 0.0f) == 0 && AbstractC7890e.billing(this.ad, ((C15421e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode() + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.ad + ')';
    }
}
