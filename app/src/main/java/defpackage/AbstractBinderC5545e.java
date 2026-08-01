package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC5545e extends AbstractBinderC0175e implements InterfaceC11764e {
    public static InterfaceC11764e asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return queryLocalInterface instanceof InterfaceC11764e ? (InterfaceC11764e) queryLocalInterface : new C15961e(iBinder);
    }

    @Override // defpackage.AbstractBinderC0175e
    public final boolean adcel(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        InterfaceC15751e m1404e = BinderC3838e.m1404e(parcel.readStrongBinder());
        C15573e c15573e = (C15573e) AbstractC17383e.ad(parcel, C15573e.CREATOR);
        AbstractC17383e.vip(parcel);
        IInterface newBarcodeScanner = newBarcodeScanner(m1404e, c15573e);
        parcel2.writeNoException();
        if (newBarcodeScanner == null) {
            parcel2.writeStrongBinder(null);
            return true;
        }
        parcel2.writeStrongBinder(((AbstractBinderC0175e) newBarcodeScanner).asBinder());
        return true;
    }
}
