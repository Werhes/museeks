package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16850e implements IInterface {
    public final IBinder metrica;

    public C16850e(IBinder iBinder) {
        this.metrica = iBinder;
    }

    public final void adcel(BinderC2906e binderC2906e, C12288e c12288e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(binderC2906e);
            obtain.writeInt(1);
            C18517e.ad(c12288e, obtain, 0);
            this.metrica.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.metrica;
    }
}
