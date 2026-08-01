package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17652e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f34605e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34606e;

    public /* synthetic */ C17652e(InterfaceC16132e interfaceC16132e, int i) {
        this.f34606e = i;
        this.f34605e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f34606e) {
            case 0:
                return new C11490e((0 << 32) | (((InterfaceC14388e) obj).mo493e(((C15765e) this.f34605e.getValue()).f31051e) & 4294967295L));
            case 1:
                return new C11490e((0 << 32) | (((InterfaceC14388e) obj).mo493e(((C15765e) this.f34605e.getValue()).f31051e) & 4294967295L));
            case 2:
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                long j = ((C3618e) this.f34605e.getValue()).ad;
                if (!C3618e.metrica(j, C3618e.adcel)) {
                    AbstractC4653e.subscription(interfaceC2235e, j, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return Unit.INSTANCE;
            case 3:
                return new C11490e((0 << 32) | (((InterfaceC14388e) obj).mo493e(((C15765e) this.f34605e.getValue()).f31051e) & 4294967295L));
            case 4:
                ((C10122e) obj).metrica(((Number) this.f34605e.getValue()).floatValue());
                return Unit.INSTANCE;
            case 5:
                return new C11490e((0 << 32) | (((InterfaceC14388e) obj).mo493e(((C15765e) this.f34605e.getValue()).f31051e) & 4294967295L));
            case 6:
                ((C10122e) obj).metrica(((Number) this.f34605e.getValue()).floatValue());
                return Unit.INSTANCE;
            case 7:
                AbstractC4653e.subscription((InterfaceC2235e) obj, ((C3618e) this.f34605e.getValue()).ad, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
            default:
                AbstractC4653e.subscription((InterfaceC2235e) obj, ((C3618e) this.f34605e.getValue()).ad, 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.INSTANCE;
        }
    }
}
