package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16192e {
    public final EnumC7701e ad;
    public final boolean vip;

    public C16192e(EnumC7701e enumC7701e, boolean z) {
        this.ad = enumC7701e;
        this.vip = z;
    }

    public static C16192e ad(C16192e c16192e, EnumC7701e enumC7701e, boolean z, int i) {
        if ((i & 1) != 0) {
            enumC7701e = c16192e.ad;
        }
        if ((i & 2) != 0) {
            z = c16192e.vip;
        }
        c16192e.getClass();
        return new C16192e(enumC7701e, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16192e)) {
            return false;
        }
        C16192e c16192e = (C16192e) obj;
        return this.ad == c16192e.ad && this.vip == c16192e.vip;
    }

    public final int hashCode() {
        return (this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.ad);
        sb.append(", isForWarningOnly=");
        return AbstractC1786e.isVip(sb, this.vip, ')');
    }
}
