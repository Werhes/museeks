package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ۠ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15769e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31054e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C15860e f31055e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f31056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15769e(C15860e c15860e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f31054e = i;
        this.f31055e = c15860e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f31054e) {
            case 0:
                return new C15769e(this.f31055e, interfaceC5083e, 0);
            case 1:
                return new C15769e(this.f31055e, interfaceC5083e, 1);
            default:
                return new C15769e(this.f31055e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31054e) {
            case 0:
                long j = ((C2152e) obj).ad;
                return new C15769e(this.f31055e, (InterfaceC5083e) obj2, 0).loadAd(Unit.INSTANCE);
            case 1:
                return ((C15769e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C15769e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x02cc  */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r47) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15769e.loadAd(java.lang.Object):java.lang.Object");
    }
}
