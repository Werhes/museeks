package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7019e {
    public final C9553e ad;
    public final InterfaceC17372e license;
    public final C17500e metrica;
    public final C0984e vip;

    public C7019e(C9553e c9553e, C0984e c0984e, C17500e c17500e, InterfaceC17372e interfaceC17372e) {
        this.ad = c9553e;
        this.vip = c0984e;
        this.metrica = c17500e;
        this.license = interfaceC17372e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7019e.class != obj.getClass()) {
            return false;
        }
        C7019e c7019e = (C7019e) obj;
        return AbstractC7890e.billing(this.ad, c7019e.ad) && AbstractC7890e.billing(this.vip, c7019e.vip) && AbstractC7890e.billing(this.metrica, c7019e.metrica) && AbstractC7890e.billing(this.license, c7019e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Values(colorScheme=" + this.ad + ", typography=" + this.vip + ", shapes=" + this.metrica + ", motionScheme=" + this.license + ')';
    }
}
