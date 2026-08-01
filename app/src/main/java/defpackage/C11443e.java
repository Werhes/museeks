package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11443e {
    public static final C11443e metrica = new C11443e(0, false);
    public final int ad;
    public final boolean vip;

    public C11443e(int i, boolean z) {
        this.ad = i;
        this.vip = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11443e.class == obj.getClass()) {
            C11443e c11443e = (C11443e) obj;
            if (this.ad == c11443e.ad && this.vip == c11443e.vip) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.ad << 1) + (this.vip ? 1 : 0);
    }
}
