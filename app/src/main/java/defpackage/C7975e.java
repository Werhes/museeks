package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7975e {
    public final int ad;

    public static String ad(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7975e) {
            return this.ad == ((C7975e) obj).ad;
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
