package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC7729e implements Choreographer.FrameCallback {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f15685e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15686e = 0;

    public /* synthetic */ ChoreographerFrameCallbackC7729e(Runnable runnable) {
        this.f15685e = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f15686e) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? AbstractC17305e.adcel(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC14993e((Context) this.f15685e, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                ((Runnable) this.f15685e).run();
                return;
        }
    }
}
