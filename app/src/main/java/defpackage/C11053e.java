package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11053e extends C7140e implements Function1 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f21928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11053e(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f21928e = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21928e) {
            case 0:
                C8226e c8226e = (C8226e) obj;
                C4850e c4850e = (C4850e) this.f14619e;
                C11887e ad = AbstractC16082e.ad((Iterable) c4850e.ad);
                if (ad != null) {
                    c4850e.vip = new C13391e(c8226e, ad, 15);
                    Function1 function1 = ad.license;
                    if (function1 != null) {
                        function1.invoke(c8226e);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C12284e c12284e = (C12284e) this.f14619e;
                c12284e.getClass();
                AbstractC5336e.purchase(AbstractC4608e.metrica(c12284e.vip()), null, 0, new C4870e(c12284e, (C6064e) obj, null, 18), 3);
                return Unit.INSTANCE;
            case 2:
                ((C12431e) this.f14619e).license((C8201e) obj);
                return Unit.INSTANCE;
            case 3:
                Object appmetrica = ((AbstractC11424e) this.f14619e).appmetrica((InterfaceC5083e) obj);
                return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
            default:
                ((C1902e) this.f14619e).m711e(((C10120e) obj).ad);
                return Unit.INSTANCE;
        }
    }
}
