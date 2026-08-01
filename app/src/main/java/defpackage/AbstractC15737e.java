package defpackage;

import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۜؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15737e {
    public static final C16089e ad;

    static {
        C10610e c10610e = new C10610e();
        C7724e c7724e = C7724e.ad;
        c10610e.startapp(AbstractC15737e.class, c7724e);
        c10610e.startapp(C12258e.class, c7724e);
        ad = new C16089e(c10610e);
    }

    public static C12258e ad(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("rolloutId");
        String string2 = jSONObject.getString("parameterKey");
        String string3 = jSONObject.getString("parameterValue");
        String string4 = jSONObject.getString("variantId");
        long j = jSONObject.getLong("templateVersion");
        if (string3.length() > 256) {
            string3 = string3.substring(0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        return new C12258e(string, string2, string3, string4, j);
    }
}
