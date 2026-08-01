package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4283e extends AnimatorListenerAdapter {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C10264e appmetrica;
    public final /* synthetic */ TextView license;
    public final /* synthetic */ int metrica;
    public final /* synthetic */ TextView vip;

    public C4283e(C10264e c10264e, int i, TextView textView, int i2, TextView textView2) {
        this.appmetrica = c10264e;
        this.ad = i;
        this.vip = textView;
        this.metrica = i2;
        this.license = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C13272e c13272e;
        int i = this.ad;
        C10264e c10264e = this.appmetrica;
        c10264e.amazon = i;
        c10264e.advert = null;
        TextView textView = this.vip;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.metrica == 1 && (c13272e = c10264e.subscription) != null) {
                c13272e.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.license;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.license;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
