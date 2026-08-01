package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3859e implements InterfaceC9998e {
    public final String ad;
    public final AbstractC5296e vip;

    public C3859e(String str, AbstractC5296e abstractC5296e) {
        this.ad = str;
        this.vip = abstractC5296e;
    }

    @Override // defpackage.InterfaceC9998e
    public final String ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC9998e
    public final InterfaceC9998e adcel(int i) {
        vip();
        throw null;
    }

    @Override // defpackage.InterfaceC9998e
    public final AbstractC8457e appmetrica() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC9998e
    public final String billing(int i) {
        vip();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3859e)) {
            return false;
        }
        C3859e c3859e = (C3859e) obj;
        return AbstractC7890e.billing(this.ad, c3859e.ad) && AbstractC7890e.billing(this.vip, c3859e.vip);
    }

    @Override // defpackage.InterfaceC9998e
    public final List getAnnotations() {
        return C13664e.f27089e;
    }

    public final int hashCode() {
        return (this.vip.hashCode() * 31) + this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC9998e
    public final int license(String str) {
        vip();
        throw null;
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean metrica() {
        return false;
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean mopub(int i) {
        vip();
        throw null;
    }

    @Override // defpackage.InterfaceC9998e
    public final int purchase() {
        return 0;
    }

    @Override // defpackage.InterfaceC9998e
    public final List startapp(int i) {
        vip();
        throw null;
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("PrimitiveDescriptor("), this.ad, ')');
    }

    public final void vip() {
        throw new IllegalStateException(AbstractC1786e.signatures(new StringBuilder("Primitive descriptor "), this.ad, " does not have elements"));
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean yandex() {
        return false;
    }
}
