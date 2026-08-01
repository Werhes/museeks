package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17001e implements InterfaceC16282e {
    public static final C4697e ad = new C4697e(0);
    public static final C4697e vip = new C4697e(1);

    @Override // defpackage.InterfaceC16282e
    public void ad(C15816e c15816e, C11154e c11154e) {
        if (metrica()) {
            return;
        }
        c15816e.m4017final(vip());
    }

    public final void license(C15816e c15816e, Object obj, HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            InterfaceC8371e interfaceC8371e = (InterfaceC8371e) entry.getValue();
            String str = (String) entry.getKey();
            if (interfaceC8371e.vip(obj)) {
                String ad2 = interfaceC8371e.ad(obj);
                sb.append(str);
                sb.append("=");
                sb.append(ad2);
                sb.append(AbstractC16316e.vip);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        c15816e.m4022super(vip(), sb.toString());
    }

    public abstract boolean metrica();

    public abstract String vip();
}
