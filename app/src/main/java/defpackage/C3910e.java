package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3910e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8731e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C4473e f8732e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f8733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3910e(C4473e c4473e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f8731e = i;
        this.f8732e = c4473e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f8731e) {
            case 0:
                C3910e c3910e = new C3910e(this.f8732e, interfaceC5083e, 0);
                c3910e.f8733e = obj;
                return c3910e;
            default:
                C3910e c3910e2 = new C3910e(this.f8732e, interfaceC5083e, 1);
                c3910e2.f8733e = obj;
                return c3910e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C12893e c12893e = (C12893e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f8731e) {
            case 0:
                return ((C3910e) advert(interfaceC5083e, c12893e)).loadAd(Unit.INSTANCE);
            default:
                return ((C3910e) advert(interfaceC5083e, c12893e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a0  */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3910e.loadAd(java.lang.Object):java.lang.Object");
    }
}
