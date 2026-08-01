package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Leٗۢۦ;", "Landroid/app/Fragment;", "<init>", "()V", "ad", "eۣٗٗ", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: eٗۢۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class FragmentC17355e extends Fragment {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ int f34058e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C6594e f34059e;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    /* renamed from: eٗۢۦ$ad */
    /* loaded from: classes.dex */
    public static final class ad implements Application.ActivityLifecycleCallbacks {
        public static final C17697e Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            C17697e.ad(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            int i = FragmentC17355e.f34058e;
            AbstractC17368e.ad(activity, EnumC14621e.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            int i = FragmentC17355e.f34058e;
            AbstractC17368e.ad(activity, EnumC14621e.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            int i = FragmentC17355e.f34058e;
            AbstractC17368e.ad(activity, EnumC14621e.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            int i = FragmentC17355e.f34058e;
            AbstractC17368e.ad(activity, EnumC14621e.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            int i = FragmentC17355e.f34058e;
            AbstractC17368e.ad(activity, EnumC14621e.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            int i = FragmentC17355e.f34058e;
            AbstractC17368e.ad(activity, EnumC14621e.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public final void ad(EnumC14621e enumC14621e) {
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC17368e.ad(getActivity(), enumC14621e);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ad(EnumC14621e.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ad(EnumC14621e.ON_DESTROY);
        this.f34059e = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        ad(EnumC14621e.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C6594e c6594e = this.f34059e;
        if (c6594e != null) {
            ((C14091e) c6594e.f13613e).metrica();
        }
        ad(EnumC14621e.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C6594e c6594e = this.f34059e;
        if (c6594e != null) {
            C14091e c14091e = (C14091e) c6594e.f13613e;
            int i = c14091e.f27852e + 1;
            c14091e.f27852e = i;
            if (i == 1 && c14091e.f27851e) {
                c14091e.f27854e.appmetrica(EnumC14621e.ON_START);
                c14091e.f27851e = false;
            }
        }
        ad(EnumC14621e.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        ad(EnumC14621e.ON_STOP);
    }
}
