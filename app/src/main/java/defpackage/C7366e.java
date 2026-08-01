package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۖ۠ */
/* loaded from: classes.dex */
public final class C7366e {
    public static final Uri billing = Uri.parse("content://androidx.car.app.connection");
    public final Context ad;
    public final AtomicBoolean appmetrica;
    public final C13264e license;
    public final Executor metrica;
    public final AtomicBoolean purchase;
    public final RunnableC16583e vip;

    public C7366e(Context context, RunnableC16583e runnableC16583e) {
        this.ad = context.getApplicationContext();
        this.vip = runnableC16583e;
        Executor purchase = AbstractC8461e.purchase();
        this.metrica = purchase;
        this.license = new C13264e(0, this);
        this.appmetrica = new AtomicBoolean();
        this.purchase = new AtomicBoolean();
        purchase.execute(new RunnableC2613e(this, 1));
    }

    public static /* synthetic */ void ad(C7366e c7366e) {
        C13264e c13264e = c7366e.license;
        Context context = c7366e.ad;
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(c13264e, intentFilter, 2);
        } else {
            context.registerReceiver(c13264e, intentFilter);
        }
        c7366e.vip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r4 != null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip() {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.appmetrica
            boolean r2 = r1.get()
            java.lang.String r0 = "CarConnectionState"
            r3 = 0
            android.content.Context r4 = r11.ad     // Catch: java.lang.Exception -> L4c
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Exception -> L4c
            android.net.Uri r6 = defpackage.C7366e.billing     // Catch: java.lang.Exception -> L4c
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L4c
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L4c
            if (r4 != 0) goto L24
            if (r4 == 0) goto L4c
        L20:
            r4.close()     // Catch: java.lang.Exception -> L4c
            goto L4c
        L24:
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L41
            r5 = -1
            if (r0 != r5) goto L2c
            goto L20
        L2c:
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L41
            if (r5 != 0) goto L33
            goto L20
        L33:
            int r0 = r4.getInt(r0)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L3b
            r0 = 1
            goto L3c
        L3b:
            r0 = r3
        L3c:
            r4.close()     // Catch: java.lang.Exception -> L4c
            r3 = r0
            goto L4c
        L41:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Exception -> L4c
        L4b:
            throw r5     // Catch: java.lang.Exception -> L4c
        L4c:
            r1.set(r3)
            if (r2 == r3) goto L5e
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.purchase
            boolean r0 = r0.get()
            if (r0 != 0) goto L5e
            eٖۢۘ r0 = r11.vip
            r0.run()
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7366e.vip():void");
    }
}
