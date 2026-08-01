package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13750e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f27235e = 0;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5881e f27236e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f27237e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ Object f27238e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C4246e f27239e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C4246e f27240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13750e(C4246e c4246e, AbstractC5881e abstractC5881e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27239e = c4246e;
        this.f27236e = abstractC5881e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13750e(AbstractC5881e abstractC5881e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27236e = abstractC5881e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f27235e) {
            case 0:
                C13750e c13750e = new C13750e(this.f27239e, this.f27236e, interfaceC5083e);
                c13750e.f27238e = obj;
                return c13750e;
            default:
                C13750e c13750e2 = new C13750e(this.f27236e, interfaceC5083e);
                c13750e2.f27238e = obj;
                return c13750e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27235e) {
            case 0:
                return ((C13750e) advert((InterfaceC5083e) obj2, (Function1) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C13750e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|23|(1:43)|25|26|27|(2:33|(2:35|(1:37)))(2:29|(2:31|32))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:27:0x00b0, B:29:0x00b6, B:33:0x00c8, B:35:0x00cc), top: B:26:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:27:0x00b0, B:29:0x00b6, B:33:0x00c8, B:35:0x00cc), top: B:26:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARN: Type inference failed for: r0v24, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0087 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c3 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ca -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d7 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e5 -> B:9:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x013b -> B:61:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0140 -> B:62:0x0141). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13750e.loadAd(java.lang.Object):java.lang.Object");
    }
}
