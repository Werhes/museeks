package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18094e {
    public final String ad;
    public final String appmetrica;
    public final String billing;
    public final String license;
    public final String metrica;
    public final String purchase;
    public final String vip;

    public C18094e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = AbstractC11450e.ad;
        AbstractC9528e.mopub("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.vip = str;
        this.ad = str2;
        this.metrica = str3;
        this.license = str4;
        this.appmetrica = str5;
        this.purchase = str6;
        this.billing = str7;
    }

    public static C18094e ad(Context context) {
        C11883e c11883e = new C11883e(context, 19);
        String adcel = c11883e.adcel("google_app_id");
        if (TextUtils.isEmpty(adcel)) {
            return null;
        }
        return new C18094e(adcel, c11883e.adcel("google_api_key"), c11883e.adcel("firebase_database_url"), c11883e.adcel("ga_trackingId"), c11883e.adcel("gcm_defaultSenderId"), c11883e.adcel("google_storage_bucket"), c11883e.adcel("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18094e)) {
            return false;
        }
        C18094e c18094e = (C18094e) obj;
        return AbstractC5729e.vip(this.vip, c18094e.vip) && AbstractC5729e.vip(this.ad, c18094e.ad) && AbstractC5729e.vip(this.metrica, c18094e.metrica) && AbstractC5729e.vip(this.license, c18094e.license) && AbstractC5729e.vip(this.appmetrica, c18094e.appmetrica) && AbstractC5729e.vip(this.purchase, c18094e.purchase) && AbstractC5729e.vip(this.billing, c18094e.billing);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.vip, this.ad, this.metrica, this.license, this.appmetrica, this.purchase, this.billing});
    }

    public final String toString() {
        C11883e c11883e = new C11883e(5, this);
        c11883e.vip(this.vip, "applicationId");
        c11883e.vip(this.ad, "apiKey");
        c11883e.vip(this.metrica, "databaseUrl");
        c11883e.vip(this.appmetrica, "gcmSenderId");
        c11883e.vip(this.purchase, "storageBucket");
        c11883e.vip(this.billing, "projectId");
        return c11883e.toString();
    }
}
