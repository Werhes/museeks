package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15984e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f31497e = 1;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ Object f31498e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ Object f31499e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object f31500e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f31501e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public /* synthetic */ Object f31502e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f31503e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f31504e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f31505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15984e(C8729e c8729e, C2347e c2347e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f31499e = c8729e;
        this.f31498e = c2347e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15984e(C12318e c12318e, Map map, C7838e c7838e, int i, C0086e c0086e, InterfaceC1686e interfaceC1686e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f31503e = c12318e;
        this.f31500e = map;
        this.f31502e = c7838e;
        this.f31504e = i;
        this.f31499e = c0086e;
        this.f31498e = interfaceC1686e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f31497e) {
            case 0:
                return new C15984e((C12318e) this.f31503e, (Map) this.f31500e, (C7838e) this.f31502e, this.f31504e, (C0086e) this.f31499e, (InterfaceC1686e) this.f31498e, interfaceC5083e);
            default:
                C15984e c15984e = new C15984e((C8729e) this.f31499e, (C2347e) this.f31498e, interfaceC5083e);
                c15984e.f31502e = obj;
                return c15984e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f31497e) {
            case 0:
                return ((C15984e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C15984e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:46:0x0036
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:11:0x0031, B:21:0x0094, B:27:0x00bd, B:32:0x00e8, B:34:0x00f8, B:55:0x004b, B:58:0x0060), top: B:4:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Type inference failed for: r10v5, types: [eٖؑۡ, eُۙۨ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f6 -> B:12:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0125 -> B:13:0x012b). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15984e.loadAd(java.lang.Object):java.lang.Object");
    }
}
