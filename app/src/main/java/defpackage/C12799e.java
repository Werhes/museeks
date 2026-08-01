package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12799e implements InterfaceC13297e, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f25601e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ScheduledExecutorServiceC5380e f25602e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public SurfaceTexture f25603e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final HandlerThread f25604e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final LinkedHashMap f25605e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Handler f25606e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public SurfaceTexture f25607e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C2625e f25608e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final AtomicBoolean f25609e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f25610e;

    public C12799e(C14677e c14677e, C13391e c13391e, C13391e c13391e2) {
        Map map = Collections.EMPTY_MAP;
        this.f25601e = 0;
        this.f25610e = false;
        this.f25609e = new AtomicBoolean(false);
        this.f25605e = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f25604e = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f25606e = handler;
        this.f25602e = new ScheduledExecutorServiceC5380e(handler);
        this.f25608e = new C2625e(c13391e, c13391e2);
        try {
            try {
                AbstractC5750e.purchase(new C11565e(this, c14677e)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    @Override // defpackage.InterfaceC13297e
    public final void ad(C6122e c6122e) {
        if (this.f25609e.get()) {
            c6122e.metrica();
        } else {
            license(new RunnableC2623e(this, c6122e, 8), new RunnableC4327e(c6122e, 0));
        }
    }

    public final void license(Runnable runnable, Runnable runnable2) {
        try {
            this.f25602e.execute(new RunnableC4904e(15, this, runnable2, runnable));
        } catch (RejectedExecutionException e) {
            AbstractC9464e.pro("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void metrica() {
        if (this.f25610e && this.f25601e == 0) {
            LinkedHashMap linkedHashMap = this.f25605e;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((C13705e) it.next()).close();
            }
            linkedHashMap.clear();
            this.f25608e.smaato();
            this.f25604e.quit();
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f25609e.get() || (surfaceTexture2 = this.f25607e) == null || this.f25603e == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f25603e.updateTexImage();
        for (Map.Entry entry : this.f25605e.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            C13705e c13705e = (C13705e) entry.getKey();
            if (c13705e.f27148e == 34) {
                try {
                    this.f25608e.signatures(surfaceTexture.getTimestamp(), surface, c13705e, this.f25607e, this.f25603e);
                } catch (RuntimeException e) {
                    AbstractC9464e.mopub("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC13297e
    public final void release() {
        if (this.f25609e.getAndSet(true)) {
            return;
        }
        license(new RunnableC2783e(2, this), new RunnableC5512e(3));
    }

    @Override // defpackage.InterfaceC13297e
    public final void vip(C13705e c13705e) {
        if (this.f25609e.get()) {
            c13705e.close();
            return;
        }
        RunnableC2623e runnableC2623e = new RunnableC2623e(this, c13705e, 9);
        Objects.requireNonNull(c13705e);
        license(runnableC2623e, new RunnableC17584e(27, c13705e));
    }
}
