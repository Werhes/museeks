package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؑؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0002e extends C17991e {
    public C4480e metrica;
    public static final Object license = new Object();
    public static final C0002e appmetrica = new Object();

    public static AlertDialog purchase(Activity activity, int i, AbstractDialogInterfaceOnClickListenerC5702e abstractDialogInterfaceOnClickListenerC5702e, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(AbstractC12930e.vip(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(ua.itaysonlab.vkx.R.string.common_google_play_services_enable_button) : resources.getString(ua.itaysonlab.vkx.R.string.common_google_play_services_update_button) : resources.getString(ua.itaysonlab.vkx.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, abstractDialogInterfaceOnClickListenerC5702e);
        }
        String ad = AbstractC12930e.ad(activity, i);
        if (ad != null) {
            builder.setTitle(ad);
        }
        Log.w("GoogleApiAvailability", AbstractC1786e.admob(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eؙٜؔ, android.app.DialogFragment] */
    public static void startapp(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1752e) {
                C1154e c1154e = ((C2386e) ((AbstractActivityC1752e) activity).f4791e.f15896e).f6095e;
                C8728e c8728e = new C8728e();
                AbstractC9528e.adcel(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                c8728e.f17622e = alertDialog;
                if (onCancelListener != null) {
                    c8728e.f17623e = onCancelListener;
                }
                c8728e.f36332e = false;
                c8728e.f36340e = true;
                c1154e.getClass();
                C10159e c10159e = new C10159e(c1154e);
                c10159e.loadAd = true;
                c10159e.purchase(0, c8728e, str, 1);
                c10159e.appmetrica(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        AbstractC9528e.adcel(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f13423e = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f13422e = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final boolean appmetrica(Activity activity, int i, int i2, GoogleApiActivity googleApiActivity) {
        AlertDialog purchase = purchase(activity, i, new C18386e(super.vip(i, activity, "d"), activity, i2), googleApiActivity);
        if (purchase == null) {
            return false;
        }
        startapp(activity, purchase, "GooglePlayServicesErrorDialog", googleApiActivity);
        return true;
    }

    public final void billing(Activity activity, InterfaceC4352e interfaceC4352e, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog purchase = purchase(activity, i, new C16052e(super.vip(i, activity, "d"), interfaceC4352e), onCancelListener);
        if (purchase == null) {
            return;
        }
        startapp(activity, purchase, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [eؚؗۘ, eؖۤۛ] */
    /* JADX WARN: Type inference failed for: r7v4, types: [eؚٗٗ, package] */
    public final void yandex(Context context, C14758e c14758e) {
        int i;
        int i2 = c14758e.f29190e;
        Log.w("GoogleApiAvailability", AbstractC1634e.smaato("GMS core API Availability. ConnectionResult=", i2, ", tag=null"), new IllegalArgumentException());
        if (i2 == 18) {
            new HandlerC3279e(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        PendingIntent pendingIntent = c14758e.f29189e;
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String appmetrica2 = i2 == 6 ? AbstractC12930e.appmetrica(context, "common_google_play_services_resolution_required_title") : AbstractC12930e.ad(context, i2);
        if (appmetrica2 == null) {
            appmetrica2 = context.getResources().getString(ua.itaysonlab.vkx.R.string.common_google_play_services_try_again_title);
        }
        String license2 = (i2 == 6 || i2 == 19) ? AbstractC12930e.license(context, "common_google_play_services_resolution_required_text", AbstractC12930e.metrica(context)) : AbstractC12930e.vip(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC9528e.startapp(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C11389e c11389e = new C11389e(context, null);
        c11389e.subscription = true;
        c11389e.appmetrica(16, true);
        c11389e.appmetrica = C11389e.metrica(appmetrica2);
        ?? cpackage = new Cpackage(13, false);
        cpackage.f14733e = C11389e.metrica(license2);
        c11389e.billing(cpackage);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC12684e.admob == null) {
            AbstractC12684e.admob = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean booleanValue = AbstractC12684e.admob.booleanValue();
        int i3 = 2;
        int i4 = R.drawable.stat_sys_warning;
        if (booleanValue) {
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            c11389e.applovin.icon = i4;
            c11389e.adcel = 2;
            if (AbstractC12684e.ad(context)) {
                c11389e.ad(ua.itaysonlab.vkx.R.drawable.common_full_open_on_phone, pendingIntent, resources.getString(ua.itaysonlab.vkx.R.string.common_open_on_phone));
            } else {
                c11389e.billing = pendingIntent;
            }
        } else {
            c11389e.applovin.icon = R.drawable.stat_sys_warning;
            c11389e.applovin.tickerText = C11389e.metrica(resources.getString(ua.itaysonlab.vkx.R.string.common_google_play_services_notification_ticker));
            c11389e.applovin.when = System.currentTimeMillis();
            c11389e.billing = pendingIntent;
            c11389e.license(license2);
        }
        if (AbstractC11765e.metrica()) {
            AbstractC9528e.advert(AbstractC11765e.metrica());
            synchronized (license) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(ua.itaysonlab.vkx.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            c11389e.isVip = "com.google.android.gms.availability";
        }
        Notification vip = c11389e.vip();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            AbstractC18410e.ad.set(false);
            i = 10436;
        } else {
            i = 39789;
        }
        notificationManager.notify(i, vip);
        Integer num = c14758e.f29188e;
        C7330e c7330e = new C7330e(num == null ? -1 : num.intValue(), c14758e.f29190e, System.currentTimeMillis(), context.getPackageName(), false);
        if (this.metrica == null) {
            this.metrica = new AbstractC6950e(context, C4480e.mopub, InterfaceC12516e.ad, C16258e.metrica);
        }
        C4480e c4480e = this.metrica;
        c4480e.getClass();
        C9321e ad = C0381e.ad();
        ad.license = new C1032e[]{AbstractC8797e.smaato};
        ad.metrica = true;
        ad.vip = false;
        ad.ad = new C8167e(i3, c7330e);
        c4480e.appmetrica(2, ad.ad());
    }
}
