package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11646e {
    public static final C11646e license = new C11646e(EnumC10949e.f21677e, 6);
    public final EnumC10949e ad;
    public final EnumC10949e metrica;
    public final C8662e vip;

    public C11646e(EnumC10949e enumC10949e, int i) {
        this(enumC10949e, (i & 2) != 0 ? new C8662e(1, 0, 0) : null, enumC10949e);
    }

    public C11646e(EnumC10949e enumC10949e, C8662e c8662e, EnumC10949e enumC10949e2) {
        this.ad = enumC10949e;
        this.vip = c8662e;
        this.metrica = enumC10949e2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11646e)) {
            return false;
        }
        C11646e c11646e = (C11646e) obj;
        return this.ad == c11646e.ad && AbstractC7890e.billing(this.vip, c11646e.vip) && this.metrica == c11646e.metrica;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        C8662e c8662e = this.vip;
        return this.metrica.hashCode() + ((hashCode + (c8662e == null ? 0 : c8662e.f17503e)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.ad + ", sinceVersion=" + this.vip + ", reportLevelAfter=" + this.metrica + ')';
    }
}
