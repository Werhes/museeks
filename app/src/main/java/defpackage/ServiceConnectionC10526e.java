package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC10526e implements ServiceConnection, InterfaceC3440e, InterfaceC5560e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C10640e f20780e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile C17034e f20781e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public volatile boolean f20782e;

    public ServiceConnectionC10526e(C10640e c10640e) {
        this.f20780e = c10640e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eؙۦؒ, eٖٗؒ] */
    public final void ad() {
        C10640e c10640e = this.f20780e;
        c10640e.mo2250e();
        Context context = ((C6936e) c10640e.f36443e).f14225e;
        synchronized (this) {
            try {
                try {
                    if (this.f20782e) {
                        C13879e c13879e = ((C6936e) this.f20780e.f36443e).f14227e;
                        C6936e.yandex(c13879e);
                        c13879e.f27497e.ad("Connection attempt already in progress");
                    } else {
                        if (this.f20781e != null && (this.f20781e.pro() || this.f20781e.remoteconfig())) {
                            C13879e c13879e2 = ((C6936e) this.f20780e.f36443e).f14227e;
                            C6936e.yandex(c13879e2);
                            c13879e2.f27497e.ad("Already awaiting connection attempt");
                            return;
                        }
                        this.f20781e = new AbstractC6785e(context, Looper.getMainLooper(), C14864e.ad(context), C17991e.vip, 93, this, this, null);
                        C13879e c13879e3 = ((C6936e) this.f20780e.f36443e).f14227e;
                        C6936e.yandex(c13879e3);
                        c13879e3.f27497e.ad("Connecting to remote service");
                        this.f20782e = true;
                        AbstractC9528e.startapp(this.f20781e);
                        this.f20781e.license();
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.InterfaceC5560e
    public final void adcel(C14758e c14758e) {
        C10640e c10640e = this.f20780e;
        C6915e c6915e = ((C6936e) c10640e.f36443e).f14226e;
        C6936e.yandex(c6915e);
        c6915e.m2246e();
        C13879e c13879e = ((C6936e) c10640e.f36443e).f14227e;
        if (c13879e == null || !c13879e.f15961e) {
            c13879e = null;
        }
        if (c13879e != null) {
            c13879e.f27497e.vip(c14758e, "Service connection failed");
        }
        synchronized (this) {
            this.f20782e = false;
            this.f20781e = null;
        }
        C6915e c6915e2 = ((C6936e) this.f20780e.f36443e).f14226e;
        C6936e.yandex(c6915e2);
        c6915e2.m2254e(new RunnableC12554e((Object) this, (Object) c14758e, false, 21));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C6915e c6915e = ((C6936e) this.f20780e.f36443e).f14226e;
        C6936e.yandex(c6915e);
        c6915e.m2246e();
        synchronized (this) {
            if (iBinder == null) {
                this.f20782e = false;
                C13879e c13879e = ((C6936e) this.f20780e.f36443e).f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27502e.ad("Service connected with null binder");
                return;
            }
            InterfaceC8227e interfaceC8227e = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    interfaceC8227e = queryLocalInterface instanceof InterfaceC8227e ? (InterfaceC8227e) queryLocalInterface : new C4661e(iBinder);
                    C13879e c13879e2 = ((C6936e) this.f20780e.f36443e).f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27497e.ad("Bound to IMeasurementService interface");
                } else {
                    C13879e c13879e3 = ((C6936e) this.f20780e.f36443e).f14227e;
                    C6936e.yandex(c13879e3);
                    c13879e3.f27502e.vip(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                C13879e c13879e4 = ((C6936e) this.f20780e.f36443e).f14227e;
                C6936e.yandex(c13879e4);
                c13879e4.f27502e.ad("Service connect failed to get IMeasurementService");
            }
            if (interfaceC8227e == null) {
                this.f20782e = false;
                try {
                    C5459e vip = C5459e.vip();
                    C10640e c10640e = this.f20780e;
                    vip.metrica(((C6936e) c10640e.f36443e).f14225e, c10640e.f20965e);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                C6915e c6915e2 = ((C6936e) this.f20780e.f36443e).f14226e;
                C6936e.yandex(c6915e2);
                c6915e2.m2254e(new RunnableC9958e(this, interfaceC8227e, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C6936e c6936e = (C6936e) this.f20780e.f36443e;
        C6915e c6915e = c6936e.f14226e;
        C6936e.yandex(c6915e);
        c6915e.m2246e();
        C13879e c13879e = c6936e.f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27496e.ad("Service disconnected");
        C6915e c6915e2 = c6936e.f14226e;
        C6936e.yandex(c6915e2);
        c6915e2.m2254e(new RunnableC12554e((Object) this, (Object) componentName, false, 19));
    }

    @Override // defpackage.InterfaceC3440e
    public final void pro(Bundle bundle) {
        C6915e c6915e = ((C6936e) this.f20780e.f36443e).f14226e;
        C6936e.yandex(c6915e);
        c6915e.m2246e();
        synchronized (this) {
            try {
                AbstractC9528e.startapp(this.f20781e);
                InterfaceC8227e interfaceC8227e = (InterfaceC8227e) this.f20781e.loadAd();
                C6915e c6915e2 = ((C6936e) this.f20780e.f36443e).f14226e;
                C6936e.yandex(c6915e2);
                c6915e2.m2254e(new RunnableC9958e(this, interfaceC8227e, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f20781e = null;
                this.f20782e = false;
            }
        }
    }

    @Override // defpackage.InterfaceC3440e
    public final void remoteconfig(int i) {
        C6936e c6936e = (C6936e) this.f20780e.f36443e;
        C6915e c6915e = c6936e.f14226e;
        C6936e.yandex(c6915e);
        c6915e.m2246e();
        C13879e c13879e = c6936e.f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27496e.ad("Service connection suspended");
        C6915e c6915e2 = c6936e.f14226e;
        C6936e.yandex(c6915e2);
        c6915e2.m2254e(new RunnableC16721e(15, this));
    }
}
