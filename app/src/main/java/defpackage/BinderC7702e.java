package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC7702e extends Binder implements InterfaceC3455e {
    public static final /* synthetic */ int license = 0;
    public final /* synthetic */ C12636e metrica;

    public BinderC7702e(C12636e c12636e) {
        this.metrica = c12636e;
        attachInterface(this, InterfaceC3455e.vip);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.InterfaceC3455e
    /* renamed from: e٘ۡؗ */
    public final void mo1365e(int i, Bundle bundle) {
        this.metrica.ad(i, bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC3455e.vip;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        mo1365e(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        return true;
    }
}
