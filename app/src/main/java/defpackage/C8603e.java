package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.os.Build;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C8603e {
    public final MediaController ad;
    public final C13765e appmetrica;
    public final Object vip = new Object();
    public final ArrayList metrica = new ArrayList();
    public final HashMap license = new HashMap();

    public C8603e(Context context, C13765e c13765e) {
        this.appmetrica = c13765e;
        MediaController mediaController = new MediaController(context, c13765e.f27276e);
        this.ad = mediaController;
        if (c13765e.ad() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiverC14881e(this));
        }
    }

    public final C18368e ad() {
        MediaController.PlaybackInfo playbackInfo = this.ad.getPlaybackInfo();
        if (playbackInfo != null) {
            return new C18368e(playbackInfo.getPlaybackType(), C3335e.vip(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), Build.VERSION.SDK_INT >= 30 ? playbackInfo.getVolumeControlId() : null);
        }
        return null;
    }

    public final void metrica(C1861e c1861e) {
        MediaController mediaController = this.ad;
        C15719e c15719e = c1861e.ad;
        c15719e.getClass();
        mediaController.unregisterCallback(c15719e);
        synchronized (this.vip) {
            InterfaceC16274e ad = this.appmetrica.ad();
            if (ad != null) {
                try {
                    BinderC8864e binderC8864e = (BinderC8864e) this.license.remove(c1861e);
                    if (binderC8864e != null) {
                        c1861e.metrica = null;
                        ad.mo257e(binderC8864e);
                    }
                } catch (RemoteException | SecurityException e) {
                    AbstractC2803e.billing("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                this.metrica.remove(c1861e);
            }
        }
    }

    public final void vip() {
        InterfaceC16274e ad = this.appmetrica.ad();
        if (ad == null) {
            return;
        }
        ArrayList arrayList = this.metrica;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1861e c1861e = (C1861e) it.next();
            BinderC8864e binderC8864e = new BinderC8864e(c1861e);
            this.license.put(c1861e, binderC8864e);
            c1861e.metrica = binderC8864e;
            try {
                ad.mo258e(binderC8864e);
                c1861e.metrica(13, null);
            } catch (RemoteException | SecurityException e) {
                AbstractC2803e.billing("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }
}
