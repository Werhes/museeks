package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13689e implements InterfaceC14003e {
    public ValueAnimator ad;
    public final /* synthetic */ C2690e vip;

    public C13689e(C2690e c2690e) {
        this.vip = c2690e;
    }

    @Override // defpackage.InterfaceC14003e
    public final void clear() {
        AbstractC9464e.yandex("ScreenFlashView", "ScreenFlash#clear");
        ValueAnimator valueAnimator = this.ad;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.ad = null;
        }
        C2690e c2690e = this.vip;
        c2690e.setAlpha(0.0f);
        c2690e.setBrightness(0.0f);
    }
}
