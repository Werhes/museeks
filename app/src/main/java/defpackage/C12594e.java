package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٛۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12594e {
    public final C17381e ad;
    public boolean vip;

    public C12594e() {
        this(C17381e.ad);
    }

    public C12594e(C17381e c17381e) {
        this.ad = c17381e;
    }

    public final synchronized void ad() {
        while (!this.vip) {
            this.ad.getClass();
            wait();
        }
    }

    public final synchronized boolean license() {
        if (this.vip) {
            return false;
        }
        this.vip = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean metrica(long j) {
        if (j <= 0) {
            return this.vip;
        }
        this.ad.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        if (j2 < elapsedRealtime) {
            vip();
        } else {
            boolean z = false;
            while (!this.vip && elapsedRealtime < j2) {
                try {
                    this.ad.getClass();
                    wait(j2 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z = true;
                }
                this.ad.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.vip;
    }

    public final synchronized void vip() {
        boolean z = false;
        while (!this.vip) {
            try {
                this.ad.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
