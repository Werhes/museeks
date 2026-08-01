package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8366e {
    public final int ad;
    public final boolean vip;

    public C8366e(int i, boolean z) {
        this.ad = i;
        this.vip = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8366e.class != obj.getClass()) {
            return false;
        }
        C8366e c8366e = (C8366e) obj;
        return this.ad == c8366e.ad && this.vip == c8366e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + (this.vip ? 1 : 0);
    }
}
