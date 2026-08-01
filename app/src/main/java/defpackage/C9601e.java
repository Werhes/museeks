package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٜۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9601e {
    public static final String billing;
    public static final HashMap purchase;
    public final Context ad;
    public final C4956e appmetrica;
    public final C5891e license;
    public final C15621e metrica;
    public final C17960e vip;

    static {
        HashMap hashMap = new HashMap();
        purchase = hashMap;
        AbstractC13501e.smaato(5, hashMap, "armeabi", 6, "armeabi-v7a");
        AbstractC13501e.smaato(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        billing = "Crashlytics Android SDK/20.0.4";
    }

    public C9601e(Context context, C17960e c17960e, C15621e c15621e, C5891e c5891e, C4956e c4956e) {
        this.ad = context;
        this.vip = c17960e;
        this.metrica = c15621e;
        this.license = c5891e;
        this.appmetrica = c4956e;
    }

    public static C10330e appmetrica() {
        byte b = (byte) 1;
        if (b == 1) {
            return new C10330e(0L, "0", "0");
        }
        StringBuilder sb = new StringBuilder();
        if (b == 0) {
            sb.append(" address");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, eٌؚۨ] */
    public static List license(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.appmetrica = i;
            obj.purchase = (byte) (obj.purchase | 4);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            obj.ad = max;
            byte b = (byte) (obj.purchase | 1);
            obj.purchase = b;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            obj.vip = str;
            obj.metrica = fileName;
            obj.license = j;
            obj.purchase = (byte) (b | 2);
            arrayList.add(obj.ad());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static C10216e metrica(C11467e c11467e, int i) {
        String str = (String) c11467e.f23070e;
        String str2 = (String) c11467e.f23072e;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c11467e.f23069e;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C11467e c11467e2 = (C11467e) c11467e.f23071e;
        if (i >= 8) {
            C11467e c11467e3 = c11467e2;
            while (c11467e3 != null) {
                c11467e3 = (C11467e) c11467e3.f23071e;
                i2++;
            }
        }
        int i3 = i2;
        List license = license(stackTraceElementArr, 4);
        if (license == null) {
            throw new NullPointerException("Null frames");
        }
        byte b = (byte) (0 | 1);
        C10216e c10216e = null;
        if (c11467e2 != null && i3 == 0) {
            c10216e = metrica(c11467e2, i + 1);
        }
        if (b == 1) {
            return new C10216e(str, str2, license, c10216e, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }

    public final List ad() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        C15621e c15621e = this.metrica;
        String str = c15621e.appmetrica;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = c15621e.vip;
        if (b == 3) {
            return Collections.singletonList(new C1338e(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Type inference failed for: r2v9, types: [eّٕۡ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C3876e vip(int r17) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9601e.vip(int):eٟؖؕ");
    }
}
