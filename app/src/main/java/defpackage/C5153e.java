package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۛؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5153e extends BroadcastReceiver {
    public final SurfaceHolderCallbackC0960e ad;
    public final /* synthetic */ C5609e metrica;
    public final C2399e vip;

    public C5153e(C5609e c5609e, C2399e c2399e, SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e) {
        this.metrica = c5609e;
        this.vip = c2399e;
        this.ad = surfaceHolderCallbackC0960e;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.vip.license(new RunnableC17584e(7, this));
        }
    }
}
