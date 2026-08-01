package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13015e implements InterfaceC3455e {
    public IBinder metrica;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC3455e
    /* renamed from: e٘ۡؗ */
    public final void mo1365e(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC3455e.vip);
            obtain.writeInt(i);
            obtain.writeTypedObject(bundle, 0);
            this.metrica.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
