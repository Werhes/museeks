package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۥٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18486e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7765e f36249e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36250e;

    public /* synthetic */ C18486e(C7765e c7765e, int i) {
        this.f36250e = i;
        this.f36249e = c7765e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC0043e admob;
        C0763e c0763e;
        switch (this.f36250e) {
            case 0:
                return this.f36249e.Signature(true, false);
            case 1:
                return this.f36249e.Signature(false, false);
            case 2:
                return Boolean.valueOf(this.f36249e.adcel(false).ad);
            case 3:
                C7765e c7765e = this.f36249e;
                C0576e c0576e = c7765e.pro;
                C11388e c11388e = c7765e.ad;
                boolean license = C12347e.license(c11388e.license().f33324e);
                if (((license && ((EnumC5022e) c0576e.getValue()) == EnumC5022e.f10705e) || (!license && ((EnumC5022e) c0576e.getValue()) == EnumC5022e.f10704e)) && c7765e.advert() == null && ((Boolean) c7765e.advert.getValue()).booleanValue() && (admob = c7765e.admob()) != null) {
                    C0763e startapp = AbstractC14520e.startapp(admob);
                    C0763e billing = AbstractC18489e.billing(admob.mo211this(startapp.yandex()), startapp.billing());
                    InterfaceC0043e admob2 = c7765e.admob();
                    if (admob2 == null) {
                        AbstractC8889e.license("textLayoutCoordinates should not be null.");
                        throw new C14803e(9);
                    }
                    if (C12347e.license(c11388e.license().f33324e)) {
                        C0763e mopub = c7765e.mopub();
                        c0763e = AbstractC18489e.billing(admob2.mo211this(mopub.yandex()), mopub.billing());
                    } else {
                        long mo211this = admob2.mo211this(c7765e.loadAd(true));
                        long mo211this2 = admob2.mo211this(c7765e.loadAd(false));
                        if (c7765e.vip.metrica() == null) {
                            c0763e = C0763e.appmetrica;
                        } else {
                            float intBitsToFloat = Float.intBitsToFloat((int) (admob2.mo211this((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r1.metrica((int) (r5 >> 32)).vip) & 4294967295L)) & 4294967295L));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (admob2.mo211this((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r1.metrica((int) (r5 & 4294967295L)).vip) & 4294967295L)) & 4294967295L));
                            int i = (int) (mo211this >> 32);
                            int i2 = (int) (mo211this2 >> 32);
                            c0763e = new C0763e(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.min(intBitsToFloat, intBitsToFloat2), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat((int) (mo211this & 4294967295L)), Float.intBitsToFloat((int) (mo211this2 & 4294967295L))));
                        }
                    }
                    if (c0763e.advert(billing)) {
                        return c0763e.adcel(billing);
                    }
                }
                return null;
            case 4:
                return (C0763e) this.f36249e.isPro.getValue();
            case 5:
                return this.f36249e.ad.license();
            case 6:
                this.f36249e.license();
                return Unit.INSTANCE;
            case 7:
                return Boolean.valueOf(!((Boolean) this.f36249e.signatures.getValue()).booleanValue());
            case 8:
                C11388e c11388e2 = this.f36249e.ad;
                C12380e c12380e = c11388e2.ad;
                InterfaceC12006e interfaceC12006e = c11388e2.vip;
                c12380e.vip.ad().admob();
                C2573e c2573e = c12380e.vip;
                AbstractC16377e.startapp(c2573e, 0, c2573e.f6429e.length());
                C12380e.ad(c12380e, interfaceC12006e, true, 1);
                c12380e.license(true);
                return Unit.INSTANCE;
            default:
                Function0 function0 = this.f36249e.smaato;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
