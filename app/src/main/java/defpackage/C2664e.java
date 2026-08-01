package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2664e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f6530e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C10620e f6531e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f6532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2664e(C10620e c10620e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f6530e = i;
        this.f6531e = c10620e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f6530e) {
            case 0:
                return new C2664e(this.f6531e, interfaceC5083e, 0);
            case 1:
                return new C2664e(this.f6531e, interfaceC5083e, 1);
            case 2:
                return new C2664e(this.f6531e, interfaceC5083e, 2);
            default:
                return new C2664e(this.f6531e, interfaceC5083e, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f6530e) {
            case 0:
                return ((C2664e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C2664e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C2664e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C2664e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ff, code lost:
    
        if (r5 == r1) goto L67;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2664e.loadAd(java.lang.Object):java.lang.Object");
    }
}
