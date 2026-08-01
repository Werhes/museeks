package defpackage;

import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۢؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1399e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9029e f4194e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4195e;

    public /* synthetic */ RunnableC1399e(C9029e c9029e, int i) {
        this.f4195e = i;
        this.f4194e = c9029e;
    }

    public /* synthetic */ RunnableC1399e(C9029e c9029e, C5306e c5306e) {
        this.f4195e = 0;
        this.f4194e = c9029e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4195e) {
            case 0:
                AbstractC13480e.m3582e(this.f4194e.mopub).isEmpty();
                return;
            case 1:
                C9029e c9029e = this.f4194e;
                synchronized (c9029e.license) {
                    try {
                        ScheduledFuture scheduledFuture = c9029e.appmetrica;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        AbstractC9464e.yandex("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
                        c9029e.appmetrica(3, c9029e.mopub);
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                C9029e c9029e2 = this.f4194e;
                Iterator it = c9029e2.mopub.iterator();
                while (it.hasNext()) {
                    c9029e2.vip(((C14131e) it.next()).ad());
                }
                return;
        }
    }
}
