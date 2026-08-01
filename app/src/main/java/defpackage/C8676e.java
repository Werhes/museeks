package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8676e implements InterfaceC4687e {
    public IBinder metrica;

    @Override // defpackage.InterfaceC4687e
    public final void Signature(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            if (!this.metrica.transact(9, obtain, null, 1)) {
                int i2 = BinderC8864e.license;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC4687e
    /* renamed from: extends */
    public final void mo1669extends(C4820e c4820e) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            c4820e.writeToParcel(obtain, 0);
            if (!this.metrica.transact(3, obtain, null, 1)) {
                int i = BinderC8864e.license;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4687e
    /* renamed from: eؘِۢ */
    public final void mo1670e(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            if (!this.metrica.transact(12, obtain, null, 1)) {
                int i2 = BinderC8864e.license;
            }
        } finally {
            obtain.recycle();
        }
    }
}
