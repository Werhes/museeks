package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۛۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16505e extends AbstractC9246e {
    public static final String startapp = C5401e.crashlytics("BatteryChrgTracker");

    @Override // defpackage.AbstractC9166e
    public final Object ad() {
        Intent registerReceiver = this.vip.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            C5401e.loadAd().amazon(startapp, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r6.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L7;
     */
    @Override // defpackage.AbstractC9246e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void billing(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L7
            goto L50
        L7:
            eؘؔٔ r0 = defpackage.C5401e.loadAd()
            java.lang.String r1 = "Received "
            java.lang.String r1 = r1.concat(r6)
            r2 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            java.lang.String r4 = defpackage.C16505e.startapp
            r0.smaato(r4, r1, r3)
            int r0 = r6.hashCode()
            r1 = -1
            switch(r0) {
                case -1886648615: goto L44;
                case -54942926: goto L39;
                case 948344062: goto L2e;
                case 1019184907: goto L23;
                default: goto L21;
            }
        L21:
            r2 = r1
            goto L4d
        L23:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2c
            goto L21
        L2c:
            r2 = 3
            goto L4d
        L2e:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L37
            goto L21
        L37:
            r2 = 2
            goto L4d
        L39:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L42
            goto L21
        L42:
            r2 = 1
            goto L4d
        L44:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L4d
            goto L21
        L4d:
            switch(r2) {
                case 0: goto L63;
                case 1: goto L5d;
                case 2: goto L57;
                case 3: goto L51;
                default: goto L50;
            }
        L50:
            return
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.metrica(r6)
            return
        L57:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.metrica(r6)
            return
        L5d:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.metrica(r6)
            return
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.metrica(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16505e.billing(android.content.Intent):void");
    }

    @Override // defpackage.AbstractC9246e
    public final IntentFilter purchase() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }
}
