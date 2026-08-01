package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.graphics.drawable.IconCompat;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۨٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3032e implements InterfaceC5379e {
    public static final InterfaceC6823e yandex = AbstractC5209e.billing(new C8456e(1));
    public final Context ad;
    public final int appmetrica;
    public C16911e billing;
    public C12309e license;
    public final NotificationManager metrica;
    public InterfaceC14343e purchase;
    public final int vip;

    public C3032e(C0381e c0381e) {
        Context context = (Context) c0381e.license;
        int i = c0381e.vip;
        this.ad = context;
        this.vip = i;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        notificationManager.getClass();
        this.metrica = notificationManager;
        this.appmetrica = R.drawable.media3_notification_small_icon;
    }

    @Override // defpackage.InterfaceC5379e
    public final C15400e ad() {
        return new C15400e(this.ad.getString(this.vip), 2);
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [eّۗؐ, eْٗۤ] */
    @Override // defpackage.InterfaceC5379e
    public final C15816e metrica(C4748e c4748e, AbstractC17475e abstractC17475e, C6594e c6594e, C17825e c17825e) {
        int i;
        C3032e c3032e;
        C11389e c11389e;
        C6584e c6584e;
        InterfaceC16843e interfaceC16843e;
        C11389e c11389e2;
        C6584e c6584e2;
        boolean z;
        int i2 = this.vip;
        Context context = this.ad;
        AbstractC9413e.remoteconfig(this.metrica, context.getString(i2));
        InterfaceC16843e ad = c4748e.ad();
        C11389e c11389e3 = new C11389e(context, "default_channel_id");
        C17973e c17973e = new C17973e(c4748e);
        C5298e firebase = ad.firebase();
        C6584e c6584e3 = c4748e.ad;
        boolean z2 = c6584e3.Signature;
        String str = c6584e3.startapp;
        boolean m2564static = AbstractC9413e.m2564static(ad, z2);
        int i3 = 1;
        C1410e adcel = C11161e.adcel(abstractC17475e, true, true, 9);
        boolean metrica = C11161e.metrica(2, adcel);
        boolean metrica2 = C11161e.metrica(3, adcel);
        ?? abstractC12670e = new AbstractC12670e(4);
        if (metrica) {
            abstractC12670e.metrica((C11161e) adcel.get(0));
            i = 1;
        } else {
            if (firebase.ad.ad(7, 6)) {
                C12769e c12769e = new C12769e(57413);
                c12769e.metrica(6);
                c12769e.purchase = context.getString(R.string.media3_controls_seek_to_previous_description);
                abstractC12670e.metrica(c12769e.ad());
            }
            i3 = 0;
            i = 1;
        }
        if (firebase.ad(i)) {
            if (m2564static) {
                C12769e c12769e2 = new C12769e(57399);
                c12769e2.metrica(i);
                c12769e2.purchase = context.getString(R.string.media3_controls_play_description);
                abstractC12670e.metrica(c12769e2.ad());
            } else {
                C12769e c12769e3 = new C12769e(57396);
                c12769e3.metrica(i);
                c12769e3.purchase = context.getString(R.string.media3_controls_pause_description);
                abstractC12670e.metrica(c12769e3.ad());
            }
        }
        if (metrica2) {
            abstractC12670e.metrica((C11161e) adcel.get(i3));
            i3++;
        } else if (firebase.ad.ad(9, 8)) {
            C12769e c12769e4 = new C12769e(57412);
            c12769e4.metrica(8);
            c12769e4.purchase = context.getString(R.string.media3_controls_seek_to_next_description);
            abstractC12670e.metrica(c12769e4.ad());
        }
        while (i3 < adcel.f4224e) {
            abstractC12670e.metrica((C11161e) adcel.get(i3));
            i3++;
        }
        C1410e billing = abstractC12670e.billing();
        int[] iArr = new int[3];
        int[] iArr2 = new int[3];
        Arrays.fill(iArr, -1);
        Arrays.fill(iArr2, -1);
        int i4 = 0;
        boolean z3 = false;
        while (i4 < billing.f4224e) {
            C11161e c11161e = (C11161e) billing.get(i4);
            C11858e c11858e = c11161e.ad;
            int i5 = c11161e.vip;
            Context context2 = context;
            CharSequence charSequence = c11161e.purchase;
            C1410e c1410e = billing;
            int i6 = c11161e.license;
            int[] iArr3 = iArr2;
            C15574e c15574e = c11161e.yandex;
            int i7 = i4;
            ArrayList arrayList = c11389e3.vip;
            if (c11858e != null) {
                int i8 = c11858e.ad;
                PlaybackService playbackService = (PlaybackService) c6594e.f13613e;
                AbstractC2301e.billing(i8 == 0);
                z = z3;
                PorterDuff.Mode mode = IconCompat.mopub;
                c6584e2 = c6584e3;
                IconCompat license = IconCompat.license(playbackService.getResources(), playbackService.getPackageName(), i6);
                Class<?> cls = playbackService.getClass();
                AbstractC2301e.billing(i8 == 0);
                int nextInt = ThreadLocalRandom.current().nextInt();
                AbstractC2301e.billing(i8 == 0);
                c11389e2 = c11389e3;
                interfaceC16843e = ad;
                Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
                intent.setData(C6584e.appmetrica(str));
                intent.setComponent(new ComponentName(playbackService, cls));
                intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", c11858e.vip);
                intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", c11858e.metrica);
                arrayList.add(new C9170e(license, charSequence, PendingIntent.getService(playbackService, nextInt, intent, 201326592)));
            } else {
                interfaceC16843e = ad;
                c11389e2 = c11389e3;
                c6584e2 = c6584e3;
                z = z3;
                AbstractC2301e.subscription(i5 != -1);
                PorterDuff.Mode mode2 = IconCompat.mopub;
                IconCompat license2 = IconCompat.license(context2.getResources(), context2.getPackageName(), i6);
                PlaybackService playbackService2 = (PlaybackService) c6594e.f13613e;
                C8347e c8347e = new C8347e(playbackService2, i5, playbackService2.getClass());
                c8347e.appmetrica = !c4748e.ad().mo2129interface();
                c8347e.purchase = str;
                arrayList.add(new C9170e(license2, charSequence, c8347e.ad()));
            }
            int i9 = c11161e.billing.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
            if (i9 < 0 || i9 >= 3) {
                if (c15574e.vip(0) == 2) {
                    iArr3[0] = i7;
                } else if (c15574e.vip(0) == 1) {
                    iArr3[1] = i7;
                } else {
                    if (c15574e.vip(0) == 3) {
                        iArr3[2] = i7;
                    }
                    z3 = z;
                }
                z3 = z;
            } else {
                iArr[i9] = i7;
                z3 = true;
            }
            i4 = i7 + 1;
            context = context2;
            billing = c1410e;
            iArr2 = iArr3;
            c11389e3 = c11389e2;
            c6584e3 = c6584e2;
            ad = interfaceC16843e;
        }
        InterfaceC16843e interfaceC16843e2 = ad;
        C11389e c11389e4 = c11389e3;
        C6584e c6584e4 = c6584e3;
        int[] iArr4 = iArr2;
        if (!z3) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 3; i10 < i12; i12 = 3) {
                int i13 = iArr4[i10];
                if (i13 != -1) {
                    iArr[i11] = i13;
                    i11++;
                }
                i10++;
            }
        }
        int i14 = 0;
        while (true) {
            if (i14 >= 3) {
                break;
            }
            if (iArr[i14] == -1) {
                iArr = Arrays.copyOf(iArr, i14);
                break;
            }
            i14++;
        }
        c17973e.f35230e = iArr;
        if (interfaceC16843e2.mo2107e(18)) {
            C12053e mo2089e = interfaceC16843e2.mo2089e();
            c11389e = c11389e4;
            c11389e.appmetrica = C11389e.metrica(mo2089e.ad);
            c11389e.license(mo2089e.vip);
            c6584e = c6584e4;
            InterfaceC14343e interfaceC14343e = c6584e.smaato;
            c3032e = this;
            if (c3032e.billing == null || !interfaceC14343e.equals(c3032e.purchase)) {
                c3032e.purchase = interfaceC14343e;
                c3032e.billing = new C16911e(9, new C13572e(interfaceC14343e, ((Integer) yandex.get()).intValue(), 19));
            }
            ListenableFuture billing2 = c3032e.billing.billing(mo2089e);
            if (billing2 != null) {
                C12309e c12309e = c3032e.license;
                if (c12309e != null) {
                    c12309e.f24694e = true;
                }
                if (billing2.isDone()) {
                    try {
                        c11389e.purchase((Bitmap) AbstractC2017e.vip(billing2));
                    } catch (CancellationException | ExecutionException e) {
                        AbstractC2803e.smaato("NotificationProvider", "Failed to load bitmap: " + e.getMessage());
                    }
                } else {
                    C12309e c12309e2 = new C12309e(c11389e, c17825e, 5);
                    c3032e.license = c12309e2;
                    Handler handler = c6584e.advert;
                    Objects.requireNonNull(handler);
                    billing2.ad(new RunnableC17144e(billing2, c12309e2, 11), new ExecutorC17160e(0, handler));
                }
            }
        } else {
            c3032e = this;
            c11389e = c11389e4;
            c6584e = c6584e4;
        }
        long currentTimeMillis = (!interfaceC16843e2.mo2108e() || interfaceC16843e2.applovin() || interfaceC16843e2.mo2124e() || interfaceC16843e2.isVip().ad != 1.0f) ? -9223372036854775807L : System.currentTimeMillis() - interfaceC16843e2.mo2075e();
        boolean z4 = currentTimeMillis != -9223372036854775807L;
        if (!z4) {
            currentTimeMillis = 0;
        }
        Notification notification = c11389e.applovin;
        notification.when = currentTimeMillis;
        c11389e.mopub = z4;
        c11389e.advert = z4;
        if (Build.VERSION.SDK_INT >= 31) {
            c11389e.inmobi = 1;
        }
        c11389e.billing = c6584e.signatures;
        c6594e.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true);
        PlaybackService playbackService3 = (PlaybackService) c6594e.f13613e;
        C8347e c8347e2 = new C8347e(playbackService3, 3, playbackService3.getClass());
        c8347e2.purchase = str;
        c8347e2.billing = bundle;
        notification.deleteIntent = c8347e2.ad();
        c11389e.appmetrica(8, true);
        notification.icon = c3032e.appmetrica;
        c11389e.billing(c17973e);
        c11389e.tapsense = 1;
        c11389e.appmetrica(2, false);
        c11389e.admob = "media3_group_key";
        return new C15816e(c11389e.vip());
    }

    @Override // defpackage.InterfaceC5379e
    public final void vip() {
    }
}
