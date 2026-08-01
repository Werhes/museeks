package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0833e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f3221e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f3222e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3223e;

    public /* synthetic */ RunnableC0833e(Object obj, long j, int i) {
        this.f3223e = i;
        this.f3221e = obj;
        this.f3222e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3223e;
        long j = this.f3222e;
        Object obj = this.f3221e;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = (SurfaceHolderCallbackC0960e) ((C17424e) obj).f34141e;
                String str = AbstractC9413e.ad;
                C4174e c4174e = surfaceHolderCallbackC0960e.ad.f33635e;
                C18177e m1494package = c4174e.m1494package();
                c4174e.m1501transient(m1494package, 1010, new C12019e(j, m1494package));
                return;
            default:
                View view = (View) obj;
                if (view.isAttachedToWindow()) {
                    view.setVisibility(0);
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getRight() + view.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, 0.0f, Math.max(view.getWidth(), view.getHeight()));
                    createCircularReveal.setDuration(j);
                    createCircularReveal.start();
                    return;
                }
                return;
        }
    }
}
