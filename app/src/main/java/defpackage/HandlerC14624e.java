package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC14624e extends Handler implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public IOException f28847e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f28848e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C18478e f28849e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC15834e f28850e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f28851e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public InterfaceC6901e f28852e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public volatile boolean f28853e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f28854e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Thread f28855e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f28856e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC14624e(C18478e c18478e, Looper looper, InterfaceC15834e interfaceC15834e, InterfaceC6901e interfaceC6901e, int i, long j) {
        super(looper);
        this.f28849e = c18478e;
        this.f28850e = interfaceC15834e;
        this.f28852e = interfaceC6901e;
        this.f28854e = i;
        this.f28848e = j;
    }

    public final void ad(boolean z) {
        this.f28853e = z;
        this.f28847e = null;
        if (hasMessages(1)) {
            this.f28851e = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f28851e = true;
                    this.f28850e.vip();
                    Thread thread = this.f28855e;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.f28849e.f36227e = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC6901e interfaceC6901e = this.f28852e;
            interfaceC6901e.getClass();
            interfaceC6901e.vip(this.f28850e, elapsedRealtime, elapsedRealtime - this.f28848e, true);
            this.f28852e = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f28853e) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            vip();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f28849e.f36227e = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f28848e;
        InterfaceC6901e interfaceC6901e = this.f28852e;
        interfaceC6901e.getClass();
        if (this.f28851e) {
            interfaceC6901e.vip(this.f28850e, elapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                interfaceC6901e.purchase(this.f28850e, elapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                AbstractC2803e.billing("LoadTask", "Unexpected exception handling load completed", e);
                this.f28849e.f36229e = new C11705e(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f28847e = iOException;
        int i3 = this.f28856e + 1;
        this.f28856e = i3;
        C9436e signatures = interfaceC6901e.signatures(this.f28850e, elapsedRealtime, j, iOException, i3);
        int i4 = signatures.f18776e;
        if (i4 == 3) {
            this.f28849e.f36229e = this.f28847e;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f28856e = 1;
            }
            long j2 = signatures.f18775e;
            if (j2 == -9223372036854775807L) {
                j2 = Math.min((this.f28856e - 1) * 1000, 5000);
            }
            C18478e c18478e = this.f28849e;
            AbstractC2301e.subscription(((HandlerC14624e) c18478e.f36227e) == null);
            c18478e.f36227e = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(1, j2);
            } else {
                vip();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f28851e;
                this.f28855e = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f28850e.getClass().getSimpleName()));
                try {
                    this.f28850e.ad();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f28855e = null;
                Thread.interrupted();
            }
            if (this.f28853e) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f28853e) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.f28853e) {
                return;
            }
            AbstractC2803e.billing("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new C11705e(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.f28853e) {
                return;
            }
            AbstractC2803e.billing("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new C11705e(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.f28853e) {
                AbstractC2803e.billing("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }

    public final void vip() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f28848e;
        InterfaceC6901e interfaceC6901e = this.f28852e;
        interfaceC6901e.getClass();
        interfaceC6901e.adcel(this.f28850e, elapsedRealtime, j, this.f28856e);
        this.f28847e = null;
        C18478e c18478e = this.f28849e;
        ExecutorC17731e executorC17731e = (ExecutorC17731e) c18478e.f36228e;
        HandlerC14624e handlerC14624e = (HandlerC14624e) c18478e.f36227e;
        handlerC14624e.getClass();
        executorC17731e.execute(handlerC14624e);
    }
}
