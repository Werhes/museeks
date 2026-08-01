package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12683e implements InterfaceC1149e, IInterface {
    public final IBinder metrica;

    public C12683e(IBinder iBinder) {
        this.metrica = iBinder;
    }

    public final Parcel adcel(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.metrica.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.metrica;
    }
}
