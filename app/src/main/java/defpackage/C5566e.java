package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5566e extends C4662e {
    public final /* synthetic */ C10961e billing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5566e(C10961e c10961e) {
        super(20);
        this.billing = c10961e;
    }

    @Override // defpackage.C4662e
    public final Object ad(Object obj) {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        AbstractC9528e.purchase(str);
        C10961e c10961e = this.billing;
        c10961e.m613e();
        AbstractC9528e.purchase(str);
        C1248e c1248e = c10961e.f19060e.f30353e;
        C15398e.m3939break(c1248e);
        C0912e m531e = c1248e.m531e(str);
        if (m531e == null) {
            return null;
        }
        C13879e c13879e = ((C6936e) c10961e.f36443e).f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27497e.vip(str, "Populate EES config from database on cache miss. appId");
        c10961e.m2954e(str, c10961e.m2963e(str, (byte[]) m531e.f3332e));
        C5566e c5566e = c10961e.f21707e;
        synchronized (c5566e.metrica) {
            linkedHashMap = new LinkedHashMap(c5566e.vip.ad.entrySet().size());
            for (Map.Entry entry : c5566e.vip.ad.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (C9963e) linkedHashMap.get(str);
    }
}
