package defpackage;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0385e {
    public String Signature;
    public C10078e adcel;
    public String admob;
    public String advert;
    public String amazon;
    public final String billing;
    public String loadAd;
    public String mopub;
    public final C0140e purchase;
    public String remoteconfig;
    public int signatures;
    public C18451e smaato;
    public final long startapp;
    public String subscription;
    public static final C18482e tapsense = new C18482e("SessionFlowSummary", null);
    public static final String isVip = "22.2.0";
    public static long inmobi = System.currentTimeMillis();
    public final C8209e ad = new C8209e(1);
    public final List vip = DesugarCollections.synchronizedList(new ArrayList());
    public final List metrica = DesugarCollections.synchronizedList(new ArrayList());
    public final List license = DesugarCollections.synchronizedList(new ArrayList());
    public final Map appmetrica = DesugarCollections.synchronizedMap(new HashMap());
    public int pro = 0;
    public final long yandex = System.currentTimeMillis();

    public C0385e(C0140e c0140e, String str) {
        this.purchase = c0140e;
        this.billing = str;
        long j = inmobi;
        inmobi = 1 + j;
        this.startapp = j;
    }

    public final void ad(C10078e c10078e) {
        if (c10078e == null) {
            vip(2);
            return;
        }
        AbstractC9528e.appmetrica();
        CastDevice castDevice = c10078e.mopub;
        if (castDevice == null) {
            vip(3);
            return;
        }
        String str = castDevice.f659e;
        this.adcel = c10078e;
        String str2 = this.advert;
        if (str2 != null) {
            if (TextUtils.equals(str2, str)) {
                return;
            }
            vip(5);
            return;
        }
        this.advert = str;
        this.amazon = castDevice.f657e;
        this.pro = castDevice.startapp();
        C10467e yandex = castDevice.yandex();
        if (yandex != null) {
            this.loadAd = yandex.f20660e;
            this.Signature = yandex.f20655e;
            this.admob = yandex.f20664e;
            this.subscription = yandex.f20663e;
            this.remoteconfig = yandex.f20659e;
        }
        c10078e.vip();
    }

    public final void vip(int i) {
        Integer valueOf = Integer.valueOf(i - 1);
        Map map = this.appmetrica;
        C7411e c7411e = (C7411e) map.get(valueOf);
        if (c7411e != null) {
            c7411e.license.incrementAndGet();
            c7411e.vip = System.currentTimeMillis();
        } else {
            C7411e c7411e2 = new C7411e(new C5401e(i, 20, (byte) 0));
            c7411e2.metrica = this.yandex;
            map.put(valueOf, c7411e2);
        }
    }
}
