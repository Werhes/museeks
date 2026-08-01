package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15719e extends MediaController.Callback {
    public final WeakReference ad;

    public C15719e(C1861e c1861e) {
        this.ad = new WeakReference(c1861e);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        C1861e c1861e = (C1861e) this.ad.get();
        if (c1861e == null || playbackInfo == null) {
            return;
        }
        int playbackType = playbackInfo.getPlaybackType();
        String volumeControlId = Build.VERSION.SDK_INT >= 30 ? playbackInfo.getVolumeControlId() : null;
        boolean z = true;
        if (playbackType == 1 && volumeControlId != null) {
            z = false;
        }
        AbstractC2301e.billing(z);
        C18368e c18368e = new C18368e(playbackType, C3335e.vip(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), volumeControlId);
        C12621e c12621e = c1861e.appmetrica;
        C13798e c13798e = c12621e.amazon;
        c12621e.amazon = new C13798e(c18368e, (C4820e) c13798e.f27349e, (C3737e) c13798e.f27345e, (List) c13798e.f27352e, (CharSequence) c13798e.f27351e, c13798e.f27350e, c13798e.f27347e, (Bundle) c13798e.f27348e);
        c1861e.appmetrica();
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        Bundle Signature = AbstractC9413e.Signature(bundle);
        C1861e c1861e = (C1861e) this.ad.get();
        if (c1861e != null) {
            C12621e c12621e = c1861e.appmetrica;
            if (Signature == null) {
                Signature = new Bundle();
            }
            Bundle bundle2 = Signature;
            C13798e c13798e = c12621e.amazon;
            c12621e.amazon = new C13798e((C18368e) c13798e.f27346e, (C4820e) c13798e.f27349e, (C3737e) c13798e.f27345e, (List) c13798e.f27352e, (CharSequence) c13798e.f27351e, c13798e.f27350e, c13798e.f27347e, bundle2);
            c12621e.loadAd = true;
            c1861e.appmetrica();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        C3737e c3737e;
        C1861e c1861e = (C1861e) this.ad.get();
        if (c1861e != null) {
            C2271e c2271e = C3737e.f8321e;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                c3737e = C3737e.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                c3737e.f8323e = mediaMetadata;
            } else {
                c3737e = null;
            }
            C3737e c3737e2 = c3737e;
            C12621e c12621e = c1861e.appmetrica;
            C13798e c13798e = c12621e.amazon;
            c12621e.amazon = new C13798e((C18368e) c13798e.f27346e, (C4820e) c13798e.f27349e, c3737e2, (List) c13798e.f27352e, (CharSequence) c13798e.f27351e, c13798e.f27350e, c13798e.f27347e, (Bundle) c13798e.f27348e);
            c1861e.appmetrica();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C1861e c1861e = (C1861e) this.ad.get();
        if (c1861e == null || c1861e.metrica != null) {
            return;
        }
        c1861e.vip(C4820e.ad(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        C1861e c1861e = (C1861e) this.ad.get();
        if (c1861e != null) {
            ArrayList ad = C17638e.ad(list);
            C12621e c12621e = c1861e.appmetrica;
            C13798e c13798e = c12621e.amazon;
            c12621e.amazon = new C13798e((C18368e) c13798e.f27346e, (C4820e) c13798e.f27349e, (C3737e) c13798e.f27345e, C12621e.vip(ad), (CharSequence) c13798e.f27351e, c13798e.f27350e, c13798e.f27347e, (Bundle) c13798e.f27348e);
            c1861e.appmetrica();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        C1861e c1861e = (C1861e) this.ad.get();
        if (c1861e != null) {
            C12621e c12621e = c1861e.appmetrica;
            C13798e c13798e = c12621e.amazon;
            c12621e.amazon = new C13798e((C18368e) c13798e.f27346e, (C4820e) c13798e.f27349e, (C3737e) c13798e.f27345e, (List) c13798e.f27352e, charSequence, c13798e.f27350e, c13798e.f27347e, (Bundle) c13798e.f27348e);
            c1861e.appmetrica();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        C1861e c1861e = (C1861e) this.ad.get();
        if (c1861e != null) {
            c1861e.appmetrica.vip.release();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        Bundle Signature = AbstractC9413e.Signature(bundle);
        C1861e c1861e = (C1861e) this.ad.get();
        if (c1861e != null) {
            C12318e c12318e = c1861e.appmetrica.vip;
            if (str == null) {
                return;
            }
            if (Signature == null) {
                Signature = Bundle.EMPTY;
            }
            c12318e.getClass();
            AbstractC2301e.subscription(Looper.myLooper() == c12318e.f24699e.getLooper());
            c12318e.f24703e.advert(c12318e, new C11858e(str, Signature), Signature);
        }
    }
}
