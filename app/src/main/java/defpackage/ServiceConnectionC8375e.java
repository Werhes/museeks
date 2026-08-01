package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC8375e implements ServiceConnection {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6785e f17139e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f17140e;

    public ServiceConnectionC8375e(AbstractC6785e abstractC6785e, int i) {
        this.f17139e = abstractC6785e;
        this.f17140e = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC6785e abstractC6785e = this.f17139e;
        if (iBinder == null) {
            abstractC6785e.premium();
            return;
        }
        synchronized (abstractC6785e.startapp) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC6785e.adcel = (queryLocalInterface == null || !(queryLocalInterface instanceof C16850e)) ? new C16850e(iBinder) : (C16850e) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC6785e abstractC6785e2 = this.f17139e;
        int i = this.f17140e;
        abstractC6785e2.getClass();
        C16195e c16195e = new C16195e(abstractC6785e2, 0, null);
        HandlerC3262e handlerC3262e = abstractC6785e2.billing;
        handlerC3262e.sendMessage(handlerC3262e.obtainMessage(7, i, -1, c16195e));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC6785e abstractC6785e = this.f17139e;
        synchronized (abstractC6785e.startapp) {
            abstractC6785e.adcel = null;
        }
        AbstractC6785e abstractC6785e2 = this.f17139e;
        int i = this.f17140e;
        HandlerC3262e handlerC3262e = abstractC6785e2.billing;
        handlerC3262e.sendMessage(handlerC3262e.obtainMessage(6, i, 1));
    }
}
