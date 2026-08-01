package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۛۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8982e extends AbstractC16845e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C7850e f18032e;

    public C8982e(C7850e c7850e) {
        this.f18032e = c7850e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8982e) {
            return this.f18032e.equals(((C8982e) obj).f18032e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18032e.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f18032e + ')';
    }
}
