package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16842e extends AbstractC15049e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f32996e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f32997e = 1;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f32998e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f32999e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f33000e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f33001e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f33002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16842e(C11353e c11353e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f33000e = c11353e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16842e(C12695e c12695e, String str, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f32998e = c12695e;
        this.f33000e = str;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f32997e) {
            case 0:
                C16842e c16842e = new C16842e((C12695e) this.f32998e, (String) this.f33000e, interfaceC5083e);
                c16842e.f33001e = obj;
                return c16842e;
            default:
                C16842e c16842e2 = new C16842e((C11353e) this.f33000e, interfaceC5083e);
                c16842e2.f33001e = obj;
                return c16842e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4300e c4300e = (C4300e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f32997e) {
            case 0:
                return ((C16842e) advert(interfaceC5083e, c4300e)).loadAd(Unit.INSTANCE);
            default:
                return ((C16842e) advert(interfaceC5083e, c4300e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r2 != (-1)) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00c6 -> B:9:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:21:0x009e). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16842e.loadAd(java.lang.Object):java.lang.Object");
    }
}
