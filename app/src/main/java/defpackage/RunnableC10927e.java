package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10927e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ RunnableC12139e f21642e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6566e f21643e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21644e;

    public /* synthetic */ RunnableC10927e(RunnableC12139e runnableC12139e, C6566e c6566e, int i) {
        this.f21644e = i;
        this.f21642e = runnableC12139e;
        this.f21643e = c6566e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21644e) {
            case 0:
                this.f21643e.mopub(this.f21642e.f24321e.vip());
                return;
            default:
                RunnableC12139e runnableC12139e = this.f21642e;
                C6566e c6566e = runnableC12139e.f24322e;
                C13394e c13394e = runnableC12139e.f24319e;
                try {
                    C8098e c8098e = (C8098e) this.f21643e.get();
                    if (c8098e == null) {
                        throw new IllegalStateException("Worker was marked important (" + c13394e.metrica + ") but did not provide ForegroundInfo");
                    }
                    C5401e.loadAd().smaato(RunnableC12139e.f24317e, "Updating notification for " + c13394e.metrica, new Throwable[0]);
                    ListenableWorker listenableWorker = runnableC12139e.f24321e;
                    listenableWorker.f601e = true;
                    C13228e c13228e = runnableC12139e.f24318e;
                    Context context = runnableC12139e.f24320e;
                    UUID uuid = listenableWorker.f603e.ad;
                    c13228e.getClass();
                    ?? obj = new Object();
                    c13228e.ad.license(new RunnableC3512e(c13228e, obj, uuid, c8098e, context, 1));
                    c6566e.mopub(obj);
                    return;
                } catch (Throwable th) {
                    c6566e.adcel(th);
                    return;
                }
        }
    }
}
