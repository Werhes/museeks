package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14603e implements InterfaceC2444e {
    public IBinder metrica;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: eٍؙّ */
    public final void mo845e(MediaMetadataCompat mediaMetadataCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            AbstractC13671e.vip(obtain, mediaMetadataCompat);
            this.metrica.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: eٔؖۘ */
    public final void mo847e() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.metrica.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: eٕۦ٘ */
    public final void mo848e(PlaybackStateCompat playbackStateCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            AbstractC13671e.vip(obtain, playbackStateCompat);
            this.metrica.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: eؙّٗ */
    public final void mo849e(ParcelableVolumeInfo parcelableVolumeInfo) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            AbstractC13671e.vip(obtain, parcelableVolumeInfo);
            this.metrica.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: instanceof */
    public final void mo850instanceof(Bundle bundle) {
        throw null;
    }
}
