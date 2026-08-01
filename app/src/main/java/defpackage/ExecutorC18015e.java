package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC18015e implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f35337e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Runnable f35338e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC15824e f35339e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f35340e = SystemClock.uptimeMillis() + ModuleDescriptor.MODULE_VERSION;

    public ExecutorC18015e(AbstractActivityC15824e abstractActivityC15824e) {
        this.f35339e = abstractActivityC15824e;
    }

    public final void ad(View view) {
        if (this.f35337e) {
            return;
        }
        this.f35337e = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f35338e = runnable;
        View decorView = this.f35339e.getWindow().getDecorView();
        if (!this.f35337e) {
            decorView.postOnAnimation(new RunnableC17584e(18, this));
        } else if (AbstractC7890e.billing(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f35338e;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f35340e) {
                this.f35337e = false;
                this.f35339e.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f35338e = null;
        C12059e c12059e = (C12059e) this.f35339e.f31253e.getValue();
        synchronized (c12059e.ad) {
            z = c12059e.vip;
        }
        if (z) {
            this.f35337e = false;
            this.f35339e.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35339e.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
