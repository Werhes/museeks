package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18462e extends AbstractC15049e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f36180e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f36181e = 0;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f36182e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12561e f36183e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f36184e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12561e f36185e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f36186e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f36187e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18462e(C0996e c0996e, C6599e c6599e, Function2 function2, Function0 function0, C17897e c17897e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f36187e = c0996e;
        this.f36186e = c6599e;
        this.f36183e = function2;
        this.f36185e = function0;
        this.f36182e = c17897e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18462e(InterfaceC18435e interfaceC18435e, Function3 function3, Function1 function1, C14307e c14307e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f36186e = interfaceC18435e;
        this.f36183e = (AbstractC7185e) function3;
        this.f36185e = function1;
        this.f36182e = c14307e;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f36181e) {
            case 0:
                C18462e c18462e = new C18462e((C0996e) this.f36187e, (C6599e) this.f36186e, (Function2) this.f36183e, (Function0) this.f36185e, (C17897e) this.f36182e, interfaceC5083e);
                c18462e.f36180e = obj;
                return c18462e;
            default:
                C18462e c18462e2 = new C18462e((InterfaceC18435e) this.f36186e, (AbstractC7185e) this.f36183e, (Function1) this.f36185e, (C14307e) this.f36182e, interfaceC5083e);
                c18462e2.f36180e = obj;
                return c18462e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C14718e c14718e = (C14718e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f36181e) {
            case 0:
                return ((C18462e) advert(interfaceC5083e, c14718e)).loadAd(Unit.INSTANCE);
            default:
                return ((C18462e) advert(interfaceC5083e, c14718e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Type inference failed for: r7v5, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18462e.loadAd(java.lang.Object):java.lang.Object");
    }
}
