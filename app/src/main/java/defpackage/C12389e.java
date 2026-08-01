package defpackage;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12389e {
    public static final Charset vip = Charset.forName("UTF-8");
    public final C14461e ad;

    public C12389e(C14461e c14461e) {
        this.ad = c14461e;
    }

    public static HashMap ad(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static String appmetrica(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(AbstractC15737e.ad.yandex(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void billing(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", AbstractC17861e.admob("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    public static void purchase(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static ArrayList vip(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(AbstractC15737e.ad(string));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String license(String str) {
        FileInputStream fileInputStream;
        File yandex = this.ad.yandex(str, "user-data");
        Closeable closeable = null;
        if (yandex.exists()) {
            ?? r3 = (yandex.length() > 0L ? 1 : (yandex.length() == 0L ? 0 : -1));
            try {
                if (r3 != 0) {
                    try {
                        fileInputStream = new FileInputStream(yandex);
                        try {
                            JSONObject jSONObject = new JSONObject(AbstractC6494e.admob(fileInputStream));
                            String optString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + optString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            AbstractC6494e.billing(fileInputStream, "Failed to close user metadata file.");
                            return optString;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            purchase(yandex);
                            AbstractC6494e.billing(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        AbstractC6494e.billing(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r3;
            }
        }
        String Signature = AbstractC17861e.Signature("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", Signature, null);
        }
        purchase(yandex);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map metrica(String str, boolean z) {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        C14461e c14461e = this.ad;
        File yandex = z ? c14461e.yandex(str, "internal-keys") : c14461e.yandex(str, "keys");
        if (!yandex.exists() || yandex.length() == 0) {
            billing(yandex, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(yandex);
                try {
                    HashMap ad = ad(AbstractC6494e.admob(fileInputStream));
                    AbstractC6494e.billing(fileInputStream, "Failed to close user metadata file.");
                    return ad;
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    purchase(yandex);
                    AbstractC6494e.billing(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC6494e.billing(r1, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            fileInputStream = null;
            e = e3;
        } catch (Throwable th3) {
            ?? r1 = 0;
            th = th3;
            AbstractC6494e.billing(r1, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final void yandex(String str, Map map, boolean z) {
        String jSONObject;
        BufferedWriter bufferedWriter;
        C14461e c14461e = this.ad;
        File yandex = z ? c14461e.yandex(str, "internal-keys") : c14461e.yandex(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(yandex), vip));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            AbstractC6494e.billing(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            purchase(yandex);
            AbstractC6494e.billing(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            AbstractC6494e.billing(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }
}
