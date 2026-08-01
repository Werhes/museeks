package defpackage;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15993e {
    public static final C18482e ad = new C18482e("MetadataUtils", null);
    public static final String metrica;
    public static final String[] vip;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        vip = strArr;
        metrica = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    public static void ad(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    list.add(new C5470e(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Calendar vip(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15993e.vip(java.lang.String):java.util.Calendar");
    }
}
