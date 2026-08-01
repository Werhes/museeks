package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13425e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26688e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15876e f26689e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f26690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13425e(AbstractC15876e abstractC15876e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f26688e = i;
        this.f26689e = abstractC15876e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f26688e) {
            case 0:
                C13425e c13425e = new C13425e(this.f26689e, interfaceC5083e, 0);
                c13425e.f26690e = obj;
                return c13425e;
            case 1:
                C13425e c13425e2 = new C13425e(this.f26689e, interfaceC5083e, 1);
                c13425e2.f26690e = obj;
                return c13425e2;
            default:
                C13425e c13425e3 = new C13425e(this.f26689e, interfaceC5083e, 2);
                c13425e3.f26690e = obj;
                return c13425e3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26688e) {
            case 0:
                return ((C13425e) advert((InterfaceC5083e) obj2, (C17510e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C13425e) advert((InterfaceC5083e) obj2, (C12920e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C13425e) advert((InterfaceC5083e) obj2, (C11814e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027 A[SYNTHETIC] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13425e.loadAd(java.lang.Object):java.lang.Object");
    }
}
