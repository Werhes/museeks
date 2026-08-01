package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC11808e implements ServiceConnection {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C5605e f23682e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f23683e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public IBinder f23685e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C14864e f23687e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public ComponentName f23688e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final HashMap f23686e = new HashMap();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f23684e = 2;

    public ServiceConnectionC11808e(C14864e c14864e, C5605e c5605e) {
        this.f23687e = c14864e;
        this.f23682e = c5605e;
    }

    public final C14758e ad(String str, Executor executor) {
        try {
            Intent ad = AbstractC10825e.ad(this.f23687e.vip, this.f23682e);
            this.f23684e = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(AbstractC5832e.ad(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                C14864e c14864e = this.f23687e;
                C5459e c5459e = c14864e.license;
                Context context = c14864e.vip;
                C5605e c5605e = this.f23682e;
                try {
                    boolean license = c5459e.license(context, str, ad, this, 4225, executor);
                    this.f23683e = license;
                    if (license) {
                        c14864e.metrica.sendMessageDelayed(c14864e.metrica.obtainMessage(1, c5605e), c14864e.purchase);
                        C14758e c14758e = C14758e.f29187e;
                        StrictMode.setVmPolicy(vmPolicy);
                        return c14758e;
                    }
                    this.f23684e = 2;
                    try {
                        c14864e.license.metrica(c14864e.vip, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    C14758e c14758e2 = new C14758e(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return c14758e2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (C10027e e) {
            return e.f19827e;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C14864e c14864e = this.f23687e;
        synchronized (c14864e.ad) {
            try {
                c14864e.metrica.removeMessages(1, this.f23682e);
                this.f23685e = iBinder;
                this.f23688e = componentName;
                Iterator it = this.f23686e.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f23684e = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C14864e c14864e = this.f23687e;
        synchronized (c14864e.ad) {
            try {
                c14864e.metrica.removeMessages(1, this.f23682e);
                this.f23685e = null;
                this.f23688e = componentName;
                Iterator it = this.f23686e.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f23684e = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
