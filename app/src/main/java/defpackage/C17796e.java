package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17796e {
    public final C10068e ad = new C10068e(4);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17796e) && this.ad.equals(((C17796e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "MetadataTransform(past=0, future=0, transformFn=" + this.ad + ')';
    }
}
