package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC14206e extends AnimationSet implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f28066e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f28067e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final View f28068e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f28069e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ViewGroup f28070e;

    public RunnableC14206e(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f28066e = true;
        this.f28070e = viewGroup;
        this.f28068e = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f28066e = true;
        if (this.f28067e) {
            return !this.f28069e;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f28067e = true;
            ViewTreeObserverOnPreDrawListenerC7587e.ad(this.f28070e, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f28066e = true;
        if (this.f28067e) {
            return !this.f28069e;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f28067e = true;
            ViewTreeObserverOnPreDrawListenerC7587e.ad(this.f28070e, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f28067e;
        ViewGroup viewGroup = this.f28070e;
        if (z || !this.f28066e) {
            viewGroup.endViewTransition(this.f28068e);
            this.f28069e = true;
        } else {
            this.f28066e = false;
            viewGroup.post(this);
        }
    }
}
