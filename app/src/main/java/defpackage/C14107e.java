package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14107e implements InterfaceC15313e {
    public final EnumC11043e ad;
    public final boolean appmetrica;
    public final boolean license;
    public final boolean metrica;
    public final boolean vip;

    public C14107e(EnumC11043e enumC11043e, boolean z, boolean z2, boolean z3, boolean z4) {
        this.ad = enumC11043e;
        this.vip = z;
        this.metrica = z2;
        this.license = z3;
        this.appmetrica = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14107e)) {
            return false;
        }
        C14107e c14107e = (C14107e) obj;
        return this.ad == c14107e.ad && this.vip == c14107e.vip && this.metrica == c14107e.metrica && this.license == c14107e.license && this.appmetrica == c14107e.appmetrica;
    }

    public final int hashCode() {
        return (((((((this.ad.hashCode() * 31) + (this.vip ? 1231 : 1237)) * 31) + (this.metrica ? 1231 : 1237)) * 31) + (this.license ? 1231 : 1237)) * 31) + (this.appmetrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValuePropertyType(storageType=");
        sb.append(this.ad);
        sb.append(", isNullable=");
        sb.append(this.vip);
        sb.append(", isPrimaryKey=");
        sb.append(this.metrica);
        sb.append(", isIndexed=");
        sb.append(this.license);
        sb.append(", isFullTextIndexed=");
        return AbstractC8703e.signatures(sb, this.appmetrica, ")");
    }
}
