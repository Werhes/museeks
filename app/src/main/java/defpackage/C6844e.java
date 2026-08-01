package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؐۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6844e extends BroadcastReceiver {
    public static final IntentFilter metrica;
    public static final List vip;
    public final C5625e ad;

    static {
        List startapp = AbstractC6874e.startapp("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        vip = startapp;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = startapp.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        metrica = intentFilter;
    }

    public C6844e(C5625e c5625e) {
        this.ad = c5625e;
    }

    public final void ad(Context context) {
        int i = Build.VERSION.SDK_INT;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        boolean isDeviceIdleMode = powerManager.isDeviceIdleMode();
        if (i >= 33) {
            isDeviceIdleMode = isDeviceIdleMode || AbstractC14380e.signatures(powerManager);
        }
        if (isDeviceIdleMode) {
            this.ad.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (AbstractC13480e.ads(vip, intent.getAction())) {
            ad(context);
        }
    }
}
