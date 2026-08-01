package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: const, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cconst {
    public final C10985e ad;

    public /* synthetic */ Cconst(C10985e c10985e) {
        this.ad = c10985e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Cconst) {
            return AbstractC7890e.billing(this.ad, ((Cconst) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "AboutDestination(packed=" + this.ad + ')';
    }
}
