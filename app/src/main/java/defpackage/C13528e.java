package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ۟ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13528e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26816e = 0;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f26817e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f26818e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ int f26819e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f26820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13528e(int i, InterfaceC5083e interfaceC5083e, List list) {
        super(3, interfaceC5083e);
        this.f26818e = list;
        this.f26819e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13528e(C9272e c9272e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f26818e = c9272e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f26816e) {
            case 0:
                List list = (List) this.f26818e;
                C13528e c13528e = new C13528e(this.f26819e, (InterfaceC5083e) obj3, list);
                c13528e.f26817e = (AbstractC11424e) obj;
                return c13528e.loadAd(Unit.INSTANCE);
            default:
                int intValue = ((Number) obj2).intValue();
                C13528e c13528e2 = new C13528e((C9272e) this.f26818e, (InterfaceC5083e) obj3);
                c13528e2.f26817e = (InterfaceC6034e) obj;
                c13528e2.f26819e = intValue;
                return c13528e2.loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13528e.loadAd(java.lang.Object):java.lang.Object");
    }
}
