package defpackage;

import android.content.Context;
import android.os.SystemClock;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٛؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17856e {
    public static final C10093e advert;
    public static C7895e mopub;
    public final String ad;
    public final C0560e appmetrica;
    public final String billing;
    public final C6043e license;
    public final C1534e metrica;
    public final C0560e purchase;
    public final String vip;
    public final int yandex;
    public final HashMap startapp = new HashMap();
    public final HashMap adcel = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        advert = new C10093e(objArr);
    }

    public C17856e(Context context, C6043e c6043e, C1534e c1534e, String str) {
        this.ad = context.getPackageName();
        this.vip = AbstractC10849e.ad(context);
        this.license = c6043e;
        this.metrica = c1534e;
        C5107e.smaato();
        this.billing = str;
        C6594e m2212final = C6594e.m2212final();
        CallableC8878e callableC8878e = new CallableC8878e(8, this);
        m2212final.getClass();
        this.appmetrica = C6594e.m2211e(callableC8878e);
        C6594e m2212final2 = C6594e.m2212final();
        Objects.requireNonNull(c6043e);
        CallableC16081e callableC16081e = new CallableC16081e(c6043e, 2);
        m2212final2.getClass();
        this.purchase = C6594e.m2211e(callableC16081e);
        C10093e c10093e = advert;
        this.yandex = c10093e.containsKey(str) ? C0781e.license(context, (String) c10093e.get(str), false) : -1;
    }

    public static long ad(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final boolean license(EnumC11135e enumC11135e, long j) {
        HashMap hashMap = this.startapp;
        return hashMap.get(enumC11135e) == null || j - ((Long) hashMap.get(enumC11135e)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final String metrica() {
        C0560e c0560e = this.appmetrica;
        if (c0560e.advert()) {
            return (String) c0560e.adcel();
        }
        return C7092e.metrica.ad(this.billing);
    }

    public final void vip(InterfaceC18508e interfaceC18508e, EnumC11135e enumC11135e) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (license(enumC11135e, elapsedRealtime)) {
            this.startapp.put(enumC11135e, Long.valueOf(elapsedRealtime));
            EnumC2663e.f6529e.execute(new RunnableC11327e(16, this, interfaceC18508e.ad(), enumC11135e, metrica(), false));
        }
    }
}
