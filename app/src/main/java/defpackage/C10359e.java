package defpackage;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10359e {
    public final String ad;
    public final String appmetrica;
    public final String billing;
    public final List license;
    public final String metrica;
    public final String purchase;
    public final String vip;

    public C10359e(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.ad = str;
        str2.getClass();
        this.vip = str2;
        this.metrica = str3;
        list.getClass();
        this.license = list;
        this.appmetrica = str4;
        this.purchase = str5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        this.billing = AbstractC4653e.ads(sb, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.ad + ", mProviderPackage: " + this.vip + ", mQuery: " + this.metrica + ", mSystemFont: " + this.appmetrica + ", mVariationSettings: " + this.purchase + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.license;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
