package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٞؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17164e extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup ad;
    public final /* synthetic */ C15250e appmetrica;
    public final /* synthetic */ C14635e license;
    public final /* synthetic */ boolean metrica;
    public final /* synthetic */ View vip;

    public C17164e(ViewGroup viewGroup, View view, boolean z, C14635e c14635e, C15250e c15250e) {
        this.ad = viewGroup;
        this.vip = view;
        this.metrica = z;
        this.license = c14635e;
        this.appmetrica = c15250e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.ad;
        View view = this.vip;
        viewGroup.endViewTransition(view);
        boolean z = this.metrica;
        C14635e c14635e = this.license;
        if (z || c14635e.ad == 3) {
            AbstractC1786e.yandex(c14635e.ad, view, viewGroup);
        }
        C15250e c15250e = this.appmetrica;
        ((C14635e) c15250e.metrica.f36443e).metrica(c15250e);
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Animator from operation " + c14635e + " has ended.");
        }
    }
}
