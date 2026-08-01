package defpackage;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3109e extends AbstractC12564e {
    public final WindowInsetsAnimation appmetrica;

    public C3109e(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.appmetrica = windowInsetsAnimation;
    }

    public static C7088e billing(WindowInsetsAnimation.Bounds bounds) {
        return C7088e.metrica(bounds.getLowerBound());
    }

    public static C7088e purchase(WindowInsetsAnimation.Bounds bounds) {
        return C7088e.metrica(bounds.getUpperBound());
    }

    public static void yandex(View view, AbstractC15825e abstractC15825e) {
        view.setWindowInsetsAnimationCallback(abstractC15825e != null ? new C2762e(abstractC15825e) : null);
    }

    @Override // defpackage.AbstractC12564e
    public final float ad() {
        return this.appmetrica.getAlpha();
    }

    @Override // defpackage.AbstractC12564e
    public final void appmetrica(float f) {
        this.appmetrica.setFraction(f);
    }

    @Override // defpackage.AbstractC12564e
    public final int license() {
        return this.appmetrica.getTypeMask();
    }

    @Override // defpackage.AbstractC12564e
    public final float metrica() {
        return this.appmetrica.getInterpolatedFraction();
    }

    @Override // defpackage.AbstractC12564e
    public final long vip() {
        return this.appmetrica.getDurationMillis();
    }
}
