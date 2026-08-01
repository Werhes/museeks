package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7348e implements InterfaceC0274e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f15079e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16151e f15080e = new Object();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C10420e f15081e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f15082e;

    /* JADX WARN: Type inference failed for: r1v1, types: [eِٖۢ, java.lang.Object] */
    public C7348e(C10420e c10420e, boolean z) {
        this.f15081e = c10420e;
        this.f15082e = z;
    }

    /* JADX WARN: Finally extract failed */
    public final void ad(boolean z) {
        long min;
        boolean z2;
        C10420e c10420e = this.f15081e;
        synchronized (c10420e) {
            try {
                c10420e.f20599e.yandex();
                while (c10420e.f20600e >= c10420e.f20592e && !this.f15082e && !this.f15079e && c10420e.purchase() == 0) {
                    try {
                        try {
                            c10420e.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        c10420e.f20599e.advert();
                        throw th;
                    }
                }
                c10420e.f20599e.advert();
                c10420e.vip();
                min = Math.min(c10420e.f20592e - c10420e.f20600e, this.f15080e.f31731e);
                c10420e.f20600e += min;
                z2 = z && min == this.f15080e.f31731e;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f15081e.f20599e.yandex();
        try {
            C10420e c10420e2 = this.f15081e;
            c10420e2.f20597e.isVip(c10420e2.f20602e, z2, this.f15080e, min);
        } finally {
            this.f15081e.f20599e.advert();
        }
    }

    @Override // defpackage.InterfaceC0274e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C10420e c10420e = this.f15081e;
        TimeZone timeZone = AbstractC16286e.ad;
        synchronized (c10420e) {
            if (this.f15079e) {
                return;
            }
            boolean z = c10420e.purchase() == 0;
            Unit unit = Unit.INSTANCE;
            C10420e c10420e2 = this.f15081e;
            if (!c10420e2.f20601e.f15082e) {
                if (this.f15080e.f31731e > 0) {
                    while (this.f15080e.f31731e > 0) {
                        ad(true);
                    }
                } else if (z) {
                    c10420e2.f20597e.isVip(c10420e2.f20602e, true, null, 0L);
                }
            }
            C10420e c10420e3 = this.f15081e;
            synchronized (c10420e3) {
                this.f15079e = true;
                c10420e3.notifyAll();
                Unit unit2 = Unit.INSTANCE;
            }
            this.f15081e.f20597e.f20074e.flush();
            this.f15081e.ad();
        }
    }

    @Override // defpackage.InterfaceC0274e, java.io.Flushable
    public final void flush() {
        C10420e c10420e = this.f15081e;
        TimeZone timeZone = AbstractC16286e.ad;
        synchronized (c10420e) {
            c10420e.vip();
            Unit unit = Unit.INSTANCE;
        }
        while (this.f15080e.f31731e > 0) {
            ad(false);
            this.f15081e.f20597e.f20074e.flush();
        }
    }

    @Override // defpackage.InterfaceC0274e
    public final C1930e startapp() {
        return this.f15081e.f20599e;
    }

    @Override // defpackage.InterfaceC0274e
    /* renamed from: transient */
    public final void mo272transient(C16151e c16151e, long j) {
        TimeZone timeZone = AbstractC16286e.ad;
        C16151e c16151e2 = this.f15080e;
        c16151e2.mo272transient(c16151e, j);
        while (c16151e2.f31731e >= 16384) {
            ad(false);
        }
    }
}
