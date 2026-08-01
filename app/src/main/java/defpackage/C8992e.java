package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8992e {
    public final boolean ad;

    public C8992e(boolean z) {
        this.ad = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8992e) {
            return this.ad == ((C8992e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return (this.ad ? 1231 : 1237) * 31;
    }

    public final String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=" + this.ad;
    }
}
