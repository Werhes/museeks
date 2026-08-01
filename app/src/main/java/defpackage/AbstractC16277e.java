package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16277e implements IInterface {
    public final String appmetrica;
    public final IBinder license;
    public final /* synthetic */ int metrica;

    public /* synthetic */ AbstractC16277e(IBinder iBinder, String str, int i) {
        this.metrica = i;
        this.license = iBinder;
        this.appmetrica = str;
    }

    public Parcel adcel() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.appmetrica);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.metrica) {
            case 0:
                return this.license;
            case 1:
                return this.license;
            case 2:
                return this.license;
            case 3:
                return this.license;
            case 4:
                return this.license;
            default:
                return this.license;
        }
    }

    /* renamed from: eٜؑ٘, reason: contains not printable characters */
    public void m4149e(Parcel parcel) {
        try {
            this.license.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: eؚؑ۟, reason: contains not printable characters */
    public Parcel m4150e(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.license.transact(i, parcel, obtain, 0);
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

    /* renamed from: eؚؓؓ, reason: contains not printable characters */
    public void m4151e(Parcel parcel, int i) {
        try {
            this.license.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: eًٓؓ, reason: contains not printable characters */
    public Parcel m4152e(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.license.transact(i, parcel, obtain, 0);
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

    /* renamed from: eٔۚٙ, reason: contains not printable characters */
    public void m4153e(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.license.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public Parcel m4154e(Parcel parcel, int i) {
        switch (this.metrica) {
            case 1:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        this.license.transact(i, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } finally {
                    }
                } catch (RuntimeException e) {
                    obtain.recycle();
                    throw e;
                }
            default:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.license.transact(i, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } catch (RuntimeException e2) {
                        obtain2.recycle();
                        throw e2;
                    }
                } finally {
                }
        }
    }

    /* renamed from: eٖۤٝ, reason: contains not printable characters */
    public void m4155e(Parcel parcel, int i) {
        Parcel obtain;
        switch (this.metrica) {
            case 1:
                obtain = Parcel.obtain();
                try {
                    this.license.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 2:
            default:
                obtain = Parcel.obtain();
                try {
                    this.license.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 3:
                obtain = Parcel.obtain();
                try {
                    this.license.transact(i, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    /* renamed from: eٍۡ, reason: contains not printable characters */
    public Parcel m4156e() {
        switch (this.metrica) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.appmetrica);
                return obtain;
            case 2:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.appmetrica);
                return obtain2;
            case 3:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.appmetrica);
                return obtain3;
            case 4:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(this.appmetrica);
                return obtain4;
            default:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(this.appmetrica);
                return obtain5;
        }
    }

    public void remoteconfig(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.license.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
