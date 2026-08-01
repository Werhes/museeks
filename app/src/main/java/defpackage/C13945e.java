package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13945e {
    public C5891e adcel;
    public final InterfaceC14449e advert;
    public final C9029e amazon;
    public final Handler appmetrica;
    public C6797e billing;
    public final Executor license;
    public final C5363e loadAd;
    public final C4373e metrica;
    public C11106e mopub;
    public final HandlerThread purchase;
    public final C9689e smaato;
    public C11807e startapp;
    public final Integer subscription;
    public C5139e yandex;
    public static final Object remoteconfig = new Object();
    public static final SparseArray pro = new SparseArray();
    public final C3862e ad = new C3862e();
    public final Object vip = new Object();
    public int Signature = 1;
    public ListenableFuture admob = C4065e.f9036e;

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13945e(android.content.Context r8, defpackage.AbstractC17791e r9) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13945e.<init>(android.content.Context, eٖ٘ؒ):void");
    }

    public static void ad(Integer num) {
        synchronized (remoteconfig) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = pro;
                int intValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                purchase();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void appmetrica(C15475e c15475e) {
        if (AbstractC12246e.billing()) {
            int i = c15475e != null ? c15475e.ad : -1;
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC14204e.m3784while(i, AbstractC12246e.startapp("CX:CameraProvider-RetryStatus"));
                return;
            }
            String startapp = AbstractC12246e.startapp("CX:CameraProvider-RetryStatus");
            try {
                if (AbstractC12246e.billing == null) {
                    AbstractC12246e.billing = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                }
                Method method = AbstractC12246e.billing;
                if (method == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                method.invoke(null, Long.valueOf(AbstractC12246e.metrica), startapp, Integer.valueOf(i));
            } catch (Exception e) {
                AbstractC12246e.purchase("traceCounter", e);
            }
        }
    }

    public static void purchase() {
        SparseArray sparseArray = pro;
        if (sparseArray.size() == 0) {
            AbstractC9464e.metrica = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            AbstractC9464e.metrica = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            AbstractC9464e.metrica = 4;
        } else if (sparseArray.get(5) != null) {
            AbstractC9464e.metrica = 5;
        } else if (sparseArray.get(6) != null) {
            AbstractC9464e.metrica = 6;
        }
    }

    public final ListenableFuture license() {
        synchronized (this.vip) {
            try {
                this.appmetrica.removeCallbacksAndMessages("retry_token");
                int m2467class = AbstractC8703e.m2467class(this.Signature);
                if (m2467class == 0) {
                    this.Signature = 5;
                    return C4065e.f9036e;
                }
                if (m2467class == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (m2467class == 2 || m2467class == 3) {
                    this.Signature = 5;
                    ad(this.subscription);
                    this.admob = AbstractC5750e.purchase(new C0211e(7, this));
                }
                return this.admob;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void metrica() {
        synchronized (this.vip) {
            this.Signature = 4;
        }
    }

    public final C9689e vip(Context context) {
        C9689e purchase;
        synchronized (this.vip) {
            boolean z = true;
            if (this.Signature != 1) {
                z = false;
            }
            AbstractC4265e.yandex("CameraX.initInternal() should only be called once per instance", z);
            this.Signature = 2;
            purchase = AbstractC5750e.purchase(new C11565e(this, context, 0));
        }
        return purchase;
    }
}
