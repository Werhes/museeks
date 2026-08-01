package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14734e implements InterfaceC14906e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC17426e f29157e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC16904e f29158e;

    public C14734e(AbstractC16904e abstractC16904e, EnumC17426e enumC17426e) {
        this.f29158e = abstractC16904e;
        this.f29157e = enumC17426e;
    }

    @Override // defpackage.InterfaceC14906e
    /* renamed from: class */
    public final Object mo615class(long j, long j2, InterfaceC5083e interfaceC5083e) {
        return new C11422e(this.f29157e == EnumC17426e.f34146e ? C11422e.ad(j2, 0.0f, 0.0f, 2) : C11422e.ad(j2, 0.0f, 0.0f, 1));
    }

    @Override // defpackage.InterfaceC14906e
    /* renamed from: eُٓؓ */
    public final Object mo617e(long j, InterfaceC5083e interfaceC5083e) {
        return new C11422e(0L);
    }

    @Override // defpackage.InterfaceC14906e
    /* renamed from: eؙٟ٘ */
    public final long mo619e(int i, long j, long j2) {
        if (i != 2) {
            return 0L;
        }
        if (Float.intBitsToFloat((int) (this.f29157e == EnumC17426e.f34145e ? j2 >> 32 : 4294967295L & j2)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.InterfaceC14906e
    /* renamed from: implements */
    public final long mo620implements(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        AbstractC16904e abstractC16904e = this.f29158e;
        C8331e c8331e = abstractC16904e.license;
        C8331e c8331e2 = abstractC16904e.license;
        if (Math.abs(((C2616e) c8331e.f17053e).purchase()) <= 1.0E-6d) {
            return 0L;
        }
        EnumC17426e enumC17426e = this.f29157e;
        EnumC17426e enumC17426e2 = EnumC17426e.f34145e;
        if (Math.abs(Float.intBitsToFloat((int) (enumC17426e == enumC17426e2 ? j >> 32 : j & 4294967295L))) <= 0.0f) {
            return 0L;
        }
        C14870e mopub = abstractC16904e.mopub();
        float purchase = ((C2616e) c8331e2.f17053e).purchase() * abstractC16904e.smaato();
        float f = ((mopub.vip + mopub.metrica) * (-Math.signum(((C2616e) c8331e2.f17053e).purchase()))) + purchase;
        if (((C2616e) c8331e2.f17053e).purchase() > 0.0f) {
            purchase = f;
            f = purchase;
        }
        float f2 = -abstractC16904e.mopub.appmetrica(-AbstractC3062e.vip(Float.intBitsToFloat((int) (enumC17426e == enumC17426e2 ? j >> 32 : j & 4294967295L)), purchase, f));
        float intBitsToFloat = enumC17426e == enumC17426e2 ? f2 : Float.intBitsToFloat((int) (j >> 32));
        if (enumC17426e != EnumC17426e.f34146e) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }
}
