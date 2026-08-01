package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4200e {
    public static final /* synthetic */ int ad = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static C12859e ad(C3599e c3599e) {
        C0799e premium = C12859e.premium();
        int firebase = c3599e.firebase();
        premium.appmetrica();
        C12859e.applovin((C12859e) premium.f9709e, firebase);
        for (C17915e c17915e : c3599e.crashlytics()) {
            C14504e crashlytics = C3372e.crashlytics();
            String firebase2 = c17915e.crashlytics().firebase();
            crashlytics.appmetrica();
            C3372e.applovin((C3372e) crashlytics.f9709e, firebase2);
            EnumC4513e m4470interface = c17915e.m4470interface();
            crashlytics.appmetrica();
            C3372e.premium((C3372e) crashlytics.f9709e, m4470interface);
            EnumC3021e m4468class = c17915e.m4468class();
            crashlytics.appmetrica();
            C3372e.ads((C3372e) crashlytics.f9709e, m4468class);
            int firebase3 = c17915e.firebase();
            crashlytics.appmetrica();
            C3372e.subs((C3372e) crashlytics.f9709e, firebase3);
            C3372e c3372e = (C3372e) crashlytics.ad();
            premium.appmetrica();
            C12859e.ads((C12859e) premium.f9709e, c3372e);
        }
        return (C12859e) premium.ad();
    }
}
