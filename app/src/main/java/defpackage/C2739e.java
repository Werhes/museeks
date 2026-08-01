package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2739e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9456e f6637e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6638e;

    public /* synthetic */ C2739e(C9456e c9456e, int i) {
        this.f6638e = i;
        this.f6637e = c9456e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6638e;
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C9456e c9456e = this.f6637e;
                    AbstractC6022e.vip((C9553e) c9456e.Signature.getValue(), AbstractC16653e.license(-825022247, new C2739e(c9456e, 1), c13770e), c13770e, 48, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    this.f6637e.Signature(null, c13770e, 0, 1);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C9456e c9456e2 = this.f6637e;
                    c9456e2.loadAd(((String) c9456e2.amazon.getValue()).length() > 0 ? EnumC12199e.f24496e : (c9456e2.startapp || ((String) c9456e2.amazon.getValue()).length() != 0) ? EnumC12199e.f24499e : EnumC12199e.f24497e, c13770e, 48);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
