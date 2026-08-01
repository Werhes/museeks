package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14715e implements InterfaceC10648e {
    public final InterfaceC14388e ad;
    public final long vip;

    public C14715e(InterfaceC7183e interfaceC7183e, long j) {
        this.ad = interfaceC7183e;
        this.vip = j;
    }

    @Override // defpackage.InterfaceC10648e
    public final InterfaceC12864e ad(InterfaceC12864e interfaceC12864e, C10156e c10156e) {
        return interfaceC12864e.premium(new C10148e(c10156e, false));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14715e)) {
            return false;
        }
        C14715e c14715e = (C14715e) obj;
        return AbstractC7890e.billing(this.ad, c14715e.ad) && C5602e.vip(this.vip, c14715e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long j = this.vip;
        return ((int) (j ^ (j >>> 32))) + hashCode;
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.ad + ", constraints=" + ((Object) C5602e.advert(this.vip)) + ')';
    }

    public final float vip() {
        long j = this.vip;
        if (!C5602e.license(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.ad.mo496final(C5602e.yandex(j));
    }
}
