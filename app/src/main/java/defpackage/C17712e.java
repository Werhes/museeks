package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17712e extends AbstractC3698e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f34717e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f34718e;

    public /* synthetic */ C17712e(int i, Object obj) {
        this.f34718e = i;
        this.f34717e = obj;
    }

    @Override // defpackage.AbstractC3698e
    public final EnumC7792e appmetrica() {
        switch (this.f34718e) {
            case 0:
                return ((AbstractC9292e) this.f34717e).getLayoutDirection();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC5014e) this.f34717e).getLayoutDirection();
        }
    }

    @Override // defpackage.AbstractC3698e
    public final InterfaceC0043e license() {
        switch (this.f34718e) {
            case 0:
                AbstractC9292e abstractC9292e = (AbstractC9292e) this.f34717e;
                InterfaceC0043e mo1472volatile = abstractC9292e.f18514e ? null : abstractC9292e.mo1472volatile();
                if (mo1472volatile == null) {
                    abstractC9292e.mo1461continue().f27612e.vip();
                }
                return mo1472volatile;
            default:
                return (AbstractC17732e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) this.f34717e).getRoot().f27592e.appmetrica;
        }
    }

    @Override // defpackage.AbstractC3698e
    public float metrica(C9340e c9340e) {
        float intBitsToFloat;
        int firebase;
        switch (this.f34718e) {
            case 0:
                Function2 function2 = c9340e.ad;
                if (function2 != null) {
                    return ((Number) function2.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                AbstractC9292e abstractC9292e = (AbstractC9292e) this.f34717e;
                if (abstractC9292e.f18514e) {
                    return Float.NaN;
                }
                AbstractC9292e abstractC9292e2 = abstractC9292e;
                while (true) {
                    C17790e c17790e = abstractC9292e2.f18509e;
                    if (!Float.isNaN((c17790e == null || (firebase = AbstractC1660e.firebase(c9340e, (C9340e[]) c17790e.f34879e)) < 0) ? Float.NaN : ((float[]) c17790e.f34881e)[firebase])) {
                        abstractC9292e2.m2539private(abstractC9292e.mo1461continue(), c9340e);
                        InterfaceC0043e mo1472volatile = abstractC9292e2.mo1472volatile();
                        InterfaceC0043e mo1472volatile2 = abstractC9292e.mo1472volatile();
                        switch (c9340e.vip) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (mo1472volatile2.mo207class(mo1472volatile, (Float.floatToRawIntBits(r3) & 4294967295L) | (Float.floatToRawIntBits(((int) (mo1472volatile.advert() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (mo1472volatile2.mo207class(mo1472volatile, (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(((int) (mo1472volatile.advert() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    AbstractC9292e mo1466e = abstractC9292e2.mo1466e();
                    if (mo1466e == null) {
                        abstractC9292e2.m2539private(abstractC9292e.mo1461continue(), c9340e);
                        return Float.NaN;
                    }
                    abstractC9292e2 = mo1466e;
                }
                break;
            default:
                return super.metrica(c9340e);
        }
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        switch (this.f34718e) {
            case 0:
                return ((AbstractC9292e) this.f34717e).mo499package();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC5014e) this.f34717e).getDensity().mo499package();
        }
    }

    @Override // defpackage.AbstractC3698e
    public final int purchase() {
        switch (this.f34718e) {
            case 0:
                return ((AbstractC9292e) this.f34717e).mo1206break();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC5014e) this.f34717e).getRoot().f27612e.Signature.f6806e;
        }
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        switch (this.f34718e) {
            case 0:
                return ((AbstractC9292e) this.f34717e).vip();
            default:
                return ((ViewTreeObserverOnGlobalLayoutListenerC5014e) this.f34717e).getDensity().vip();
        }
    }
}
