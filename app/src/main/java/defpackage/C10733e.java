package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10733e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12344e f21136e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final double f21137e;

    public C10733e(C12344e c12344e, C0624e c0624e) {
        this.f21136e = c12344e;
        C11307e c11307e = c0624e.ad;
        C12916e c12916e = AbstractC15124e.ad;
        Object obj = c11307e.vip.amazon.ad.get(AbstractC15124e.license);
        this.f21137e = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void ad(Context context) {
        long j;
        double d = this.f21137e;
        if (d == 1.0d) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        C12344e c12344e = this.f21136e;
        C0624e c0624e = (C0624e) ((WeakReference) c12344e.f24749e).get();
        if (c0624e == null) {
            c12344e.ads();
            return;
        }
        C4421e license = c0624e.license();
        if (license != null) {
            synchronized (license.metrica) {
                j = license.ad.f15625e;
            }
            license.appmetrica((long) (d * j));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        vip(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityStopped(Activity activity) {
    }

    public final void vip(Context context) {
        long j;
        if (this.f21137e == 1.0d) {
            return;
        }
        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        C12344e c12344e = this.f21136e;
        C0624e c0624e = (C0624e) ((WeakReference) c12344e.f24749e).get();
        if (c0624e == null) {
            c12344e.ads();
            return;
        }
        C4421e license = c0624e.license();
        if (license != null) {
            synchronized (license.metrica) {
                j = license.ad.f15625e;
            }
            license.appmetrica(j);
        }
    }
}
