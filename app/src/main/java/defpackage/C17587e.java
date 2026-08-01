package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17587e implements InterfaceC8645e {
    public final boolean ad;

    public C17587e(boolean z) {
        this.ad = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17587e) && this.ad == ((C17587e) obj).ad;
    }

    public final int hashCode() {
        return this.ad ? 1231 : 1237;
    }

    public final String toString() {
        return AbstractC1786e.isVip(new StringBuilder("Denied(shouldShowRationale="), this.ad, ')');
    }
}
