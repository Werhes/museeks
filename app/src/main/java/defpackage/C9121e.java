package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۦ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9121e extends AbstractC11367e {
    public final String ad;

    public C9121e(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11367e)) {
            return false;
        }
        return this.ad.equals(((C9121e) ((AbstractC11367e) obj)).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1786e.signatures(new StringBuilder("Log{content="), this.ad, "}");
    }
}
