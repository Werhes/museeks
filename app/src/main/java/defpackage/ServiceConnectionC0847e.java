package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC0847e implements ServiceConnection {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public boolean f3230e = false;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final LinkedBlockingQueue f3229e = new LinkedBlockingQueue();

    public final IBinder ad() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC9528e.yandex("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f3230e) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f3230e = true;
        IBinder iBinder = (IBinder) this.f3229e.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3229e.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
