package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۛۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14967e extends AbstractC17857e {
    final /* synthetic */ C14091e this$0;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    /* renamed from: eٔۛۛ$ad */
    /* loaded from: classes.dex */
    public static final class ad extends AbstractC17857e {
        final /* synthetic */ C14091e this$0;

        public ad(C14091e c14091e) {
            this.this$0 = c14091e;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            this.this$0.metrica();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C14091e c14091e = this.this$0;
            int i = c14091e.f27852e + 1;
            c14091e.f27852e = i;
            if (i == 1 && c14091e.f27851e) {
                c14091e.f27854e.appmetrica(EnumC14621e.ON_START);
                c14091e.f27851e = false;
            }
        }
    }

    public C14967e(C14091e c14091e) {
        this.this$0 = c14091e;
    }

    @Override // defpackage.AbstractC17857e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC17355e.f34058e;
            ((FragmentC17355e) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f34059e = this.this$0.f27850e;
        }
    }

    @Override // defpackage.AbstractC17857e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C14091e c14091e = this.this$0;
        int i = c14091e.f27849e - 1;
        c14091e.f27849e = i;
        if (i == 0) {
            c14091e.f27847e.postDelayed(c14091e.f27853e, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC14204e.m3774goto(activity, new ad(this.this$0));
    }

    @Override // defpackage.AbstractC17857e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C14091e c14091e = this.this$0;
        int i = c14091e.f27852e - 1;
        c14091e.f27852e = i;
        if (i == 0 && c14091e.f27848e) {
            c14091e.f27854e.appmetrica(EnumC14621e.ON_STOP);
            c14091e.f27851e = true;
        }
    }
}
