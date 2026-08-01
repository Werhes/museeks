package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5526e implements InterfaceC15313e {
    public final EnumC11043e ad;
    public final boolean vip;

    public C5526e(EnumC11043e enumC11043e, boolean z) {
        this.ad = enumC11043e;
        this.vip = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5526e)) {
            return false;
        }
        C5526e c5526e = (C5526e) obj;
        return this.ad == c5526e.ad && this.vip == c5526e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237);
    }

    public final String toString() {
        return "SetPropertyType(storageType=" + this.ad + ", isNullable=" + this.vip + ")";
    }
}
