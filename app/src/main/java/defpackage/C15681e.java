package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۘۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15681e {
    public final Object ad;

    public C15681e(Object obj) {
        this.ad = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15681e) {
            return this.ad.equals(((C15681e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.ad + "}";
    }
}
