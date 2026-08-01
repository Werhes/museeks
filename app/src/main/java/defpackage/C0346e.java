package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0346e extends AbstractC9613e {
    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public static final boolean m331e(String str) {
        String str2 = (String) AbstractC17254e.pro.ad(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.m2768native().signatures()) goto L26;
     */
    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C1766e m332e(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0346e.m332e(java.lang.String):eّؓؑ");
    }

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final String m333e(String str) {
        C10961e c10961e = this.f19060e.f30382e;
        C15398e.m3939break(c10961e);
        String m2958e = c10961e.m2958e(str);
        if (TextUtils.isEmpty(m2958e)) {
            return (String) AbstractC17254e.subscription.ad(null);
        }
        Uri parse = Uri.parse((String) AbstractC17254e.subscription.ad(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(m2958e).length() + 1 + String.valueOf(authority).length());
        sb.append(m2958e);
        sb.append(".");
        sb.append(authority);
        buildUpon.authority(sb.toString());
        return buildUpon.build().toString();
    }
}
