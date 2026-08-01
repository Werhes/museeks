package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.FragmentC17355e;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17368e {
    /* JADX WARN: Multi-variable type inference failed */
    public static void ad(Activity activity, EnumC14621e enumC14621e) {
        if (activity instanceof InterfaceC16400e) {
            AbstractC0003e vip = ((InterfaceC16400e) activity).vip();
            if (vip instanceof C4891e) {
                ((C4891e) vip).appmetrica(enumC14621e);
            }
        }
    }

    public static void vip(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC17355e.ad.Companion.getClass();
            C17697e.ad(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC17355e(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
