package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11165e implements Handler.Callback {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ExecutorC17160e f22408e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f22409e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f22410e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final NotificationManager f22411e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f22412e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public boolean f22413e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6594e f22414e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final long f22415e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final int f22416e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final HashMap f22417e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C15816e f22418e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Handler f22419e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public InterfaceC5379e f22420e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final PlaybackService f22421e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f22422e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Intent f22423e;

    public C11165e(PlaybackService playbackService, InterfaceC5379e interfaceC5379e, C6594e c6594e) {
        this.f22421e = playbackService;
        this.f22420e = interfaceC5379e;
        this.f22414e = c6594e;
        NotificationManager notificationManager = (NotificationManager) playbackService.getSystemService("notification");
        notificationManager.getClass();
        this.f22411e = notificationManager;
        Looper mainLooper = Looper.getMainLooper();
        String str = AbstractC9413e.ad;
        this.f22419e = new Handler(mainLooper, this);
        this.f22408e = new ExecutorC17160e(4, this);
        Intent intent = new Intent(playbackService, playbackService.getClass());
        this.f22423e = intent;
        String uuid = UUID.randomUUID().toString();
        this.f22422e = uuid;
        intent.putExtra("androidx.media3.session.intent.uid", uuid);
        this.f22417e = new HashMap();
        this.f22410e = false;
        this.f22413e = true;
        this.f22415e = 600000L;
        this.f22416e = 3;
    }

    public final void ad() {
        this.f22413e = false;
        Handler handler = this.f22419e;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            PlaybackService playbackService = this.f22421e;
            ArrayList smaato = playbackService.smaato();
            for (int i = 0; i < smaato.size(); i++) {
                playbackService.ads((C4748e) smaato.get(i), false);
            }
        }
    }

    public final void appmetrica(C4748e c4748e, C15816e c15816e, boolean z) {
        MediaSession.Token token = ((C2584e) c4748e.ad.yandex.amazon.f26645e).metrica.f27276e;
        Notification notification = (Notification) c15816e.f31190e;
        notification.extras.putParcelable("android.mediaSession", token);
        this.f22418e = c15816e;
        PlaybackService playbackService = this.f22421e;
        if (z) {
            AbstractC10077e.subs(playbackService, this.f22423e);
            String str = AbstractC9413e.ad;
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC14204e.m3767break(playbackService, 1001, notification);
            } else {
                playbackService.startForeground(1001, notification);
            }
            this.f22410e = true;
            return;
        }
        this.f22411e.notify(1001, notification);
        String str2 = AbstractC9413e.ad;
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC12026e.ad(playbackService, false);
        } else {
            playbackService.stopForeground(false);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        PlaybackService playbackService = this.f22421e;
        ArrayList smaato = playbackService.smaato();
        for (int i = 0; i < smaato.size(); i++) {
            playbackService.ads((C4748e) smaato.get(i), false);
        }
        return true;
    }

    public final boolean license(C4748e c4748e) {
        C12318e vip = vip(c4748e);
        if (vip != null && !vip.mo2105e().Signature()) {
            C7479e c7479e = (C7479e) this.f22417e.get(c4748e);
            c7479e.getClass();
            if (vip.billing() != 1) {
                c7479e.vip = false;
                c7479e.metrica = true;
                return true;
            }
            int i = this.f22416e;
            if (i == 1) {
                return !c7479e.vip;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                if (!c7479e.vip && c7479e.metrica) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean metrica(boolean z) {
        boolean z2;
        ArrayList smaato = this.f22421e.smaato();
        for (int i = 0; i < smaato.size(); i++) {
            C12318e vip = vip((C4748e) smaato.get(i));
            if (vip != null && ((vip.mo2129interface() || z) && (vip.billing() == 3 || vip.billing() == 2))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.f22413e;
        long j = this.f22415e;
        boolean z4 = z3 && j > 0;
        boolean z5 = this.f22409e;
        Handler handler = this.f22419e;
        if (z5 && !z2 && z4) {
            handler.sendEmptyMessageDelayed(1, j);
        } else if (z2) {
            handler.removeMessages(1);
        }
        this.f22409e = z2;
        return z2 || handler.hasMessages(1);
    }

    public final C12318e vip(C4748e c4748e) {
        C7479e c7479e = (C7479e) this.f22417e.get(c4748e);
        if (c7479e == null) {
            return null;
        }
        C4187e c4187e = c7479e.ad;
        if (!c4187e.isDone()) {
            return null;
        }
        try {
            return (C12318e) AbstractC2017e.vip(c4187e);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }
}
