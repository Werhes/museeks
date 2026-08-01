package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5683e extends AbstractC9246e {
    public static final String startapp = C5401e.crashlytics("StorageNotLowTracker");

    @Override // defpackage.AbstractC9166e
    public final Object ad() {
        Intent registerReceiver = this.vip.registerReceiver(null, purchase());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
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
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            metrica(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            metrica(Boolean.TRUE);
        }
    }

    @Override // defpackage.AbstractC9246e
    public final IntentFilter purchase() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
}
