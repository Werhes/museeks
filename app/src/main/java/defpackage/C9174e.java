package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9174e extends Thread {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f18348e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final WeakReference f18350e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final CountDownLatch f18347e = new CountDownLatch(1);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f18349e = false;

    public C9174e(C2698e c2698e, long j) {
        this.f18350e = new WeakReference(c2698e);
        this.f18348e = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C2698e c2698e;
        WeakReference weakReference = this.f18350e;
        try {
            if (this.f18347e.await(this.f18348e, TimeUnit.MILLISECONDS) || (c2698e = (C2698e) weakReference.get()) == null) {
                return;
            }
            c2698e.vip();
            this.f18349e = true;
        } catch (InterruptedException unused) {
            C2698e c2698e2 = (C2698e) weakReference.get();
            if (c2698e2 != null) {
                c2698e2.vip();
                this.f18349e = true;
            }
        }
    }
}
