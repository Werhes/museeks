package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10142e implements Closeable {

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final C7207e f20055e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f20056e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public long f20057e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public long f20058e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f20059e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C10497e f20060e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public long f20061e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public long f20062e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C7207e f20063e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final LinkedHashMap f20064e = new LinkedHashMap();

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C7207e f20065e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public long f20066e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C14255e f20067e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C10497e f20068e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C17354e f20069e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final LinkedHashSet f20070e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C12894e f20071e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C18451e f20072e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f20073e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C13341e f20074e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C10497e f20075e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C12056e f20076e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC11101e f20077e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C14899e f20078e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f20079e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public long f20080e;

    static {
        C7207e c7207e = new C7207e();
        c7207e.vip(4, 65535);
        c7207e.vip(5, 16384);
        f20055e = c7207e;
    }

    public C10142e(C18464e c18464e) {
        this.f20077e = (AbstractC11101e) c18464e.f36189e;
        String str = (String) c18464e.f36192e;
        this.f20059e = str == null ? null : str;
        this.f20056e = 3;
        C14899e c14899e = (C14899e) c18464e.f36191e;
        this.f20078e = c14899e;
        this.f20068e = c14899e.license();
        this.f20075e = c14899e.license();
        this.f20060e = c14899e.license();
        this.f20069e = C17354e.f34053e;
        this.f20067e = (C14255e) c18464e.f36194e;
        C7207e c7207e = new C7207e();
        c7207e.vip(4, 16777216);
        this.f20065e = c7207e;
        this.f20063e = f20055e;
        this.f20072e = new C18451e(0);
        this.f20061e = r0.ad();
        C12894e c12894e = (C12894e) c18464e.f36190e;
        C12894e c12894e2 = c12894e != null ? c12894e : null;
        this.f20071e = c12894e2;
        this.f20074e = new C13341e((C9674e) c12894e2.f25752e);
        this.f20076e = new C12056e(this, new C14177e((C13197e) c12894e2.f25750e), false, 19);
        this.f20070e = new LinkedHashSet();
    }

    public final void Signature(long j) {
        synchronized (this) {
            try {
                C18451e.metrica(this.f20072e, j, 0L, 2);
                long vip = this.f20072e.vip();
                if (vip >= this.f20065e.ad() / 2) {
                    ads(0, vip);
                    C18451e.metrica(this.f20072e, 0L, vip, 1);
                }
                this.f20067e.getClass();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ad(int i, int i2, IOException iOException) {
        int i3;
        Object[] objArr;
        TimeZone timeZone = AbstractC16286e.ad;
        try {
            loadAd(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f20064e.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.f20064e.values().toArray(new C10420e[0]);
                    this.f20064e.clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        C10420e[] c10420eArr = (C10420e[]) objArr;
        if (c10420eArr != null) {
            for (C10420e c10420e : c10420eArr) {
                try {
                    c10420e.metrica(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f20074e.close();
        } catch (IOException unused3) {
        }
        try {
            this.f20071e.cancel();
        } catch (IOException unused4) {
        }
        this.f20068e.purchase();
        this.f20075e.purchase();
        this.f20060e.purchase();
    }

    public final void ads(final int i, final long j) {
        C10497e.metrica(this.f20068e, this.f20059e + '[' + i + "] windowUpdate", 0L, new Function0() { // from class: eؘۗۗ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C10142e c10142e = C10142e.this;
                try {
                    c10142e.f20074e.ads(i, j);
                } catch (IOException e) {
                    c10142e.ad(2, 2, e);
                }
                return Unit.INSTANCE;
            }
        }, 6);
    }

    public final C10420e advert(int i) {
        C10420e c10420e;
        synchronized (this) {
            c10420e = (C10420e) this.f20064e.remove(Integer.valueOf(i));
            notifyAll();
        }
        return c10420e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ad(1, 9, null);
    }

    public final void inmobi(int i, int i2) {
        C10497e.metrica(this.f20068e, this.f20059e + '[' + i + "] writeSynReset", 0L, new C11162e(this, i, i2, 0), 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f20074e.f26589e);
        r6 = r2;
        r8.f20080e += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void isVip(int r9, boolean r10, defpackage.C16151e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            eَْٚ r12 = r8.f20074e
            r12.license(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r4 = r8.f20080e     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            long r6 = r8.f20061e     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f20064e     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            r9 = move-exception
            goto L68
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            eَْٚ r4 = r8.f20074e     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f26589e     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f20080e     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f20080e = r4     // Catch: java.lang.Throwable -> L2a
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            eَْٚ r4 = r8.f20074e
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.license(r5, r9, r11, r2)
            goto Ld
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10142e.isVip(int, boolean, eِٖۢ, long):void");
    }

    public final C10420e license(int i) {
        C10420e c10420e;
        synchronized (this) {
            c10420e = (C10420e) this.f20064e.get(Integer.valueOf(i));
        }
        return c10420e;
    }

    public final void loadAd(int i) {
        synchronized (this.f20074e) {
            synchronized (this) {
                if (this.f20079e) {
                    return;
                }
                this.f20079e = true;
                int i2 = this.f20073e;
                Unit unit = Unit.INSTANCE;
                this.f20074e.advert(i2, i, AbstractC10220e.ad);
            }
        }
    }

    public final boolean purchase(long j) {
        synchronized (this) {
            if (this.f20079e) {
                return false;
            }
            if (this.f20062e < this.f20057e) {
                if (j >= this.f20066e) {
                    return false;
                }
            }
            return true;
        }
    }
}
