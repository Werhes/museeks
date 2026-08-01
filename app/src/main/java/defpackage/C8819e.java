package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8819e extends AbstractC8031e {
    public final AtomicReference subs;

    public C8819e(Context context, Looper looper, C2532e c2532e, C1623e c1623e, C1623e c1623e2) {
        super(context, looper, 41, c2532e, c1623e, c1623e2);
        this.subs = new AtomicReference();
    }

    @Override // defpackage.AbstractC6785e
    public final String Signature() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.AbstractC6785e
    public final String admob() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.AbstractC6785e
    public final IInterface appmetrica(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return queryLocalInterface instanceof C11544e ? (C11544e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService", 1);
    }

    @Override // defpackage.AbstractC6785e
    public final boolean isPro() {
        return true;
    }

    @Override // defpackage.AbstractC6785e
    public final void purchase() {
        try {
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        if (this.subs.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        super.purchase();
    }

    @Override // defpackage.AbstractC6785e
    public final C1032e[] startapp() {
        return AbstractC12900e.startapp;
    }

    @Override // defpackage.AbstractC6785e, defpackage.InterfaceC2367e
    public final int vip() {
        return 12600000;
    }
}
