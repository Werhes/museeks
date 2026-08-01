package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11939e {
    public final int ad;

    public final boolean equals(Object obj) {
        if (obj instanceof C11939e) {
            return this.ad == ((C11939e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        int i = this.ad;
        return i == 0 ? "LineHeightStyle.Mode.Fixed" : i == 1 ? "LineHeightStyle.Mode.Minimum" : i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
