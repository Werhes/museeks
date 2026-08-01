package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٚؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC15561e implements ServiceConnection {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4275e f30714e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Bundle f30715e;

    public ServiceConnectionC15561e(C4275e c4275e, Bundle bundle) {
        this.f30714e = c4275e;
        this.f30715e = bundle;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        C12318e c12318e = this.f30714e.ad;
        Objects.requireNonNull(c12318e);
        c12318e.vip(new RunnableC2783e(17, c12318e));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        RunnableC2783e runnableC2783e;
        C4275e c4275e = this.f30714e;
        C7543e c7543e = c4275e.appmetrica;
        C12318e c12318e = c4275e.ad;
        try {
            try {
                if (c7543e.ad.ads().equals(componentName.getPackageName())) {
                    InterfaceC14444e adcel = BinderC12883e.adcel(iBinder);
                    if (adcel != null) {
                        String packageName = c4275e.license.getPackageName();
                        int myPid = Process.myPid();
                        Bundle bundle = this.f30715e;
                        c12318e.getClass();
                        adcel.mo1913e(c4275e.metrica, new C5412e(packageName, myPid, bundle).vip());
                        return;
                    }
                    AbstractC2803e.purchase("MCImplBase", "Service interface is missing.");
                    Objects.requireNonNull(c12318e);
                    runnableC2783e = new RunnableC2783e(17, c12318e);
                } else {
                    AbstractC2803e.purchase("MCImplBase", "Expected connection to " + c7543e.ad.ads() + " but is connected to " + componentName);
                    Objects.requireNonNull(c12318e);
                    runnableC2783e = new RunnableC2783e(17, c12318e);
                }
            } catch (RemoteException unused) {
                AbstractC2803e.smaato("MCImplBase", "Service " + componentName + " has died prematurely");
                Objects.requireNonNull(c12318e);
                runnableC2783e = new RunnableC2783e(17, c12318e);
            }
            c12318e.vip(runnableC2783e);
        } catch (Throwable th) {
            Objects.requireNonNull(c12318e);
            c12318e.vip(new RunnableC2783e(17, c12318e));
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C12318e c12318e = this.f30714e.ad;
        Objects.requireNonNull(c12318e);
        c12318e.vip(new RunnableC2783e(17, c12318e));
    }
}
