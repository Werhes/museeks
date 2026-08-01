package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2026e {
    public byte ad;
    public byte vip;

    public C2026e(C2992e c2992e, byte b) {
        this.ad = b;
        this.vip = b;
        if (C16582e.startapp().vip(c2992e.f4425e)) {
            this.vip = (byte) (((byte) (this.vip | 32)) & (-65));
        } else {
            this.vip = (byte) (((byte) (this.vip & (-33))) & (-65));
        }
    }

    public C2026e(C6276e c6276e, byte b) {
        this.ad = b;
        this.vip = b;
        if (C11673e.yandex().vip(c6276e.f4425e)) {
            this.vip = (byte) (((byte) (this.vip | 64)) & Byte.MAX_VALUE);
        } else {
            this.vip = (byte) (((byte) (this.vip & (-65))) & Byte.MAX_VALUE);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2026e)) {
            return false;
        }
        C2026e c2026e = (C2026e) obj;
        return ((long) this.ad) == ((long) c2026e.ad) && ((long) this.vip) == ((long) c2026e.vip);
    }
}
