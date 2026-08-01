package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12170e implements InterfaceC9998e {
    public final String ad;
    public final InterfaceC9998e metrica;
    public final InterfaceC9998e vip;

    public C12170e(String str, InterfaceC9998e interfaceC9998e, InterfaceC9998e interfaceC9998e2) {
        this.ad = str;
        this.vip = interfaceC9998e;
        this.metrica = interfaceC9998e2;
    }

    @Override // defpackage.InterfaceC9998e
    public final String ad() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC9998e
    public final InterfaceC9998e adcel(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1786e.signatures(AbstractC4653e.premium("Illegal index ", i, ", "), this.ad, " expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.vip;
        }
        if (i2 == 1) {
            return this.metrica;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // defpackage.InterfaceC9998e
    public final AbstractC8457e appmetrica() {
        return C18215e.appmetrica;
    }

    @Override // defpackage.InterfaceC9998e
    public final String billing(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12170e)) {
            return false;
        }
        C12170e c12170e = (C12170e) obj;
        return AbstractC7890e.billing(this.ad, c12170e.ad) && AbstractC7890e.billing(this.vip, c12170e.vip) && AbstractC7890e.billing(this.metrica, c12170e.metrica);
    }

    @Override // defpackage.InterfaceC9998e
    public final List getAnnotations() {
        return C13664e.f27089e;
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31);
    }

    @Override // defpackage.InterfaceC9998e
    public final int license(String str) {
        Integer signatures = AbstractC6507e.signatures(str);
        if (signatures != null) {
            return signatures.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean metrica() {
        return false;
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean mopub(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(AbstractC1786e.signatures(AbstractC4653e.premium("Illegal index ", i, ", "), this.ad, " expects only non-negative indices").toString());
    }

    @Override // defpackage.InterfaceC9998e
    public final int purchase() {
        return 2;
    }

    @Override // defpackage.InterfaceC9998e
    public final List startapp(int i) {
        if (i >= 0) {
            return C13664e.f27089e;
        }
        throw new IllegalArgumentException(AbstractC1786e.signatures(AbstractC4653e.premium("Illegal index ", i, ", "), this.ad, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.ad + '(' + this.vip + ", " + this.metrica + ')';
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean yandex() {
        return false;
    }
}
