package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۡۢ */
/* loaded from: classes3.dex */
public final class C5976e {
    public final ExecutorService ad;
    public final C17519e appmetrica;
    public final C17519e license;
    public volatile boolean metrica;
    public final C17519e vip;

    public C5976e() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(6, 6, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.ad = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.vip = new C17519e(0);
        this.metrica = false;
        this.license = new C17519e(0);
        this.appmetrica = new C17519e(0);
    }

    public static /* bridge */ /* synthetic */ void ad(ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream, boolean z, long j) {
        try {
            try {
                autoCloseOutputStream.write(z ? 1 : 0);
            } catch (IOException e) {
                Log.w("NearbyConnections", String.format("Unable to deliver status for Payload %d", Long.valueOf(j)), e);
            }
        } finally {
            AbstractC2206e.ad(autoCloseOutputStream);
        }
    }

    public final synchronized void metrica() {
        C17519e c17519e;
        C17519e c17519e2;
        try {
            this.metrica = true;
            this.ad.shutdownNow();
            int i = 0;
            int i2 = 0;
            while (true) {
                c17519e = this.vip;
                if (i2 >= c17519e.f34352e) {
                    break;
                }
                AbstractC2206e.ad((Closeable) c17519e.startapp(i2));
                i2++;
            }
            c17519e.clear();
            int i3 = 0;
            while (true) {
                c17519e2 = this.license;
                if (i3 >= c17519e2.f34352e) {
                    break;
                }
                AbstractC2206e.ad((Closeable) c17519e2.startapp(i3));
                i3++;
            }
            c17519e2.clear();
            while (true) {
                C17519e c17519e3 = this.appmetrica;
                if (i < c17519e3.f34352e) {
                    C7210e c7210e = (C7210e) c17519e3.startapp(i);
                    ParcelFileDescriptor parcelFileDescriptor = c7210e.f14728e;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptor2 = c7210e.f14731e;
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    i++;
                } else {
                    c17519e3.clear();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void vip(long j) {
        C17519e c17519e = this.vip;
        Long valueOf = Long.valueOf(j);
        AbstractC2206e.ad((Closeable) c17519e.get(valueOf));
        this.vip.remove(valueOf);
        AbstractC2206e.ad((Closeable) this.license.get(valueOf));
        this.license.remove(valueOf);
        C7210e c7210e = (C7210e) this.appmetrica.remove(valueOf);
        if (c7210e != null) {
            ParcelFileDescriptor parcelFileDescriptor = c7210e.f14728e;
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            ParcelFileDescriptor parcelFileDescriptor2 = c7210e.f14731e;
            if (parcelFileDescriptor2 != null) {
                try {
                    parcelFileDescriptor2.close();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
