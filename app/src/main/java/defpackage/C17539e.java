package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17539e {
    public InterfaceC14388e ad;
    public long license;
    public InterfaceC14576e metrica;
    public EnumC7792e vip;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17539e)) {
            return false;
        }
        C17539e c17539e = (C17539e) obj;
        return AbstractC7890e.billing(this.ad, c17539e.ad) && this.vip == c17539e.vip && AbstractC7890e.billing(this.metrica, c17539e.metrica) && C2108e.vip(this.license, c17539e.license);
    }

    public final int hashCode() {
        int hashCode = (this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31;
        long j = this.license;
        return ((int) (j ^ (j >>> 32))) + hashCode;
    }

    public final String toString() {
        return "DrawParams(density=" + this.ad + ", layoutDirection=" + this.vip + ", canvas=" + this.metrica + ", size=" + ((Object) C2108e.startapp(this.license)) + ')';
    }
}
