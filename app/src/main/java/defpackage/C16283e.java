package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16283e implements InterfaceC14620e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12431e f31971e = new C12431e(0, new InterfaceC9374e[16]);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Set f31972e;

    public C16283e(Set set) {
        this.f31972e = set;
    }

    @Override // defpackage.InterfaceC14620e
    public final void ad() {
    }

    @Override // defpackage.InterfaceC14620e
    public final void metrica() {
        C12431e c12431e = this.f31971e;
        Object[] objArr = c12431e.f24870e;
        int i = c12431e.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC14620e applovin = ((InterfaceC9374e) objArr[i2]).applovin();
            this.f31972e.remove(applovin);
            applovin.metrica();
        }
    }

    @Override // defpackage.InterfaceC14620e
    public final void vip() {
    }
}
