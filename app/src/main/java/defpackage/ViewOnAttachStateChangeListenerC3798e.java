package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3798e implements View.OnAttachStateChangeListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C13756e f8408e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C8419e f8409e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f8410e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C17002e f8411e;

    public final synchronized void ad() {
        try {
            C8419e c8419e = this.f8409e;
            InterfaceC5083e interfaceC5083e = null;
            if (c8419e != null) {
                c8419e.Signature(null);
            }
            C5162e c5162e = C5162e.f11047e;
            C15420e c15420e = AbstractC6731e.ad;
            this.f8409e = AbstractC5336e.purchase(c5162e, AbstractC1497e.ad.f25795e, 0, new C18474e(this, interfaceC5083e, 24), 2);
            this.f8411e = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C13756e c13756e = this.f8408e;
        if (c13756e == null) {
            return;
        }
        this.f8410e = true;
        c13756e.f27256e.ad(c13756e.f27254e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C13756e c13756e = this.f8408e;
        if (c13756e != null) {
            c13756e.license();
        }
    }
}
