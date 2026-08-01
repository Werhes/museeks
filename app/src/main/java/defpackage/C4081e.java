package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4081e {
    public final Context ad;
    public final C16442e metrica = new C16442e();
    public final InterfaceC7970e vip;
    public static final Pattern license = Pattern.compile("[0-9]+s");
    public static final Charset appmetrica = Charset.forName("UTF-8");

    public C4081e(Context context, InterfaceC7970e interfaceC7970e) {
        this.ad = context;
        this.vip = interfaceC7970e;
    }

    public static URL ad(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e) {
            throw new C10877e(e.getMessage());
        }
    }

    public static C7921e appmetrica(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, appmetrica));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        C10974e c10974e = null;
        long j = 0;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str4 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        str = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        b = (byte) (b | 1);
                        j = license(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b != 1) {
                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                }
                c10974e = new C10974e(j, 0, str);
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C7921e(str3, str4, str2, c10974e, 1);
    }

    public static void billing(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.1.0");
            startapp(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static long license(String str) {
        AbstractC9528e.metrica(license.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static C10974e purchase(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, appmetrica));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        String str = null;
        long j = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                j = license(jsonReader.nextString());
                b = (byte) (b | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (b == 1) {
            return new C10974e(j, 1, str);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    public static void startapp(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void vip(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, appmetrica));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", AbstractC17861e.subscription("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? BuildConfig.FLAVOR : AbstractC17861e.Signature(", ", str)));
    }

    public static void yandex(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.1.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            startapp(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5 A[Catch: NameNotFoundException -> 0x00b9, TryCatch #0 {NameNotFoundException -> 0x00b9, blocks: (B:8:0x006c, B:10:0x007e, B:17:0x0088, B:21:0x0095, B:23:0x00a5, B:27:0x00bb, B:29:0x00c5, B:31:0x00de), top: B:7:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[Catch: NameNotFoundException -> 0x00b9, TryCatch #0 {NameNotFoundException -> 0x00b9, blocks: (B:8:0x006c, B:10:0x007e, B:17:0x0088, B:21:0x0095, B:23:0x00a5, B:27:0x00bb, B:29:0x00c5, B:31:0x00de), top: B:7:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection metrica(java.net.URL r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4081e.metrica(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
