package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2394e implements Comparable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C2394e f6113e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C2394e f6114e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C2394e f6115e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C2394e f6116e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C2394e f6117e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C2394e f6118e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C2394e f6119e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C2394e f6120e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C2394e f6121e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C2394e f6122e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C2394e f6123e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C2394e f6124e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f6125e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f6126e;

    static {
        C2394e c2394e = new C2394e(100, "Continue");
        C2394e c2394e2 = new C2394e(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "Switching Protocols");
        C2394e c2394e3 = new C2394e(102, "Processing");
        C2394e c2394e4 = new C2394e(200, "OK");
        f6116e = c2394e4;
        C2394e c2394e5 = new C2394e(201, "Created");
        C2394e c2394e6 = new C2394e(202, "Accepted");
        C2394e c2394e7 = new C2394e(203, "Non-Authoritative Information");
        C2394e c2394e8 = new C2394e(204, "No Content");
        C2394e c2394e9 = new C2394e(205, "Reset Content");
        C2394e c2394e10 = new C2394e(206, "Partial Content");
        C2394e c2394e11 = new C2394e(207, "Multi-Status");
        C2394e c2394e12 = new C2394e(300, "Multiple Choices");
        C2394e c2394e13 = new C2394e(301, "Moved Permanently");
        C2394e c2394e14 = new C2394e(302, "Found");
        f6121e = c2394e14;
        C2394e c2394e15 = new C2394e(303, "See Other");
        C2394e c2394e16 = new C2394e(304, "Not Modified");
        C2394e c2394e17 = new C2394e(305, "Use Proxy");
        C2394e c2394e18 = new C2394e(306, "Switch Proxy");
        C2394e c2394e19 = new C2394e(307, "Temporary Redirect");
        C2394e c2394e20 = new C2394e(308, "Permanent Redirect");
        C2394e c2394e21 = new C2394e(400, "Bad Request");
        f6113e = c2394e21;
        C2394e c2394e22 = new C2394e(401, "Unauthorized");
        f6124e = c2394e22;
        C2394e c2394e23 = new C2394e(402, "Payment Required");
        C2394e c2394e24 = new C2394e(403, "Forbidden");
        C2394e c2394e25 = new C2394e(404, "Not Found");
        f6123e = c2394e25;
        C2394e c2394e26 = new C2394e(405, "Method Not Allowed");
        f6119e = c2394e26;
        C2394e c2394e27 = new C2394e(406, "Not Acceptable");
        f6122e = c2394e27;
        C2394e c2394e28 = new C2394e(407, "Proxy Authentication Required");
        C2394e c2394e29 = new C2394e(408, "Request Timeout");
        C2394e c2394e30 = new C2394e(409, "Conflict");
        C2394e c2394e31 = new C2394e(410, "Gone");
        f6117e = c2394e31;
        C2394e c2394e32 = new C2394e(411, "Length Required");
        C2394e c2394e33 = new C2394e(412, "Precondition Failed");
        C2394e c2394e34 = new C2394e(413, "Payload Too Large");
        C2394e c2394e35 = new C2394e(414, "Request-URI Too Long");
        C2394e c2394e36 = new C2394e(415, "Unsupported Media Type");
        f6120e = c2394e36;
        C2394e c2394e37 = new C2394e(416, "Requested Range Not Satisfiable");
        C2394e c2394e38 = new C2394e(417, "Expectation Failed");
        f6115e = c2394e38;
        C2394e c2394e39 = new C2394e(422, "Unprocessable Entity");
        C2394e c2394e40 = new C2394e(423, "Locked");
        C2394e c2394e41 = new C2394e(424, "Failed Dependency");
        C2394e c2394e42 = new C2394e(425, "Too Early");
        C2394e c2394e43 = new C2394e(426, "Upgrade Required");
        C2394e c2394e44 = new C2394e(429, "Too Many Requests");
        C2394e c2394e45 = new C2394e(431, "Request Header Fields Too Large");
        C2394e c2394e46 = new C2394e(500, "Internal Server Error");
        f6114e = c2394e46;
        C2394e c2394e47 = new C2394e(501, "Not Implemented");
        C2394e c2394e48 = new C2394e(502, "Bad Gateway");
        C2394e c2394e49 = new C2394e(503, "Service Unavailable");
        C2394e c2394e50 = new C2394e(504, "Gateway Timeout");
        f6118e = c2394e50;
        List startapp = AbstractC6874e.startapp(c2394e, c2394e2, c2394e3, c2394e4, c2394e5, c2394e6, c2394e7, c2394e8, c2394e9, c2394e10, c2394e11, c2394e12, c2394e13, c2394e14, c2394e15, c2394e16, c2394e17, c2394e18, c2394e19, c2394e20, c2394e21, c2394e22, c2394e23, c2394e24, c2394e25, c2394e26, c2394e27, c2394e28, c2394e29, c2394e30, c2394e31, c2394e32, c2394e33, c2394e34, c2394e35, c2394e36, c2394e37, c2394e38, c2394e39, c2394e40, c2394e41, c2394e42, c2394e43, c2394e44, c2394e45, c2394e46, c2394e47, c2394e48, c2394e49, c2394e50, new C2394e(505, "HTTP Version Not Supported"), new C2394e(506, "Variant Also Negotiates"), new C2394e(507, "Insufficient Storage"));
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(startapp, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica >= 16 ? appmetrica : 16);
        for (Object obj : startapp) {
            linkedHashMap.put(Integer.valueOf(((C2394e) obj).f6126e), obj);
        }
    }

    public C2394e(int i, String str) {
        this.f6126e = i;
        this.f6125e = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6126e - ((C2394e) obj).f6126e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2394e) && ((C2394e) obj).f6126e == this.f6126e;
    }

    public final int hashCode() {
        return this.f6126e;
    }

    public final String toString() {
        return this.f6126e + ' ' + this.f6125e;
    }
}
