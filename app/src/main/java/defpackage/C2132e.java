package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓ۟۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2132e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f5503e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f5504e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f5505e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f5506e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5507e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f5508e;

    public /* synthetic */ C2132e(InterfaceC12864e interfaceC12864e, long j, long j2, InterfaceC16154e interfaceC16154e, List list, int i) {
        this.f5506e = interfaceC12864e;
        this.f5505e = j;
        this.f5504e = j2;
        this.f5503e = interfaceC16154e;
        this.f5508e = list;
    }

    public /* synthetic */ C2132e(Function2 function2, C2892e c2892e, Function2 function22, long j, long j2) {
        this.f5506e = function2;
        this.f5503e = c2892e;
        this.f5508e = function22;
        this.f5505e = j;
        this.f5504e = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5507e) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC6232e.ad((InterfaceC12864e) this.f5506e, this.f5505e, this.f5504e, (InterfaceC16154e) this.f5503e, (List) this.f5508e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                Function2 function2 = (Function2) this.f5506e;
                C2892e c2892e = (C2892e) this.f5503e;
                Function2 function22 = (Function2) this.f5508e;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC1101e.ad(AbstractC14489e.ad.ad(AbstractC16475e.ad(c13770e, AbstractC13981e.appmetrica)), AbstractC16653e.license(969655473, new C3085e(function2, c2892e, function22, AbstractC16475e.ad(c13770e, 10), this.f5505e, this.f5504e), c13770e), c13770e, 56);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
