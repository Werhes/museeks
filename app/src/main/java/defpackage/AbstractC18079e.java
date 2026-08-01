package defpackage;

import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18079e {
    static {
        Pattern.compile("\\\\.");
        Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    public static boolean ad(Object obj, Object obj2) {
        int i;
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj != null && obj2 != null) {
            try {
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    JSONObject jSONObject = (JSONObject) obj;
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    if (jSONObject.length() == jSONObject2.length()) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (jSONObject2.has(next)) {
                                AbstractC9528e.startapp(next);
                                if (ad(jSONObject.get(next), jSONObject2.get(next))) {
                                }
                            }
                        }
                        return true;
                    }
                } else {
                    if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
                        return obj.equals(obj2);
                    }
                    JSONArray jSONArray = (JSONArray) obj;
                    JSONArray jSONArray2 = (JSONArray) obj2;
                    if (jSONArray.length() == jSONArray2.length()) {
                        for (0; i < jSONArray.length(); i + 1) {
                            i = ad(jSONArray.get(i), jSONArray2.get(i)) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }
}
