package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14484e implements InterfaceC12379e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Handler f28629e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C16728e f28630e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C10359e f28631e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public AbstractC12947e f28632e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f28633e = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f28634e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public ThreadPoolExecutor f28635e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public ThreadPoolExecutor f28636e;

    public C14484e(Context context, C10359e c10359e) {
        AbstractC4265e.billing(context, "Context cannot be null");
        this.f28634e = context.getApplicationContext();
        this.f28631e = c10359e;
        this.f28630e = C15097e.license;
    }

    public final void ad() {
        synchronized (this.f28633e) {
            try {
                this.f28632e = null;
                Handler handler = this.f28629e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f28629e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f28635e;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f28636e = null;
                this.f28635e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C14959e metrica() {
        try {
            C16728e c16728e = this.f28630e;
            Context context = this.f28634e;
            C10359e c10359e = this.f28631e;
            c16728e.getClass();
            Object[] objArr = {c10359e};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C6233e ad = AbstractC0050e.ad(context, DesugarCollections.unmodifiableList(arrayList));
            int i = ad.ad;
            if (i != 0) {
                throw new RuntimeException(AbstractC1634e.smaato("fetchFonts failed (", i, ")"));
            }
            C14959e[] c14959eArr = (C14959e[]) ad.vip.get(0);
            if (c14959eArr == null || c14959eArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return c14959eArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // defpackage.InterfaceC12379e
    public final void purchase(AbstractC12947e abstractC12947e) {
        synchronized (this.f28633e) {
            this.f28632e = abstractC12947e;
        }
        vip();
    }

    public final void vip() {
        synchronized (this.f28633e) {
            try {
                if (this.f28632e == null) {
                    return;
                }
                if (this.f28636e == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC9760e("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f28635e = threadPoolExecutor;
                    this.f28636e = threadPoolExecutor;
                }
                this.f28636e.execute(new RunnableC2783e(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
