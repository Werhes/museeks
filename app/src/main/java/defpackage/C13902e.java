package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13902e extends AbstractC14773e {
    public C13902e(AbstractC10226e abstractC10226e, AbstractC10226e abstractC10226e2, int i) {
        super(abstractC10226e, abstractC10226e2);
        InterfaceC9853e.ad.vip(abstractC10226e, abstractC10226e2);
    }

    public static final ArrayList ads(C8746e c8746e, AbstractC1186e abstractC1186e) {
        List<AbstractC16232e> mopub = abstractC1186e.mopub();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mopub, 10));
        for (AbstractC16232e abstractC16232e : mopub) {
            StringBuilder sb = new StringBuilder();
            AbstractC13480e.m3610while(Collections.singletonList(abstractC16232e), sb, ", ", null, null, new C7007e(c8746e, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String premium(String str, String str2) {
        if (!AbstractC5304e.isPro(str, '<')) {
            return str;
        }
        return AbstractC5304e.m1857else(str, '<') + '<' + str2 + '>' + AbstractC5304e.m1876synchronized('>', str, str);
    }

    @Override // defpackage.AbstractC1186e
    /* renamed from: admob */
    public final AbstractC1186e signatures(C13520e c13520e) {
        return new AbstractC14773e(this.f29222e, this.f29221e);
    }

    @Override // defpackage.AbstractC14773e
    public final String applovin(C8746e c8746e, C8746e c8746e2) {
        AbstractC10226e abstractC10226e = this.f29222e;
        String m2481final = c8746e.m2481final(abstractC10226e);
        AbstractC10226e abstractC10226e2 = this.f29221e;
        String m2481final2 = c8746e.m2481final(abstractC10226e2);
        if (c8746e2.ad.amazon()) {
            return "raw (" + m2481final + ".." + m2481final2 + ')';
        }
        if (abstractC10226e2.mopub().isEmpty()) {
            return c8746e.firebase(m2481final, m2481final2, loadAd().amazon());
        }
        ArrayList ads = ads(c8746e, abstractC10226e);
        ArrayList ads2 = ads(c8746e, abstractC10226e2);
        String m3608try = AbstractC13480e.m3608try(ads, ", ", null, null, C8865e.f17817e, 30);
        ArrayList m3579e = AbstractC13480e.m3579e(ads2, ads);
        if (!m3579e.isEmpty()) {
            Iterator it = m3579e.iterator();
            while (it.hasNext()) {
                C6571e c6571e = (C6571e) it.next();
                String str = (String) c6571e.f13544e;
                String str2 = (String) c6571e.f13543e;
                if (!AbstractC7890e.billing(str, AbstractC5304e.m1852case(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        }
        m2481final2 = premium(m2481final2, m3608try);
        String premium = premium(m2481final, m3608try);
        return AbstractC7890e.billing(premium, m2481final2) ? premium : c8746e.firebase(premium, m2481final2, loadAd().amazon());
    }

    @Override // defpackage.AbstractC14773e, defpackage.AbstractC1186e
    /* renamed from: eؗٔٓ */
    public final InterfaceC8528e mo483e() {
        InterfaceC4077e advert = loadAd().advert();
        InterfaceC5052e interfaceC5052e = advert instanceof InterfaceC5052e ? (InterfaceC5052e) advert : null;
        if (interfaceC5052e != null) {
            return interfaceC5052e.mo1721e(new C13714e());
        }
        throw new IllegalStateException(("Incorrect classifier: " + loadAd().advert()).toString());
    }

    @Override // defpackage.AbstractC14773e
    public final AbstractC10226e isPro() {
        return this.f29222e;
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e isVip(C6557e c6557e) {
        return new C13902e(this.f29222e.isVip(c6557e), this.f29221e.isVip(c6557e), 0);
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e pro(boolean z) {
        return new C13902e(this.f29222e.pro(z), this.f29221e.pro(z), 0);
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e signatures(C13520e c13520e) {
        return new AbstractC14773e(this.f29222e, this.f29221e);
    }
}
