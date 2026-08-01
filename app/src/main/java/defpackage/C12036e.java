package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ۠ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12036e {
    public final String ad;
    public final long appmetrica;
    public final C3276e billing;
    public final long license;
    public final String metrica;
    public final long purchase;
    public final String vip;

    public C12036e(C6936e c6936e, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        C3276e c3276e;
        AbstractC9528e.purchase(str2);
        AbstractC9528e.purchase(str3);
        this.ad = str2;
        this.vip = str3;
        this.metrica = true == TextUtils.isEmpty(str) ? null : str;
        this.license = j;
        this.appmetrica = j2;
        this.purchase = j3;
        if (j3 != 0 && j3 > j) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.vip(C13879e.m3689e(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            c3276e = new C3276e(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    C13879e c13879e2 = c6936e.f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27502e.ad("Param name can't be null");
                    it.remove();
                } else {
                    C5240e c5240e = c6936e.f14223e;
                    C6936e.purchase(c5240e);
                    Object m1831e = c5240e.m1831e(bundle2.get(next), next);
                    if (m1831e == null) {
                        C13879e c13879e3 = c6936e.f14227e;
                        C6936e.yandex(c13879e3);
                        c13879e3.f27495e.vip(c6936e.f14202e.vip(next), "Param value can't be null");
                        it.remove();
                    } else {
                        C5240e c5240e2 = c6936e.f14223e;
                        C6936e.purchase(c5240e2);
                        c5240e2.m1838e(bundle2, next, m1831e);
                    }
                }
            }
            c3276e = new C3276e(bundle2);
        }
        this.billing = c3276e;
    }

    public C12036e(C6936e c6936e, String str, String str2, String str3, long j, long j2, long j3, C3276e c3276e) {
        AbstractC9528e.purchase(str2);
        AbstractC9528e.purchase(str3);
        AbstractC9528e.startapp(c3276e);
        this.ad = str2;
        this.vip = str3;
        this.metrica = true == TextUtils.isEmpty(str) ? null : str;
        this.license = j;
        this.appmetrica = j2;
        this.purchase = j3;
        if (j3 != 0 && j3 > j) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.metrica(C13879e.m3689e(str2), C13879e.m3689e(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.billing = c3276e;
    }

    public final C12036e ad(C6936e c6936e, long j) {
        return new C12036e(c6936e, this.metrica, this.ad, this.vip, this.license, this.appmetrica, j, this.billing);
    }

    public final String toString() {
        String c3276e = this.billing.toString();
        String str = this.ad;
        int length = String.valueOf(str).length();
        String str2 = this.vip;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + c3276e.length() + 1);
        AbstractC13501e.Signature(sb, "Event{appId='", str, "', name='", str2);
        return AbstractC8647e.ads(sb, "', params=", c3276e, "}");
    }
}
