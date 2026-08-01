package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۥؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0682e extends C7460e implements Function0 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f2956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0682e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f2956e = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        switch (this.f2956e) {
            case 0:
                ((C11046e) this.f7266e).isPro();
                return Unit.INSTANCE;
            case 1:
                C11046e c11046e = (C11046e) this.f7266e;
                if (((C16101e) c11046e.f21898e.getValue()).ad == 39) {
                    AbstractC5336e.purchase(c11046e, null, 0, new C7195e(c11046e, (InterfaceC5083e) null, 24), 3);
                } else {
                    c11046e.isPro();
                }
                return Unit.INSTANCE;
            case 2:
                ((C11046e) this.f7266e).purchase();
                return Unit.INSTANCE;
            case 3:
                C11046e.inmobi((C11046e) this.f7266e);
                return Unit.INSTANCE;
            case 4:
                ((C10366e) this.f7266e).appmetrica.ad(new C1068e(0, C5436e.INSTANCE), new C17084e(3));
                return Unit.INSTANCE;
            default:
                ((C2243e) this.f7266e).getClass();
                C13614e appmetrica = AbstractC7291e.appmetrica((C6594e) AbstractC1831e.vip().purchase);
                return Collections.singletonList(((appmetrica == null || (list = appmetrica.vip) == null) ? 0 : list.size()) != 0 ? C16362e.INSTANCE : C13450e.INSTANCE);
        }
    }
}
