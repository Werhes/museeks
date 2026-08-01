package defpackage;

import android.os.CancellationSignal;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ۠ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15018e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f29762e = 1;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public Map f29763e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public Iterator f29764e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public String f29765e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public Object f29766e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public String f29767e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public Object f29768e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f29769e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f29770e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f29771e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Map f29772e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Object f29773e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f29774e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f29775e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public Object f29776e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final /* synthetic */ Object f29777e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f29778e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f29779e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C3967e f29780e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C2697e f29781e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public Object f29782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15018e(C4381e c4381e, C12024e c12024e, String str, File file, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f29775e = c4381e;
        this.f29777e = c12024e;
        this.f29779e = str;
        this.f29774e = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15018e(Function2 function2, String str, CancellationSignal cancellationSignal, C10675e c10675e, C10675e c10675e2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f29779e = function2;
        this.f29767e = str;
        this.f29774e = cancellationSignal;
        this.f29775e = c10675e;
        this.f29777e = c10675e2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f29762e) {
            case 0:
                C15018e c15018e = new C15018e((Function2) this.f29779e, this.f29767e, (CancellationSignal) this.f29774e, (C10675e) this.f29775e, (C10675e) this.f29777e, interfaceC5083e);
                c15018e.f29773e = obj;
                return c15018e;
            default:
                C15018e c15018e2 = new C15018e((C4381e) this.f29775e, (C12024e) this.f29777e, (String) this.f29779e, (File) this.f29774e, interfaceC5083e);
                c15018e2.f29766e = obj;
                return c15018e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f29762e) {
            case 0:
                return ((C15018e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C15018e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0387, code lost:
    
        if (r3 == r5) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0370, code lost:
    
        if (defpackage.AbstractC5336e.advert(r1, r4, r30) == r5) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e7, code lost:
    
        if (r3 == r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0554, code lost:
    
        if (defpackage.AbstractC5336e.advert(r1, r5, r30) == r5) goto L116;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x0279. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x024e A[LOOP:0: B:10:0x0248->B:12:0x024e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d5  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [eؚؖٞ] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r13v26, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v23, types: [eِٜؒ] */
    /* JADX WARN: Type inference failed for: r19v8, types: [eؓۢۡ] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eؚؖٞ] */
    /* JADX WARN: Type inference failed for: r6v37, types: [eِٜؒ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0240 -> B:9:0x0242). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x016b -> B:34:0x0177). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x040d -> B:88:0x0416). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15018e.loadAd(java.lang.Object):java.lang.Object");
    }
}
