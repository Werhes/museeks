package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17427e extends AbstractC9246e {
    public static final String startapp = C5401e.crashlytics("BatteryNotLowTracker");

    @Override // defpackage.AbstractC9166e
    public final Object ad() {
        Intent registerReceiver = this.vip.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        C5401e.loadAd().amazon(startapp, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // defpackage.AbstractC9246e
    public final void billing(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        C5401e.loadAd().smaato(startapp, AbstractC17861e.Signature("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            metrica(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            metrica(Boolean.FALSE);
        }
    }

    @Override // defpackage.AbstractC9246e
    public final IntentFilter purchase() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
}
