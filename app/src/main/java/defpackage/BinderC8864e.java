package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٞ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC8864e extends Binder implements InterfaceC4687e {
    public static final /* synthetic */ int license = 0;
    public final WeakReference metrica;

    public BinderC8864e(C1861e c1861e) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.metrica = new WeakReference(c1861e);
    }

    @Override // defpackage.InterfaceC4687e
    public final void Signature(int i) {
        C1861e c1861e = (C1861e) this.metrica.get();
        if (c1861e != null) {
            c1861e.metrica(9, Integer.valueOf(i));
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.InterfaceC4687e
    /* renamed from: extends */
    public final void mo1669extends(C4820e c4820e) {
        C1861e c1861e = (C1861e) this.metrica.get();
        if (c1861e != null) {
            c1861e.metrica(2, c4820e);
        }
    }

    @Override // defpackage.InterfaceC4687e
    /* renamed from: eؘِۢ */
    public final void mo1670e(int i) {
        C1861e c1861e = (C1861e) this.metrica.get();
        if (c1861e != null) {
            c1861e.metrica(12, Integer.valueOf(i));
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            mo1669extends(parcel.readInt() != 0 ? C4820e.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 9) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            Signature(parcel.readInt());
            return true;
        }
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.metrica;
        switch (i) {
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z = parcel.readInt() != 0;
                C1861e c1861e = (C1861e) weakReference.get();
                if (c1861e != null) {
                    c1861e.metrica(11, Boolean.valueOf(z));
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                mo1670e(parcel.readInt());
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                C1861e c1861e2 = (C1861e) weakReference.get();
                if (c1861e2 != null) {
                    c1861e2.metrica(13, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
