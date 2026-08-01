package defpackage;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؒؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0873e extends AbstractC10517e {
    public boolean billing;
    public final /* synthetic */ ExtendedFloatingActionButton yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0873e(ExtendedFloatingActionButton extendedFloatingActionButton, C0444e c0444e) {
        super(extendedFloatingActionButton, c0444e);
        this.yandex = extendedFloatingActionButton;
    }

    @Override // defpackage.AbstractC10517e
    public final void appmetrica() {
        this.license.f2491e = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.yandex;
        extendedFloatingActionButton.f883e = 0;
        if (this.billing) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // defpackage.AbstractC10517e
    public final void billing() {
        this.yandex.setVisibility(8);
    }

    @Override // defpackage.AbstractC10517e
    public final void license() {
        super.license();
        this.billing = true;
    }

    @Override // defpackage.AbstractC10517e
    public final int metrica() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // defpackage.AbstractC10517e
    public final void purchase(Animator animator) {
        C0444e c0444e = this.license;
        Animator animator2 = (Animator) c0444e.f2491e;
        if (animator2 != null) {
            animator2.cancel();
        }
        c0444e.f2491e = animator;
        this.billing = false;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.yandex;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f883e = 1;
    }

    @Override // defpackage.AbstractC10517e
    public final boolean yandex() {
        C9184e c9184e = ExtendedFloatingActionButton.f865e;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.yandex;
        if (extendedFloatingActionButton.getVisibility() == 0) {
            if (extendedFloatingActionButton.f883e != 1) {
                return false;
            }
        } else if (extendedFloatingActionButton.f883e == 2) {
            return false;
        }
        return true;
    }
}
