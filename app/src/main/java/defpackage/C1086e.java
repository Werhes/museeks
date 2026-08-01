package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1086e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3612e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f3613e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ Object f3614e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f3615e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f3616e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1086e(int i, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f3612e = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1086e(C4993e c4993e, int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3612e = 2;
        this.f3613e = c4993e;
        this.f3615e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1086e(C11268e c11268e, int i, AbstractC16049e abstractC16049e, int i2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3612e = 5;
        this.f3613e = c11268e;
        this.f3616e = i;
        this.f3614e = abstractC16049e;
        this.f3615e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1086e(AbstractC12260e abstractC12260e, Context context, int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3612e = 1;
        this.f3613e = abstractC12260e;
        this.f3614e = context;
        this.f3615e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1086e(Object obj, int i, Object obj2, InterfaceC5083e interfaceC5083e, int i2) {
        super(2, interfaceC5083e);
        this.f3612e = i2;
        this.f3613e = obj;
        this.f3615e = i;
        this.f3614e = obj2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f3612e) {
            case 0:
                C1086e c1086e = new C1086e(2, interfaceC5083e);
                c1086e.f3614e = obj;
                return c1086e;
            case 1:
                return new C1086e((AbstractC12260e) this.f3613e, (Context) this.f3614e, this.f3615e, interfaceC5083e);
            case 2:
                C1086e c1086e2 = new C1086e((C4993e) this.f3613e, this.f3615e, interfaceC5083e);
                c1086e2.f3614e = obj;
                return c1086e2;
            case 3:
                return new C1086e((C7838e) this.f3613e, this.f3615e, (C14609e) this.f3614e, interfaceC5083e, 3);
            case 4:
                return new C1086e((C7558e) this.f3613e, this.f3615e, (C2907e) this.f3614e, interfaceC5083e, 4);
            default:
                return new C1086e((C11268e) this.f3613e, this.f3616e, (AbstractC16049e) this.f3614e, this.f3615e, interfaceC5083e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3612e) {
            case 0:
                return ((C1086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C1086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C1086e) advert((InterfaceC5083e) obj2, (InterfaceC1719e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C1086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C1086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C1086e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0158 A[Catch: all -> 0x0137, TryCatch #0 {all -> 0x0137, blocks: (B:61:0x0131, B:63:0x0152, B:65:0x0158, B:68:0x015e, B:70:0x0170, B:73:0x0176, B:80:0x018e, B:84:0x0187, B:87:0x019f, B:106:0x0149), top: B:56:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x019c -> B:58:0x0134). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1086e.loadAd(java.lang.Object):java.lang.Object");
    }
}
