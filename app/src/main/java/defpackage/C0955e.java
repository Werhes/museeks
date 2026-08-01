package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C6007e c6007e = (C6007e) obj;
        c17790e.m4424case(c6007e.ad());
        String str = c6007e.f12656e;
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        AbstractC11069e.Signature.adcel(c17790e, 1, str);
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        String str = BuildConfig.FLAVOR;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C6007e(c17546e.appmetrica(license), str);
            }
            if (billing == 1) {
                AbstractC11069e.Signature.getClass();
                str = c17546e.advert();
            } else {
                c17546e.smaato(billing);
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C6007e c6007e = (C6007e) obj;
        int license = c6007e.ad().license();
        String str = c6007e.f12656e;
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? AbstractC11069e.Signature.advert(1, str) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C6007e c6007e = (C6007e) obj;
        String str = c6007e.f12656e;
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.startapp(c0444e, 1, str);
        }
        c0444e.m356try(c6007e.ad());
    }
}
