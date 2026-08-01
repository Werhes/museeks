package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17625e {
    public final int ad;

    public static String ad(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17625e) {
            return this.ad == ((C17625e) obj).ad;
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
