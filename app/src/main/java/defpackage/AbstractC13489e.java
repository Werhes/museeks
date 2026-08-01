package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13489e {
    public static final C1410e ad = AbstractC17475e.subs("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String ad(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, BuildConfig.FLAVOR);
        } catch (ClassCastException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static final boolean appmetrica(EnumC0060e enumC0060e, char[] cArr, String str, boolean z) {
        char c;
        int metrica = metrica(enumC0060e);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= enumC0060e.ad()) {
                char charAt = str.charAt(enumC0060e.ad() - 1);
                boolean z2 = charAt == '1';
                if (metrica > 0 && cArr[metrica] != '2') {
                    cArr[metrica] = charAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (metrica > 0 && cArr[metrica] != '2') {
            cArr[metrica] = c;
        }
        return false;
    }

    public static final EnumC13835e billing(EnumC0060e enumC0060e, C0409e c0409e) {
        Object obj = c0409e.get(enumC0060e);
        if (obj == null) {
            obj = EnumC13835e.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (EnumC13835e) obj;
    }

    public static final String license(EnumC0060e enumC0060e, String str, String str2) {
        String str3 = "0";
        String valueOf = (TextUtils.isEmpty(str) || str.length() < enumC0060e.ad()) ? "0" : String.valueOf(str.charAt(enumC0060e.ad() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= enumC0060e.ad()) {
            str3 = String.valueOf(str2.charAt(enumC0060e.ad() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str3));
    }

    public static final int metrica(EnumC0060e enumC0060e) {
        if (enumC0060e == EnumC0060e.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (enumC0060e == EnumC0060e.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (enumC0060e == EnumC0060e.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return enumC0060e == EnumC0060e.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final boolean purchase(EnumC0060e enumC0060e, char[] cArr, String str, boolean z) {
        char c;
        int metrica = metrica(enumC0060e);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= enumC0060e.ad()) {
                char charAt = str.charAt(enumC0060e.ad() - 1);
                boolean z2 = charAt == '1';
                if (metrica > 0 && cArr[metrica] != '2') {
                    cArr[metrica] = charAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (metrica > 0 && cArr[metrica] != '2') {
            cArr[metrica] = c;
        }
        return false;
    }

    public static final boolean vip(EnumC0060e enumC0060e, C0409e c0409e, C0409e c0409e2, C8892e c8892e, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        EnumC17959e enumC17959e;
        char c;
        int metrica = metrica(enumC0060e);
        if (metrica > 0 && (i2 != 1 || i != 1)) {
            cArr[metrica] = '2';
        }
        if (billing(enumC0060e, c0409e2) == EnumC13835e.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (enumC0060e == EnumC0060e.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && c8892e.f17859e.equals(str)) {
                if (metrica > 0 && cArr[metrica] != '2') {
                    cArr[metrica] = '1';
                }
                return true;
            }
            if (c0409e.containsKey(enumC0060e) && (enumC17959e = (EnumC17959e) c0409e.get(enumC0060e)) != null) {
                int ordinal = enumC17959e.ordinal();
                EnumC13835e enumC13835e = EnumC13835e.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    EnumC13835e enumC13835e2 = EnumC13835e.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return billing(enumC0060e, c0409e2) == enumC13835e ? purchase(enumC0060e, cArr, str3, z2) : appmetrica(enumC0060e, cArr, str2, z);
                        }
                        if (ordinal == 3) {
                            return billing(enumC0060e, c0409e2) == enumC13835e2 ? appmetrica(enumC0060e, cArr, str2, z) : purchase(enumC0060e, cArr, str3, z2);
                        }
                    } else if (billing(enumC0060e, c0409e2) != enumC13835e2) {
                        return purchase(enumC0060e, cArr, str3, z2);
                    }
                } else if (billing(enumC0060e, c0409e2) != enumC13835e) {
                    return appmetrica(enumC0060e, cArr, str2, z);
                }
                c = '8';
            }
            c = '0';
        }
        if (metrica <= 0 || cArr[metrica] == '2') {
            return false;
        }
        cArr[metrica] = c;
        return false;
    }
}
