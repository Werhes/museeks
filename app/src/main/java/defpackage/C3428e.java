package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3428e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11802e f7674e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C11199e f7675e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7676e;

    public /* synthetic */ C3428e(C11199e c11199e, C11802e c11802e, int i) {
        this.f7676e = i;
        this.f7675e = c11199e;
        this.f7674e = c11802e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7676e) {
            case 0:
                C11199e c11199e = this.f7675e;
                ((C8365e) c11199e.f22467e).getClass();
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", c11199e.f22465e);
                handlerThread.start();
                this.f7674e.metrica(3, new RunnableC1352e(11, handlerThread));
                return new Handler(handlerThread.getLooper());
            default:
                C11199e c11199e2 = this.f7675e;
                Executor executor = ((C8365e) c11199e2.f22467e).ad;
                if (executor != null) {
                    return executor;
                }
                ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1, new ThreadFactoryC13954e(c11199e2.f22465e, new ThreadFactoryC6417e(AbstractC9744e.vip, "CXCP-Camera-E", AbstractC14430e.license(0))));
                this.f7674e.metrica(3, new RunnableC1352e(12, newFixedThreadPool));
                return newFixedThreadPool;
        }
    }
}
