package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2598e extends AbstractC16287e {
    public final C3937e ad;

    public C2598e(C3937e c3937e) {
        EnumC8304e enumC8304e = EnumC8304e.f16985e;
        this.ad = c3937e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC16287e)) {
            return false;
        }
        if (!this.ad.equals(((C2598e) ((AbstractC16287e) obj)).ad)) {
            return false;
        }
        Object obj2 = EnumC8304e.f16985e;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ EnumC8304e.f16985e.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.ad + ", productIdOrigin=" + EnumC8304e.f16985e + "}";
    }
}
