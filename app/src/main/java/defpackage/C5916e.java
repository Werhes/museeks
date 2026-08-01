package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5916e {
    public static final Pattern adcel = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public static PendingIntent startapp;
    public static int yandex;
    public final C17519e ad = new C17519e(0);
    public final Messenger appmetrica = new Messenger(new HandlerC16128e(this, Looper.getMainLooper()));
    public C3773e billing;
    public final ScheduledThreadPoolExecutor license;
    public final C10629e metrica;
    public Messenger purchase;
    public final Context vip;

    public C5916e(Context context) {
        this.vip = context;
        this.metrica = new C10629e(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.license = scheduledThreadPoolExecutor;
    }

    public static synchronized void metrica(Context context, Intent intent) {
        synchronized (C5916e.class) {
            try {
                if (startapp == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    startapp = PendingIntent.getBroadcast(context, 0, intent2, AbstractC7409e.ad);
                }
                intent.putExtra("app", startapp);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized String vip() {
        String num;
        synchronized (C5916e.class) {
            int i = yandex;
            yandex = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    public final C0560e ad(Bundle bundle) {
        String vip = vip();
        C8988e c8988e = new C8988e();
        synchronized (this.ad) {
            this.ad.put(vip, c8988e);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.metrica.isPro() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        metrica(this.vip, intent);
        intent.putExtra("kid", "|ID|" + vip + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.appmetrica);
        if (this.purchase != null || this.billing != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.purchase;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.billing.f8375e;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            c8988e.ad.vip(ExecutorC0082e.f1250e, new C0912e(12, this, vip, this.license.schedule(new RunnableC4177e(0, c8988e), 30L, TimeUnit.SECONDS)));
            return c8988e.ad;
        }
        if (this.metrica.isPro() == 2) {
            this.vip.sendBroadcast(intent);
        } else {
            this.vip.startService(intent);
        }
        c8988e.ad.vip(ExecutorC0082e.f1250e, new C0912e(12, this, vip, this.license.schedule(new RunnableC4177e(0, c8988e), 30L, TimeUnit.SECONDS)));
        return c8988e.ad;
    }

    public final void license(String str, Bundle bundle) {
        synchronized (this.ad) {
            try {
                C8988e c8988e = (C8988e) this.ad.remove(str);
                if (c8988e != null) {
                    c8988e.vip(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
