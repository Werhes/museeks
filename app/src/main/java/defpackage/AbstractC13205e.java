package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13205e {
    public static final C4861e[] ad;
    public static final Map vip;

    static {
        C4861e c4861e = new C4861e(C4861e.startapp, BuildConfig.FLAVOR);
        C0193e c0193e = C4861e.purchase;
        C4861e c4861e2 = new C4861e(c0193e, "GET");
        C4861e c4861e3 = new C4861e(c0193e, "POST");
        C0193e c0193e2 = C4861e.billing;
        C4861e c4861e4 = new C4861e(c0193e2, "/");
        C4861e c4861e5 = new C4861e(c0193e2, "/index.html");
        C0193e c0193e3 = C4861e.yandex;
        C4861e c4861e6 = new C4861e(c0193e3, "http");
        C4861e c4861e7 = new C4861e(c0193e3, "https");
        C0193e c0193e4 = C4861e.appmetrica;
        C4861e[] c4861eArr = {c4861e, c4861e2, c4861e3, c4861e4, c4861e5, c4861e6, c4861e7, new C4861e(c0193e4, "200"), new C4861e(c0193e4, "204"), new C4861e(c0193e4, "206"), new C4861e(c0193e4, "304"), new C4861e(c0193e4, "400"), new C4861e(c0193e4, "404"), new C4861e(c0193e4, "500"), new C4861e("accept-charset", BuildConfig.FLAVOR), new C4861e("accept-encoding", "gzip, deflate"), new C4861e("accept-language", BuildConfig.FLAVOR), new C4861e("accept-ranges", BuildConfig.FLAVOR), new C4861e("accept", BuildConfig.FLAVOR), new C4861e("access-control-allow-origin", BuildConfig.FLAVOR), new C4861e("age", BuildConfig.FLAVOR), new C4861e("allow", BuildConfig.FLAVOR), new C4861e("authorization", BuildConfig.FLAVOR), new C4861e("cache-control", BuildConfig.FLAVOR), new C4861e("content-disposition", BuildConfig.FLAVOR), new C4861e("content-encoding", BuildConfig.FLAVOR), new C4861e("content-language", BuildConfig.FLAVOR), new C4861e("content-length", BuildConfig.FLAVOR), new C4861e("content-location", BuildConfig.FLAVOR), new C4861e("content-range", BuildConfig.FLAVOR), new C4861e("content-type", BuildConfig.FLAVOR), new C4861e("cookie", BuildConfig.FLAVOR), new C4861e("date", BuildConfig.FLAVOR), new C4861e("etag", BuildConfig.FLAVOR), new C4861e("expect", BuildConfig.FLAVOR), new C4861e("expires", BuildConfig.FLAVOR), new C4861e("from", BuildConfig.FLAVOR), new C4861e("host", BuildConfig.FLAVOR), new C4861e("if-match", BuildConfig.FLAVOR), new C4861e("if-modified-since", BuildConfig.FLAVOR), new C4861e("if-none-match", BuildConfig.FLAVOR), new C4861e("if-range", BuildConfig.FLAVOR), new C4861e("if-unmodified-since", BuildConfig.FLAVOR), new C4861e("last-modified", BuildConfig.FLAVOR), new C4861e("link", BuildConfig.FLAVOR), new C4861e("location", BuildConfig.FLAVOR), new C4861e("max-forwards", BuildConfig.FLAVOR), new C4861e("proxy-authenticate", BuildConfig.FLAVOR), new C4861e("proxy-authorization", BuildConfig.FLAVOR), new C4861e("range", BuildConfig.FLAVOR), new C4861e("referer", BuildConfig.FLAVOR), new C4861e("refresh", BuildConfig.FLAVOR), new C4861e("retry-after", BuildConfig.FLAVOR), new C4861e("server", BuildConfig.FLAVOR), new C4861e("set-cookie", BuildConfig.FLAVOR), new C4861e("strict-transport-security", BuildConfig.FLAVOR), new C4861e("transfer-encoding", BuildConfig.FLAVOR), new C4861e("user-agent", BuildConfig.FLAVOR), new C4861e("vary", BuildConfig.FLAVOR), new C4861e("via", BuildConfig.FLAVOR), new C4861e("www-authenticate", BuildConfig.FLAVOR)};
        ad = c4861eArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(c4861eArr[i].ad)) {
                linkedHashMap.put(c4861eArr[i].ad, Integer.valueOf(i));
            }
        }
        vip = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static void ad(C0193e c0193e) {
        int license = c0193e.license();
        for (int i = 0; i < license; i++) {
            byte startapp = c0193e.startapp(i);
            if (65 <= startapp && startapp < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0193e.remoteconfig()));
            }
        }
    }
}
