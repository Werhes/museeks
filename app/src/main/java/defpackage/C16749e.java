package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16749e extends AbstractC10517e {
    public final InterfaceC13363e billing;
    public final /* synthetic */ ExtendedFloatingActionButton startapp;
    public final boolean yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16749e(ExtendedFloatingActionButton extendedFloatingActionButton, C0444e c0444e, InterfaceC13363e interfaceC13363e, boolean z) {
        super(extendedFloatingActionButton, c0444e);
        this.startapp = extendedFloatingActionButton;
        this.billing = interfaceC13363e;
        this.yandex = z;
    }

    @Override // defpackage.AbstractC10517e
    public final AnimatorSet ad() {
        C14188e c14188e = this.purchase;
        if (c14188e == null) {
            if (this.appmetrica == null) {
                this.appmetrica = C14188e.vip(this.ad, metrica());
            }
            c14188e = this.appmetrica;
            c14188e.getClass();
        }
        boolean purchase = c14188e.purchase("width");
        InterfaceC13363e interfaceC13363e = this.billing;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.startapp;
        if (purchase) {
            PropertyValuesHolder[] appmetrica = c14188e.appmetrica("width");
            appmetrica[0].setFloatValues(extendedFloatingActionButton.getWidth(), interfaceC13363e.getWidth());
            c14188e.billing("width", appmetrica);
        }
        if (c14188e.purchase("height")) {
            PropertyValuesHolder[] appmetrica2 = c14188e.appmetrica("height");
            appmetrica2[0].setFloatValues(extendedFloatingActionButton.getHeight(), interfaceC13363e.vip());
            c14188e.billing("height", appmetrica2);
        }
        if (c14188e.purchase("paddingStart")) {
            PropertyValuesHolder[] appmetrica3 = c14188e.appmetrica("paddingStart");
            PropertyValuesHolder propertyValuesHolder = appmetrica3[0];
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            propertyValuesHolder.setFloatValues(extendedFloatingActionButton.getPaddingStart(), interfaceC13363e.mo820new());
            c14188e.billing("paddingStart", appmetrica3);
        }
        if (c14188e.purchase("paddingEnd")) {
            PropertyValuesHolder[] appmetrica4 = c14188e.appmetrica("paddingEnd");
            PropertyValuesHolder propertyValuesHolder2 = appmetrica4[0];
            WeakHashMap weakHashMap2 = AbstractC2016e.ad;
            propertyValuesHolder2.setFloatValues(extendedFloatingActionButton.getPaddingEnd(), interfaceC13363e.billing());
            c14188e.billing("paddingEnd", appmetrica4);
        }
        if (c14188e.purchase("labelOpacity")) {
            PropertyValuesHolder[] appmetrica5 = c14188e.appmetrica("labelOpacity");
            boolean z = this.yandex;
            appmetrica5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            c14188e.billing("labelOpacity", appmetrica5);
        }
        return vip(c14188e);
    }

    @Override // defpackage.AbstractC10517e
    public final void appmetrica() {
        this.license.f2491e = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.startapp;
        extendedFloatingActionButton.f871e = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        InterfaceC13363e interfaceC13363e = this.billing;
        layoutParams.width = interfaceC13363e.mo817goto().width;
        layoutParams.height = interfaceC13363e.mo817goto().height;
    }

    @Override // defpackage.AbstractC10517e
    public final void billing() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.startapp;
        boolean z = this.yandex;
        extendedFloatingActionButton.f872e = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            extendedFloatingActionButton.f880e = layoutParams.width;
            extendedFloatingActionButton.f878e = layoutParams.height;
        }
        InterfaceC13363e interfaceC13363e = this.billing;
        layoutParams.width = interfaceC13363e.mo817goto().width;
        layoutParams.height = interfaceC13363e.mo817goto().height;
        int mo820new = interfaceC13363e.mo820new();
        int paddingTop = extendedFloatingActionButton.getPaddingTop();
        int billing = interfaceC13363e.billing();
        int paddingBottom = extendedFloatingActionButton.getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        extendedFloatingActionButton.setPaddingRelative(mo820new, paddingTop, billing, paddingBottom);
        extendedFloatingActionButton.requestLayout();
    }

    @Override // defpackage.AbstractC10517e
    public final int metrica() {
        return this.yandex ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.AbstractC10517e
    public final void purchase(Animator animator) {
        C0444e c0444e = this.license;
        Animator animator2 = (Animator) c0444e.f2491e;
        if (animator2 != null) {
            animator2.cancel();
        }
        c0444e.f2491e = animator;
        boolean z = this.yandex;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.startapp;
        extendedFloatingActionButton.f872e = z;
        extendedFloatingActionButton.f871e = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // defpackage.AbstractC10517e
    public final boolean yandex() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.startapp;
        return this.yandex == extendedFloatingActionButton.f872e || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
