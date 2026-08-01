package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٚۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18202e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f35623e = 0;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object f35624e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ float f35625e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Object f35626e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1719e f35627e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f35628e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C15096e f35629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18202e(float f, C4807e c4807e, InterfaceC1719e interfaceC1719e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f35625e = f;
        this.f35626e = c4807e;
        this.f35627e = interfaceC1719e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18202e(C9708e c9708e, float f, Function1 function1, InterfaceC1719e interfaceC1719e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f35624e = c9708e;
        this.f35625e = f;
        this.f35626e = function1;
        this.f35627e = interfaceC1719e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f35623e) {
            case 0:
                return new C18202e(this.f35625e, (C4807e) this.f35626e, this.f35627e, interfaceC5083e);
            default:
                return new C18202e((C9708e) this.f35624e, this.f35625e, (Function1) this.f35626e, this.f35627e, interfaceC5083e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f35623e) {
            case 0:
                return ((C18202e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C18202e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r1 == r10) goto L23;
     */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, eٔۦْ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, eٔۦْ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, eٔۦْ] */
    /* JADX WARN: Type inference failed for: r4v4, types: [eؖٞؕ] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18202e.loadAd(java.lang.Object):java.lang.Object");
    }
}
