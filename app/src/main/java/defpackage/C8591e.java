package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8591e {
    public final C14826e ad;
    public final C14826e appmetrica;
    public final ExecutorC17160e license;
    public final ThreadLocal metrica;
    public final ExecutorC12245e vip;

    public C8591e(C14826e c14826e, Executor executor) {
        this.ad = c14826e;
        new Handler(Looper.getMainLooper());
        this.vip = new ExecutorC12245e(executor);
        this.metrica = new ThreadLocal();
        ExecutorC17160e executorC17160e = new ExecutorC17160e(6, this);
        this.license = executorC17160e;
        this.appmetrica = AbstractC9743e.ad(c14826e.f29359e.mo394const(AbstractC5097e.ad()).mo394const(AbstractC18275e.purchase(executorC17160e)));
    }
}
