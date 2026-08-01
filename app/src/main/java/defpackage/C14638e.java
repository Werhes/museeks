package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14638e extends AbstractC18068e {
    public final C13198e ad = C13198e.metrica;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14638e.class != obj.getClass()) {
            return false;
        }
        return this.ad.equals(((C14638e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() + (C14638e.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.ad + '}';
    }
}
