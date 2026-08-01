package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4606e extends Animation {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6559e f9932e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9933e;

    public /* synthetic */ C4606e(C6559e c6559e, int i) {
        this.f9933e = i;
        this.f9932e = c6559e;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.f9933e) {
            case 0:
                this.f9932e.setAnimationProgress(f);
                return;
            case 1:
                this.f9932e.setAnimationProgress(1.0f - f);
                return;
            case 2:
                C6559e c6559e = this.f9932e;
                int abs = c6559e.f13526e - Math.abs(c6559e.f13524e);
                c6559e.setTargetOffsetTopAndBottom((c6559e.f13517e + ((int) ((abs - r1) * f))) - c6559e.f13531e.getTop());
                C8266e c8266e = c6559e.f13513e;
                float f2 = 1.0f - f;
                C1935e c1935e = c8266e.f16785e;
                if (f2 != c1935e.Signature) {
                    c1935e.Signature = f2;
                }
                c8266e.invalidateSelf();
                return;
            default:
                this.f9932e.mopub(f);
                return;
        }
    }
}
