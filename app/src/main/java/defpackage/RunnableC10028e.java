package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10028e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f19828e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f19829e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f19830e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19831e;

    public RunnableC10028e(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f19831e = 1;
        this.f19830e = bottomSheetBehavior;
        this.f19828e = view;
        this.f19829e = i;
    }

    public /* synthetic */ RunnableC10028e(Object obj, int i, Object obj2, int i2) {
        this.f19831e = i2;
        this.f19830e = obj;
        this.f19829e = i;
        this.f19828e = obj2;
    }

    public /* synthetic */ RunnableC10028e(Object obj, Object obj2, int i, int i2) {
        this.f19831e = i2;
        this.f19828e = obj;
        this.f19830e = obj2;
        this.f19829e = i;
    }

    private final /* synthetic */ void ad() {
        BinderC8922e binderC8922e = (BinderC8922e) this.f19828e;
        C0056e c0056e = (C0056e) this.f19830e;
        int i = this.f19829e;
        synchronized (binderC8922e.billing) {
            binderC8922e.m2506e(c0056e, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [eؚٜۨ, java.lang.Object, eًّۣ] */
    @Override // java.lang.Runnable
    public final void run() {
        C7169e c7169e;
        ArrayList arrayList;
        int decrementAndGet;
        C0560e c0560e;
        switch (this.f19831e) {
            case 0:
                ((TextView) this.f19828e).setTypeface((Typeface) this.f19830e, this.f19829e);
                return;
            case 1:
                ((BottomSheetBehavior) this.f19830e).m179interface((View) this.f19828e, this.f19829e, false);
                return;
            case 2:
                C6907e c6907e = (C6907e) this.f19830e;
                int i = this.f19829e;
                ListenableFuture listenableFuture = (ListenableFuture) this.f19828e;
                boolean z = c6907e.f14156e;
                AtomicInteger atomicInteger = c6907e.f14158e;
                ArrayList arrayList2 = c6907e.f14157e;
                if (c6907e.isDone() || arrayList2 == null) {
                    AbstractC4265e.yandex("Future was done before all dependencies completed", z);
                    return;
                }
                try {
                    try {
                        try {
                            try {
                                AbstractC4265e.yandex("Tried to set value from future which is not done", listenableFuture.isDone());
                                arrayList2.set(i, AbstractC15792e.adcel(listenableFuture));
                                decrementAndGet = atomicInteger.decrementAndGet();
                                AbstractC4265e.yandex("Less than 0 remaining futures", decrementAndGet >= 0);
                            } catch (ExecutionException e) {
                                if (z) {
                                    c6907e.f14160e.metrica(e.getCause());
                                }
                                int decrementAndGet2 = atomicInteger.decrementAndGet();
                                AbstractC4265e.yandex("Less than 0 remaining futures", decrementAndGet2 >= 0);
                                if (decrementAndGet2 != 0) {
                                    return;
                                }
                                ArrayList arrayList3 = c6907e.f14157e;
                                if (arrayList3 != null) {
                                    c7169e = c6907e.f14160e;
                                    arrayList = new ArrayList(arrayList3);
                                }
                            }
                        } catch (CancellationException unused) {
                            if (z) {
                                c6907e.cancel(false);
                            }
                            int decrementAndGet3 = atomicInteger.decrementAndGet();
                            AbstractC4265e.yandex("Less than 0 remaining futures", decrementAndGet3 >= 0);
                            if (decrementAndGet3 != 0) {
                                return;
                            }
                            ArrayList arrayList4 = c6907e.f14157e;
                            if (arrayList4 != null) {
                                c7169e = c6907e.f14160e;
                                arrayList = new ArrayList(arrayList4);
                            }
                        }
                    } catch (Error e2) {
                        c6907e.f14160e.metrica(e2);
                        int decrementAndGet4 = atomicInteger.decrementAndGet();
                        AbstractC4265e.yandex("Less than 0 remaining futures", decrementAndGet4 >= 0);
                        if (decrementAndGet4 != 0) {
                            return;
                        }
                        ArrayList arrayList5 = c6907e.f14157e;
                        if (arrayList5 != null) {
                            c7169e = c6907e.f14160e;
                            arrayList = new ArrayList(arrayList5);
                        }
                    } catch (RuntimeException e3) {
                        if (z) {
                            c6907e.f14160e.metrica(e3);
                        }
                        int decrementAndGet5 = atomicInteger.decrementAndGet();
                        AbstractC4265e.yandex("Less than 0 remaining futures", decrementAndGet5 >= 0);
                        if (decrementAndGet5 != 0) {
                            return;
                        }
                        ArrayList arrayList6 = c6907e.f14157e;
                        if (arrayList6 != null) {
                            c7169e = c6907e.f14160e;
                            arrayList = new ArrayList(arrayList6);
                        }
                    }
                    if (decrementAndGet == 0) {
                        ArrayList arrayList7 = c6907e.f14157e;
                        if (arrayList7 != null) {
                            c7169e = c6907e.f14160e;
                            arrayList = new ArrayList(arrayList7);
                            c7169e.ad(arrayList);
                            return;
                        }
                        AbstractC4265e.yandex(null, c6907e.isDone());
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    int decrementAndGet6 = atomicInteger.decrementAndGet();
                    AbstractC4265e.yandex("Less than 0 remaining futures", decrementAndGet6 >= 0);
                    if (decrementAndGet6 == 0) {
                        ArrayList arrayList8 = c6907e.f14157e;
                        if (arrayList8 != null) {
                            c6907e.f14160e.ad(new ArrayList(arrayList8));
                        } else {
                            AbstractC4265e.yandex(null, c6907e.isDone());
                        }
                    }
                    throw th;
                }
            case 3:
                ((C15749e) this.f19828e).ad((Intent) this.f19830e, this.f19829e);
                return;
            case 4:
                ((SystemForegroundService) this.f19830e).f614e.notify(this.f19829e, (Notification) this.f19828e);
                return;
            case 5:
                ad();
                return;
            default:
                C0140e c0140e = (C0140e) this.f19828e;
                C4469e c4469e = (C4469e) this.f19830e;
                int i2 = this.f19829e;
                C11909e c11909e = c0140e.yandex;
                if (c11909e == null) {
                    return;
                }
                synchronized (c11909e) {
                    C8988e c8988e = new C8988e();
                    C4480e c4480e = c11909e.ad;
                    c4480e.getClass();
                    C9321e ad = C0381e.ad();
                    ad.ad = new C10182e(c4480e);
                    ad.appmetrica = 4501;
                    C0560e appmetrica = c4480e.appmetrica(0, ad.ad());
                    C9770e c9770e = new C9770e(29, c8988e);
                    appmetrica.getClass();
                    appmetrica.purchase(AbstractC10468e.ad, c9770e);
                    appmetrica.metrica(new C13951e(c8988e));
                    c11909e.metrica.postDelayed(new RunnableC4177e(1, c8988e), c11909e.vip * 1000);
                    c0560e = c8988e.ad;
                }
                ?? obj = new Object();
                obj.f14927e = c0140e;
                obj.f14926e = c4469e;
                obj.f14928e = i2;
                c0560e.appmetrica(obj);
                return;
        }
    }
}
