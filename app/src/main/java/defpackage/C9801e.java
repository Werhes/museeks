package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9801e {
    public final C13705e ad;

    public C9801e(C13705e c13705e) {
        this.ad = c13705e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C9801e) && this.ad.equals(((C9801e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.ad + "}";
    }
}
