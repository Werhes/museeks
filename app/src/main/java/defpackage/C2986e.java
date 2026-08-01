package defpackage;

import android.app.ActivityManager;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۥٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2986e implements InterfaceC6823e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7029e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C2986e f7028e = new C2986e(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C2986e f7027e = new C2986e(1);

    public /* synthetic */ C2986e(int i) {
        this.f7029e = i;
    }

    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        switch (this.f7029e) {
            case 0:
                Object obj = C13150e.adcel;
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ThreadFactoryC4501e.vip);
                return newSingleThreadScheduledExecutor instanceof InterfaceScheduledExecutorServiceC1678e ? (InterfaceScheduledExecutorServiceC1678e) newSingleThreadScheduledExecutor : new C3598e(newSingleThreadScheduledExecutor);
            default:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                boolean z = false;
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    int i = runningAppProcessInfo.importance;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
                    sb.append("Memory state is: ");
                    sb.append(i);
                    Log.i("PhenotypeProcessReaper", sb.toString());
                    if (runningAppProcessInfo.importance >= 400) {
                        z = true;
                    }
                } catch (RuntimeException e) {
                    Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
                }
                return new Boolean(z);
        }
    }
}
