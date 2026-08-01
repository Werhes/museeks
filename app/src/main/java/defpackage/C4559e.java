package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؐۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4559e {
    public final String ad;
    public static final C4559e vip = new C4559e("text/*");
    public static final C4559e metrica = new C4559e("*/*");

    public C4559e(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4559e)) {
            return false;
        }
        return AbstractC7890e.billing(this.ad, ((C4559e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC1786e.signatures(new StringBuilder("MediaType(representation='"), this.ad, "')");
    }
}
