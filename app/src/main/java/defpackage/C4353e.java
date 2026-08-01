package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4353e extends AbstractC6126e implements InterfaceC17303e, InterfaceC9629e, InterfaceC1683e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f9485e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C7102e f9486e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C5154e f9487e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public Map f9488e;

    public C4353e(C7102e c7102e, C11388e c11388e, C1839e c1839e, boolean z, C4988e c4988e) {
        this.f9486e = c7102e;
        this.f9485e = z;
        C5154e c5154e = new C5154e(c7102e.billing);
        m2050e(c5154e);
        this.f9487e = c5154e;
        C7102e c7102e2 = this.f9486e;
        c7102e2.getClass();
        boolean z2 = this.f9485e;
        boolean z3 = !z2;
        C2371e c2371e = c7102e2.ad;
        c2371e.getClass();
        c2371e.f5937e.setValue(new C7086e(c11388e, c1839e, z2, z3, c4988e.metrica == 4));
    }

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
        C7102e c7102e = this.f9486e;
        EnumC7792e layoutDirection = interfaceC13158e.getLayoutDirection();
        InterfaceC2141e interfaceC2141e = (InterfaceC2141e) AbstractC10432e.vip(this, AbstractC11473e.mopub);
        C2371e c2371e = c7102e.ad;
        c2371e.getClass();
        C8679e c8679e = new C8679e(interfaceC13158e, layoutDirection, interfaceC2141e, j);
        c2371e.f5935e.setValue(c8679e);
        C7086e c7086e = (C7086e) c2371e.f5937e.getValue();
        if (c7086e == null) {
            AbstractC8889e.license("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            throw new C14803e(9);
        }
        C12476e metrica = c2371e.metrica(c7086e, c8679e);
        long j2 = metrica.metrica;
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        AbstractC2832e admob = interfaceC16719e.admob(AbstractC15118e.license(i, i, i2, i2));
        this.f9486e.purchase.setValue(new C15765e(this.f9485e ? interfaceC13158e.mo496final(AbstractC7861e.billing(metrica.vip.vip(0))) : 0));
        Map map = this.f9488e;
        if (map == null) {
            map = new LinkedHashMap(2);
        }
        map.put(AbstractC14806e.ad, Integer.valueOf(Math.round(metrica.license)));
        map.put(AbstractC14806e.vip, Integer.valueOf(Math.round(metrica.appmetrica)));
        this.f9488e = map;
        return interfaceC13158e.ads(i, i2, map, new C4889e(admob, 16));
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC9629e
    /* renamed from: try */
    public final void mo721try(InterfaceC0043e interfaceC0043e) {
        this.f9486e.metrica.setValue(interfaceC0043e);
    }
}
