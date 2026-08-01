package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۘٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3586e implements InterfaceC16274e {
    public IBinder metrica;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC16274e
    public final C4820e billing() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.metrica.transact(28, obtain, obtain2, 0)) {
                int i = BinderC0188e.license;
            }
            obtain2.readException();
            C4820e createFromParcel = obtain2.readInt() != 0 ? C4820e.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return createFromParcel;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC16274e
    /* renamed from: eؚٜ۠ */
    public final void mo257e(InterfaceC4687e interfaceC4687e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder((BinderC8864e) interfaceC4687e);
            if (!this.metrica.transact(4, obtain, obtain2, 0)) {
                int i = BinderC0188e.license;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC16274e
    /* renamed from: eًًؓ */
    public final void mo258e(InterfaceC4687e interfaceC4687e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder((BinderC8864e) interfaceC4687e);
            if (!this.metrica.transact(3, obtain, obtain2, 0)) {
                int i = BinderC0188e.license;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC16274e
    public final boolean inmobi() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.metrica.transact(45, obtain, obtain2, 0)) {
                int i = BinderC0188e.license;
            }
            obtain2.readException();
            boolean z = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC16274e
    public final int isVip() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.metrica.transact(47, obtain, obtain2, 0)) {
                int i = BinderC0188e.license;
            }
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
            return readInt;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC16274e
    public final int startapp() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.metrica.transact(37, obtain, obtain2, 0)) {
                int i = BinderC0188e.license;
            }
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
            return readInt;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
