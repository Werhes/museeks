package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4232e {
    public final C15214e ad;
    public final /* synthetic */ C8938e metrica;
    public final HashMap vip;

    public C4232e(C8938e c8938e, C15214e c15214e) {
        this.metrica = c8938e;
        this.ad = c15214e;
        HashMap hashMap = new HashMap();
        AbstractC7014e it = AbstractC12614e.admob(c15214e.vip.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) c15214e.vip.get(str);
            uri.getClass();
            hashMap.put(uri, new C15762e(this.metrica, uri, str));
        }
        this.vip = hashMap;
    }

    public static C9144e ad(C4232e c4232e, Uri uri) {
        C15762e c15762e = (C15762e) AbstractC0869e.signatures(c4232e.vip, uri, uri);
        c15762e.getClass();
        return c15762e.f31038e;
    }

    public static boolean metrica(C4232e c4232e, Uri uri, long j) {
        HashMap hashMap = c4232e.vip;
        C15762e c15762e = (C15762e) AbstractC0869e.signatures(hashMap, uri, uri);
        c15762e.getClass();
        c15762e.f31047e = SystemClock.elapsedRealtime() + j;
        C8938e c8938e = c4232e.metrica;
        C15214e c15214e = c4232e.ad;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (C15762e c15762e2 : hashMap.values()) {
            if (!c15762e2.f31043e.equals(c15214e.license) && elapsedRealtime > c15762e2.f31047e) {
                Uri metrica = c15214e.metrica();
                String str = c15762e2.f31043e;
                AbstractC2301e.subscription(c15214e.vip.containsKey(str));
                c15214e.license = str;
                if (metrica.equals(c8938e.f17915e)) {
                    c8938e.startapp(c15762e2.f31048e);
                }
                C15762e c15762e3 = (C15762e) hashMap.get(metrica);
                c15762e3.getClass();
                c15762e2.f31040e = c15762e3.f31040e;
                c15762e3.f31040e = false;
                return true;
            }
        }
        Uri uri2 = c8938e.f17915e;
        if (uri2 == null || uri.equals(uri2)) {
            AbstractC17475e abstractC17475e = c8938e.f17907e;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= abstractC17475e.size()) {
                    break;
                }
                Uri metrica2 = ((C15214e) abstractC17475e.get(i)).metrica();
                C4232e c4232e2 = (C4232e) c8938e.f17919e.get(metrica2);
                c4232e2.getClass();
                HashMap hashMap2 = c4232e2.vip;
                C15762e c15762e4 = (C15762e) AbstractC0869e.signatures(hashMap2, metrica2, metrica2);
                c15762e4.getClass();
                if (elapsedRealtime2 > c15762e4.f31047e) {
                    c8938e.f17915e = metrica2;
                    Uri appmetrica = c8938e.appmetrica(metrica2);
                    C15762e c15762e5 = (C15762e) AbstractC0869e.signatures(hashMap2, metrica2, metrica2);
                    c15762e5.getClass();
                    c15762e5.license(appmetrica);
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static void vip(C4232e c4232e, Uri uri, boolean z) {
        C15762e c15762e = (C15762e) AbstractC0869e.signatures(c4232e.vip, uri, uri);
        c15762e.getClass();
        c15762e.license(z ? c15762e.ad() : c15762e.f31048e);
    }
}
