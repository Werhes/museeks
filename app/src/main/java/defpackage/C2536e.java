package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2536e implements InterfaceC3001e {
    public IBinder metrica;

    @Override // defpackage.InterfaceC3001e
    /* renamed from: abstract, reason: not valid java name */
    public final void mo941abstract(InterfaceC4342e interfaceC4342e, int i, Bundle bundle, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, bundle);
            obtain.writeLong(j);
            this.metrica.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: class, reason: not valid java name */
    public final void mo942class(InterfaceC4342e interfaceC4342e, int i, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeString(str);
            AbstractC5458e.metrica(obtain, bundle);
            this.metrica.transact(3049, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    public final void crashlytics(InterfaceC4342e interfaceC4342e, int i, Bundle bundle, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, bundle);
            obtain.writeInt(z ? 1 : 0);
            this.metrica.transact(3057, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: else, reason: not valid java name */
    public final void mo943else(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3024, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eَؑۨ, reason: contains not printable characters */
    public final void mo944e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3040, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؑ۠ۖ, reason: contains not printable characters */
    public final void mo945e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, bundle);
            obtain.writeInt(1);
            this.metrica.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eۣؑۡ, reason: contains not printable characters */
    public final void mo946e(InterfaceC4342e interfaceC4342e, int i, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            this.metrica.transact(3031, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؑۧٝ, reason: contains not printable characters */
    public final void mo947e(InterfaceC4342e interfaceC4342e, int i, int i2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            AbstractC5458e.metrica(obtain, bundle);
            this.metrica.transact(3055, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒؑۜ, reason: contains not printable characters */
    public final void mo948e(InterfaceC4342e interfaceC4342e, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.metrica.transact(3022, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒؓٙ, reason: contains not printable characters */
    public final void mo949e(InterfaceC4342e interfaceC4342e, int i, int i2, int i3, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            this.metrica.transact(3023, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final void mo950e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.metrica.transact(3019, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒٞ٘, reason: contains not printable characters */
    public final void mo951e(InterfaceC4342e interfaceC4342e, int i, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeLong(j);
            this.metrica.transact(3038, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public final void mo952e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, bundle);
            this.metrica.transact(3048, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    public final void mo953e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3004, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public final void mo954e(InterfaceC4342e interfaceC4342e, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.metrica.transact(3051, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٕؓؗ, reason: contains not printable characters */
    public final void mo955e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.metrica.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؕؓٗ, reason: contains not printable characters */
    public final void mo956e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3046, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٟؕۡ, reason: contains not printable characters */
    public final void mo957e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3021, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eِؖؕ, reason: contains not printable characters */
    public final void mo958e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, bundle);
            this.metrica.transact(3007, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public final void mo959e(InterfaceC4342e interfaceC4342e, int i, IBinder iBinder, int i2, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.metrica.transact(3012, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٍؖۙ, reason: contains not printable characters */
    public final void mo960e(InterfaceC4342e interfaceC4342e, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.metrica.transact(3020, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eًؖٝ, reason: contains not printable characters */
    public final void mo961e(InterfaceC4342e interfaceC4342e, int i, int i2, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeStrongBinder(iBinder);
            this.metrica.transact(3032, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public final void mo962e(InterfaceC4342e interfaceC4342e, int i, float f) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeFloat(f);
            this.metrica.transact(3028, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public final void mo963e(InterfaceC4342e interfaceC4342e, int i, float f) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeFloat(f);
            this.metrica.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؘؗؕ, reason: contains not printable characters */
    public final void mo964e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3026, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؙؐ٘, reason: contains not printable characters */
    public final void mo965e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, bundle);
            this.metrica.transact(3015, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؙؙٝ, reason: contains not printable characters */
    public final void mo966e(InterfaceC4342e interfaceC4342e, int i, int i2, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.metrica.transact(3039, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؙۛ۠, reason: contains not printable characters */
    public final void mo967e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3036, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public final void mo968e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3041, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eًؚؔ, reason: contains not printable characters */
    public final void mo969e(InterfaceC4342e interfaceC4342e, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.metrica.transact(3006, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٍؙۨ, reason: contains not printable characters */
    public final void mo970e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, bundle);
            this.metrica.transact(3033, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public final void mo971e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3043, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؘُٗ, reason: contains not printable characters */
    public final void mo972e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.metrica.transact(3037, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public final void mo973e(InterfaceC4342e interfaceC4342e, int i, int i2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            AbstractC5458e.metrica(obtain, bundle);
            this.metrica.transact(3030, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eُۚۙ, reason: contains not printable characters */
    public final void mo974e(InterfaceC4342e interfaceC4342e, int i, Surface surface, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, surface);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.metrica.transact(3061, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final void mo975e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3042, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eُِؕ, reason: contains not printable characters */
    public final void mo976e(InterfaceC4342e interfaceC4342e, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.metrica.transact(3013, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eِْ۠, reason: contains not printable characters */
    public final void mo977e(InterfaceC4342e interfaceC4342e, int i, Surface surface) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, surface);
            this.metrica.transact(3044, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؙِۡ, reason: contains not printable characters */
    public final void mo978e(InterfaceC4342e interfaceC4342e, int i, IBinder iBinder, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(1);
            this.metrica.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٓؒؔ, reason: contains not printable characters */
    public final void mo979e(InterfaceC4342e interfaceC4342e, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.metrica.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٍٓۢ, reason: contains not printable characters */
    public final void mo980e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.metrica.transact(3053, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eِٓۦ, reason: contains not printable characters */
    public final void mo981e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3034, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eّٔؗ, reason: contains not printable characters */
    public final void mo982e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3047, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٖٔ٘, reason: contains not printable characters */
    public final void mo983e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, bundle);
            this.metrica.transact(3027, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٔٞۢ, reason: contains not printable characters */
    public final void mo984e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3035, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٔۥۥ, reason: contains not printable characters */
    public final void mo985e(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٕٙؗ, reason: contains not printable characters */
    public final void mo986e(InterfaceC4342e interfaceC4342e, int i, int i2, int i3, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeStrongBinder(iBinder);
            this.metrica.transact(3056, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؙٖؐ, reason: contains not printable characters */
    public final void mo987e(InterfaceC4342e interfaceC4342e, int i, Bundle bundle, Bundle bundle2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, bundle);
            AbstractC5458e.metrica(obtain, bundle2);
            this.metrica.transact(3016, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eؘٖؗ, reason: contains not printable characters */
    public final void mo988e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.metrica.transact(3052, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eِٗۛ, reason: contains not printable characters */
    public final void mo989e(InterfaceC4342e interfaceC4342e) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            this.metrica.transact(3045, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٕٗٛ, reason: contains not printable characters */
    public final void mo990e(InterfaceC4342e interfaceC4342e, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.metrica.transact(3062, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eٗٚٚ, reason: contains not printable characters */
    public final void mo991e(InterfaceC4342e interfaceC4342e, int i, boolean z, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i2);
            this.metrica.transact(3054, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: eۣ٘ؓ, reason: contains not printable characters */
    public final void mo992e(InterfaceC4342e interfaceC4342e, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.metrica.transact(3017, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: interface, reason: not valid java name */
    public final void mo993interface(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3025, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: protected, reason: not valid java name */
    public final void mo994protected(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3058, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: public, reason: not valid java name */
    public final void mo995public(InterfaceC4342e interfaceC4342e, int i, Bundle bundle, Bundle bundle2, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, bundle);
            AbstractC5458e.metrica(obtain, bundle2);
            obtain.writeInt(z ? 1 : 0);
            this.metrica.transact(3060, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    public final void subs(InterfaceC4342e interfaceC4342e, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            AbstractC5458e.metrica(obtain, bundle);
            this.metrica.transact(3014, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC3001e
    /* renamed from: transient, reason: not valid java name */
    public final void mo996transient(InterfaceC4342e interfaceC4342e, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(i);
            this.metrica.transact(3059, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
