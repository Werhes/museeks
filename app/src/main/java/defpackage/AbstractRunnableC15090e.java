package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۥۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC15090e extends AbstractC16326e implements Runnable {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final /* synthetic */ int f29871e = 0;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Class f29872e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Object f29873e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public ListenableFuture f29874e;

    public AbstractRunnableC15090e(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.f29874e = listenableFuture;
        this.f29872e = cls;
        this.f29873e = obj;
    }

    public abstract Object admob(Object obj, Throwable th);

    @Override // defpackage.AbstractC0586e
    public final void license() {
        ListenableFuture listenableFuture = this.f29874e;
        if ((listenableFuture != null) & (this.f2776e instanceof C8973e)) {
            listenableFuture.cancel(Signature());
        }
        this.f29874e = null;
        this.f29872e = null;
        this.f29873e = null;
    }

    @Override // defpackage.AbstractC0586e
    public final String mopub() {
        String str;
        ListenableFuture listenableFuture = this.f29874e;
        Class cls = this.f29872e;
        Object obj = this.f29873e;
        String mopub = super.mopub();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (cls == null || obj == null) {
            if (mopub != null) {
                return AbstractC10257e.adcel(str, mopub);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r8.f29874e
            java.lang.Class r1 = r8.f29872e
            java.lang.Object r2 = r8.f29873e
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = r4
            goto Ld
        Lc:
            r5 = r3
        Ld:
            if (r1 != 0) goto L11
            r6 = r4
            goto L12
        L11:
            r6 = r3
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = r4
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto La4
            java.lang.Object r3 = r8.f2776e
            boolean r3 = r3 instanceof defpackage.C8973e
            if (r3 == 0) goto L21
            goto La4
        L21:
            r3 = 0
            r8.f29874e = r3
            boolean r4 = r0 instanceof defpackage.AbstractC16520e     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            eٖۜٚ r4 = (defpackage.AbstractC16520e) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = r4.vip()     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = defpackage.AbstractC2017e.vip(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L6e
        L3c:
            r5 = r3
            goto L6e
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L6c
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Future type "
            r6.<init>(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.String r7 = " threw "
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            java.lang.String r4 = " without a cause"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
        L6c:
            r4 = r5
            goto L3c
        L6e:
            if (r4 != 0) goto L74
            r8.smaato(r5)
            return
        L74:
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L7e
            r8.loadAd(r0)
            return
        L7e:
            java.lang.Object r0 = r8.admob(r2, r4)     // Catch: java.lang.Throwable -> L8a
            r8.f29872e = r3
            r8.f29873e = r3
            r8.subscription(r0)
            return
        L8a:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L96
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9e
            r1.interrupt()     // Catch: java.lang.Throwable -> L9e
        L96:
            r8.amazon(r0)     // Catch: java.lang.Throwable -> L9e
            r8.f29872e = r3
            r8.f29873e = r3
            return
        L9e:
            r0 = move-exception
            r8.f29872e = r3
            r8.f29873e = r3
            throw r0
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractRunnableC15090e.run():void");
    }

    public abstract void subscription(Object obj);
}
