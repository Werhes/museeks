package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۥۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8347e {
    public final PlaybackService ad;
    public boolean appmetrica;
    public Bundle billing;
    public final int license;
    public final Class metrica;
    public String purchase;
    public final int vip;

    public C8347e(PlaybackService playbackService, int i, Class cls) {
        this.ad = playbackService;
        this.vip = i;
        int license = license(i);
        this.license = license;
        AbstractC2301e.billing(metrica(license));
        this.metrica = cls;
        this.appmetrica = false;
        this.purchase = null;
        this.billing = Bundle.EMPTY;
    }

    public static int license(int i) {
        if (i == 1) {
            return 85;
        }
        if (i == 3) {
            return 86;
        }
        if (i == 11) {
            return 89;
        }
        if (i == 12) {
            return 90;
        }
        switch (i) {
            case 6:
            case 7:
                return 88;
            case 8:
            case 9:
                return 87;
            default:
                return 0;
        }
    }

    public static boolean metrica(int i) {
        return i == 87 || i == 88 || i == 86 || i == 90 || i == 89 || i == 85;
    }

    public static Intent vip(Context context, int i, Bundle bundle, String str, Class cls) {
        AbstractC2301e.billing(metrica(i));
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(C6584e.appmetrica(str));
        intent.setComponent(new ComponentName(context, (Class<?>) cls));
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        return intent;
    }

    public final PendingIntent ad() {
        int i = Build.VERSION.SDK_INT;
        Class cls = this.metrica;
        int i2 = this.license;
        PlaybackService playbackService = this.ad;
        return (i >= 26 && this.appmetrica && this.vip == 1) ? PendingIntent.getForegroundService(playbackService, i2, vip(playbackService, i2, this.billing, this.purchase, cls), 201326592) : PendingIntent.getService(playbackService, i2, vip(playbackService, i2, this.billing, this.purchase, cls), 201326592);
    }
}
