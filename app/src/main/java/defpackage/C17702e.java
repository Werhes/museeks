package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17702e implements InterfaceC4719e, InterfaceC13619e, InterfaceC1363e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ImageView f34698e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f34699e;

    public C17702e(ImageView imageView) {
        this.f34698e = imageView;
    }

    @Override // defpackage.InterfaceC1363e
    public final void ad(InterfaceC4082e interfaceC4082e) {
        license(interfaceC4082e);
    }

    @Override // defpackage.InterfaceC1363e
    public final void amazon(InterfaceC4082e interfaceC4082e) {
        license(interfaceC4082e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17702e) && AbstractC7890e.billing(this.f34698e, ((C17702e) obj).f34698e);
    }

    public final int hashCode() {
        return this.f34698e.hashCode();
    }

    public final void license(InterfaceC4082e interfaceC4082e) {
        ImageView imageView = this.f34698e;
        Drawable ad = interfaceC4082e != null ? AbstractC15143e.ad(interfaceC4082e, imageView.getResources()) : null;
        Object drawable = imageView.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(ad);
        vip();
    }

    @Override // defpackage.InterfaceC4719e
    public final Drawable loadAd() {
        return this.f34698e.getDrawable();
    }

    @Override // defpackage.InterfaceC1363e
    public final void metrica(InterfaceC4082e interfaceC4082e) {
        license(interfaceC4082e);
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onDestroy(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onPause(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onResume(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final void onStart(InterfaceC16400e interfaceC16400e) {
        this.f34699e = true;
        vip();
    }

    @Override // defpackage.InterfaceC13619e
    public final void onStop(InterfaceC16400e interfaceC16400e) {
        this.f34699e = false;
        vip();
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void purchase() {
    }

    @Override // defpackage.InterfaceC4719e
    public final View startapp() {
        return this.f34698e;
    }

    public final String toString() {
        return "ImageViewTarget(view=" + this.f34698e + ")";
    }

    public final void vip() {
        Object drawable = this.f34698e.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f34699e) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }
}
