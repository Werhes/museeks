package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9409e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f18720e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7185e f18721e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f18722e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C4070e f18723e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ Object f18724e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Throwable f18725e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C6799e f18726e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9409e(Function2 function2, C4070e c4070e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f18720e = i;
        switch (i) {
            case 1:
                this.f18721e = (AbstractC7185e) function2;
                this.f18723e = c4070e;
                super(2, interfaceC5083e);
                return;
            default:
                this.f18721e = (AbstractC7185e) function2;
                this.f18723e = c4070e;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f18720e) {
            case 0:
                C9409e c9409e = new C9409e(this.f18721e, this.f18723e, interfaceC5083e, 0);
                c9409e.f18724e = obj;
                return c9409e;
            default:
                C9409e c9409e2 = new C9409e(this.f18721e, this.f18723e, interfaceC5083e, 1);
                c9409e2.f18724e = obj;
                return c9409e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f18720e) {
            case 0:
                return ((C9409e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C9409e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #7 {all -> 0x004c, blocks: (B:36:0x0048, B:37:0x007a, B:39:0x008b), top: B:35:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v7, types: [eۡۦ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9409e.loadAd(java.lang.Object):java.lang.Object");
    }
}
