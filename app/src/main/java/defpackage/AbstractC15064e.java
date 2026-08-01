package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15064e {
    public static final Set ad = AbstractC1660e.m664case(new String[]{"max-age", "expires", "domain", "path", "secure", "httponly", "$x-enc"});
    public static final C10445e vip = new C10445e("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");
    public static final Set metrica = AbstractC1660e.m664case(new Character[]{';', ',', '\"'});

    public static final Map ad(String str, boolean z) {
        C12150e<C6571e> startapp = AbstractC7762e.startapp(new C2167e(C10445e.ad(vip, str), new C2894e(28)), new C7317e(z, 1));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C6571e c6571e : startapp) {
            String str2 = (String) c6571e.f13543e;
            if (AbstractC6507e.pro(str2, "\"", false) && AbstractC6507e.amazon(str2, "\"", false)) {
                c6571e = new C6571e(c6571e.f13544e, AbstractC5304e.m1859final(str2));
            }
            linkedHashMap.put(c6571e.f13544e, c6571e.f13543e);
        }
        int size = linkedHashMap.size();
        if (size == 0) {
            return C9139e.f18290e;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
