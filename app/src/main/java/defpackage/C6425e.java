package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6425e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C10743e f13311e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f13312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6425e(C10743e c10743e, int i) {
        super(1);
        this.f13312e = i;
        this.f13311e = c10743e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13312e) {
            case 0:
                ((C10122e) obj).signatures(C2152e.purchase(this.f13311e.appmetrica()));
                return Unit.INSTANCE;
            case 1:
                ((C10122e) obj).pro(C2152e.appmetrica(this.f13311e.appmetrica()));
                return Unit.INSTANCE;
            case 2:
                ((C10122e) obj).signatures(C2152e.purchase(((C2152e) this.f13311e.remoteconfig.license()).ad));
                return Unit.INSTANCE;
            default:
                ((C10122e) obj).pro(C2152e.appmetrica(((C2152e) this.f13311e.remoteconfig.license()).ad));
                return Unit.INSTANCE;
        }
    }
}
