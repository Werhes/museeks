package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6974e extends Animatable2.AnimationCallback {
    public final /* synthetic */ AbstractC8715e ad;

    public C6974e(AbstractC8715e abstractC8715e) {
        this.ad = abstractC8715e;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.ad.ad(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.ad.vip(drawable);
    }
}
