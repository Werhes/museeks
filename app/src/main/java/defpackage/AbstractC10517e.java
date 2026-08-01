package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10517e {
    public final Context ad;
    public C14188e appmetrica;
    public final C0444e license;
    public final ArrayList metrica = new ArrayList();
    public C14188e purchase;
    public final ExtendedFloatingActionButton vip;

    public AbstractC10517e(ExtendedFloatingActionButton extendedFloatingActionButton, C0444e c0444e) {
        this.vip = extendedFloatingActionButton;
        this.ad = extendedFloatingActionButton.getContext();
        this.license = c0444e;
    }

    public AnimatorSet ad() {
        C14188e c14188e = this.purchase;
        if (c14188e == null) {
            if (this.appmetrica == null) {
                this.appmetrica = C14188e.vip(this.ad, metrica());
            }
            c14188e = this.appmetrica;
            c14188e.getClass();
        }
        return vip(c14188e);
    }

    public abstract void appmetrica();

    public abstract void billing();

    public void license() {
        this.license.f2491e = null;
    }

    public abstract int metrica();

    public abstract void purchase(Animator animator);

    public final AnimatorSet vip(C14188e c14188e) {
        ArrayList arrayList = new ArrayList();
        boolean purchase = c14188e.purchase("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.vip;
        if (purchase) {
            arrayList.add(c14188e.license("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (c14188e.purchase("scale")) {
            arrayList.add(c14188e.license("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(c14188e.license("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (c14188e.purchase("width")) {
            arrayList.add(c14188e.license("width", extendedFloatingActionButton, ExtendedFloatingActionButton.f865e));
        }
        if (c14188e.purchase("height")) {
            arrayList.add(c14188e.license("height", extendedFloatingActionButton, ExtendedFloatingActionButton.f866e));
        }
        if (c14188e.purchase("paddingStart")) {
            arrayList.add(c14188e.license("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.f868e));
        }
        if (c14188e.purchase("paddingEnd")) {
            arrayList.add(c14188e.license("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.f867e));
        }
        if (c14188e.purchase("labelOpacity")) {
            arrayList.add(c14188e.license("labelOpacity", extendedFloatingActionButton, new C6976e(this)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC8636e.vip(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract boolean yandex();
}
