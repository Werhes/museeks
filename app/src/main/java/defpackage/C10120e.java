package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10120e {
    public final int ad;

    public static String ad(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Default" : i == 2 ? "Go" : i == 3 ? "Search" : i == 4 ? "Send" : i == 5 ? "Previous" : i == 6 ? "Next" : i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10120e) {
            return this.ad == ((C10120e) obj).ad;
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
