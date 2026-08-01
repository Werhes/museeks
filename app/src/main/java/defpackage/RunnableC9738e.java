package defpackage;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9738e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f19259e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19260e;

    public /* synthetic */ RunnableC9738e(Toolbar toolbar, int i) {
        this.f19260e = i;
        this.f19259e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19260e) {
            case 0:
                C3212e c3212e = this.f19259e.f266e;
                C9995e c9995e = c3212e == null ? null : c3212e.f7331e;
                if (c9995e != null) {
                    c9995e.collapseActionView();
                    return;
                }
                return;
            default:
                this.f19259e.amazon();
                return;
        }
    }
}
