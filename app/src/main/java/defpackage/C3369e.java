package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3369e extends AbstractC11069e {
    public final C5363e signatures;

    public C3369e(InterfaceC7227e interfaceC7227e) {
        super(3, interfaceC7227e, 2, null);
        this.signatures = new C5363e(new C13564e(17));
    }

    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C15347e c15347e = (C15347e) obj;
        c17790e.m4424case(c15347e.ad());
        ((AbstractC11069e) this.signatures.getValue()).adcel(c17790e, 2, c15347e.f30270e);
        String str = c15347e.f30271e;
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        AbstractC11069e.Signature.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C15347e(str, linkedHashMap, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                AbstractC11069e.Signature.getClass();
                str = c17546e.advert();
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                linkedHashMap.putAll((Map) ((AbstractC11069e) this.signatures.getValue()).metrica(c17546e));
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C15347e c15347e = (C15347e) obj;
        int license = c15347e.ad().license();
        String str = c15347e.f30271e;
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += AbstractC11069e.Signature.advert(1, str);
        }
        return ((AbstractC11069e) this.signatures.getValue()).advert(2, c15347e.f30270e) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C15347e c15347e = (C15347e) obj;
        String str = c15347e.f30271e;
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.startapp(c0444e, 1, str);
        }
        ((AbstractC11069e) this.signatures.getValue()).startapp(c0444e, 2, c15347e.f30270e);
        c0444e.m356try(c15347e.ad());
    }
}
