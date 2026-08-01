package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8758e extends MediaController.Callback {
    public final WeakReference ad;

    public C8758e(C13632e c13632e) {
        this.ad = new WeakReference(c13632e);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((C13632e) this.ad.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            if (Build.VERSION.SDK_INT >= 26) {
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        C12894e.subscription(bundle);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        MediaMetadataCompat mediaMetadataCompat;
        C13632e c13632e = (C13632e) this.ad.get();
        if (c13632e != null) {
            C2271e c2271e = MediaMetadataCompat.f20e;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.f24e = mediaMetadata;
            } else {
                mediaMetadataCompat = null;
            }
            c13632e.ad(mediaMetadataCompat);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C13632e c13632e = (C13632e) this.ad.get();
        if (c13632e == null || c13632e.metrica != null) {
            return;
        }
        c13632e.vip(PlaybackStateCompat.ad(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((C13632e) this.ad.get()) == null || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj != null) {
                MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(MediaDescriptionCompat.ad(AbstractC8090e.vip(queueItem)), AbstractC8090e.metrica(queueItem));
            } else {
                mediaSessionCompat$QueueItem = null;
            }
            arrayList.add(mediaSessionCompat$QueueItem);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        C13632e c13632e = (C13632e) this.ad.get();
        if (c13632e != null) {
            c13632e.license();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        C12894e.subscription(bundle);
    }
}
