package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1930e {
    public static final C13997e license = new Object();
    public boolean ad;
    public long metrica;
    public long vip;

    public C1930e ad() {
        this.ad = false;
        return this;
    }

    public boolean appmetrica() {
        return this.ad;
    }

    public C1930e billing(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0869e.isVip(j, "timeout < 0: ").toString());
        }
        this.metrica = timeUnit.toNanos(j);
        return this;
    }

    public C1930e license(long j) {
        this.ad = true;
        this.vip = j;
        return this;
    }

    public long metrica() {
        if (this.ad) {
            return this.vip;
        }
        throw new IllegalStateException("No deadline");
    }

    public void purchase() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.ad && this.vip - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C1930e vip() {
        this.metrica = 0L;
        return this;
    }
}
