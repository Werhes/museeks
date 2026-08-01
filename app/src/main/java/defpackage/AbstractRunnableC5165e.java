package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۜؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC5165e extends AbstractC16326e implements Runnable {

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final /* synthetic */ int f11052e = 0;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object f11053e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public ListenableFuture f11054e;

    public AbstractRunnableC5165e(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.f11054e = listenableFuture;
        obj.getClass();
        this.f11053e = obj;
    }

    public abstract Object admob(Object obj, Object obj2);

    @Override // defpackage.AbstractC0586e
    public final void license() {
        ListenableFuture listenableFuture = this.f11054e;
        if ((listenableFuture != null) & (this.f2776e instanceof C8973e)) {
            listenableFuture.cancel(Signature());
        }
        this.f11054e = null;
        this.f11053e = null;
    }

    @Override // defpackage.AbstractC0586e
    public final String mopub() {
        String str;
        ListenableFuture listenableFuture = this.f11054e;
        Object obj = this.f11053e;
        String mopub = super.mopub();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (obj == null) {
            if (mopub != null) {
                return AbstractC10257e.adcel(str, mopub);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f11054e;
        Object obj = this.f11053e;
        if (((this.f2776e instanceof C8973e) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f11054e = null;
        if (listenableFuture.isCancelled()) {
            loadAd(listenableFuture);
            return;
        }
        try {
            try {
                Object admob = admob(obj, AbstractC2017e.vip(listenableFuture));
                this.f11053e = null;
                subscription(admob);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    amazon(th);
                } finally {
                    this.f11053e = null;
                }
            }
        } catch (Error e) {
            amazon(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            amazon(e2.getCause());
        } catch (Exception e3) {
            amazon(e3);
        }
    }

    public abstract void subscription(Object obj);
}
