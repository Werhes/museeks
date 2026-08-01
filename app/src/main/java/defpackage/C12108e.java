package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۦؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12108e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f24271e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Activity f24272e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f24274e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f24273e = false;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f24270e = false;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f24275e = false;

    public C12108e(Activity activity) {
        this.f24272e = activity;
        this.f24271e = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f24272e == activity) {
            this.f24272e = null;
            this.f24270e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f24270e || this.f24275e || this.f24273e) {
            return;
        }
        Object obj = this.f24274e;
        try {
            Object obj2 = AbstractC13941e.metrica.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f24271e) {
                AbstractC13941e.billing.postAtFrontOfQueue(new RunnableC17144e(AbstractC13941e.vip.get(activity), obj2, 4));
                this.f24275e = true;
                this.f24274e = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f24272e == activity) {
            this.f24273e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
