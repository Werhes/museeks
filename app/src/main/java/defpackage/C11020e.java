package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11020e {
    public C8905e ad;

    public C11020e(C8905e c8905e) {
        this.ad = c8905e;
    }

    public final boolean equals(Object obj) {
        boolean z = obj == this;
        if (!(obj instanceof C11020e) || z) {
            return z;
        }
        boolean equals = this.ad.f17871e.equals(((C11020e) obj).ad.f17871e);
        this.ad.getClass();
        return equals;
    }

    public final int hashCode() {
        int hashCode = this.ad.f17871e.hashCode();
        this.ad.getClass();
        return hashCode * 961;
    }
}
