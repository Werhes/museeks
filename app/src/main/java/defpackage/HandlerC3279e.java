package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC3279e extends HandlerC9134e {
    public final Context ad;
    public final /* synthetic */ C0002e vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3279e(C0002e c0002e, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.vip = c0002e;
        this.ad = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = C17991e.ad;
        C0002e c0002e = this.vip;
        Context context = this.ad;
        int metrica = c0002e.metrica(context, i2);
        int i3 = AbstractC18410e.appmetrica;
        if (metrica == 1 || metrica == 2 || metrica == 3 || metrica == 9) {
            Intent vip = c0002e.vip(metrica, context, "n");
            c0002e.yandex(context, new C14758e(metrica, vip == null ? null : PendingIntent.getActivity(context, 0, vip, 201326592), null));
        }
    }
}
