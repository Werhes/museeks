package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0899e implements InterfaceC9998e, InterfaceC15234e {
    public final InterfaceC9998e ad;
    public final Set metrica;
    public final String vip;

    public C0899e(InterfaceC9998e interfaceC9998e) {
        this.ad = interfaceC9998e;
        this.vip = interfaceC9998e.ad() + '?';
        this.metrica = AbstractC14161e.ad(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC9998e
    public final String ad() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC9998e
    public final InterfaceC9998e adcel(int i) {
        return this.ad.adcel(i);
    }

    @Override // defpackage.InterfaceC9998e
    public final AbstractC8457e appmetrica() {
        return this.ad.appmetrica();
    }

    @Override // defpackage.InterfaceC9998e
    public final String billing(int i) {
        return this.ad.billing(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0899e) {
            return AbstractC7890e.billing(this.ad, ((C0899e) obj).ad);
        }
        return false;
    }

    @Override // defpackage.InterfaceC9998e
    public final List getAnnotations() {
        return this.ad.getAnnotations();
    }

    public final int hashCode() {
        return this.ad.hashCode() * 31;
    }

    @Override // defpackage.InterfaceC9998e
    public final int license(String str) {
        return this.ad.license(str);
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean metrica() {
        return true;
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean mopub(int i) {
        return this.ad.mopub(i);
    }

    @Override // defpackage.InterfaceC9998e
    public final int purchase() {
        return this.ad.purchase();
    }

    @Override // defpackage.InterfaceC9998e
    public final List startapp(int i) {
        return this.ad.startapp(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ad);
        sb.append('?');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC15234e
    public final Set vip() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean yandex() {
        return this.ad.yandex();
    }
}
