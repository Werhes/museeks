package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC13805e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ ActionBarOverlayLayout f27362e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27363e;

    public /* synthetic */ RunnableC13805e(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f27363e = i;
        this.f27362e = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27363e) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f27362e;
                actionBarOverlayLayout.vip();
                actionBarOverlayLayout.f144e = actionBarOverlayLayout.f143e.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f146e);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f27362e;
                actionBarOverlayLayout2.vip();
                actionBarOverlayLayout2.f144e = actionBarOverlayLayout2.f143e.animate().translationY(-actionBarOverlayLayout2.f143e.getHeight()).setListener(actionBarOverlayLayout2.f146e);
                return;
        }
    }
}
