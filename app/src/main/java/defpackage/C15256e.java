package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15256e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30190e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15256e(int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f30190e = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f30190e) {
            case 0:
                long j = ((C2152e) obj2).ad;
                new C15256e(3, 0, (InterfaceC5083e) obj3);
                Unit unit = Unit.INSTANCE;
                AbstractC2003e.purchase(unit);
                return unit;
            case 1:
                ((Number) obj2).floatValue();
                new C15256e(3, 1, (InterfaceC5083e) obj3);
                Unit unit2 = Unit.INSTANCE;
                AbstractC2003e.purchase(unit2);
                return unit2;
            default:
                long j2 = ((C2152e) obj2).ad;
                new C15256e(3, 2, (InterfaceC5083e) obj3);
                Unit unit3 = Unit.INSTANCE;
                AbstractC2003e.purchase(unit3);
                return unit3;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f30190e) {
            case 0:
                AbstractC2003e.purchase(obj);
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                return Unit.INSTANCE;
        }
    }
}
