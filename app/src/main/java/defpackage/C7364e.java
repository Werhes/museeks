package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٟۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7364e implements InterfaceC7004e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C7364e f15094e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C7364e f15095e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C7364e f15096e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static volatile C0409e f15097e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Object f15098e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f15099e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15100e;

    static {
        int i = 0;
        f15095e = new C7364e("ENABLED", i);
        f15096e = new C7364e("DISABLED", i);
        f15094e = new C7364e("DESTROYED", i);
    }

    public C7364e(Context context, C13871e c13871e) {
        this.f15100e = 1;
        this.f15099e = c13871e.tapsense() ? AbstractC5594e.vip(context, c13871e.signatures()) : c13871e.signatures();
    }

    public C7364e(String str) {
        this.f15100e = 3;
        str.getClass();
        this.f15099e = str;
    }

    public /* synthetic */ C7364e(String str, int i) {
        this.f15100e = i;
        this.f15099e = str;
    }

    public C7364e(String str, C13023e c13023e) {
        this.f15100e = 2;
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f15099e = str;
    }

    public static HashMap metrica(C6708e c6708e) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", c6708e.yandex);
        hashMap.put("display_version", c6708e.billing);
        hashMap.put("source", Integer.toString(c6708e.startapp));
        String str = c6708e.purchase;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static CharSequence purchase(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static void vip(C18478e c18478e, C6708e c6708e) {
        String str = c6708e.ad;
        if (str != null) {
            c18478e.m4528break("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        c18478e.m4528break("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c18478e.m4528break("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.4");
        c18478e.m4528break("Accept", "application/json");
        String str2 = c6708e.vip;
        if (str2 != null) {
            c18478e.m4528break("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = c6708e.metrica;
        if (str3 != null) {
            c18478e.m4528break("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = c6708e.license;
        if (str4 != null) {
            c18478e.m4528break("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = c6708e.appmetrica.metrica().ad;
        if (str5 != null) {
            c18478e.m4528break("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public void ad(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(purchase(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f15099e);
                    sb.append(purchase(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public String appmetrica(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        ad(sb, it);
        return sb.toString();
    }

    public JSONObject license(C15525e c15525e) {
        int i = c15525e.metrica;
        C5438e c5438e = C5438e.f11671e;
        c5438e.signatures("Settings response code was: " + i);
        String str = this.f15099e;
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String str2 = "Settings request failed; (status: " + i + ") from " + str;
            if (c5438e.admob(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = c15525e.vip;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            c5438e.isVip("Failed to parse settings JSON from " + str, e);
            c5438e.isVip("Settings response " + str3, null);
            return null;
        }
    }

    public String toString() {
        switch (this.f15100e) {
            case 0:
                return this.f15099e;
            case 4:
                return this.f15099e;
            default:
                return super.toString();
        }
    }
}
