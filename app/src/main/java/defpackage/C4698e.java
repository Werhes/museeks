package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4698e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C18399e c18399e = (C18399e) obj;
        c17790e.m4424case(c18399e.ad());
        int i = c18399e.f36075e;
        C14808e c14808e = AbstractC11069e.billing;
        if (i != 0) {
            c14808e.adcel(c17790e, 2, Integer.valueOf(i));
        }
        int i2 = c18399e.f36076e;
        if (i2 != 0) {
            c14808e.adcel(c17790e, 1, Integer.valueOf(i2));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        int i = 0;
        int i2 = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C18399e(i, i2, c17546e.appmetrica(license));
            }
            C14808e c14808e = AbstractC11069e.billing;
            if (billing == 1) {
                c14808e.getClass();
                i = c17546e.amazon();
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                c14808e.getClass();
                i2 = c17546e.amazon();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C18399e c18399e = (C18399e) obj;
        int license = c18399e.ad().license();
        int i = c18399e.f36076e;
        C14808e c14808e = AbstractC11069e.billing;
        if (i != 0) {
            license = AbstractC8647e.signatures(i, c14808e, 1, license);
        }
        int i2 = c18399e.f36075e;
        return i2 != 0 ? AbstractC8647e.signatures(i2, c14808e, 2, license) : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C18399e c18399e = (C18399e) obj;
        int i = c18399e.f36076e;
        C14808e c14808e = AbstractC11069e.billing;
        if (i != 0) {
            c14808e.startapp(c0444e, 1, Integer.valueOf(i));
        }
        int i2 = c18399e.f36075e;
        if (i2 != 0) {
            c14808e.startapp(c0444e, 2, Integer.valueOf(i2));
        }
        c0444e.m356try(c18399e.ad());
    }
}
