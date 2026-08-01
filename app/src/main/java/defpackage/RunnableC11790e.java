package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC11790e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C4602e f23659e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile AtomicInteger f23660e = new AtomicInteger(0);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC14187e f23661e;

    public RunnableC11790e(C4602e c4602e, InterfaceC14187e interfaceC14187e) {
        this.f23659e = c4602e;
        this.f23661e = interfaceC14187e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1343e c1343e;
        String str = "OkHttp " + this.f23659e.f9920e.ad.billing();
        C4602e c4602e = this.f23659e;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            c4602e.f9913e.yandex();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    c4602e.f9929e.ad.m3291abstract(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f23661e.subscription(c4602e, c4602e.yandex());
                c1343e = c4602e.f9929e;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    AbstractC18303e abstractC18303e = AbstractC18303e.ad;
                    AbstractC18303e.ad.adcel(4, "Callback failure for " + C4602e.ad(c4602e), e);
                } else {
                    this.f23661e.inmobi(e);
                }
                c1343e = c4602e.f9929e;
                c1343e.ad.m3291abstract(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                c4602e.license();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.initCause(th);
                    this.f23661e.inmobi(iOException);
                }
                if (!(th instanceof InterruptedException)) {
                    throw th;
                }
                Thread.currentThread().interrupt();
                c1343e = c4602e.f9929e;
                c1343e.ad.m3291abstract(this);
            }
            c1343e.ad.m3291abstract(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
