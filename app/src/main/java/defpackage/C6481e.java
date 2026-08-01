package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6481e implements InterfaceC14620e, InterfaceC12088e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C14826e f13394e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function2 f13395e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C8419e f13396e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC8850e f13397e;

    public C6481e(InterfaceC8850e interfaceC8850e, Function2 function2) {
        this.f13397e = interfaceC8850e;
        this.f13395e = function2;
        this.f13394e = AbstractC9743e.ad(interfaceC8850e.mo394const(this));
    }

    @Override // defpackage.InterfaceC14620e
    public final void ad() {
        C8419e c8419e = this.f13396e;
        if (c8419e != null) {
            c8419e.applovin(new C2981e(1));
        }
        this.f13396e = null;
    }

    @Override // defpackage.InterfaceC12088e
    /* renamed from: break */
    public final void mo2160break(InterfaceC8850e interfaceC8850e, Throwable th) {
        C3344e c3344e = (C3344e) interfaceC8850e.mo397public(C3344e.f7542e);
        if (c3344e != null) {
            AbstractC3415e.mopub(th, new C5625e(c3344e, this, 4));
        }
        InterfaceC12088e interfaceC12088e = (InterfaceC12088e) this.f13397e.mo397public(C5170e.f11077e);
        if (interfaceC12088e == null) {
            throw th;
        }
        interfaceC12088e.mo2160break(interfaceC8850e, th);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: const */
    public final InterfaceC8850e mo394const(InterfaceC8850e interfaceC8850e) {
        return AbstractC5797e.vip(this, interfaceC8850e);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: eؘْؖ */
    public final Object mo395e(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: final */
    public final InterfaceC8850e mo396final(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.appmetrica(this, interfaceC1598e);
    }

    @Override // defpackage.InterfaceC4595e
    public final InterfaceC1598e getKey() {
        return C5170e.f11077e;
    }

    @Override // defpackage.InterfaceC14620e
    public final void metrica() {
        C8419e c8419e = this.f13396e;
        if (c8419e != null) {
            AbstractC6629e.appmetrica(c8419e, "Old job was still running!", null);
        }
        this.f13396e = AbstractC5336e.purchase(this.f13394e, null, 0, this.f13395e, 3);
    }

    @Override // defpackage.InterfaceC8850e
    /* renamed from: public */
    public final InterfaceC4595e mo397public(InterfaceC1598e interfaceC1598e) {
        return AbstractC8769e.vip(this, interfaceC1598e);
    }

    @Override // defpackage.InterfaceC14620e
    public final void vip() {
        C8419e c8419e = this.f13396e;
        if (c8419e != null) {
            c8419e.applovin(new C2981e(1));
        }
        this.f13396e = null;
    }
}
