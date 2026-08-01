package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۙ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14210e extends AbstractC17920e {
    public final String ad;

    public C14210e(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC17920e)) {
            return false;
        }
        return this.ad.equals(((C14210e) ((AbstractC17920e) obj)).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1786e.signatures(new StringBuilder("User{identifier="), this.ad, "}");
    }
}
