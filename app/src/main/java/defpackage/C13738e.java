package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13738e {
    public final Map ad;
    public final InterfaceC0707e license;
    public final Object vip = new Object();
    public final LinkedHashMap metrica = new LinkedHashMap();

    public C13738e(String str, Map map, Context context, C17280e c17280e, C11802e c11802e) {
        this.ad = map;
        c11802e.metrica(1, new RunnableC17584e(12, this));
        InterfaceC0707e ad = ad(str);
        if (ad != null) {
            this.license = ad;
            return;
        }
        throw new IllegalStateException(("Failed to load the default backend for " + ((Object) C10644e.ad(str)) + "! Available backends are " + map.keySet()).toString());
    }

    public final InterfaceC0707e ad(String str) {
        synchronized (this.vip) {
            try {
                InterfaceC0707e interfaceC0707e = (InterfaceC0707e) this.metrica.get(new C10644e(str));
                if (interfaceC0707e != null) {
                    return interfaceC0707e;
                }
                C3379e c3379e = (C3379e) this.ad.get(new C10644e(str));
                InterfaceC0707e interfaceC0707e2 = c3379e != null ? c3379e.ad : null;
                if (interfaceC0707e2 != null) {
                    if (!AbstractC7890e.billing(str, "CXCP-Camera2")) {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) C10644e.ad(str)) + " but it was actually " + ((Object) C10644e.ad("CXCP-Camera2"))).toString());
                    }
                    this.metrica.put(new C10644e(str), interfaceC0707e2);
                }
                return interfaceC0707e2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
