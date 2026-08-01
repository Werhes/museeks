package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14771e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f29213e = 1;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f29214e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f29215e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f29216e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f29217e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f29218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14771e(InterfaceC5083e interfaceC5083e, int i, int i2, String str, Function1 function1) {
        super(2, interfaceC5083e);
        this.f29217e = i;
        this.f29215e = i2;
        this.f29216e = str;
        this.f29214e = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14771e(C17399e c17399e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f29214e = c17399e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f29213e) {
            case 0:
                return new C14771e((C17399e) this.f29214e, interfaceC5083e);
            default:
                return new C14771e(interfaceC5083e, this.f29217e, this.f29215e, (String) this.f29216e, (Function1) this.f29214e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f29213e) {
            case 0:
                return ((C14771e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C14771e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0165 -> B:25:0x006d). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14771e.loadAd(java.lang.Object):java.lang.Object");
    }
}
