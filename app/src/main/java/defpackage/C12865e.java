package defpackage;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12865e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Closeable f25688e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public /* synthetic */ Object f25689e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f25690e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public long f25691e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ C4510e f25692e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final /* synthetic */ long f25693e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final /* synthetic */ C11380e f25694e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final /* synthetic */ C5279e f25695e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final /* synthetic */ C8823e f25696e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public InterfaceC0148e f25697e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f25698e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final /* synthetic */ C1053e f25699e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f25700e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Function3 f25701e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f25702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12865e(C4510e c4510e, C5279e c5279e, C8823e c8823e, C11380e c11380e, long j, C1053e c1053e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f25692e = c4510e;
        this.f25695e = c5279e;
        this.f25696e = c8823e;
        this.f25694e = c11380e;
        this.f25693e = j;
        this.f25699e = c1053e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C12865e c12865e = new C12865e(this.f25692e, this.f25695e, this.f25696e, this.f25694e, this.f25693e, this.f25699e, interfaceC5083e);
        c12865e.f25689e = obj;
        return c12865e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12865e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:70:0x00ab
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f A[Catch: all -> 0x01cb, ClosedChannelException -> 0x01d2, TryCatch #7 {ClosedChannelException -> 0x01d2, blocks: (B:55:0x0169, B:57:0x018f, B:58:0x0194, B:60:0x01a0, B:61:0x01a5), top: B:54:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0 A[Catch: all -> 0x01cb, ClosedChannelException -> 0x01d2, TryCatch #7 {ClosedChannelException -> 0x01d2, blocks: (B:55:0x0169, B:57:0x018f, B:58:0x0194, B:60:0x01a0, B:61:0x01a5), top: B:54:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0154 A[Catch: all -> 0x00a7, IOException -> 0x00ab, TryCatch #6 {all -> 0x00a7, blocks: (B:48:0x0099, B:63:0x0137, B:65:0x0154, B:68:0x0159, B:75:0x01ea, B:72:0x01e0), top: B:47:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159 A[Catch: all -> 0x00a7, IOException -> 0x00ab, TRY_LEAVE, TryCatch #6 {all -> 0x00a7, blocks: (B:48:0x0099, B:63:0x0137, B:65:0x0154, B:68:0x0159, B:75:0x01ea, B:72:0x01e0), top: B:47:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0266  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, eُۛۜ] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0161 -> B:50:0x00a2). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12865e.loadAd(java.lang.Object):java.lang.Object");
    }
}
