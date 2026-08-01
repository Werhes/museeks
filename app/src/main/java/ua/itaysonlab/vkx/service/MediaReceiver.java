package com.werhes.museeks.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import defpackage.AbstractC10077e;
import defpackage.AbstractC11815e;
import defpackage.AbstractC15933e;
import defpackage.AbstractC2890e;
import defpackage.AbstractC5336e;
import defpackage.AbstractC6232e;
import defpackage.C11389e;
import defpackage.C11485e;
import defpackage.C12328e;
import defpackage.C14027e;
import defpackage.C14803e;
import defpackage.C15409e;
import defpackage.C1582e;
import defpackage.C3342e;
import defpackage.C3964e;
import defpackage.C7838e;
import defpackage.EnumC11342e;
import defpackage.EnumC12505e;
import defpackage.ServiceConnectionC17738e;
import kotlin.Metadata;
import com.werhes.museeks.R;
import com.werhes.museeks.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkx/service/MediaReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "eِٛ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MediaReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int ad = 0;

    public static void ad(boolean z) {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        new C1582e(vKXApplication).ad.cancel(null, 200);
        VKXApplication vKXApplication2 = VKXApplication.f36528e;
        if (vKXApplication2 == null) {
            vKXApplication2 = null;
        }
        AbstractC5336e.purchase(vKXApplication2, null, 0, new C11485e(z, null, 2), 3);
    }

    public static void vip(boolean z) {
        NotificationChannel amazon;
        int i;
        C14027e.ad.getClass();
        if (C14027e.ad()) {
            C7838e c7838e = VKXApplication.f36530e;
            if (c7838e == null) {
                c7838e = null;
            }
            if (c7838e.appmetrica() != EnumC11342e.f22810e) {
                return;
            }
            C15409e.ad.getClass();
            if (!((Boolean) C15409e.pro.ad()).booleanValue()) {
                ad(false);
                return;
            }
            VKXApplication.Companion companion = VKXApplication.f36531e;
            if (VKXApplication.f36534e) {
                C3342e c3342e = new C3342e(z);
                VKXApplication vKXApplication = VKXApplication.f36528e;
                AbstractC6232e.billing(c3342e, vKXApplication != null ? vKXApplication : null);
                return;
            }
            Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
            AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
            String vip = VKXApplication.Companion.vip(R.string.hs_plug_ch);
            String vip2 = VKXApplication.Companion.vip(R.string.hs_plug_ch_desc);
            VKXApplication vKXApplication2 = VKXApplication.f36528e;
            if (vKXApplication2 == null) {
                vKXApplication2 = null;
            }
            C1582e c1582e = new C1582e(vKXApplication2);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 26) {
                amazon = null;
            } else {
                amazon = AbstractC11815e.amazon("headsetChannel", vip);
                AbstractC11815e.m3249default(amazon, vip2);
                AbstractC11815e.m3255implements(amazon);
                AbstractC11815e.m3273transient(amazon, false);
                AbstractC11815e.m3256import(amazon, null, null);
                AbstractC11815e.remoteconfig(amazon);
                AbstractC11815e.m3260new(amazon);
                AbstractC11815e.m3269synchronized(amazon);
                AbstractC11815e.signatures(amazon);
            }
            if (i2 >= 26) {
                AbstractC11815e.loadAd(c1582e.ad, amazon);
            }
            EnumC12505e enumC12505e = (EnumC12505e) C15409e.signatures.ad();
            VKXApplication vKXApplication3 = VKXApplication.f36528e;
            if (vKXApplication3 == null) {
                vKXApplication3 = null;
            }
            String string = vKXApplication3.getString(z ? R.string.hs_autostart_connected : R.string.hs_autostart_plug);
            VKXApplication vKXApplication4 = VKXApplication.f36528e;
            VKXApplication vKXApplication5 = vKXApplication4 != null ? vKXApplication4 : null;
            if (vKXApplication4 == null) {
                vKXApplication4 = null;
            }
            int ordinal = enumC12505e.ordinal();
            if (ordinal == 0) {
                i = R.string.hs_source_queue_templated;
            } else if (ordinal == 1) {
                i = R.string.hs_source_library_templated;
            } else if (ordinal == 2) {
                i = R.string.hs_source_mix;
            } else {
                if (ordinal != 3) {
                    throw new C14803e(10);
                }
                i = R.string.hs_source_library_cached_templated;
            }
            String string2 = vKXApplication5.getString(R.string.hs_autostart_template, vKXApplication4.getString(i));
            VKXApplication vKXApplication6 = VKXApplication.f36528e;
            if (vKXApplication6 == null) {
                vKXApplication6 = null;
            }
            C11389e c11389e = new C11389e(vKXApplication6, "headsetChannel");
            c11389e.applovin.icon = R.drawable.ic_headphones_outline_28;
            c11389e.appmetrica = C11389e.metrica(string);
            c11389e.purchase = C11389e.metrica(string2);
            C12328e c12328e = AbstractC2890e.ad;
            c11389e.signatures = AbstractC15933e.ad(R.attr.global_accent);
            c11389e.adcel = 1;
            Notification notification = c11389e.applovin;
            notification.ledARGB = 0;
            notification.ledOnMS = 0;
            notification.ledOffMS = 0;
            notification.flags &= -2;
            notification.sound = null;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            VKXApplication vKXApplication7 = VKXApplication.f36528e;
            if (vKXApplication7 == null) {
                vKXApplication7 = null;
            }
            VKXApplication vKXApplication8 = VKXApplication.f36528e;
            if (vKXApplication8 == null) {
                vKXApplication8 = null;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(vKXApplication7, 0, new Intent(vKXApplication8, (Class<?>) MediaReceiver.class).setAction("ua.itaysonlab.vkx.shuffleFromNotify"), i2 >= 31 ? 33554432 : 0);
            VKXApplication vKXApplication9 = VKXApplication.f36528e;
            if (vKXApplication9 == null) {
                vKXApplication9 = null;
            }
            VKXApplication vKXApplication10 = VKXApplication.f36528e;
            if (vKXApplication10 == null) {
                vKXApplication10 = null;
            }
            PendingIntent broadcast2 = PendingIntent.getBroadcast(vKXApplication9, 0, new Intent(vKXApplication10, (Class<?>) MediaReceiver.class).setAction("ua.itaysonlab.vkx.playFromNotify"), i2 < 31 ? 0 : 33554432);
            c11389e.ad(R.drawable.player_play, broadcast, VKXApplication.Companion.vip(R.string.hs_plug_act));
            if (enumC12505e.f25048e) {
                c11389e.ad(R.drawable.ic_shuffle_outline_24, broadcast2, VKXApplication.Companion.vip(R.string.hs_plug_act2));
            }
            VKXApplication vKXApplication11 = VKXApplication.f36528e;
            if (vKXApplication11 == null) {
                vKXApplication11 = null;
            }
            if (AbstractC10077e.appmetrica(vKXApplication11, "android.permission.POST_NOTIFICATIONS") == 0) {
                VKXApplication vKXApplication12 = VKXApplication.f36528e;
                if (vKXApplication12 == null) {
                    vKXApplication12 = null;
                }
                C1582e c1582e2 = new C1582e(vKXApplication12);
                Notification vip3 = c11389e.vip();
                Bundle bundle = vip3.extras;
                if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
                    c1582e2.ad.notify(null, 200, vip3);
                    return;
                }
                C3964e c3964e = new C3964e(vKXApplication12.getPackageName(), vip3);
                synchronized (C1582e.appmetrica) {
                    try {
                        if (C1582e.purchase == null) {
                            C1582e.purchase = new ServiceConnectionC17738e(vKXApplication12.getApplicationContext());
                        }
                        C1582e.purchase.f34808e.obtainMessage(0, c3964e).sendToTarget();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c1582e2.ad.cancel(null, 200);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        if (intent.getAction() == null || (action = intent.getAction()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1676458352:
                if (action.equals("android.intent.action.HEADSET_PLUG") && !isInitialStickyBroadcast() && intent.getIntExtra("state", -1) == 1) {
                    C7838e c7838e = VKXApplication.f36530e;
                    if (c7838e == null) {
                        c7838e = null;
                    }
                    if (c7838e.appmetrica() == EnumC11342e.f22808e) {
                        C15409e.ad.getClass();
                        if (((Boolean) C15409e.appmetrica.ad()).booleanValue()) {
                            C7838e c7838e2 = VKXApplication.f36530e;
                            (c7838e2 != null ? c7838e2 : null).adcel();
                            return;
                        }
                    }
                    C15409e.ad.getClass();
                    if (((Boolean) C15409e.remoteconfig.ad()).booleanValue()) {
                        vip(false);
                        return;
                    }
                    return;
                }
                return;
            case -936232205:
                if (action.equals("ua.itaysonlab.vkx.shuffleFromNotify")) {
                    ad(false);
                    return;
                }
                return;
            case 1244161670:
                if (action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED") && !isInitialStickyBroadcast()) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                    int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
                    C15409e.ad.getClass();
                    if (((Boolean) C15409e.subscription.ad()).booleanValue() && intExtra == 2 && intExtra2 == 1) {
                        vip(true);
                        return;
                    }
                    return;
                }
                return;
            case 2101028800:
                if (action.equals("ua.itaysonlab.vkx.playFromNotify")) {
                    ad(true);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
