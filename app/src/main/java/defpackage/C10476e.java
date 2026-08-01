package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۘٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10476e extends Cpackage {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC7268e f20685e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Boolean f20686e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f20687e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Boolean f20688e;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final int m2813e(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(m2825e(str, AbstractC17254e.f33801else), 500), 100) : 500, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final void m2814e() {
        ((C6936e) this.f36443e).getClass();
    }

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public final boolean m2815e() {
        Boolean m2820e = m2820e("google_analytics_automatic_screen_reporting_enabled");
        return m2820e == null || m2820e.booleanValue();
    }

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final long m2816e(String str, C6973e c6973e) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c6973e.ad(null)).longValue();
        }
        String mo2279e = this.f20685e.mo2279e(str, c6973e.ad);
        if (TextUtils.isEmpty(mo2279e)) {
            return ((Long) c6973e.ad(null)).longValue();
        }
        try {
            return ((Long) c6973e.ad(Long.valueOf(Long.parseLong(mo2279e)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c6973e.ad(null)).longValue();
        }
    }

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final boolean m2817e(String str) {
        C6936e.purchase(((C6936e) this.f36443e).f14223e);
        if (C5240e.m1781e((String) AbstractC17254e.f33817e.ad(null), str) || C5240e.m1781e((String) AbstractC17254e.f33809e.ad(null), str) || C5240e.m1781e((String) AbstractC17254e.f33849e.ad(null), str)) {
            return true;
        }
        return "1".equals(this.f20685e.mo2279e(str, "gaia_collection_enabled"));
    }

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public final boolean m2818e() {
        ((C6936e) this.f36443e).getClass();
        Boolean m2820e = m2820e("firebase_analytics_collection_deactivated");
        return m2820e != null && m2820e.booleanValue();
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final String m2819e(String str, C6973e c6973e) {
        return TextUtils.isEmpty(str) ? (String) c6973e.ad(null) : (String) c6973e.ad(this.f20685e.mo2279e(str, c6973e.ad));
    }

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public final Boolean m2820e(String str) {
        AbstractC9528e.purchase(str);
        Bundle m2828e = m2828e();
        if (m2828e != null) {
            if (m2828e.containsKey(str)) {
                return Boolean.valueOf(m2828e.getBoolean(str));
            }
            return null;
        }
        C13879e c13879e = ((C6936e) this.f36443e).f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27502e.ad("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final double m2821e(String str, C6973e c6973e) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c6973e.ad(null)).doubleValue();
        }
        String mo2279e = this.f20685e.mo2279e(str, c6973e.ad);
        if (TextUtils.isEmpty(mo2279e)) {
            return ((Double) c6973e.ad(null)).doubleValue();
        }
        try {
            return ((Double) c6973e.ad(Double.valueOf(Double.parseDouble(mo2279e)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c6973e.ad(null)).doubleValue();
        }
    }

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public final boolean m2822e(String str, C6973e c6973e) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c6973e.ad(null)).booleanValue();
        }
        String mo2279e = this.f20685e.mo2279e(str, c6973e.ad);
        return TextUtils.isEmpty(mo2279e) ? ((Boolean) c6973e.ad(null)).booleanValue() : ((Boolean) c6973e.ad(Boolean.valueOf("1".equals(mo2279e)))).booleanValue();
    }

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final boolean m2823e(String str) {
        return "1".equals(this.f20685e.mo2279e(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public final EnumC18450e m2824e(String str, boolean z) {
        Object obj;
        AbstractC9528e.purchase(str);
        C6936e c6936e = (C6936e) this.f36443e;
        Bundle m2828e = m2828e();
        if (m2828e == null) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = m2828e.get(str);
        }
        EnumC18450e enumC18450e = EnumC18450e.UNINITIALIZED;
        if (obj == null) {
            return enumC18450e;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC18450e.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC18450e.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return EnumC18450e.POLICY;
        }
        C13879e c13879e2 = c6936e.f14227e;
        C6936e.yandex(c13879e2);
        c13879e2.f27495e.vip(str, "Invalid manifest metadata for");
        return enumC18450e;
    }

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final int m2825e(String str, C6973e c6973e) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c6973e.ad(null)).intValue();
        }
        String mo2279e = this.f20685e.mo2279e(str, c6973e.ad);
        if (TextUtils.isEmpty(mo2279e)) {
            return ((Integer) c6973e.ad(null)).intValue();
        }
        try {
            return ((Integer) c6973e.ad(Integer.valueOf(Integer.parseInt(mo2279e)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c6973e.ad(null)).intValue();
        }
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final String m2826e(String str) {
        C6936e c6936e = (C6936e) this.f36443e;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.FLAVOR);
            AbstractC9528e.startapp(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(e, "Could not find SystemProperties class");
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e2) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.vip(e2, "Could not access SystemProperties.get()");
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e3) {
            C13879e c13879e3 = c6936e.f14227e;
            C6936e.yandex(c13879e3);
            c13879e3.f27502e.vip(e3, "Could not find SystemProperties.get() method");
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e4) {
            C13879e c13879e4 = c6936e.f14227e;
            C6936e.yandex(c13879e4);
            c13879e4.f27502e.vip(e4, "SystemProperties.get() threw an exception");
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final boolean m2827e() {
        if (this.f20686e == null) {
            Boolean m2820e = m2820e("app_measurement_lite");
            this.f20686e = m2820e;
            if (m2820e == null) {
                this.f20686e = Boolean.FALSE;
            }
        }
        return this.f20686e.booleanValue() || !((C6936e) this.f36443e).f14207e;
    }

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final Bundle m2828e() {
        C6936e c6936e = (C6936e) this.f36443e;
        try {
            Context context = c6936e.f14225e;
            Context context2 = c6936e.f14225e;
            C13879e c13879e = c6936e.f14227e;
            if (context.getPackageManager() == null) {
                C6936e.yandex(c13879e);
                c13879e.f27502e.ad("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo vip = C5277e.ad(context2).vip(128, context2.getPackageName());
            if (vip != null) {
                return vip.metaData;
            }
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.vip(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }
}
