package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17239e extends AbstractC18068e {
    public final C13198e ad;

    public C17239e(C13198e c13198e) {
        this.ad = c13198e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17239e.class != obj.getClass()) {
            return false;
        }
        return this.ad.equals(((C17239e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() + (C17239e.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.ad + '}';
    }
}
