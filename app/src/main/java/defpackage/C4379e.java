package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4379e extends AbstractC8031e {

    /* renamed from: interface, reason: not valid java name */
    public static final C18482e f9540interface = new C18482e("CastClientImplCxless", null);

    /* renamed from: class, reason: not valid java name */
    public final String f9541class;
    public final long crashlytics;
    public final Bundle firebase;
    public final CastDevice subs;

    public C4379e(Context context, Looper looper, C2532e c2532e, CastDevice castDevice, long j, Bundle bundle, String str, C1623e c1623e, C1623e c1623e2) {
        super(context, looper, 10, c2532e, c1623e, c1623e2);
        this.subs = castDevice;
        this.crashlytics = j;
        this.firebase = bundle;
        this.f9541class = str;
    }

    @Override // defpackage.AbstractC6785e
    public final String Signature() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // defpackage.AbstractC6785e
    public final String admob() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // defpackage.AbstractC6785e
    public final Bundle advert() {
        Bundle bundle = new Bundle();
        f9540interface.vip("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.subs;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.crashlytics);
        bundle.putString("connectionless_client_record_id", this.f9541class);
        Bundle bundle2 = this.firebase;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    @Override // defpackage.AbstractC6785e
    public final /* synthetic */ IInterface appmetrica(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof C1091e ? (C1091e) queryLocalInterface : new C1091e(iBinder);
    }

    @Override // defpackage.AbstractC6785e
    public final boolean isPro() {
        return true;
    }

    @Override // defpackage.AbstractC6785e
    public final void purchase() {
        try {
            try {
                C1091e c1091e = (C1091e) loadAd();
                C10988e appmetrica = AbstractC10432e.appmetrica();
                Parcel m4156e = c1091e.m4156e();
                AbstractC3336e.vip(m4156e, appmetrica);
                c1091e.m4151e(m4156e, 1);
            } finally {
                super.purchase();
            }
        } catch (RemoteException | IllegalStateException e) {
            f9540interface.ad(e, "Error while disconnecting the controller interface", new Object[0]);
        }
    }

    @Override // defpackage.AbstractC6785e
    public final C1032e[] startapp() {
        return AbstractC18209e.purchase;
    }

    @Override // defpackage.AbstractC6785e, defpackage.InterfaceC2367e
    public final int vip() {
        return 19390000;
    }
}
