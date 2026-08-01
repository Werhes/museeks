package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؕۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10796e {
    public static final C10796e appmetrica = new C10796e(null, false);
    public final EnumC7701e ad;
    public final boolean license;
    public final boolean metrica;
    public final EnumC16322e vip;

    public C10796e(EnumC7701e enumC7701e, EnumC16322e enumC16322e, boolean z, boolean z2) {
        this.ad = enumC7701e;
        this.vip = enumC16322e;
        this.metrica = z;
        this.license = z2;
    }

    public /* synthetic */ C10796e(EnumC7701e enumC7701e, boolean z) {
        this(enumC7701e, null, z, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10796e)) {
            return false;
        }
        C10796e c10796e = (C10796e) obj;
        return this.ad == c10796e.ad && this.vip == c10796e.vip && this.metrica == c10796e.metrica && this.license == c10796e.license;
    }

    public final int hashCode() {
        EnumC7701e enumC7701e = this.ad;
        int hashCode = (enumC7701e == null ? 0 : enumC7701e.hashCode()) * 31;
        EnumC16322e enumC16322e = this.vip;
        return ((((hashCode + (enumC16322e != null ? enumC16322e.hashCode() : 0)) * 31) + (this.metrica ? 1231 : 1237)) * 31) + (this.license ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.ad);
        sb.append(", mutability=");
        sb.append(this.vip);
        sb.append(", definitelyNotNull=");
        sb.append(this.metrica);
        sb.append(", isNullabilityQualifierForWarning=");
        return AbstractC1786e.isVip(sb, this.license, ')');
    }
}
