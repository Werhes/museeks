package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۛٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC8216e extends Binder implements IInterface {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        AbstractBinderC2498e abstractBinderC2498e = (AbstractBinderC2498e) this;
        if (i == 1) {
            abstractBinderC2498e.init(BinderC3838e.m1404e(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String readString = parcel.readString();
            int i3 = AbstractC3260e.ad;
            boolean booleanFlagValue = abstractBinderC2498e.getBooleanFlagValue(readString, parcel.readInt() != 0, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        }
        if (i == 3) {
            int intFlagValue = abstractBinderC2498e.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
            return true;
        }
        if (i == 4) {
            long longFlagValue = abstractBinderC2498e.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
            return true;
        }
        if (i != 5) {
            return false;
        }
        String stringFlagValue = abstractBinderC2498e.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
        parcel2.writeNoException();
        parcel2.writeString(stringFlagValue);
        return true;
    }
}
