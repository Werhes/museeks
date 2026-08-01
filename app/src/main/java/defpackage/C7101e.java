package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7101e {
    public final Integer ad;
    public final C8406e license;
    public final EnumC6651e metrica;
    public final Object vip;

    public C7101e(Integer num, Object obj, EnumC6651e enumC6651e, C8406e c8406e) {
        this.ad = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.vip = obj;
        this.metrica = enumC6651e;
        this.license = c8406e;
    }

    public final boolean equals(Object obj) {
        C8406e c8406e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7101e) {
            C7101e c7101e = (C7101e) obj;
            C8406e c8406e2 = c7101e.license;
            Integer num = c7101e.ad;
            Integer num2 = this.ad;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.vip.equals(c7101e.vip) && this.metrica.equals(c7101e.metrica) && ((c8406e = this.license) != null ? c8406e.equals(c8406e2) : c8406e2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.ad;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode()) * 1000003;
        C8406e c8406e = this.license;
        return ((c8406e != null ? c8406e.hashCode() : 0) ^ hashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.ad + ", payload=" + this.vip + ", priority=" + this.metrica + ", productData=" + this.license + ", eventContext=null}";
    }
}
