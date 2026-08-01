package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8661e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17496e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ String f17497e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15876e f17498e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f17499e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8661e(AbstractC15876e abstractC15876e, String str, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f17496e = i;
        this.f17498e = abstractC15876e;
        this.f17497e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8661e(String str, AbstractC15876e abstractC15876e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f17496e = i;
        this.f17497e = str;
        this.f17498e = abstractC15876e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f17496e) {
            case 0:
                return new C8661e(this.f17497e, this.f17498e, interfaceC5083e, 0);
            case 1:
                return new C8661e(this.f17498e, this.f17497e, interfaceC5083e, 1);
            case 2:
                return new C8661e(this.f17497e, this.f17498e, interfaceC5083e, 2);
            case 3:
                return new C8661e(this.f17498e, this.f17497e, interfaceC5083e, 3);
            default:
                return new C8661e(this.f17497e, this.f17498e, interfaceC5083e, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f17496e) {
            case 0:
                return ((C8661e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C8661e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C8661e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C8661e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C8661e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8661e.loadAd(java.lang.Object):java.lang.Object");
    }
}
