package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15919e {
    public InterfaceC16154e ad;
    public C4383e appmetrica;
    public float license;
    public EnumC7792e metrica;
    public long vip;

    public C15919e(InterfaceC16154e interfaceC16154e, long j, EnumC7792e enumC7792e, float f, C4383e c4383e) {
        this.ad = interfaceC16154e;
        this.vip = j;
        this.metrica = enumC7792e;
        this.license = f;
        this.appmetrica = c4383e;
    }

    public static C15919e ad(C15919e c15919e) {
        return new C15919e(c15919e.ad, c15919e.vip, c15919e.metrica, c15919e.license, c15919e.appmetrica);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15919e)) {
            return false;
        }
        C15919e c15919e = (C15919e) obj;
        return AbstractC7890e.billing(this.ad, c15919e.ad) && C2108e.vip(this.vip, c15919e.vip) && this.metrica == c15919e.metrica && Float.compare(this.license, c15919e.license) == 0 && AbstractC7890e.billing(this.appmetrica, c15919e.appmetrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long j = this.vip;
        int license = AbstractC1414e.license((this.metrica.hashCode() + ((((int) (j ^ (j >>> 32))) + hashCode) * 31)) * 31, this.license, 31);
        C4383e c4383e = this.appmetrica;
        return license + (c4383e == null ? 0 : c4383e.hashCode());
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.ad + ", size=" + ((Object) C2108e.startapp(this.vip)) + ", layoutDirection=" + this.metrica + ", density=" + this.license + ", shadow=" + this.appmetrica + ')';
    }
}
