package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4748e {
    public final C6584e ad;
    public static final Object vip = new Object();
    public static final HashMap metrica = new HashMap();

    public C4748e(Context context, String str, InterfaceC16843e interfaceC16843e, PendingIntent pendingIntent, AbstractC17475e abstractC17475e, AbstractC17475e abstractC17475e2, AbstractC17475e abstractC17475e3, C1439e c1439e, Bundle bundle, Bundle bundle2, InterfaceC14343e interfaceC14343e, boolean z, boolean z2, int i) {
        synchronized (vip) {
            HashMap hashMap = metrica;
            if (hashMap.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            hashMap.put(str, this);
        }
        this.ad = new C6584e(this, context, str, interfaceC16843e, pendingIntent, abstractC17475e, abstractC17475e2, abstractC17475e3, c1439e, bundle, bundle2, interfaceC14343e, z, z2, i);
    }

    public final InterfaceC16843e ad() {
        return (InterfaceC16843e) this.ad.pro.f22047e;
    }
}
