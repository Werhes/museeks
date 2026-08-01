package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16860e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f33037e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f33038e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16860e(int i, Function1 function1) {
        super(1);
        this.f33038e = i;
        this.f33037e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33038e) {
            case 0:
                C4017e c4017e = (C4017e) obj;
                this.f33037e.invoke(c4017e);
                c4017e.ad();
                return Unit.INSTANCE;
            case 1:
                return new C11490e((((Number) this.f33037e.invoke(Integer.valueOf((int) (((C12729e) obj).ad >> 32)))).intValue() << 32) | (0 & 4294967295L));
            case 2:
                return new C11490e((0 << 32) | (4294967295L & ((Number) this.f33037e.invoke(Integer.valueOf((int) (((C12729e) obj).ad & 4294967295L)))).intValue()));
            default:
                return new C11490e((((Number) this.f33037e.invoke(Integer.valueOf((int) (((C12729e) obj).ad >> 32)))).intValue() << 32) | (0 & 4294967295L));
        }
    }
}
