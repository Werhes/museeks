package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ComponentCallbacks2C1517e implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final ComponentCallbacks2C1517e f4389e = new ComponentCallbacks2C1517e();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AtomicBoolean f4393e = new AtomicBoolean();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AtomicBoolean f4391e = new AtomicBoolean();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f4390e = new ArrayList();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f4392e = false;

    public static void vip(Application application) {
        ComponentCallbacks2C1517e componentCallbacks2C1517e = f4389e;
        synchronized (componentCallbacks2C1517e) {
            try {
                if (!componentCallbacks2C1517e.f4392e) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1517e);
                    application.registerComponentCallbacks(componentCallbacks2C1517e);
                    componentCallbacks2C1517e.f4392e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ad(InterfaceC12165e interfaceC12165e) {
        synchronized (f4389e) {
            this.f4390e.add(interfaceC12165e);
        }
    }

    public final void metrica(boolean z) {
        synchronized (f4389e) {
            try {
                Iterator it = this.f4390e.iterator();
                while (it.hasNext()) {
                    ((InterfaceC12165e) it.next()).ad(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f4393e.compareAndSet(true, false);
        this.f4391e.set(true);
        if (compareAndSet) {
            metrica(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f4393e.compareAndSet(true, false);
        this.f4391e.set(true);
        if (compareAndSet) {
            metrica(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f4393e.compareAndSet(false, true)) {
            this.f4391e.set(true);
            metrica(true);
        }
    }
}
