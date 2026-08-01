package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7700e {
    public static final C2892e ad = new C2892e(-1473418022, false, new C13060e(19));
    public static C17149e vip;

    public static final Object ad(C0560e c0560e, C4576e c4576e) {
        if (!c0560e.mopub()) {
            C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(c4576e));
            c13578e.tapsense();
            c0560e.vip(ExecutorC0082e.f1248e, new C2362e(28, c13578e));
            return c13578e.signatures();
        }
        Exception startapp = c0560e.startapp();
        if (startapp != null) {
            throw startapp;
        }
        if (!c0560e.license) {
            return c0560e.adcel();
        }
        throw new CancellationException("Task " + c0560e + " was cancelled normally.");
    }

    public static final String appmetrica(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static final C17149e license() {
        C17149e c17149e = vip;
        if (c17149e != null) {
            return c17149e;
        }
        C18373e c18373e = new C18373e("Rounded.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC13069e.ad;
        C18466e c18466e = new C18466e(C3618e.vip);
        C13935e c13935e = new C13935e(20);
        c13935e.m3733extends(12.0f, 8.0f);
        c13935e.premium(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        c13935e.m3735implements(-0.9f, -2.0f, -2.0f, -2.0f);
        c13935e.m3735implements(-2.0f, 0.9f, -2.0f, 2.0f);
        c13935e.m3735implements(0.9f, 2.0f, 2.0f, 2.0f);
        c13935e.ads();
        c13935e.m3733extends(12.0f, 10.0f);
        c13935e.premium(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        c13935e.m3735implements(0.9f, 2.0f, 2.0f, 2.0f);
        c13935e.m3735implements(2.0f, -0.9f, 2.0f, -2.0f);
        c13935e.m3735implements(-0.9f, -2.0f, -2.0f, -2.0f);
        c13935e.ads();
        c13935e.m3733extends(12.0f, 16.0f);
        c13935e.premium(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        c13935e.m3735implements(0.9f, 2.0f, 2.0f, 2.0f);
        c13935e.m3735implements(2.0f, -0.9f, 2.0f, -2.0f);
        c13935e.m3735implements(-0.9f, -2.0f, -2.0f, -2.0f);
        c13935e.ads();
        C18373e.ad(c18373e, (ArrayList) c13935e.f27641e, c18466e);
        C17149e vip2 = c18373e.vip();
        vip = vip2;
        return vip2;
    }

    public static final long metrica(C4641e c4641e, C16439e c16439e) {
        Function1 function1 = c4641e.adcel;
        HashMap hashMap = c4641e.mopub;
        C13797e c13797e = (C13797e) hashMap.get(c16439e);
        if (c13797e == null) {
            c13797e = (c16439e.advert == 2 ? AbstractC0903e.vip : AbstractC0903e.ad).license(c4641e, c16439e);
            if (hashMap.size() > 4) {
                hashMap.clear();
            }
            hashMap.put(c16439e, c13797e);
        }
        int i = c13797e.ad;
        Double d = function1 != null ? (Double) function1.invoke(c16439e) : null;
        if (function1 != null && d != null) {
            i = (i & 16777215) | (AbstractC3062e.metrica((int) Math.rint(d.doubleValue() * 255), 0, 255) << 24);
        }
        return AbstractC6532e.vip(i);
    }

    public static final byte vip(char c) {
        if (c < '~') {
            return C15413e.vip[c];
        }
        return (byte) 0;
    }
}
