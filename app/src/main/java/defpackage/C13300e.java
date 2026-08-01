package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13300e {
    public static final C18482e signatures = new C18482e("MediaNotificationProxy", null);
    public C9170e Signature;
    public final Context ad;
    public final Resources adcel;
    public C9170e admob;
    public C17659e advert;
    public C9170e amazon;
    public final ComponentName appmetrica;
    public int[] billing;
    public final ComponentName license;
    public C9170e loadAd;
    public final C1727e metrica;
    public C16147e mopub;
    public C9170e pro;
    public ArrayList purchase = new ArrayList();
    public C9170e remoteconfig;
    public C9170e smaato;
    public final C11328e startapp;
    public C9170e subscription;
    public final NotificationManager vip;
    public final long yandex;

    public C13300e(Context context) {
        this.ad = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.vip = notificationManager;
        C18482e c18482e = C8033e.adcel;
        AbstractC9528e.appmetrica();
        C8033e c8033e = C8033e.advert;
        AbstractC9528e.startapp(c8033e);
        AbstractC9528e.appmetrica();
        C12487e c12487e = c8033e.license;
        AbstractC9528e.startapp(c12487e);
        C4941e c4941e = c12487e.f25019e;
        AbstractC9528e.startapp(c4941e);
        C1727e c1727e = c4941e.f10457e;
        AbstractC9528e.startapp(c1727e);
        this.metrica = c1727e;
        c4941e.billing();
        Resources resources = context.getResources();
        this.adcel = resources;
        this.license = new ComponentName(context.getApplicationContext(), c4941e.f10458e);
        String str = c1727e.f4713e;
        if (TextUtils.isEmpty(str)) {
            this.appmetrica = null;
        } else {
            this.appmetrica = new ComponentName(context.getApplicationContext(), str);
        }
        this.yandex = c1727e.f4690e;
        int dimensionPixelSize = resources.getDimensionPixelSize(c1727e.f4694e);
        this.startapp = new C11328e(context.getApplicationContext(), new C11894e(1, dimensionPixelSize, dimensionPixelSize));
        if (AbstractC11765e.metrica() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        C16594e.ad(EnumC3848e.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final void ad() {
        Bitmap bitmap;
        PendingIntent activities;
        C9170e vip;
        NotificationManager notificationManager = this.vip;
        if (notificationManager == null || this.mopub == null) {
            return;
        }
        C17659e c17659e = this.advert;
        if (c17659e == null || (bitmap = (Bitmap) c17659e.f34612e) == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = null;
        }
        Context context = this.ad;
        C11389e c11389e = new C11389e(context, "cast_media_notification");
        c11389e.purchase(bitmap);
        C1727e c1727e = this.metrica;
        c11389e.applovin.icon = c1727e.f4687e;
        c11389e.appmetrica = C11389e.metrica(this.mopub.license);
        c11389e.purchase = C11389e.metrica(this.adcel.getString(c1727e.f4711e, this.mopub.appmetrica));
        c11389e.appmetrica(2, true);
        c11389e.mopub = false;
        c11389e.tapsense = 1;
        ComponentName componentName = this.appmetrica;
        if (componentName == null) {
            activities = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            ArrayList arrayList = new ArrayList();
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(context.getPackageManager());
            }
            if (component != null) {
                int size = arrayList.size();
                try {
                    for (Intent purchase = AbstractC16540e.purchase(context, component); purchase != null; purchase = AbstractC16540e.purchase(context, purchase.getComponent())) {
                        arrayList.add(size, purchase);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            arrayList.add(intent);
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
        }
        if (activities != null) {
            c11389e.billing = activities;
        }
        C13645e c13645e = c1727e.f4695e;
        C18482e c18482e = signatures;
        if (c13645e != null) {
            c18482e.vip("actionsProvider != null", new Object[0]);
            int[] vip2 = AbstractC16993e.vip(c13645e);
            this.billing = vip2 == null ? null : (int[]) vip2.clone();
            ArrayList<C6372e> ad = AbstractC16993e.ad(c13645e);
            this.purchase = new ArrayList();
            if (ad != null) {
                for (C6372e c6372e : ad) {
                    String str = c6372e.f13234e;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        vip = vip(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.license);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        int i = c6372e.f13233e;
                        String str2 = c6372e.f13232e;
                        IconCompat license = i == 0 ? null : IconCompat.license(null, BuildConfig.FLAVOR, i);
                        Bundle bundle = new Bundle();
                        CharSequence metrica = C11389e.metrica(str2);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        if (!arrayList2.isEmpty()) {
                        }
                        vip = new C9170e(license, metrica, broadcast, bundle, arrayList3.isEmpty() ? null : (AbstractC3496e[]) arrayList3.toArray(new AbstractC3496e[arrayList3.size()]), true, true);
                    }
                    if (vip != null) {
                        this.purchase.add(vip);
                    }
                }
            }
        } else {
            c18482e.vip("actionsProvider == null", new Object[0]);
            this.purchase = new ArrayList();
            Iterator it = c1727e.f4717e.iterator();
            while (it.hasNext()) {
                C9170e vip3 = vip((String) it.next());
                if (vip3 != null) {
                    this.purchase.add(vip3);
                }
            }
            int[] iArr = c1727e.f4697e;
            this.billing = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        Iterator it2 = this.purchase.iterator();
        while (it2.hasNext()) {
            C9170e c9170e = (C9170e) it2.next();
            if (c9170e != null) {
                c11389e.vip.add(c9170e);
            }
        }
        C17973e c17973e = new C17973e();
        c17973e.f35230e = null;
        int[] iArr2 = this.billing;
        if (iArr2 != null) {
            c17973e.f35230e = iArr2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = this.mopub.ad;
        if (mediaSessionCompat$Token != null) {
            c17973e.f35228e = mediaSessionCompat$Token;
        }
        c11389e.billing(c17973e);
        notificationManager.notify("castMediaNotification", 1, c11389e.vip());
    }

    public final C9170e vip(String str) {
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        int i;
        int i2;
        int hashCode = str.hashCode();
        long j = this.yandex;
        Resources resources = this.adcel;
        Context context = this.ad;
        ComponentName componentName = this.license;
        C1727e c1727e = this.metrica;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.subscription == null) {
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                        intent.setComponent(componentName);
                        intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        C18482e c18482e = AbstractC16993e.ad;
                        int i3 = c1727e.f4693e;
                        if (j == 10000) {
                            i3 = c1727e.f4699e;
                        } else if (j == 30000) {
                            i3 = c1727e.f4700e;
                        }
                        int i4 = c1727e.f4710e;
                        if (j == 10000) {
                            i4 = c1727e.f4701e;
                        } else if (j == 30000) {
                            i4 = c1727e.f4696e;
                        }
                        String string = resources.getString(i4);
                        IconCompat license = i3 == 0 ? null : IconCompat.license(null, BuildConfig.FLAVOR, i3);
                        Bundle bundle = new Bundle();
                        CharSequence metrica = C11389e.metrica(string);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (!arrayList.isEmpty()) {
                        }
                        this.subscription = new C9170e(license, metrica, broadcast, bundle, arrayList2.isEmpty() ? null : (AbstractC3496e[]) arrayList2.toArray(new AbstractC3496e[arrayList2.size()]), true, true);
                    }
                    return this.subscription;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    boolean z = this.mopub.purchase;
                    if (this.loadAd == null) {
                        if (z) {
                            Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        } else {
                            pendingIntent = null;
                        }
                        int i5 = c1727e.f4715e;
                        String string2 = resources.getString(c1727e.f4714e);
                        IconCompat license2 = i5 == 0 ? null : IconCompat.license(null, BuildConfig.FLAVOR, i5);
                        Bundle bundle2 = new Bundle();
                        CharSequence metrica2 = C11389e.metrica(string2);
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        if (!arrayList3.isEmpty()) {
                        }
                        this.loadAd = new C9170e(license2, metrica2, pendingIntent, bundle2, arrayList4.isEmpty() ? null : (AbstractC3496e[]) arrayList4.toArray(new AbstractC3496e[arrayList4.size()]), true, true);
                    }
                    return this.loadAd;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    boolean z2 = this.mopub.billing;
                    if (this.Signature == null) {
                        if (z2) {
                            Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                            intent3.setComponent(componentName);
                            pendingIntent2 = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        } else {
                            pendingIntent2 = null;
                        }
                        int i6 = c1727e.f4691e;
                        String string3 = resources.getString(c1727e.f4716e);
                        IconCompat license3 = i6 == 0 ? null : IconCompat.license(null, BuildConfig.FLAVOR, i6);
                        Bundle bundle3 = new Bundle();
                        CharSequence metrica3 = C11389e.metrica(string3);
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        if (!arrayList5.isEmpty()) {
                        }
                        this.Signature = new C9170e(license3, metrica3, pendingIntent2, bundle3, arrayList6.isEmpty() ? null : (AbstractC3496e[]) arrayList6.toArray(new AbstractC3496e[arrayList6.size()]), true, true);
                    }
                    return this.Signature;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.pro == null) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                        intent4.setComponent(componentName);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent4, 67108864);
                        int i7 = c1727e.f4698e;
                        String string4 = resources.getString(c1727e.f4708e);
                        IconCompat license4 = i7 == 0 ? null : IconCompat.license(null, BuildConfig.FLAVOR, i7);
                        Bundle bundle4 = new Bundle();
                        CharSequence metrica4 = C11389e.metrica(string4);
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        if (!arrayList7.isEmpty()) {
                        }
                        this.pro = new C9170e(license4, metrica4, broadcast2, bundle4, arrayList8.isEmpty() ? null : (AbstractC3496e[]) arrayList8.toArray(new AbstractC3496e[arrayList8.size()]), true, true);
                    }
                    return this.pro;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.remoteconfig == null) {
                        Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                        intent5.setComponent(componentName);
                        PendingIntent broadcast3 = PendingIntent.getBroadcast(context, 0, intent5, 67108864);
                        int i8 = c1727e.f4698e;
                        String string5 = resources.getString(c1727e.f4708e, BuildConfig.FLAVOR);
                        IconCompat license5 = i8 == 0 ? null : IconCompat.license(null, BuildConfig.FLAVOR, i8);
                        Bundle bundle5 = new Bundle();
                        CharSequence metrica5 = C11389e.metrica(string5);
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        if (!arrayList9.isEmpty()) {
                        }
                        this.remoteconfig = new C9170e(license5, metrica5, broadcast3, bundle5, arrayList10.isEmpty() ? null : (AbstractC3496e[]) arrayList10.toArray(new AbstractC3496e[arrayList10.size()]), true, true);
                    }
                    return this.remoteconfig;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    C16147e c16147e = this.mopub;
                    int i9 = c16147e.metrica;
                    if (!c16147e.vip) {
                        if (this.smaato == null) {
                            Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                            intent6.setComponent(componentName);
                            PendingIntent broadcast4 = PendingIntent.getBroadcast(context, 0, intent6, 67108864);
                            int i10 = c1727e.f4702e;
                            String string6 = resources.getString(c1727e.f4707e);
                            IconCompat license6 = i10 == 0 ? null : IconCompat.license(null, BuildConfig.FLAVOR, i10);
                            Bundle bundle6 = new Bundle();
                            CharSequence metrica6 = C11389e.metrica(string6);
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            if (!arrayList11.isEmpty()) {
                            }
                            this.smaato = new C9170e(license6, metrica6, broadcast4, bundle6, arrayList12.isEmpty() ? null : (AbstractC3496e[]) arrayList12.toArray(new AbstractC3496e[arrayList12.size()]), true, true);
                        }
                        return this.smaato;
                    }
                    if (this.amazon == null) {
                        if (i9 == 2) {
                            i = c1727e.f4719e;
                            i2 = c1727e.f4720e;
                        } else {
                            i = c1727e.f4718e;
                            i2 = c1727e.f4692e;
                        }
                        Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent7.setComponent(componentName);
                        PendingIntent broadcast5 = PendingIntent.getBroadcast(context, 0, intent7, 67108864);
                        String string7 = resources.getString(i2);
                        IconCompat license7 = i == 0 ? null : IconCompat.license(null, BuildConfig.FLAVOR, i);
                        Bundle bundle7 = new Bundle();
                        CharSequence metrica7 = C11389e.metrica(string7);
                        ArrayList arrayList13 = new ArrayList();
                        ArrayList arrayList14 = new ArrayList();
                        if (!arrayList13.isEmpty()) {
                        }
                        this.amazon = new C9170e(license7, metrica7, broadcast5, bundle7, arrayList14.isEmpty() ? null : (AbstractC3496e[]) arrayList14.toArray(new AbstractC3496e[arrayList14.size()]), true, true);
                    }
                    return this.amazon;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.admob == null) {
                        Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                        intent8.setComponent(componentName);
                        intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                        PendingIntent broadcast6 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        C18482e c18482e2 = AbstractC16993e.ad;
                        int i11 = c1727e.f4705e;
                        if (j == 10000) {
                            i11 = c1727e.f4689e;
                        } else if (j == 30000) {
                            i11 = c1727e.f4688e;
                        }
                        int i12 = c1727e.f4706e;
                        if (j == 10000) {
                            i12 = c1727e.f4703e;
                        } else if (j == 30000) {
                            i12 = c1727e.f4704e;
                        }
                        String string8 = resources.getString(i12);
                        IconCompat license8 = i11 == 0 ? null : IconCompat.license(null, BuildConfig.FLAVOR, i11);
                        Bundle bundle8 = new Bundle();
                        CharSequence metrica8 = C11389e.metrica(string8);
                        ArrayList arrayList15 = new ArrayList();
                        ArrayList arrayList16 = new ArrayList();
                        if (!arrayList15.isEmpty()) {
                        }
                        this.admob = new C9170e(license8, metrica8, broadcast6, bundle8, arrayList16.isEmpty() ? null : (AbstractC3496e[]) arrayList16.toArray(new AbstractC3496e[arrayList16.size()]), true, true);
                    }
                    return this.admob;
                }
                break;
        }
        C18482e c18482e3 = signatures;
        Log.e(c18482e3.ad, c18482e3.license("Action: %s is not a pre-defined action.", str));
        return null;
    }
}
