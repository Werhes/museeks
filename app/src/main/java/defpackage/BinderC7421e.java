package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC7421e extends Binder {
    public final AbstractC17475e metrica;

    public BinderC7421e(List list) {
        this.metrica = AbstractC17475e.remoteconfig(list);
    }

    public static AbstractC17475e ad(IBinder iBinder) {
        int readInt;
        if (iBinder instanceof BinderC7421e) {
            return ((BinderC7421e) iBinder).metrica;
        }
        C13304e Signature = AbstractC17475e.Signature();
        int i = 0;
        int i2 = 1;
        while (i2 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            Signature.metrica(readBundle);
                            i++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i2 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return Signature.billing();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        AbstractC17475e abstractC17475e = this.metrica;
        int size = abstractC17475e.size();
        int readInt = parcel.readInt();
        while (readInt < size && parcel2.dataSize() < AbstractC18394e.ad) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) abstractC17475e.get(readInt));
            readInt++;
        }
        parcel2.writeInt(readInt < size ? 2 : 0);
        return true;
    }
}
