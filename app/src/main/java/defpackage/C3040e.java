package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۨۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3040e extends BroadcastReceiver {
    public static volatile C16452e ad;

    public static void ad(Context context, C16452e c16452e) {
        if (ad == null) {
            synchronized (C3040e.class) {
                try {
                    if (ad == null) {
                        if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(new BroadcastReceiver(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                            } else {
                                context.registerReceiver(new BroadcastReceiver(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            }
                        }
                        ad = c16452e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
            sb.append("Got an invalid config package for P/H that includes '..': ");
            sb.append(stringExtra);
            sb.append(". Exiting.");
            Log.w("PhUpdateBroadcastRecv", sb.toString());
            return;
        }
        C16452e c16452e = ad;
        if (c16452e == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        C0164e c0164e = (C0164e) ((ConcurrentHashMap) ((C8167e) c16452e.f32285e).f16626e).get(stringExtra);
        if (c0164e != null) {
            c0164e.ad.vip();
        }
    }
}
