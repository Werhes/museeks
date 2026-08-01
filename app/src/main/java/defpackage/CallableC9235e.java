package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC9235e implements Callable {
    public final /* synthetic */ long ad;
    public final /* synthetic */ C4594e appmetrica;
    public final /* synthetic */ C4956e license;
    public final /* synthetic */ Thread metrica;
    public final /* synthetic */ Throwable vip;

    public CallableC9235e(C4594e c4594e, long j, Throwable th, Thread thread, C4956e c4956e) {
        this.appmetrica = c4594e;
        this.ad = j;
        this.vip = th;
        this.metrica = thread;
        this.license = c4956e;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C14461e c14461e;
        String str;
        long j = this.ad;
        long j2 = j / 1000;
        C4594e c4594e = this.appmetrica;
        String appmetrica = c4594e.appmetrica();
        if (appmetrica == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return AbstractC1749e.appmetrica(null);
        }
        c4594e.metrica.subscription();
        C14461e c14461e2 = c4594e.smaato;
        c14461e2.getClass();
        String concat = "Persisting fatal event for session ".concat(appmetrica);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        c14461e2.adcel(this.vip, this.metrica, "crash", new C13787e(appmetrica, j2, C9139e.f18290e), true);
        try {
            c14461e = c4594e.billing;
            str = ".ae" + j;
            c14461e.getClass();
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
        if (!new File((File) c14461e.f28586e, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        C4956e c4956e = this.license;
        c4594e.vip(false, c4956e, false);
        c4594e.metrica(new C0221e().ad, Boolean.FALSE);
        return !c4594e.vip.ad() ? AbstractC1749e.appmetrica(null) : ((C8988e) ((AtomicReference) c4956e.f10516e).get()).ad.smaato((ExecutorC4614e) c4594e.appmetrica.f25751e, new C6594e(this, appmetrica));
    }
}
