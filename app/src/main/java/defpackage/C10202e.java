package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10202e {
    public final int ad;

    public static String ad(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10202e) {
            return this.ad == ((C10202e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return ad(this.ad);
    }
}
