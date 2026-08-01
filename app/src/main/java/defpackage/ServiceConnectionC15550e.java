package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٟٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC15550e implements ServiceConnection {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final SparseArray f30701e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C9271e f30702e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Messenger f30703e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ArrayDeque f30704e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f30705e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C9556e f30706e;

    public ServiceConnectionC15550e(C9556e c9556e) {
        this.f30706e = c9556e;
        Handler handler = new Handler(Looper.getMainLooper(), new C14369e(1, this));
        Looper.getMainLooper();
        this.f30703e = new Messenger(handler);
        this.f30704e = new ArrayDeque();
        this.f30701e = new SparseArray();
    }

    public final synchronized void ad(String str) {
        vip(str, null);
    }

    public final synchronized boolean license(C2680e c2680e) {
        int i = this.f30705e;
        if (i != 0) {
            if (i == 1) {
                this.f30704e.add(c2680e);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.f30704e.add(c2680e);
            ((ScheduledExecutorService) this.f30706e.f18967e).execute(new RunnableC7077e(this, 0));
            return true;
        }
        this.f30704e.add(c2680e);
        AbstractC9528e.advert(this.f30705e == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f30705e = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (C5459e.vip().ad((Context) this.f30706e.f18968e, intent, this, 1)) {
                ((ScheduledExecutorService) this.f30706e.f18967e).schedule(new RunnableC7077e(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                ad("Unable to bind to service");
            }
        } catch (SecurityException e) {
            vip("Unable to bind to service", e);
        }
        return true;
    }

    public final synchronized void metrica() {
        try {
            if (this.f30705e == 2 && this.f30704e.isEmpty() && this.f30701e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f30705e = 3;
                C5459e.vip().metrica((Context) this.f30706e.f18968e, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f30706e.f18967e).execute(new RunnableC12554e(this, iBinder, 7));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f30706e.f18967e).execute(new RunnableC7077e(this, 2));
    }

    public final synchronized void vip(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.f30705e;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.f30705e = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f30705e = 4;
            C5459e.vip().metrica((Context) this.f30706e.f18968e, this);
            C2123e c2123e = new C2123e(16, str, securityException);
            Iterator it = this.f30704e.iterator();
            while (it.hasNext()) {
                ((C2680e) it.next()).vip(c2123e);
            }
            this.f30704e.clear();
            for (int i2 = 0; i2 < this.f30701e.size(); i2++) {
                ((C2680e) this.f30701e.valueAt(i2)).vip(c2123e);
            }
            this.f30701e.clear();
        } catch (Throwable th) {
            throw th;
        }
    }
}
