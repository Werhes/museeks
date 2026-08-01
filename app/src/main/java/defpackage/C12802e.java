package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12802e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f25611e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6029e f25612e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f25613e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25614e = 1;

    public /* synthetic */ C12802e(C6029e c6029e, Function0 function0, Function0 function02, int i) {
        this.f25612e = c6029e;
        this.f25611e = function0;
        this.f25613e = function02;
    }

    public /* synthetic */ C12802e(Function0 function0, Function0 function02, C6029e c6029e) {
        this.f25611e = function0;
        this.f25613e = function02;
        this.f25612e = c6029e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25614e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC13348e.ad(null, AbstractC16653e.license(-10256751, new C14903e(15, this.f25611e), c13770e), null, null, AbstractC16653e.license(-351088236, new C14903e(16, this.f25613e), c13770e), 0, 0L, 0L, null, AbstractC16653e.license(1305910876, new C12756e(this.f25612e, 0), c13770e), c13770e, 805330992, 493);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC8217e.ad(this.f25612e, this.f25611e, this.f25613e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
