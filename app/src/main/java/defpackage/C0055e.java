package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0055e {
    public static final C18482e startapp = new C18482e("ApplicationAnalytics", null);
    public final C0140e ad;
    public C7322e billing;
    public final C7935e metrica;
    public final SharedPreferences purchase;
    public final BinderC15170e vip;
    public C10078e yandex;
    public final HandlerC9134e appmetrica = new HandlerC9134e(Looper.getMainLooper(), 6);
    public final RunnableC16721e license = new RunnableC16721e(14, this);

    public C0055e(SharedPreferences sharedPreferences, C0140e c0140e, BinderC15170e binderC15170e, Bundle bundle, String str) {
        this.purchase = sharedPreferences;
        this.ad = c0140e;
        this.vip = binderC15170e;
        this.metrica = new C7935e(str, bundle);
    }

    public final void ad() {
        C7322e c7322e = this.billing;
        c7322e.getClass();
        SharedPreferences sharedPreferences = this.purchase;
        if (sharedPreferences == null) {
            return;
        }
        C7322e.admob.vip("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("application_id", c7322e.vip);
        edit.putString("receiver_metrics_id", c7322e.metrica);
        edit.putLong("analytics_session_id", c7322e.license);
        edit.putInt("event_sequence_number", c7322e.appmetrica);
        edit.putString("receiver_session_id", c7322e.purchase);
        edit.putInt("device_capabilities", c7322e.billing);
        edit.putString("device_model_name", c7322e.yandex);
        edit.putString("manufacturer", c7322e.startapp);
        edit.putString("product_name", c7322e.adcel);
        edit.putString("build_type", c7322e.mopub);
        edit.putString("cast_build_version", c7322e.advert);
        edit.putString("system_build_number", c7322e.smaato);
        edit.putInt("device_category", c7322e.amazon);
        edit.putInt("analytics_session_start_type", c7322e.Signature);
        edit.putBoolean("is_output_switcher_enabled", c7322e.loadAd);
        edit.apply();
    }

    public final void appmetrica() {
        CastDevice castDevice;
        if (!billing()) {
            C18482e c18482e = startapp;
            Log.w(c18482e.ad, c18482e.license("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            license();
            return;
        }
        C10078e c10078e = this.yandex;
        if (c10078e != null) {
            AbstractC9528e.appmetrica();
            castDevice = c10078e.mopub;
        } else {
            castDevice = null;
        }
        if (castDevice != null && !TextUtils.equals(this.billing.metrica, castDevice.f659e)) {
            purchase(castDevice);
        }
        AbstractC9528e.startapp(this.billing);
    }

    public final boolean billing() {
        String str;
        C18482e c18482e = startapp;
        if (this.billing == null) {
            c18482e.vip("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        C18482e c18482e2 = C8033e.adcel;
        AbstractC9528e.appmetrica();
        C8033e c8033e = C8033e.advert;
        AbstractC9528e.startapp(c8033e);
        AbstractC9528e.appmetrica();
        String str2 = c8033e.license.f25017e;
        if (str2 == null || (str = this.billing.vip) == null || !TextUtils.equals(str, str2)) {
            c18482e.vip("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        AbstractC9528e.startapp(this.billing);
        return true;
    }

    public final void license() {
        CastDevice castDevice;
        startapp.vip("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        C7322e c7322e = new C7322e(this.vip);
        C7322e.subscription++;
        this.billing = c7322e;
        C10078e c10078e = this.yandex;
        c7322e.loadAd = c10078e != null && c10078e.billing.m2508e();
        C7322e c7322e2 = this.billing;
        AbstractC9528e.startapp(c7322e2);
        C18482e c18482e = C8033e.adcel;
        AbstractC9528e.appmetrica();
        C8033e c8033e = C8033e.advert;
        AbstractC9528e.startapp(c8033e);
        AbstractC9528e.appmetrica();
        c7322e2.vip = c8033e.license.f25017e;
        C10078e c10078e2 = this.yandex;
        if (c10078e2 == null) {
            castDevice = null;
        } else {
            AbstractC9528e.appmetrica();
            castDevice = c10078e2.mopub;
        }
        if (castDevice != null) {
            purchase(castDevice);
        }
        C7322e c7322e3 = this.billing;
        AbstractC9528e.startapp(c7322e3);
        C10078e c10078e3 = this.yandex;
        c7322e3.Signature = c10078e3 != null ? c10078e3.vip() : 0;
        AbstractC9528e.startapp(this.billing);
    }

    public final void metrica() {
        HandlerC9134e handlerC9134e = this.appmetrica;
        AbstractC9528e.startapp(handlerC9134e);
        RunnableC16721e runnableC16721e = this.license;
        AbstractC9528e.startapp(runnableC16721e);
        handlerC9134e.postDelayed(runnableC16721e, 300000L);
    }

    public final void purchase(CastDevice castDevice) {
        C7322e c7322e = this.billing;
        if (c7322e == null) {
            return;
        }
        c7322e.metrica = castDevice.f659e;
        c7322e.billing = castDevice.f673e.f11581e;
        c7322e.yandex = castDevice.f657e;
        c7322e.amazon = castDevice.startapp();
        C10467e yandex = castDevice.yandex();
        if (yandex != null) {
            String str = yandex.f20660e;
            if (str != null) {
                c7322e.startapp = str;
            }
            String str2 = yandex.f20655e;
            if (str2 != null) {
                c7322e.adcel = str2;
            }
            String str3 = yandex.f20664e;
            if (str3 != null) {
                c7322e.mopub = str3;
            }
            String str4 = yandex.f20663e;
            if (str4 != null) {
                c7322e.advert = str4;
            }
            String str5 = yandex.f20659e;
            if (str5 != null) {
                c7322e.smaato = str5;
            }
        }
    }

    public final void vip(int i) {
        startapp.vip("log session ended with error = %d", Integer.valueOf(i));
        appmetrica();
        this.ad.ad(this.metrica.ad(this.billing, i), 228);
        this.appmetrica.removeCallbacks(this.license);
        this.billing = null;
    }

    public final boolean yandex(String str) {
        String str2;
        if (!billing()) {
            return false;
        }
        AbstractC9528e.startapp(this.billing);
        if (str != null && (str2 = this.billing.purchase) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        startapp.vip("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
