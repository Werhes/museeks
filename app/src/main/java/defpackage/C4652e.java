package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4652e implements InterfaceC18435e, InterfaceC14620e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C6924e f9980e = new C6924e(1);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public volatile InterfaceC8850e f9981e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C4652e f9982e = this;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC8850e f9983e;

    public C4652e(InterfaceC8850e interfaceC8850e) {
        this.f9983e = interfaceC8850e;
    }

    @Override // defpackage.InterfaceC14620e
    public final void ad() {
        appmetrica();
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        InterfaceC8850e interfaceC8850e;
        InterfaceC8850e interfaceC8850e2 = this.f9981e;
        if (interfaceC8850e2 != null && interfaceC8850e2 != f9980e) {
            return interfaceC8850e2;
        }
        C3344e c3344e = (C3344e) this.f9983e.mo397public(C3344e.f7542e);
        InterfaceC8850e c14821e = c3344e != null ? new C14821e(c3344e, this) : C2693e.f6576e;
        synchronized (this.f9982e) {
            try {
                interfaceC8850e = this.f9981e;
                if (interfaceC8850e == null) {
                    InterfaceC8850e interfaceC8850e3 = this.f9983e;
                    interfaceC8850e = interfaceC8850e3.mo394const(new C6799e((InterfaceC10500e) interfaceC8850e3.mo397public(C4524e.f9798e))).mo394const(C2693e.f6576e).mo394const(c14821e);
                } else if (interfaceC8850e == f9980e) {
                    InterfaceC8850e interfaceC8850e4 = this.f9983e;
                    C6799e c6799e = new C6799e((InterfaceC10500e) interfaceC8850e4.mo397public(C4524e.f9798e));
                    c6799e.isPro(new C2981e(0));
                    interfaceC8850e = interfaceC8850e4.mo394const(c6799e).mo394const(C2693e.f6576e).mo394const(c14821e);
                }
                this.f9981e = interfaceC8850e;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC8850e;
    }

    public final void appmetrica() {
        synchronized (this.f9982e) {
            try {
                InterfaceC8850e interfaceC8850e = this.f9981e;
                if (interfaceC8850e == null) {
                    this.f9981e = f9980e;
                } else {
                    AbstractC6629e.license(interfaceC8850e, new C2981e(0));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC14620e
    public final void metrica() {
    }

    @Override // defpackage.InterfaceC14620e
    public final void vip() {
        appmetrica();
    }
}
