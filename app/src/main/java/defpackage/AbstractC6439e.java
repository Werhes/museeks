package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6439e implements InterfaceC9998e {
    public final InterfaceC9998e ad;

    public AbstractC6439e(InterfaceC9998e interfaceC9998e) {
        this.ad = interfaceC9998e;
    }

    @Override // defpackage.InterfaceC9998e
    public final InterfaceC9998e adcel(int i) {
        if (i >= 0) {
            return this.ad;
        }
        StringBuilder premium = AbstractC4653e.premium("Illegal index ", i, ", ");
        premium.append(ad());
        premium.append(" expects only non-negative indices");
        throw new IllegalArgumentException(premium.toString().toString());
    }

    @Override // defpackage.InterfaceC9998e
    public final AbstractC8457e appmetrica() {
        return C3016e.appmetrica;
    }

    @Override // defpackage.InterfaceC9998e
    public final String billing(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6439e)) {
            return false;
        }
        AbstractC6439e abstractC6439e = (AbstractC6439e) obj;
        return AbstractC7890e.billing(this.ad, abstractC6439e.ad) && AbstractC7890e.billing(ad(), abstractC6439e.ad());
    }

    @Override // defpackage.InterfaceC9998e
    public final List getAnnotations() {
        return C13664e.f27089e;
    }

    public final int hashCode() {
        return ad().hashCode() + (this.ad.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC9998e
    public final int license(String str) {
        Integer signatures = AbstractC6507e.signatures(str);
        if (signatures != null) {
            return signatures.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
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
        StringBuilder premium = AbstractC4653e.premium("Illegal index ", i, ", ");
        premium.append(ad());
        premium.append(" expects only non-negative indices");
        throw new IllegalArgumentException(premium.toString().toString());
    }

    @Override // defpackage.InterfaceC9998e
    public final int purchase() {
        return 1;
    }

    @Override // defpackage.InterfaceC9998e
    public final List startapp(int i) {
        if (i >= 0) {
            return C13664e.f27089e;
        }
        StringBuilder premium = AbstractC4653e.premium("Illegal index ", i, ", ");
        premium.append(ad());
        premium.append(" expects only non-negative indices");
        throw new IllegalArgumentException(premium.toString().toString());
    }

    public final String toString() {
        return ad() + '(' + this.ad + ')';
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean yandex() {
        return false;
    }
}
