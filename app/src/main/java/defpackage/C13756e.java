package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13756e implements InterfaceC9208e, InterfaceC13619e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC10500e f27252e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C17702e f27253e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C14542e f27254e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC0003e f27255e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0624e f27256e;

    public C13756e(C0624e c0624e, C14542e c14542e, C17702e c17702e, AbstractC0003e abstractC0003e, InterfaceC10500e interfaceC10500e) {
        this.f27256e = c0624e;
        this.f27254e = c14542e;
        this.f27253e = c17702e;
        this.f27255e = abstractC0003e;
        this.f27252e = interfaceC10500e;
    }

    @Override // defpackage.InterfaceC9208e
    public final Object ad(C13895e c13895e) {
        Object ad;
        AbstractC0003e abstractC0003e = this.f27255e;
        return (abstractC0003e == null || (ad = AbstractC0421e.ad(abstractC0003e, c13895e)) != EnumC2821e.f6782e) ? Unit.INSTANCE : ad;
    }

    public final void license() {
        this.f27252e.Signature(null);
        C17702e c17702e = this.f27253e;
        boolean z = c17702e instanceof InterfaceC12066e;
        AbstractC0003e abstractC0003e = this.f27255e;
        if (z && abstractC0003e != null) {
            abstractC0003e.vip(c17702e);
        }
        if (abstractC0003e != null) {
            abstractC0003e.vip(this);
        }
    }

    @Override // defpackage.InterfaceC9208e
    public final /* synthetic */ void metrica() {
    }

    @Override // defpackage.InterfaceC13619e
    public final void onDestroy(InterfaceC16400e interfaceC16400e) {
        AbstractC5750e.billing(this.f27253e.f34698e).ad();
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onPause(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onResume(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onStart(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onStop(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void purchase() {
    }

    @Override // defpackage.InterfaceC9208e
    public final void start() {
        AbstractC0003e abstractC0003e = this.f27255e;
        if (abstractC0003e != null) {
            abstractC0003e.ad(this);
        }
        C17702e c17702e = this.f27253e;
        if ((c17702e instanceof InterfaceC12066e) && abstractC0003e != null) {
            C17702e c17702e2 = c17702e;
            abstractC0003e.vip(c17702e2);
            abstractC0003e.ad(c17702e2);
        }
        ViewOnAttachStateChangeListenerC3798e billing = AbstractC5750e.billing(c17702e.f34698e);
        C13756e c13756e = billing.f8408e;
        if (c13756e != null) {
            c13756e.license();
        }
        billing.f8408e = this;
    }

    @Override // defpackage.InterfaceC9208e
    public final void vip() {
        C17702e c17702e = this.f27253e;
        if (c17702e.f34698e.isAttachedToWindow()) {
            return;
        }
        ViewOnAttachStateChangeListenerC3798e billing = AbstractC5750e.billing(c17702e.f34698e);
        C13756e c13756e = billing.f8408e;
        if (c13756e != null) {
            c13756e.license();
        }
        billing.f8408e = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }
}
