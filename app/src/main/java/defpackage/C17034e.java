package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17034e extends AbstractC6785e {
    @Override // defpackage.AbstractC6785e
    public final String Signature() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.AbstractC6785e
    public final String admob() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // defpackage.AbstractC6785e
    public final /* synthetic */ IInterface appmetrica(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC8227e ? (InterfaceC8227e) queryLocalInterface : new C4661e(iBinder);
    }

    @Override // defpackage.AbstractC6785e, defpackage.InterfaceC2367e
    public final int vip() {
        return 12451000;
    }
}
