package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C11176e implements InterfaceC7970e {
    public final /* synthetic */ int ad;

    public /* synthetic */ C11176e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC7970e
    public final Object get() {
        switch (this.ad) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.ad();
            case 2:
                C6491e c6491e = ExecutorsRegistrar.ad;
                return new ScheduledExecutorServiceC5603e(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC5915e("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.license.get());
            case 3:
                C6491e c6491e2 = ExecutorsRegistrar.ad;
                return new ScheduledExecutorServiceC5603e(Executors.newCachedThreadPool(new ThreadFactoryC5915e("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.license.get());
            case 4:
                C6491e c6491e3 = ExecutorsRegistrar.ad;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC5915e("Firebase Scheduler", 0, null));
            case 5:
                C5389e c5389e = FirebaseMessaging.mopub;
                return null;
            default:
                return null;
        }
    }
}
