package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10296e extends AbstractC17416e {
    public final C1558e appmetrica;

    public C10296e(C1558e c1558e) {
        this.appmetrica = c1558e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C10296e.class == obj.getClass() && AbstractC7890e.billing(this.appmetrica, ((C10296e) obj).appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.appmetrica + ", direction=-1)";
    }
}
