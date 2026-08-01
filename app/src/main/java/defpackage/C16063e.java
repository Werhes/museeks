package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16063e implements Serializable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final LinkedHashMap f31626e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C16063e f31627e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C16063e f31628e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f31629e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f31630e;

    static {
        C16063e c16063e = new C16063e("http", 80);
        f31627e = c16063e;
        C16063e c16063e2 = new C16063e("https", 443);
        f31628e = c16063e2;
        List startapp = AbstractC6874e.startapp(c16063e, c16063e2, new C16063e("ws", 80), new C16063e("wss", 443), new C16063e("socks", 1080));
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(startapp, 10));
        if (appmetrica < 16) {
            appmetrica = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
        for (Object obj : startapp) {
            linkedHashMap.put(((C16063e) obj).f31630e, obj);
        }
        f31626e = linkedHashMap;
    }

    public C16063e(String str, int i) {
        this.f31630e = str;
        this.f31629e = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.toLowerCase(charAt) != charAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16063e)) {
            return false;
        }
        C16063e c16063e = (C16063e) obj;
        return AbstractC7890e.billing(this.f31630e, c16063e.f31630e) && this.f31629e == c16063e.f31629e;
    }

    public final int hashCode() {
        return (this.f31630e.hashCode() * 31) + this.f31629e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.f31630e);
        sb.append(", defaultPort=");
        return AbstractC1786e.pro(sb, this.f31629e, ')');
    }
}
