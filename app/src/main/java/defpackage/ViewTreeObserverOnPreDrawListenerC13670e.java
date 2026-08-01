package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC13670e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserver f27092e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1964e f27093e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C13578e f27094e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f27095e;

    public ViewTreeObserverOnPreDrawListenerC13670e(C1964e c1964e, ViewTreeObserver viewTreeObserver, C13578e c13578e) {
        this.f27093e = c1964e;
        this.f27092e = viewTreeObserver;
        this.f27094e = c13578e;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C1964e c1964e = this.f27093e;
        C16320e remoteconfig = AbstractC8647e.remoteconfig(c1964e);
        if (remoteconfig != null) {
            ViewTreeObserver viewTreeObserver = this.f27092e;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                c1964e.f5163e.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f27095e) {
                this.f27095e = true;
                this.f27094e.billing(remoteconfig);
            }
        }
        return true;
    }
}
