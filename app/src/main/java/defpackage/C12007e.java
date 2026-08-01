package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۜ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12007e {
    public final String ad;

    public C12007e(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12007e)) {
            return false;
        }
        return this.ad.equals(((C12007e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1786e.signatures(new StringBuilder("Encoding{name=\""), this.ad, "\"}");
    }
}
