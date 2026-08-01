package defpackage;

import android.content.Context;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7170e implements InterfaceC8223e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14661e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C7170e f14659e = new C7170e(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C7170e f14658e = new C7170e(1);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C7170e f14660e = new C7170e(2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C7170e f14657e = new C7170e(3);

    public /* synthetic */ C7170e(int i) {
        this.f14661e = i;
    }

    @Override // defpackage.InterfaceC8223e
    public final Object apply(Object obj) {
        switch (this.f14661e) {
            case 0:
                Context context = (Context) obj;
                String str = AbstractC18496e.vip;
                if (str == null) {
                    synchronized (AbstractC18496e.class) {
                        try {
                            str = AbstractC18496e.vip;
                            if (str == null) {
                                String vip = AbstractC5594e.vip(context, "com.google.android.gms.measurement");
                                AbstractC18496e.vip = vip;
                                str = vip;
                            }
                        } finally {
                        }
                    }
                }
                return str;
            case 1:
                C8167e c8167e = C13400e.startapp;
                return BuildConfig.FLAVOR;
            case 2:
                C17617e c17617e = (C17617e) obj;
                C17995e ads = C10228e.ads();
                if (c17617e == null) {
                    return (C10228e) ads.appmetrica();
                }
                for (C3259e c3259e : c17617e.isPro()) {
                    C8608e ads2 = C5254e.ads();
                    String signatures = c3259e.signatures();
                    ads2.vip();
                    ((C5254e) ads2.f12709e).premium(signatures);
                    int m1335this = c3259e.m1335this();
                    int i = m1335this - 1;
                    if (m1335this == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long tapsense = c3259e.tapsense();
                        ads2.vip();
                        ((C5254e) ads2.f12709e).subs(tapsense);
                    } else if (i == 1) {
                        boolean isVip = c3259e.isVip();
                        ads2.vip();
                        ((C5254e) ads2.f12709e).crashlytics(isVip);
                    } else if (i == 2) {
                        double inmobi = c3259e.inmobi();
                        ads2.vip();
                        ((C5254e) ads2.f12709e).firebase(inmobi);
                    } else if (i == 3) {
                        String isPro = c3259e.isPro();
                        ads2.vip();
                        ((C5254e) ads2.f12709e).m1842class(isPro);
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("No known flag type");
                        }
                        AbstractC7244e applovin = c3259e.applovin();
                        ads2.vip();
                        ((C5254e) ads2.f12709e).m1844interface(applovin);
                    }
                    C5254e c5254e = (C5254e) ads2.appmetrica();
                    ads.vip();
                    ((C10228e) ads.f12709e).m2786interface(c5254e);
                }
                String inmobi2 = c17617e.inmobi();
                ads.vip();
                ((C10228e) ads.f12709e).firebase(inmobi2);
                String signatures2 = c17617e.signatures();
                ads.vip();
                ((C10228e) ads.f12709e).subs(signatures2);
                long applovin2 = c17617e.applovin();
                ads.vip();
                ((C10228e) ads.f12709e).m2785class(applovin2);
                if (c17617e.tapsense()) {
                    AbstractC7244e isVip2 = c17617e.isVip();
                    ads.vip();
                    ((C10228e) ads.f12709e).crashlytics(isVip2);
                }
                return (C10228e) ads.appmetrica();
            default:
                C4914e c4914e = (C4914e) obj;
                if (c4914e.f10403e != 29514) {
                    throw c4914e;
                }
                C15364e inmobi3 = C6784e.inmobi();
                C16307e m2938goto = C10909e.m2938goto();
                long currentTimeMillis = System.currentTimeMillis();
                m2938goto.vip();
                ((C10909e) m2938goto.f12709e).m2942native(currentTimeMillis);
                inmobi3.vip();
                ((C6784e) inmobi3.f12709e).isPro((C10909e) m2938goto.appmetrica());
                return (C6784e) inmobi3.appmetrica();
        }
    }
}
