package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18314e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C18314e f35974e = new C18314e(1, 0);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f35975e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18314e(int i, int i2) {
        super(i);
        this.f35975e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18314e(C4246e c4246e) {
        super(1);
        this.f35975e = 5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35975e) {
            case 0:
                int i = ((C10120e) obj).ad;
                return Unit.INSTANCE;
            case 1:
                return new C12729e((0 << 32) | (4294967295L & ((int) (((C12729e) obj).ad & 4294967295L))));
            case 2:
                return new C12729e((((int) (((C12729e) obj).ad >> 32)) << 32) | (0 & 4294967295L));
            case 3:
                return new C12729e((0 << 32) | (4294967295L & ((int) (((C12729e) obj).ad & 4294967295L))));
            case 4:
                return new C12729e((((int) (((C12729e) obj).ad >> 32)) << 32) | (0 & 4294967295L));
            default:
                ((AbstractC12811e) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
