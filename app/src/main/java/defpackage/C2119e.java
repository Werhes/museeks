package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۜۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2119e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f5473e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f5474e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f5475e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f5476e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f5477e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f5478e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2119e(C7576e c7576e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f5473e = 1;
        this.f5474e = c7576e;
        this.f5477e = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2119e(ClassLoader classLoader, String str, C5033e c5033e, C12856e c12856e, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f5473e = 2;
        this.f5477e = classLoader;
        this.f5475e = str;
        this.f5476e = c5033e;
        this.f5474e = c12856e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2119e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(1, interfaceC5083e);
        this.f5473e = i;
        this.f5476e = obj;
        this.f5474e = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f5473e) {
            case 0:
                return ((C2119e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C2119e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C2119e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C2119e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2119e.loadAd(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f5473e) {
            case 0:
                return new C2119e((C7488e) this.f5476e, (AbstractC16824e) this.f5474e, interfaceC5083e, 0);
            case 1:
                return new C2119e((C7576e) this.f5474e, (Function2) this.f5477e, interfaceC5083e);
            case 2:
                return new C2119e((ClassLoader) this.f5477e, (String) this.f5475e, (C5033e) this.f5476e, (C12856e) this.f5474e, interfaceC5083e);
            default:
                return new C2119e((C7157e) this.f5476e, this.f5474e, interfaceC5083e, 3);
        }
    }
}
