package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٝۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC17160e implements Executor {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f33650e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33651e;

    public /* synthetic */ ExecutorC17160e(int i, Object obj) {
        this.f33651e = i;
        this.f33650e = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f33651e) {
            case 0:
                ((Handler) this.f33650e).post(runnable);
                return;
            case 1:
                ((C17790e) this.f33650e).m4427extends(runnable);
                return;
            case 2:
                ((C2399e) this.f33650e).license(runnable);
                return;
            case 3:
                AbstractC9413e.m2565strictfp(((C4187e) this.f33650e).f9225e, runnable);
                return;
            case 4:
                AbstractC9413e.m2565strictfp(((C11165e) this.f33650e).f22419e, runnable);
                return;
            case 5:
                ((Choreographer) this.f33650e).postFrameCallback(new ChoreographerFrameCallbackC7729e(runnable));
                return;
            default:
                C8591e c8591e = (C8591e) this.f33650e;
                c8591e.vip.execute(new RunnableC11247e(c8591e, runnable, 12));
                return;
        }
    }
}
