package defpackage;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5333e extends AbstractC10517e {
    public final /* synthetic */ ExtendedFloatingActionButton billing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5333e(ExtendedFloatingActionButton extendedFloatingActionButton, C0444e c0444e) {
        super(extendedFloatingActionButton, c0444e);
        this.billing = extendedFloatingActionButton;
    }

    @Override // defpackage.AbstractC10517e
    public final void appmetrica() {
        this.license.f2491e = null;
        this.billing.f883e = 0;
    }

    @Override // defpackage.AbstractC10517e
    public final void billing() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.billing;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // defpackage.AbstractC10517e
    public final int metrica() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.AbstractC10517e
    public final void purchase(Animator animator) {
        C0444e c0444e = this.license;
        Animator animator2 = (Animator) c0444e.f2491e;
        if (animator2 != null) {
            animator2.cancel();
        }
        c0444e.f2491e = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.billing;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f883e = 2;
    }

    @Override // defpackage.AbstractC10517e
    public final boolean yandex() {
        C9184e c9184e = ExtendedFloatingActionButton.f865e;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.billing;
        if (extendedFloatingActionButton.getVisibility() != 0) {
            if (extendedFloatingActionButton.f883e != 2) {
                return false;
            }
        } else if (extendedFloatingActionButton.f883e == 1) {
            return false;
        }
        return true;
    }
}
