package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۦٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18137e extends AbstractC13616e implements InterfaceC1683e, InterfaceC17303e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public LinkedHashMap f35550e;

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        float f = ((C15765e) AbstractC10432e.vip(this, AbstractC7562e.metrica)).f31051e;
        float f2 = 0;
        if (f < f2) {
            f = f2;
        }
        AbstractC2832e admob = interfaceC16719e.admob(j);
        boolean z = this.f27016e && !Float.isNaN(f) && C15765e.ad(f, f2) > 0;
        int mo493e = !Float.isNaN(f) ? interfaceC13158e.mo493e(f) : 0;
        int max = z ? Math.max(admob.f6806e, mo493e) : admob.f6806e;
        int max2 = z ? Math.max(admob.f6804e, mo493e) : admob.f6804e;
        if (z) {
            LinkedHashMap linkedHashMap = this.f35550e;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f35550e = linkedHashMap;
            }
            C12800e c12800e = AbstractC7562e.vip;
            int round = Math.round((mo493e - admob.f6806e) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(c12800e, Integer.valueOf(round));
            C4782e c4782e = AbstractC7562e.ad;
            int round2 = Math.round((mo493e - admob.f6804e) / 2.0f);
            linkedHashMap.put(c4782e, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map map = this.f35550e;
        if (map == null) {
            map = C9139e.f18290e;
        }
        return interfaceC13158e.ads(max, max2, map, new C7727e(max, admob, max2, 1));
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }
}
