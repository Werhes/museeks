package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9207e {
    public final boolean ad;
    public final boolean vip;

    public C9207e(int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        this.ad = z;
        this.vip = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9207e)) {
            return false;
        }
        C9207e c9207e = (C9207e) obj;
        return this.ad == c9207e.ad && this.vip == c9207e.vip;
    }

    public final int hashCode() {
        return (((((((AbstractC8703e.m2467class(1) + ((((this.ad ? 1231 : 1237) * 31) + (this.vip ? 1231 : 1237)) * 31)) * 31) + 1231) * 31) + 1231) * 31) + 2) * 31;
    }
}
