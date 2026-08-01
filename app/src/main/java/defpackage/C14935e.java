package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14935e implements InterfaceC4648e {
    public static final Object smaato = new Object();
    public final C14679e ad;
    public String adcel;
    public final ArrayList advert;
    public final C6491e appmetrica;
    public final Object billing;
    public final C3672e license;
    public final C5891e metrica;
    public final HashSet mopub;
    public final C8175e purchase;
    public final ExecutorC12660e startapp;
    public final C4081e vip;
    public final ExecutorService yandex;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, eًۘۜ] */
    public C14935e(C14679e c14679e, InterfaceC7970e interfaceC7970e, ExecutorService executorService, ExecutorC12660e executorC12660e) {
        c14679e.ad();
        C4081e c4081e = new C4081e(c14679e.ad, interfaceC7970e);
        C5891e c5891e = new C5891e(c14679e);
        if (C8455e.f17218e == null) {
            C8455e.f17218e = new C8455e(10);
        }
        C8455e c8455e = C8455e.f17218e;
        if (C3672e.license == null) {
            C3672e.license = new C3672e(c8455e);
        }
        C3672e c3672e = C3672e.license;
        C6491e c6491e = new C6491e(new C10175e(2, c14679e));
        ?? obj = new Object();
        this.billing = new Object();
        this.mopub = new HashSet();
        this.advert = new ArrayList();
        this.ad = c14679e;
        this.vip = c4081e;
        this.metrica = c5891e;
        this.license = c3672e;
        this.appmetrica = c6491e;
        this.purchase = obj;
        this.yandex = executorService;
        this.startapp = executorC12660e;
    }

    public final void ad(InterfaceC12836e interfaceC12836e) {
        synchronized (this.billing) {
            this.advert.add(interfaceC12836e);
        }
    }

    public final void adcel(Exception exc) {
        synchronized (this.billing) {
            try {
                Iterator it = this.advert.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC12836e) it.next()).ad(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void advert(String str) {
        this.adcel = str;
    }

    public final C0560e appmetrica() {
        billing();
        C8988e c8988e = new C8988e();
        ad(new C15832e(this.license, c8988e));
        this.yandex.execute(new RunnableC7456e(this, 1));
        return c8988e.ad;
    }

    public final void billing() {
        C14679e c14679e = this.ad;
        c14679e.ad();
        AbstractC9528e.billing(c14679e.metrica.vip, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c14679e.ad();
        AbstractC9528e.billing(c14679e.metrica.billing, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c14679e.ad();
        AbstractC9528e.billing(c14679e.metrica.ad, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c14679e.ad();
        String str = c14679e.metrica.vip;
        Pattern pattern = C3672e.metrica;
        AbstractC9528e.metrica(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c14679e.ad();
        AbstractC9528e.metrica(C3672e.metrica.matcher(c14679e.metrica.ad).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final C0560e license() {
        String str;
        billing();
        synchronized (this) {
            str = this.adcel;
        }
        if (str != null) {
            return AbstractC1749e.appmetrica(str);
        }
        C8988e c8988e = new C8988e();
        ad(new C9772e(c8988e));
        C0560e c0560e = c8988e.ad;
        this.yandex.execute(new RunnableC7456e(this, 0));
        return c0560e;
    }

    public final C0100e metrica(C0100e c0100e) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        String str;
        C10974e c10974e;
        C14679e c14679e = this.ad;
        c14679e.ad();
        String str2 = c14679e.metrica.ad;
        String str3 = c0100e.ad;
        c14679e.ad();
        String str4 = c14679e.metrica.billing;
        String str5 = c0100e.license;
        C4081e c4081e = this.vip;
        C16442e c16442e = c4081e.metrica;
        if (!c16442e.vip()) {
            throw new C10877e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL ad = C4081e.ad("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection metrica = c4081e.metrica(ad, str2);
            try {
                try {
                    metrica.setRequestMethod("POST");
                    metrica.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    metrica.setDoOutput(true);
                    C4081e.yandex(metrica);
                    responseCode = metrica.getResponseCode();
                    c16442e.license(responseCode);
                } catch (IOException | AssertionError unused) {
                    httpURLConnection = metrica;
                }
                if (responseCode >= 200 && responseCode < 300) {
                    c10974e = C4081e.purchase(metrica);
                    metrica.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    str = null;
                } else {
                    C4081e.vip(metrica, null, str2, str4);
                    httpURLConnection = metrica;
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (responseCode == 401 || responseCode == 404) {
                        if (((byte) (0 | 1)) != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        str = null;
                        C10974e c10974e2 = new C10974e(0L, 3, null);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c10974e = c10974e2;
                    } else {
                        if (responseCode == 429) {
                            throw new C10877e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            C10974e c10974e3 = new C10974e(0L, 2, null);
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            c10974e = c10974e3;
                            str = null;
                        }
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                int m2467class = AbstractC8703e.m2467class(c10974e.metrica);
                if (m2467class != 0) {
                    if (m2467class == 1) {
                        C7679e ad2 = c0100e.ad();
                        ad2.billing = "BAD CONFIG";
                        ad2.vip = 5;
                        return ad2.ad();
                    }
                    if (m2467class != 2) {
                        throw new C10877e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    advert(str);
                    C7679e ad3 = c0100e.ad();
                    ad3.vip = 2;
                    return ad3.ad();
                }
                String str6 = c10974e.ad;
                long j = c10974e.vip;
                C3672e c3672e = this.license;
                c3672e.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c3672e.ad.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C7679e ad4 = c0100e.ad();
                ad4.metrica = str6;
                ad4.appmetrica = j;
                byte b = (byte) (ad4.yandex | 1);
                ad4.purchase = seconds;
                ad4.yandex = (byte) (b | 2);
                return ad4.ad();
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = metrica;
            }
        }
        throw new C10877e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void mopub(C0100e c0100e) {
        synchronized (this.billing) {
            try {
                Iterator it = this.advert.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC12836e) it.next()).vip(c0100e)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void purchase(C0100e c0100e) {
        synchronized (smaato) {
            try {
                C14679e c14679e = this.ad;
                c14679e.ad();
                C18540e amazon = C18540e.amazon(c14679e.ad);
                try {
                    this.metrica.m2000throw(c0100e);
                    if (amazon != null) {
                        amazon.m4586transient();
                    }
                } catch (Throwable th) {
                    if (amazon != null) {
                        amazon.m4586transient();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void smaato(C0100e c0100e, C0100e c0100e2) {
        try {
            if (this.mopub.size() != 0 && !TextUtils.equals(c0100e.ad, c0100e2.ad)) {
                Iterator it = this.mopub.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [eْؖۙ] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [eًٌٓ] */
    public final C0100e startapp(C0100e c0100e) {
        int responseCode;
        String str = c0100e.ad;
        String str2 = null;
        if (str != null && str.length() == 11) {
            C1635e c1635e = (C1635e) this.appmetrica.get();
            synchronized (c1635e.ad) {
                try {
                    String[] strArr = C1635e.metrica;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String string = c1635e.ad.getString("|T|" + c1635e.vip + "|" + str3, null);
                            if (string == null || string.isEmpty()) {
                                i++;
                            } else if (string.startsWith("{")) {
                                try {
                                    str2 = new JSONObject(string).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                str2 = string;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        C4081e c4081e = this.vip;
        C14679e c14679e = this.ad;
        c14679e.ad();
        String str4 = c14679e.metrica.ad;
        String str5 = c0100e.ad;
        C14679e c14679e2 = this.ad;
        c14679e2.ad();
        String str6 = c14679e2.metrica.billing;
        C14679e c14679e3 = this.ad;
        c14679e3.ad();
        String str7 = c14679e3.metrica.vip;
        C16442e c16442e = c4081e.metrica;
        if (!c16442e.vip()) {
            throw new C10877e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL ad = C4081e.ad("projects/" + str6 + "/installations");
        int i2 = 0;
        C7921e c7921e = c4081e;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection metrica = c7921e.metrica(ad, str4);
            try {
                try {
                    metrica.setRequestMethod("POST");
                    metrica.setDoOutput(true);
                    if (str2 != null) {
                        metrica.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    C4081e.billing(metrica, str5, str7);
                    responseCode = metrica.getResponseCode();
                    c16442e.license(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (!(responseCode >= 200 && responseCode < 300)) {
                    try {
                        C4081e.vip(metrica, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        metrica.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        c7921e = c7921e;
                    }
                    if (responseCode == 429) {
                        throw new C10877e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        break;
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C7921e c7921e2 = new C7921e(null, null, null, null, 2);
                        metrica.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c7921e = c7921e2;
                    } else {
                        metrica.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        c7921e = c7921e;
                    }
                } else {
                    C7921e appmetrica = C4081e.appmetrica(metrica);
                    metrica.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c7921e = appmetrica;
                }
                int m2467class = AbstractC8703e.m2467class(c7921e.appmetrica);
                if (m2467class != 0) {
                    if (m2467class != 1) {
                        throw new C10877e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    C7679e ad2 = c0100e.ad();
                    ad2.billing = "BAD CONFIG";
                    ad2.vip = 5;
                    return ad2.ad();
                }
                String str8 = c7921e.vip;
                String str9 = c7921e.metrica;
                C3672e c3672e = this.license;
                c3672e.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c3672e.ad.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C10974e c10974e = c7921e.license;
                String str10 = c10974e.ad;
                long j = c10974e.vip;
                C7679e ad3 = c0100e.ad();
                ad3.ad = str8;
                ad3.vip = 4;
                ad3.metrica = str10;
                ad3.license = str9;
                ad3.appmetrica = j;
                byte b = (byte) (ad3.yandex | 1);
                ad3.purchase = seconds;
                ad3.yandex = (byte) (b | 2);
                return ad3.ad();
            } finally {
                metrica.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new C10877e("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = yandex(r2);
        r4 = r6.metrica;
        r2 = r2.ad();
        r2.ad = r3;
        r2.vip = 3;
        r2 = r2.ad();
        r4.m2000throw(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip() {
        /*
            r6 = this;
            java.lang.Object r0 = defpackage.C14935e.smaato
            monitor-enter(r0)
            eّٜٔ r1 = r6.ad     // Catch: java.lang.Throwable -> L3f
            r1.ad()     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = r1.ad     // Catch: java.lang.Throwable -> L3f
            eۨۗ r1 = defpackage.C18540e.amazon(r1)     // Catch: java.lang.Throwable -> L3f
            eؘٟۚ r2 = r6.metrica     // Catch: java.lang.Throwable -> L37
            eؑؖٞ r2 = r2.m1990break()     // Catch: java.lang.Throwable -> L37
            int r3 = r2.vip     // Catch: java.lang.Throwable -> L37
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L1e
            if (r3 != r5) goto L1d
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L39
            java.lang.String r3 = r6.yandex(r2)     // Catch: java.lang.Throwable -> L37
            eؘٟۚ r4 = r6.metrica     // Catch: java.lang.Throwable -> L37
            eًؓٗ r2 = r2.ad()     // Catch: java.lang.Throwable -> L37
            r2.ad = r3     // Catch: java.lang.Throwable -> L37
            r3 = 3
            r2.vip = r3     // Catch: java.lang.Throwable -> L37
            eؑؖٞ r2 = r2.ad()     // Catch: java.lang.Throwable -> L37
            r4.m2000throw(r2)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r2 = move-exception
            goto L51
        L39:
            if (r1 == 0) goto L41
            r1.m4586transient()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r1 = move-exception
            goto L57
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            r6.mopub(r2)
            eّۖٗ r0 = r6.startapp
            eؚۛٗ r1 = new eؚۛٗ
            r2 = 2
            r1.<init>(r6, r2)
            r0.execute(r1)
            return
        L51:
            if (r1 == 0) goto L56
            r1.m4586transient()     // Catch: java.lang.Throwable -> L3f
        L56:
            throw r2     // Catch: java.lang.Throwable -> L3f
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14935e.vip():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.vip) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String yandex(defpackage.C0100e r3) {
        /*
            r2 = this;
            eّٜٔ r0 = r2.ad
            r0.ad()
            java.lang.String r0 = r0.vip
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            eّٜٔ r0 = r2.ad
            java.lang.String r1 = "[DEFAULT]"
            r0.ad()
            java.lang.String r0 = r0.vip
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
        L1e:
            int r3 = r3.vip
            r0 = 1
            if (r3 != r0) goto L50
            eؙٚٞ r3 = r2.appmetrica
            java.lang.Object r3 = r3.get()
            eؘؓٙ r3 = (defpackage.C1635e) r3
            android.content.SharedPreferences r0 = r3.ad
            monitor-enter(r0)
            java.lang.String r1 = r3.ad()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4e
        L38:
            java.lang.String r1 = r3.vip()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4d
            eًۘۜ r3 = r2.purchase
            r3.getClass()
            java.lang.String r3 = defpackage.C8175e.ad()
            return r3
        L4d:
            return r1
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L50:
            eًۘۜ r3 = r2.purchase
            r3.getClass()
            java.lang.String r3 = defpackage.C8175e.ad()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14935e.yandex(eؑؖٞ):java.lang.String");
    }
}
