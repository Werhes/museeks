package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5982e implements InterfaceC7387e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f12592e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f12593e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f12594e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f12595e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f12596e;

    public C5982e(C1195e c1195e, String str, long j) {
        Objects.requireNonNull(c1195e);
        this.f12592e = c1195e;
        AbstractC9528e.purchase(str);
        this.f12595e = str;
        this.f12594e = j;
    }

    public C5982e(RunnableC2783e runnableC2783e) {
        this.f12595e = new Handler(Looper.getMainLooper());
        this.f12592e = runnableC2783e;
    }

    public C5982e(C17381e c17381e) {
        this.f12595e = c17381e;
        this.f12592e = C4194e.license;
    }

    @Override // defpackage.InterfaceC7387e
    public void Signature(C4194e c4194e) {
        if (this.f12596e) {
            ad(inmobi());
        }
        this.f12592e = c4194e;
    }

    public void ad(long j) {
        this.f12594e = j;
        if (this.f12596e) {
            ((C17381e) this.f12595e).getClass();
            this.f12593e = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.InterfaceC7387e
    public long inmobi() {
        long j = this.f12594e;
        if (!this.f12596e) {
            return j;
        }
        ((C17381e) this.f12595e).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12593e;
        return (((C4194e) this.f12592e).ad == 1.0f ? AbstractC9413e.m2546case(elapsedRealtime) : elapsedRealtime * r4.metrica) + j;
    }

    @Override // defpackage.InterfaceC7387e
    public /* synthetic */ boolean isPro() {
        return false;
    }

    @Override // defpackage.InterfaceC7387e
    public C4194e isVip() {
        return (C4194e) this.f12592e;
    }

    public void license(long j) {
        SharedPreferences.Editor edit = ((C1195e) this.f12592e).m490e().edit();
        edit.putLong((String) this.f12595e, j);
        edit.apply();
        this.f12593e = j;
    }

    public long metrica() {
        if (!this.f12596e) {
            this.f12596e = true;
            C1195e c1195e = (C1195e) this.f12592e;
            this.f12593e = c1195e.m490e().getLong((String) this.f12595e, this.f12594e);
        }
        return this.f12593e;
    }

    public void vip() {
        if (this.f12596e) {
            return;
        }
        ((C17381e) this.f12595e).getClass();
        this.f12593e = SystemClock.elapsedRealtime();
        this.f12596e = true;
    }
}
