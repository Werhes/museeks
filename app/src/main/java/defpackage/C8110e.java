package defpackage;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8110e implements Closeable {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final HashMap f16464e = new HashMap();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f16466e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f16467e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f16469e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f16468e = 2147483647L;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f16465e = -2147483648L;

    public C8110e(String str) {
    }

    public void ad() {
        this.f16467e = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.f16467e;
        if (j == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        purchase(j);
    }

    public void license(long j) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.f16466e;
        if (j2 != 0 && elapsedRealtimeNanos - j2 >= 1000000) {
            this.f16469e = 0;
            this.f16467e = 0L;
            this.f16468e = 2147483647L;
            this.f16465e = -2147483648L;
        }
        this.f16466e = elapsedRealtimeNanos;
        this.f16469e++;
        this.f16468e = Math.min(this.f16468e, j);
        this.f16465e = Math.max(this.f16465e, j);
        if (this.f16469e % 50 == 0) {
            Locale locale = Locale.US;
            C14914e.subscription();
        }
        if (this.f16469e % 500 == 0) {
            this.f16469e = 0;
            this.f16467e = 0L;
            this.f16468e = 2147483647L;
            this.f16465e = -2147483648L;
        }
    }

    public void purchase(long j) {
        license((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }
}
