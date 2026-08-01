package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13951e implements InterfaceC17847e, InterfaceC9307e, InterfaceC7898e, InterfaceC8444e, InterfaceC5000e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f27672e;

    public /* synthetic */ C13951e(Object obj) {
        this.f27672e = obj;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        C8988e c8988e = (C8988e) obj2;
        C4883e c4883e = (C4883e) ((C9803e) obj).loadAd();
        C11075e c11075e = (C11075e) this.f27672e;
        Parcel adcel = c4883e.adcel();
        AbstractC9126e.vip(adcel, c11075e);
        try {
            c4883e.license.transact(1, adcel, null, 1);
            adcel.recycle();
            c8988e.vip(null);
        } catch (Throwable th) {
            adcel.recycle();
            throw th;
        }
    }

    public void ad(String str, Bundle bundle) {
        String uri;
        C6936e c6936e = (C6936e) this.f27672e;
        C6915e c6915e = c6936e.f14226e;
        C1195e c1195e = c6936e.f14198e;
        C6936e.yandex(c6915e);
        c6915e.mo2250e();
        if (c6936e.ad()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        C6936e.purchase(c1195e);
        c1195e.f3818e.isVip(uri);
        C5982e c5982e = c1195e.f3812e;
        c6936e.f14215e.getClass();
        c5982e.license(System.currentTimeMillis());
    }

    @Override // defpackage.InterfaceC5000e
    public /* synthetic */ void appmetrica(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((C15398e) this.f27672e).isVip(str, i, th, bArr, map);
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public /* synthetic */ void mo268e(Exception exc) {
        C8988e c8988e = (C8988e) this.f27672e;
        C11909e.license.ad(exc, "get checkbox consent failed", new Object[0]);
        c8988e.license(Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC7898e
    public void license(Object obj) {
        C16594e c16594e;
        EnumC3848e metrica;
        C8033e c8033e = (C8033e) this.f27672e;
        Bundle bundle = (Bundle) obj;
        if (C0140e.mopub) {
            Context context = c8033e.ad;
            C4480e c4480e = c8033e.appmetrica;
            C0140e c0140e = new C0140e(context, c4480e, c8033e.vip, c8033e.yandex, c8033e.purchase);
            int i = 0;
            int i2 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
            C0140e.mopub = z2;
            if (i2 == 0) {
                if (!z && !z2) {
                    return;
                } else {
                    i2 = 0;
                }
            }
            c0140e.yandex = new C11909e(context, bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L));
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String adcel = AbstractC10257e.adcel(packageName, ".client_cast_analytics_data");
            c0140e.startapp = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            C6553e.vip(context);
            c0140e.billing = C6553e.ad().metrica(C12664e.appmetrica).ad("CAST_SENDER_SDK", new C12007e("proto"), C11993e.f23967e);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                c0140e.appmetrica = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(adcel, 0);
            if (i2 != 0) {
                C9321e ad = C0381e.ad();
                ad.ad = new C8879e(c4480e, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, i);
                ad.license = new C1032e[]{AbstractC18209e.license};
                ad.metrica = true;
                ad.vip = false;
                ad.appmetrica = 8426;
                c4480e.appmetrica(0, ad.ad()).appmetrica(new C9556e(i2, c0140e, packageName, sharedPreferences));
            }
            if (z) {
                AbstractC9528e.startapp(sharedPreferences);
                C18482e c18482e = C16594e.startapp;
                synchronized (C16594e.class) {
                    try {
                        if (C16594e.mopub == null) {
                            C16594e.mopub = new C16594e(sharedPreferences, c0140e, packageName);
                        }
                        c16594e = C16594e.mopub;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String str = c16594e.metrica;
                SharedPreferences sharedPreferences2 = c16594e.vip;
                HashSet hashSet = c16594e.purchase;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = c16594e.billing;
                hashSet2.clear();
                c16594e.yandex = 0L;
                String str2 = C16594e.adcel;
                if (str2.equals(string) && str.equals(string2)) {
                    c16594e.yandex = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j = sharedPreferences2.getLong(str3, 0L);
                            if (j != 0 && currentTimeMillis - j > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                EnumC3848e metrica2 = C16594e.metrica(str3.substring(41));
                                if (metrica2 != null) {
                                    hashSet2.add(metrica2);
                                    hashSet.add(metrica2);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (metrica = C16594e.metrica(str3.substring(41))) != null) {
                                hashSet.add(metrica);
                            }
                        }
                    }
                    c16594e.vip(hashSet3);
                    AbstractC9528e.startapp(c16594e.appmetrica);
                    AbstractC9528e.startapp(c16594e.license);
                    c16594e.appmetrica.post(c16594e.license);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    c16594e.vip(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                C16594e.ad(EnumC3848e.CAST_CONTEXT);
            }
            if (C0140e.mopub) {
                C12575e.m3367goto();
            }
        }
    }

    public boolean metrica() {
        C1195e c1195e = ((C6936e) this.f27672e).f14198e;
        C6936e.purchase(c1195e);
        return c1195e.f3812e.metrica() > 0;
    }

    public boolean vip() {
        if (!metrica()) {
            return false;
        }
        C6936e c6936e = (C6936e) this.f27672e;
        c6936e.f14215e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C1195e c1195e = c6936e.f14198e;
        C6936e.purchase(c1195e);
        return currentTimeMillis - c1195e.f3812e.metrica() > c6936e.f14221e.m2816e(null, AbstractC17254e.f33872throws);
    }

    @Override // defpackage.InterfaceC8444e
    public void yandex(String str, String str2, Bundle bundle) {
        C8320e c8320e = (C8320e) this.f27672e;
        if (TextUtils.isEmpty(str)) {
            c8320e.m2417e("auto", "_err", bundle);
        } else {
            c8320e.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
    }
}
