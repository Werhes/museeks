package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؙۨ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6833e {
    public static final C16285e Companion = new Object();
    public final int ad;
    public final int vip;

    public C6833e(int i, int i2) {
        this.ad = i;
        this.vip = i2;
    }

    public C6833e(int i, C2875e c2875e, C2875e c2875e2) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, C0305e.vip);
            throw null;
        }
        this.ad = c2875e.f6827e;
        this.vip = c2875e2.f6827e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6833e)) {
            return false;
        }
        C6833e c6833e = (C6833e) obj;
        return this.ad == c6833e.ad && this.vip == c6833e.vip;
    }

    public final int hashCode() {
        return (this.ad * 31) + this.vip;
    }

    public final String toString() {
        return "BsonValueData(time=" + ((Object) String.valueOf(this.ad & 4294967295L)) + ", inc=" + ((Object) String.valueOf(this.vip & 4294967295L)) + ')';
    }
}
