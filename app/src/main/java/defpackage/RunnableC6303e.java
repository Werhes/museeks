package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6303e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C4748e f13130e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f13131e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13132e;

    public /* synthetic */ RunnableC6303e(PlaybackService playbackService, C4748e c4748e, int i) {
        this.f13132e = i;
        this.f13131e = playbackService;
        this.f13130e = c4748e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13132e) {
            case 0:
                C4748e c4748e = this.f13130e;
                C6584e c6584e = c4748e.ad;
                PlaybackService playbackService = this.f13131e;
                C11165e adcel = playbackService.adcel(null);
                PlaybackService playbackService2 = adcel.f22421e;
                HashMap hashMap = adcel.f22417e;
                if (!hashMap.containsKey(c4748e)) {
                    C7243e c7243e = new C7243e(adcel, playbackService2, c4748e);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    C7543e c7543e = c6584e.adcel;
                    c7543e.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                    AbstractC9413e.applovin();
                    Bundle bundle3 = new Bundle(bundle);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    C4187e c4187e = new C4187e(mainLooper);
                    AbstractC9413e.m2565strictfp(new Handler(mainLooper), new RunnableC6027e(c4187e, new C12318e(playbackService2, c7543e, bundle3, c7243e, mainLooper, c4187e, c7543e.ad.crashlytics() ? new C16911e(9, new C16903e(new crashlytics(playbackService2))) : null), 0));
                    hashMap.put(c4748e, new C7479e(c4187e));
                    c4187e.ad(new RunnableC6795e(adcel, c4187e, c7243e, c4748e, 8), adcel.f22408e);
                }
                c6584e.isVip = new C9770e(15, playbackService);
                return;
            default:
                HashMap hashMap2 = this.f13131e.adcel(null).f22417e;
                C4748e c4748e2 = this.f13130e;
                C7479e c7479e = (C7479e) hashMap2.remove(c4748e2);
                if (c7479e != null) {
                    C4187e c4187e2 = c7479e.ad;
                    if (!c4187e2.cancel(false)) {
                        try {
                            ((C12318e) AbstractC2017e.vip(c4187e2)).release();
                        } catch (CancellationException | ExecutionException e) {
                            AbstractC2803e.amazon("MediaController", "MediaController future failed (so we couldn't release it)", e);
                        }
                    }
                }
                c4748e2.ad.isVip = null;
                return;
        }
    }
}
