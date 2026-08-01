package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2919e implements InterfaceC16132e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public AbstractC16858e f6903e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Function1 f6904e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C15037e f6905e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11117e f6906e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2919e(C15037e c15037e, C11117e c11117e, Function1 function1, Function1 function12) {
        this.f6905e = c15037e;
        this.f6906e = c11117e;
        this.f6904e = function1;
        this.f6903e = (AbstractC16858e) function12;
    }

    @Override // defpackage.InterfaceC16132e
    public final Object getValue() {
        metrica(this.f6905e.metrica.purchase());
        return this.f6906e.f22034e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    public final void metrica(InterfaceC16490e interfaceC16490e) {
        Object invoke = this.f6903e.invoke(interfaceC16490e.metrica());
        boolean billing = this.f6905e.metrica.billing();
        C11117e c11117e = this.f6906e;
        if (billing) {
            c11117e.purchase(this.f6903e.invoke(interfaceC16490e.ad()), invoke, (InterfaceC6512e) this.f6904e.invoke(interfaceC16490e));
        } else {
            c11117e.billing(invoke, (InterfaceC6512e) this.f6904e.invoke(interfaceC16490e));
        }
    }
}
