package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0251e extends AbstractC14783e {
    public final C12524e ad;

    public C0251e(C12524e c12524e) {
        c12524e.f25075e.ordinal();
        this.ad = c12524e;
    }

    public static void smaato(C12524e c12524e) {
        c12524e.f25075e.ordinal();
    }

    public final C15768e advert() {
        C12524e c12524e = this.ad;
        EnumC3021e enumC3021e = c12524e.f25072e;
        Integer num = c12524e.f25077e;
        if (enumC3021e.equals(EnumC3021e.RAW)) {
            return C15768e.ad(new byte[0]);
        }
        if (enumC3021e.equals(EnumC3021e.TINK)) {
            return AbstractC16176e.vip(num.intValue());
        }
        if (enumC3021e.equals(EnumC3021e.LEGACY) || enumC3021e.equals(EnumC3021e.CRUNCHY)) {
            return AbstractC16176e.ad(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    @Override // defpackage.AbstractC14783e
    public final AbstractC12699e metrica() {
        C12524e c12524e = this.ad;
        return new C17942e(c12524e.f25076e, c12524e.f25072e);
    }

    @Override // defpackage.AbstractC14783e
    public final Integer vip() {
        return this.ad.f25077e;
    }
}
