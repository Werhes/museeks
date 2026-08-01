package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16424e extends BroadcastReceiver {
    public final /* synthetic */ int ad = 0;
    public Object metrica;
    public Context vip;

    public /* synthetic */ C16424e() {
    }

    public C16424e(C3168e c3168e) {
        this.metrica = c3168e;
    }

    public void ad() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        RunnableC15684e runnableC15684e = (RunnableC15684e) this.metrica;
        if (runnableC15684e != null) {
            Context context = ((FirebaseMessaging) runnableC15684e.f30894e).vip;
            this.vip = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.ad) {
            case 0:
                RunnableC15684e runnableC15684e = (RunnableC15684e) this.metrica;
                if (runnableC15684e != null && runnableC15684e.ad()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    RunnableC15684e runnableC15684e2 = (RunnableC15684e) this.metrica;
                    ((FirebaseMessaging) runnableC15684e2.f30894e).getClass();
                    FirebaseMessaging.vip(runnableC15684e2, 0L);
                    Context context2 = this.vip;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.metrica = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    ((RunnableC16721e) ((C3168e) this.metrica).f7272e).getClass();
                    throw null;
                }
                return;
        }
    }
}
