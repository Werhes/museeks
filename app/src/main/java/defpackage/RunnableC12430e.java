package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12430e implements Runnable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f24863e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Parcelable f24864e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f24865e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f24866e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24867e;

    public /* synthetic */ RunnableC12430e(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f24867e = 0;
        this.f24864e = intent;
        this.f24866e = context;
        this.f24865e = z;
        this.f24863e = pendingResult;
    }

    public /* synthetic */ RunnableC12430e(C10640e c10640e, C8019e c8019e, boolean z, AbstractC6484e abstractC6484e, int i) {
        this.f24867e = i;
        this.f24864e = c8019e;
        this.f24865e = z;
        this.f24866e = abstractC6484e;
        this.f24863e = c10640e;
    }

    public RunnableC12430e(C10640e c10640e, C8019e c8019e, boolean z, C15148e c15148e) {
        this.f24867e = 3;
        this.f24864e = c8019e;
        this.f24865e = z;
        this.f24866e = c15148e;
        Objects.requireNonNull(c10640e);
        this.f24863e = c10640e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        int i;
        switch (this.f24867e) {
            case 0:
                Intent intent = (Intent) this.f24864e;
                Context context = (Context) this.f24866e;
                boolean z = this.f24865e;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f24863e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i = FirebaseInstanceIdReceiver.ad(intent2);
                    } else {
                        int i2 = 500;
                        if (intent.getExtras() != null) {
                            C18320e c18320e = new C18320e(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.vip;
                                    executor = softReference != null ? (Executor) softReference.get() : null;
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC14833e("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.vip = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new RunnableC11666e(context, c18320e, countDownLatch));
                            try {
                                i2 = ((Integer) AbstractC1749e.ad(new C18540e(context).m4578private(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        i = i2;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
            case 1:
                C10640e c10640e = (C10640e) this.f24863e;
                InterfaceC8227e interfaceC8227e = c10640e.f20961e;
                if (interfaceC8227e == null) {
                    C13879e c13879e = ((C6936e) c10640e.f36443e).f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27502e.ad("Discarding data. Failed to set user property");
                    return;
                } else {
                    c10640e.m2857e(interfaceC8227e, this.f24865e ? null : (C9097e) this.f24866e, (C8019e) this.f24864e);
                    c10640e.m2853e();
                    return;
                }
            case 2:
                C10640e c10640e2 = (C10640e) this.f24863e;
                InterfaceC8227e interfaceC8227e2 = c10640e2.f20961e;
                if (interfaceC8227e2 == null) {
                    C13879e c13879e2 = ((C6936e) c10640e2.f36443e).f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27502e.ad("Discarding data. Failed to send event to service");
                    return;
                } else {
                    c10640e2.m2857e(interfaceC8227e2, this.f24865e ? null : (C15541e) this.f24866e, (C8019e) this.f24864e);
                    c10640e2.m2853e();
                    return;
                }
            default:
                C10640e c10640e3 = (C10640e) this.f24863e;
                InterfaceC8227e interfaceC8227e3 = c10640e3.f20961e;
                if (interfaceC8227e3 == null) {
                    C13879e c13879e3 = ((C6936e) c10640e3.f36443e).f14227e;
                    C6936e.yandex(c13879e3);
                    c13879e3.f27502e.ad("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    c10640e3.m2857e(interfaceC8227e3, this.f24865e ? null : (C15148e) this.f24866e, (C8019e) this.f24864e);
                    c10640e3.m2853e();
                    return;
                }
        }
    }
}
