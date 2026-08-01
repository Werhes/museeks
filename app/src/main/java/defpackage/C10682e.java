package defpackage;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10682e {
    public static C2847e adcel;
    public static final C10502e mopub;
    public final String ad;
    public final C0560e appmetrica;
    public final String billing;
    public final C6043e license;
    public final C13755e metrica;
    public final C0560e purchase;
    public final HashMap startapp = new HashMap();
    public final String vip;
    public final int yandex;

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        mopub = new C10502e(objArr);
    }

    public C10682e(Context context, C6043e c6043e, C13755e c13755e) {
        new HashMap();
        this.ad = context.getPackageName();
        this.vip = AbstractC10849e.ad(context);
        this.license = c6043e;
        this.metrica = c13755e;
        C14914e.subscription();
        this.billing = "vision-common";
        C6594e m2212final = C6594e.m2212final();
        CallableC8878e callableC8878e = new CallableC8878e(5, this);
        m2212final.getClass();
        this.appmetrica = C6594e.m2211e(callableC8878e);
        C6594e m2212final2 = C6594e.m2212final();
        c6043e.getClass();
        CallableC16081e callableC16081e = new CallableC16081e(c6043e, 0);
        m2212final2.getClass();
        this.purchase = C6594e.m2211e(callableC16081e);
        C10502e c10502e = mopub;
        this.yandex = c10502e.containsKey("vision-common") ? C0781e.license(context, (String) c10502e.get("vision-common"), false) : -1;
    }
}
