package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12257e extends BroadcastReceiver {
    public static final AtomicReference vip = new AtomicReference();
    public final Context ad;

    public C12257e(Context context) {
        this.ad = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C14679e.mopub) {
            try {
                Iterator it = ((C9323e) C14679e.advert.values()).iterator();
                while (it.hasNext()) {
                    ((C14679e) it.next()).appmetrica();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.ad.unregisterReceiver(this);
    }
}
