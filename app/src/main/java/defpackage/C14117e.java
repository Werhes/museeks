package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٝٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14117e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f27938e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C5933e f27939e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f27940e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f27941e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14117e(C5933e c5933e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f27938e = i;
        this.f27939e = c5933e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f27938e) {
            case 0:
                C14117e c14117e = new C14117e(this.f27939e, interfaceC5083e, 0);
                c14117e.f27940e = obj;
                return c14117e;
            default:
                C14117e c14117e2 = new C14117e(this.f27939e, interfaceC5083e, 1);
                c14117e2.f27940e = obj;
                return c14117e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27938e) {
            case 0:
                return ((C14117e) advert((InterfaceC5083e) obj2, (C5788e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C14117e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00b9 A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #4 {all -> 0x008b, blocks: (B:59:0x0087, B:61:0x00b6, B:155:0x00b9, B:158:0x00c4, B:159:0x00c9, B:163:0x0090, B:166:0x009e), top: B:19:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6 A[Catch: all -> 0x008b, TryCatch #4 {all -> 0x008b, blocks: (B:59:0x0087, B:61:0x00b6, B:155:0x00b9, B:158:0x00c4, B:159:0x00c9, B:163:0x0090, B:166:0x009e), top: B:19:0x004c }] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14117e.loadAd(java.lang.Object):java.lang.Object");
    }
}
