package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؒٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1195e extends AbstractC7884e {

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public static final Pair f3798e = new Pair(BuildConfig.FLAVOR, 0L);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public SharedPreferences f3799e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C10007e f3800e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C5982e f3801e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f3802e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C10007e f3803e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C5609e f3804e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C5982e f3805e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C5982e f3806e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C11106e f3807e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C10007e f3808e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C5609e f3809e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C11106e f3810e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public long f3811e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C5982e f3812e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C5982e f3813e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f3814e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public SharedPreferences f3815e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C5609e f3816e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public String f3817e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C5609e f3818e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C5982e f3819e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C9156e f3820e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C10007e f3821e;

    public C1195e(C6936e c6936e) {
        super(c6936e);
        this.f3801e = new C5982e(this, "session_timeout", 1800000L);
        this.f3800e = new C10007e(this, "start_new_session", true);
        this.f3806e = new C5982e(this, "last_pause_time", 0L);
        this.f3805e = new C5982e(this, "session_id", 0L);
        this.f3804e = new C5609e(this, "non_personalized_ads");
        this.f3807e = new C11106e(this, "last_received_uri_timestamps_by_source");
        this.f3808e = new C10007e(this, "allow_remote_dynamite", false);
        this.f3819e = new C5982e(this, "first_open_time", 0L);
        AbstractC9528e.purchase("app_install_time");
        this.f3809e = new C5609e(this, "app_instance_id");
        this.f3821e = new C10007e(this, "app_backgrounded", false);
        this.f3803e = new C10007e(this, "deep_link_retrieval_complete", false);
        this.f3813e = new C5982e(this, "deep_link_retrieval_attempts", 0L);
        this.f3816e = new C5609e(this, "firebase_feature_rollouts");
        this.f3818e = new C5609e(this, "deferred_attribution_cache");
        this.f3812e = new C5982e(this, "deferred_attribution_cache_timestamp", 0L);
        this.f3810e = new C11106e(this, "default_event_parameters");
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final SharedPreferences m484e() {
        mo2250e();
        m2347e();
        if (this.f3799e == null) {
            C6936e c6936e = (C6936e) this.f36443e;
            String valueOf = String.valueOf(c6936e.f14225e.getPackageName());
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            C14937e c14937e = c13879e.f27497e;
            String concat = valueOf.concat("_preferences");
            c14937e.vip(concat, "Default prefs file");
            this.f3799e = c6936e.f14225e.getSharedPreferences(concat, 0);
        }
        return this.f3799e;
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final SparseArray m485e() {
        Bundle m3009finally = this.f3807e.m3009finally();
        int[] intArray = m3009finally.getIntArray("uriSources");
        long[] longArray = m3009finally.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final void m486e(boolean z) {
        mo2250e();
        C13879e c13879e = ((C6936e) this.f36443e).f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27497e.vip(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = m490e().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    @Override // defpackage.AbstractC7884e
    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final boolean mo487e() {
        return true;
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final C5291e m488e() {
        mo2250e();
        return C5291e.metrica(m490e().getInt("consent_source", 100), m490e().getString("consent_settings", "G1"));
    }

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final boolean m489e(long j) {
        return j - this.f3801e.metrica() > this.f3806e.metrica();
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final SharedPreferences m490e() {
        mo2250e();
        m2347e();
        AbstractC9528e.startapp(this.f3815e);
        return this.f3815e;
    }
}
