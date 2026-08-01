package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.ad;
import android.view.KeyEvent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12744e implements ad {
    public IBinder metrica;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.metrica;
    }

    @Override // android.support.v4.media.session.ad
    public final PlaybackStateCompat billing() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.metrica.transact(28, obtain, obtain2, 0);
            obtain2.readException();
            return (PlaybackStateCompat) AbstractC15710e.metrica(obtain2, PlaybackStateCompat.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.ad
    /* renamed from: catch */
    public final PendingIntent mo1catch() {
        throw null;
    }

    @Override // android.support.v4.media.session.ad
    /* renamed from: eٌٔٗ */
    public final boolean mo14e(KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.support.v4.media.session.ad
    /* renamed from: eؘٖؕ */
    public final void mo17e(InterfaceC2444e interfaceC2444e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC2444e);
            this.metrica.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.ad
    /* renamed from: eِٜ٘ */
    public final void mo20e(InterfaceC2444e interfaceC2444e) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongInterface(interfaceC2444e);
            this.metrica.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.ad
    public final void loadAd() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.metrica.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.ad
    public final void pro() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.metrica.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.ad
    public final MediaMetadataCompat smaato() {
        throw null;
    }

    @Override // android.support.v4.media.session.ad
    public final void stop() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.metrica.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
