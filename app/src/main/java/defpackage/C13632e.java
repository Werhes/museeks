package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.mediarouter.app.license;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۦؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13632e implements IBinder.DeathRecipient {
    public final C8758e ad = new C8758e(this);
    public final /* synthetic */ DialogC11829e appmetrica;
    public final /* synthetic */ int license;
    public BinderC7743e metrica;
    public HandlerC10242e vip;

    public C13632e(DialogC11829e dialogC11829e, int i) {
        this.license = i;
        this.appmetrica = dialogC11829e;
    }

    public final void ad(MediaMetadataCompat mediaMetadataCompat) {
        switch (this.license) {
            case 0:
                license licenseVar = (license) this.appmetrica;
                licenseVar.f490e = mediaMetadataCompat == null ? null : mediaMetadataCompat.ad();
                licenseVar.signatures();
                licenseVar.pro(false);
                return;
            default:
                DialogC1747e dialogC1747e = (DialogC1747e) this.appmetrica;
                dialogC1747e.f4749e = mediaMetadataCompat == null ? null : mediaMetadataCompat.ad();
                dialogC1747e.mopub();
                dialogC1747e.loadAd();
                return;
        }
    }

    public final void appmetrica(int i, Object obj, Bundle bundle) {
        HandlerC10242e handlerC10242e = this.vip;
        if (handlerC10242e != null) {
            Message obtainMessage = handlerC10242e.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        appmetrica(8, null, null);
    }

    public final void license() {
        switch (this.license) {
            case 0:
                license licenseVar = (license) this.appmetrica;
                C11883e c11883e = licenseVar.f533e;
                if (c11883e != null) {
                    c11883e.pro(licenseVar.f516e);
                    licenseVar.f533e = null;
                    return;
                }
                return;
            default:
                DialogC1747e dialogC1747e = (DialogC1747e) this.appmetrica;
                C11883e c11883e2 = dialogC1747e.f4785e;
                if (c11883e2 != null) {
                    c11883e2.pro(dialogC1747e.f4784e);
                    dialogC1747e.f4785e = null;
                    return;
                }
                return;
        }
    }

    public final void metrica(PlaybackStateCompat playbackStateCompat) {
    }

    public final void purchase(Handler handler) {
        if (handler != null) {
            HandlerC10242e handlerC10242e = new HandlerC10242e(this, handler.getLooper(), 2);
            this.vip = handlerC10242e;
            handlerC10242e.vip = true;
        } else {
            HandlerC10242e handlerC10242e2 = this.vip;
            if (handlerC10242e2 != null) {
                handlerC10242e2.vip = false;
                handlerC10242e2.removeCallbacksAndMessages(null);
                this.vip = null;
            }
        }
    }

    public void vip(PlaybackStateCompat playbackStateCompat) {
        switch (this.license) {
            case 0:
                license licenseVar = (license) this.appmetrica;
                licenseVar.f497e = playbackStateCompat;
                licenseVar.pro(false);
                return;
            default:
                return;
        }
    }
}
