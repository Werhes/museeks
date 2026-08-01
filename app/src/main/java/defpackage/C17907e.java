package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٞۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17907e {
    public final EnumC10949e ad;
    public final boolean metrica;
    public final EnumC10949e vip;

    public C17907e(EnumC10949e enumC10949e, EnumC10949e enumC10949e2) {
        this.ad = enumC10949e;
        this.vip = enumC10949e2;
        EnumC10949e enumC10949e3 = EnumC10949e.f21680e;
        this.metrica = enumC10949e == enumC10949e3 && enumC10949e2 == enumC10949e3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17907e)) {
            return false;
        }
        C17907e c17907e = (C17907e) obj;
        if (this.ad != c17907e.ad || this.vip != c17907e.vip) {
            return false;
        }
        C9139e c9139e = C9139e.f18290e;
        return c9139e.equals(c9139e);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        EnumC10949e enumC10949e = this.vip;
        return (hashCode + (enumC10949e == null ? 0 : enumC10949e.hashCode())) * 31;
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.ad + ", migrationLevel=" + this.vip + ", userDefinedLevelForSpecificAnnotation=" + C9139e.f18290e + ')';
    }
}
