package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.math.BigInteger;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7935e {
    public final String ad;
    public final Map metrica;
    public final Map vip;
    public static final C18482e license = new C18482e("ApplicationAnalyticsUtils", null);
    public static final String appmetrica = "22.2.0";

    public C7935e(String str, Bundle bundle) {
        this.ad = str;
        this.vip = AbstractC12220e.Signature("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", bundle);
        this.metrica = AbstractC12220e.Signature("com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C4469e ad(defpackage.C7322e r5, int r6) {
        /*
            r4 = this;
            eؚ٘ؒ r5 = r4.vip(r5)
            eًؔؒ r0 = r5.license()
            eّؒۙ r0 = defpackage.C2440e.smaato(r0)
            java.util.Map r1 = r4.metrica
            if (r1 == 0) goto L29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L1b
            goto L29
        L1b:
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            defpackage.AbstractC9528e.startapp(r1)
            int r1 = r1.intValue()
            goto L2b
        L29:
            int r1 = r6 + 10000
        L2b:
            r0.ad()
            eُۗٝ r2 = r0.f20053e
            eًؔؒ r2 = (defpackage.C2440e) r2
            r2.subscription(r1)
            java.util.Map r1 = r4.vip
            if (r1 == 0) goto L52
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L44
            goto L52
        L44:
            java.lang.Object r6 = r1.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            defpackage.AbstractC9528e.startapp(r6)
            int r6 = r6.intValue()
            goto L54
        L52:
            int r6 = r6 + 10000
        L54:
            r0.ad()
            eُۗٝ r1 = r0.f20053e
            eًؔؒ r1 = (defpackage.C2440e) r1
            r1.remoteconfig(r6)
            eُۗٝ r6 = r0.metrica()
            eًؔؒ r6 = (defpackage.C2440e) r6
            r5.appmetrica(r6)
            eُۗٝ r5 = r5.metrica()
            eۣؖۛ r5 = (defpackage.C4469e) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7935e.ad(eؙؚٞ, int):eۣؖۛ");
    }

    public final C17488e vip(C7322e c7322e) {
        int i;
        long j;
        C17488e smaato = C4469e.smaato();
        long j2 = c7322e.license;
        smaato.ad();
        ((C4469e) smaato.f20053e).loadAd(j2);
        int i2 = c7322e.appmetrica;
        c7322e.appmetrica = i2 + 1;
        smaato.ad();
        ((C4469e) smaato.f20053e).signatures(i2);
        String str = c7322e.metrica;
        if (str != null) {
            smaato.ad();
            ((C4469e) smaato.f20053e).pro(str);
        }
        C18245e advert = C10631e.advert();
        if (!TextUtils.isEmpty(c7322e.yandex)) {
            String str2 = c7322e.yandex;
            smaato.ad();
            ((C4469e) smaato.f20053e).Signature(str2);
            String str3 = c7322e.yandex;
            advert.ad();
            ((C10631e) advert.f20053e).smaato(str3);
        }
        if (!TextUtils.isEmpty(c7322e.startapp)) {
            String str4 = c7322e.startapp;
            advert.ad();
            ((C10631e) advert.f20053e).amazon(str4);
        }
        if (!TextUtils.isEmpty(c7322e.adcel)) {
            String str5 = c7322e.adcel;
            advert.ad();
            ((C10631e) advert.f20053e).loadAd(str5);
        }
        if (!TextUtils.isEmpty(c7322e.mopub)) {
            String str6 = c7322e.mopub;
            advert.ad();
            ((C10631e) advert.f20053e).Signature(str6);
        }
        if (!TextUtils.isEmpty(c7322e.advert)) {
            String str7 = c7322e.advert;
            advert.ad();
            ((C10631e) advert.f20053e).admob(str7);
        }
        if (!TextUtils.isEmpty(c7322e.smaato)) {
            String str8 = c7322e.smaato;
            advert.ad();
            ((C10631e) advert.f20053e).subscription(str8);
        }
        int i3 = c7322e.amazon;
        if (i3 != 1) {
            i = 3;
            if (i3 != 2) {
                if (i3 != 3) {
                    i = 5;
                    if (i3 != 4) {
                        i = i3 != 5 ? 1 : 6;
                    }
                } else {
                    i = 4;
                }
            }
        } else {
            i = 2;
        }
        advert.ad();
        ((C10631e) advert.f20053e).remoteconfig(i);
        C10631e c10631e = (C10631e) advert.metrica();
        smaato.ad();
        ((C4469e) smaato.f20053e).applovin(c10631e);
        C7083e advert2 = C2542e.advert();
        advert2.ad();
        ((C2542e) advert2.f20053e).amazon(appmetrica);
        advert2.ad();
        ((C2542e) advert2.f20053e).smaato(this.ad);
        C2542e c2542e = (C2542e) advert2.metrica();
        smaato.ad();
        ((C4469e) smaato.f20053e).inmobi(c2542e);
        C1282e advert3 = C2440e.advert();
        if (c7322e.vip != null) {
            C5469e advert4 = C14569e.advert();
            String str9 = c7322e.vip;
            advert4.ad();
            ((C14569e) advert4.f20053e).smaato(str9);
            C14569e c14569e = (C14569e) advert4.metrica();
            advert3.ad();
            ((C2440e) advert3.f20053e).loadAd(c14569e);
        }
        advert3.ad();
        ((C2440e) advert3.f20053e).Signature(false);
        String str10 = c7322e.purchase;
        if (str10 != null) {
            try {
                String replace = str10.replace("-", BuildConfig.FLAVOR);
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                Object[] objArr = {str10};
                C18482e c18482e = license;
                Log.w(c18482e.ad, c18482e.license("receiverSessionId %s is not valid for hash", objArr), e);
                j = 0;
            }
            advert3.ad();
            ((C2440e) advert3.f20053e).admob(j);
        }
        int i4 = c7322e.billing;
        advert3.ad();
        ((C2440e) advert3.f20053e).pro(i4);
        boolean z = c7322e.ad.purchase == 2;
        advert3.ad();
        ((C2440e) advert3.f20053e).signatures(z);
        boolean z2 = c7322e.loadAd;
        advert3.ad();
        ((C2440e) advert3.f20053e).inmobi(z2);
        smaato.ad();
        ((C4469e) smaato.f20053e).tapsense((C2440e) advert3.metrica());
        return smaato;
    }
}
