package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC7743e extends Binder implements InterfaceC2444e {
    public final WeakReference metrica;

    public BinderC7743e(C13632e c13632e) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.metrica = new WeakReference(c13632e);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: eٍؙّ */
    public final void mo845e(MediaMetadataCompat mediaMetadataCompat) {
        throw new AssertionError();
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: eّّۚ */
    public final void mo846e(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: eٔؖۘ */
    public final void mo847e() {
        throw new AssertionError();
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: eٕۦ٘ */
    public final void mo848e(PlaybackStateCompat playbackStateCompat) {
        C13632e c13632e = (C13632e) this.metrica.get();
        if (c13632e != null) {
            c13632e.appmetrica(2, playbackStateCompat, null);
        }
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: eؙّٗ */
    public final void mo849e(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: instanceof */
    public final void mo850instanceof(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.metrica;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                Bundle bundle = (Bundle) AbstractC13671e.ad(parcel, Bundle.CREATOR);
                C13632e c13632e = (C13632e) weakReference.get();
                if (c13632e != null) {
                    c13632e.appmetrica(1, readString, bundle);
                }
                return true;
            case 2:
                mo847e();
                return true;
            case 3:
                mo848e((PlaybackStateCompat) AbstractC13671e.ad(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                mo845e((MediaMetadataCompat) AbstractC13671e.ad(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                mo851switch(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                mo846e((CharSequence) AbstractC13671e.ad(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                mo850instanceof((Bundle) AbstractC13671e.ad(parcel, Bundle.CREATOR));
                return true;
            case 8:
                mo849e((ParcelableVolumeInfo) AbstractC13671e.ad(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                int readInt = parcel.readInt();
                C13632e c13632e2 = (C13632e) weakReference.get();
                if (c13632e2 != null) {
                    c13632e2.appmetrica(9, Integer.valueOf(readInt), null);
                    return true;
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z = parcel.readInt() != 0;
                C13632e c13632e3 = (C13632e) weakReference.get();
                if (c13632e3 != null) {
                    c13632e3.appmetrica(11, Boolean.valueOf(z), null);
                    return true;
                }
                return true;
            case 12:
                int readInt2 = parcel.readInt();
                C13632e c13632e4 = (C13632e) weakReference.get();
                if (c13632e4 != null) {
                    c13632e4.appmetrica(12, Integer.valueOf(readInt2), null);
                    return true;
                }
                return true;
            case 13:
                C13632e c13632e5 = (C13632e) weakReference.get();
                if (c13632e5 != null) {
                    c13632e5.appmetrica(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // defpackage.InterfaceC2444e
    /* renamed from: switch */
    public final void mo851switch(ArrayList arrayList) {
        throw new AssertionError();
    }
}
