package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14286e {
    public static final C14286e vip = new C14286e();
    public final HashMap ad = new HashMap();

    public final synchronized void ad(String str, AbstractC12699e abstractC12699e) {
        try {
            if (!this.ad.containsKey(str)) {
                this.ad.put(str, abstractC12699e);
                return;
            }
            if (((AbstractC12699e) this.ad.get(str)).equals(abstractC12699e)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.ad.get(str) + "), cannot insert " + abstractC12699e);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void vip(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ad((String) entry.getKey(), (AbstractC12699e) entry.getValue());
        }
    }
}
