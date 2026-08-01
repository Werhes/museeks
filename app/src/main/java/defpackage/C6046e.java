package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۥۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6046e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f12711e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ Object f12712e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object f12713e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f12714e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Object f12715e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f12716e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f12717e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f12718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6046e(C2347e c2347e, String str, int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f12711e = 2;
        this.f12715e = c2347e;
        this.f12712e = str;
        this.f12717e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6046e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f12711e = i;
        this.f12715e = obj;
        this.f12712e = obj2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f12711e) {
            case 0:
                return new C6046e((AbstractC9512e) this.f12715e, (String) this.f12712e, interfaceC5083e, 0);
            case 1:
                C6046e c6046e = new C6046e((C0086e) this.f12715e, (InterfaceC1686e) this.f12712e, interfaceC5083e, 1);
                c6046e.f12714e = obj;
                return c6046e;
            default:
                C6046e c6046e2 = new C6046e((C2347e) this.f12715e, (String) this.f12712e, this.f12717e, interfaceC5083e);
                c6046e2.f12713e = obj;
                return c6046e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f12711e) {
            case 0:
                return ((C6046e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C6046e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C6046e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0182  */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6046e.loadAd(java.lang.Object):java.lang.Object");
    }
}
