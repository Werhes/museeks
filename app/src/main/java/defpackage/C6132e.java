package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6132e {
    public final int ad;

    public final boolean equals(Object obj) {
        if (obj instanceof C6132e) {
            return this.ad == ((C6132e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        int i = this.ad;
        return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
    }
}
