package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؐٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5337e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f11437e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f11438e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f11439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5337e(Object obj, Object obj2, int i) {
        super(1);
        this.f11438e = i;
        this.f11439e = obj;
        this.f11437e = obj2;
    }

    private final Object ad(Object obj) {
        C4377e c4377e = (C4377e) this.f11439e;
        ChoreographerFrameCallbackC8686e choreographerFrameCallbackC8686e = (ChoreographerFrameCallbackC8686e) this.f11437e;
        synchronized (c4377e.f9527e) {
            c4377e.f9535e.remove(choreographerFrameCallbackC8686e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
    
        if (((int) (r15.vip() & 4294967295L)) == ((int) (r0.vip() & 4294967295L))) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012e, code lost:
    
        if (((int) (r15.vip() >> 32)) == ((int) (r0.vip() >> 32))) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5337e.invoke(java.lang.Object):java.lang.Object");
    }
}
