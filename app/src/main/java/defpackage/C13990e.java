package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13990e {
    public final HashMap ad;

    public C13990e(Map map) {
        HashMap hashMap = new HashMap();
        this.ad = hashMap;
        hashMap.putAll(map);
    }

    public final String ad() {
        StringBuilder sb = new StringBuilder();
        C1410e c1410e = AbstractC13489e.ad;
        int i = c1410e.f4224e;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) c1410e.get(i2);
            HashMap hashMap = this.ad;
            if (hashMap.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13990e) {
            return ad().equalsIgnoreCase(((C13990e) obj).ad());
        }
        return false;
    }

    public final int hashCode() {
        return ad().hashCode();
    }

    public final int metrica() {
        try {
            String str = (String) this.ad.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final String toString() {
        return ad();
    }

    public final Bundle vip() {
        int metrica;
        HashMap hashMap = this.ad;
        if ("1".equals(hashMap.get("gdprApplies")) && "1".equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            String str = "denied";
            if (hashMap.get("Version") == null) {
                if ("1".equals(hashMap.get("GoogleConsent")) && (metrica = metrica()) >= 0) {
                    String str2 = (String) hashMap.get("PurposeConsents");
                    if (TextUtils.isEmpty(str2)) {
                        return Bundle.EMPTY;
                    }
                    Bundle bundle = new Bundle();
                    if (str2.length() > 0) {
                        bundle.putString("ad_storage", str2.charAt(0) == '1' ? "granted" : "denied");
                    }
                    if (str2.length() > 3) {
                        bundle.putString("ad_personalization", (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                    }
                    if (str2.length() > 6 && metrica >= 4) {
                        if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                            str = "granted";
                        }
                        bundle.putString("ad_user_data", str);
                    }
                    return bundle;
                }
                return Bundle.EMPTY;
            }
            if (metrica() >= 0) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("ad_storage", true != Objects.equals(hashMap.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle2.putString("ad_personalization", (Objects.equals(hashMap.get("AuthorizePurpose3"), "1") && Objects.equals(hashMap.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (metrica() >= 4) {
                    if (Objects.equals(hashMap.get("AuthorizePurpose1"), "1") && Objects.equals(hashMap.get("AuthorizePurpose7"), "1")) {
                        str = "granted";
                    }
                    bundle2.putString("ad_user_data", str);
                }
                return bundle2;
            }
        }
        return Bundle.EMPTY;
    }
}
