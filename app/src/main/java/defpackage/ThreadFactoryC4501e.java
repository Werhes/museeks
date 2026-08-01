package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۦؘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC4501e implements ThreadFactory {
    public static final /* synthetic */ ThreadFactoryC4501e vip = new ThreadFactoryC4501e(2);
    public final /* synthetic */ int ad;

    public /* synthetic */ ThreadFactoryC4501e(int i) {
        this.ad = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.ad) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            case 1:
                return new C12129e(runnable);
            default:
                Object obj = C13150e.adcel;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
