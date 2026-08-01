package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۘٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC8172e implements Executor {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static Context f16643e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static volatile ExecutorC8172e f16644e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ ExecutorC8172e f16645e = new ExecutorC8172e(1);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16646e;

    public /* synthetic */ ExecutorC8172e(int i) {
        this.f16646e = i;
    }

    public static ExecutorC8172e ad(Context context) {
        ExecutorC8172e executorC8172e;
        ExecutorC8172e executorC8172e2 = f16644e;
        if (executorC8172e2 != null) {
            return executorC8172e2;
        }
        synchronized (ExecutorC8172e.class) {
            try {
                executorC8172e = f16644e;
                if (executorC8172e == null) {
                    Context applicationContext = context.getApplicationContext();
                    AbstractC9528e.startapp(applicationContext);
                    f16643e = applicationContext;
                    executorC8172e = new ExecutorC8172e(0);
                    f16644e = executorC8172e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorC8172e;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f16646e) {
            case 0:
                AbstractC11302e.ad.post(runnable);
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                new Thread(runnable).start();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
