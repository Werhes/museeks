package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16763e implements InterfaceC9998e {
    public final C17709e ad;
    public final String metrica;
    public final InterfaceC7227e vip;

    public C16763e(C17709e c17709e, InterfaceC7227e interfaceC7227e) {
        this.ad = c17709e;
        this.vip = interfaceC7227e;
        this.metrica = c17709e.ad + '<' + interfaceC7227e.mopub() + '>';
    }

    @Override // defpackage.InterfaceC9998e
    public final String ad() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC9998e
    public final InterfaceC9998e adcel(int i) {
        return this.ad.billing[i];
    }

    @Override // defpackage.InterfaceC9998e
    public final AbstractC8457e appmetrica() {
        return this.ad.vip;
    }

    @Override // defpackage.InterfaceC9998e
    public final String billing(int i) {
        return this.ad.purchase[i];
    }

    public final boolean equals(Object obj) {
        C16763e c16763e = obj instanceof C16763e ? (C16763e) obj : null;
        return c16763e != null && this.ad.equals(c16763e.ad) && AbstractC7890e.billing(c16763e.vip, this.vip);
    }

    @Override // defpackage.InterfaceC9998e
    public final List getAnnotations() {
        return this.ad.license;
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (this.vip.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC9998e
    public final int license(String str) {
        return this.ad.license(str);
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean metrica() {
        return false;
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean mopub(int i) {
        return this.ad.startapp[i];
    }

    @Override // defpackage.InterfaceC9998e
    public final int purchase() {
        return this.ad.metrica;
    }

    @Override // defpackage.InterfaceC9998e
    public final List startapp(int i) {
        return this.ad.yandex[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.vip + ", original: " + this.ad + ')';
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean yandex() {
        return false;
    }
}
