package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4359e implements InterfaceC4342e {
    public IBinder metrica;

    @Override // defpackage.InterfaceC4342e
    public final void ad() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(0);
            this.metrica.transact(3006, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    public final void advert(int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.metrica.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: continue */
    public final void mo1614continue(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            AbstractC10115e.startapp(obtain, bundle);
            this.metrica.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eؘٕۚ */
    public final void mo1615e(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            AbstractC10115e.startapp(obtain, bundle);
            this.metrica.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eٌؚۛ */
    public final void mo1617e(int i, Bundle bundle, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            AbstractC10115e.startapp(obtain, bundle);
            obtain.writeInt(z ? 1 : 0);
            this.metrica.transact(3007, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eٍۢؒ */
    public final void mo1618e(int i, Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            AbstractC10115e.startapp(obtain, bundle);
            AbstractC10115e.startapp(obtain, bundle2);
            this.metrica.transact(3013, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eِؗؓ */
    public final void mo1619e(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            AbstractC10115e.startapp(obtain, bundle);
            this.metrica.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eّْٝ */
    public final void mo1620e(int i, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = Bundle.EMPTY;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            AbstractC10115e.startapp(obtain, bundle);
            AbstractC10115e.startapp(obtain, bundle3);
            this.metrica.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eًْٕ */
    public final void mo1621e(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            AbstractC10115e.startapp(obtain, bundle);
            this.metrica.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eؘٟ٘ */
    public final void mo1622e(int i, int i2, Bundle bundle, String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeInt(10);
            AbstractC10115e.startapp(obtain, bundle);
            this.metrica.transact(4002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: e٘ٔ٘ */
    public final void mo1623e(int i, int i2, Bundle bundle, String str) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeInt(0);
            AbstractC10115e.startapp(obtain, bundle);
            this.metrica.transact(4001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    /* renamed from: eَۣ٘ */
    public final void mo1624e(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            AbstractC10115e.startapp(obtain, bundle);
            this.metrica.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    public final void metrica(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            this.metrica.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC4342e
    public final void premium(int i, List list) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            obtain.writeInt(i);
            if (list == null) {
                obtain.writeInt(-1);
            } else {
                int i2 = ((C1410e) list).f4224e;
                obtain.writeInt(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    AbstractC10115e.startapp(obtain, (Parcelable) ((C1410e) list).get(i3));
                }
            }
            this.metrica.transact(3004, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
