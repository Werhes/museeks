package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7368e implements InterfaceC1108e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f15102e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1108e f15103e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f15104e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15105e = 1;

    /* JADX WARN: Multi-variable type inference failed */
    public C7368e(InterfaceC1108e interfaceC1108e, InterfaceC1108e interfaceC1108e2, Function3 function3) {
        this.f15103e = interfaceC1108e;
        this.f15102e = interfaceC1108e2;
        this.f15104e = (AbstractC7185e) function3;
    }

    public C7368e(InterfaceC1108e interfaceC1108e, Function1 function1, AbstractC7654e abstractC7654e) {
        this.f15103e = interfaceC1108e;
        this.f15102e = function1;
        this.f15104e = abstractC7654e;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    @Override // defpackage.InterfaceC1108e
    public final Object ad(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        int i = this.f15105e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        Serializable serializable = this.f15104e;
        Object obj = this.f15102e;
        InterfaceC1108e interfaceC1108e = this.f15103e;
        switch (i) {
            case 0:
                Object ad = interfaceC1108e.ad(new C15312e(3, interfaceC6034e, (Function1) obj, (AbstractC7654e) serializable), interfaceC5083e);
                return ad == enumC2821e ? ad : Unit.INSTANCE;
            default:
                Object ad2 = AbstractC6437e.ad(interfaceC5083e, interfaceC6034e, new C1053e((Function3) serializable, (InterfaceC5083e) null), new InterfaceC1108e[]{interfaceC1108e, (InterfaceC1108e) obj});
                return ad2 == enumC2821e ? ad2 : Unit.INSTANCE;
        }
    }
}
