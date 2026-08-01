package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٛۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3490e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f7920e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f7921e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f7922e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7923e = 1;

    public /* synthetic */ C3490e(boolean z, Function1 function1, boolean z2) {
        this.f7921e = z;
        this.f7920e = function1;
        this.f7922e = z2;
    }

    public /* synthetic */ C3490e(boolean z, boolean z2, Function1 function1) {
        this.f7921e = z;
        this.f7922e = z2;
        this.f7920e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7923e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    c13770e.m3659default();
                } else if (this.f7921e) {
                    c13770e.m3676strictfp(-1046299973);
                    AbstractC8844e.ad(this.f7922e, this.f7920e, null, true, null, c13770e, 0, 108);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(-1046081640);
                    AbstractC5647e.ad(AbstractC8217e.license(), null, AbstractC12220e.smaato(C0115e.f1276e, 12, 0.0f, 2), 0L, c13770e, 432, 8);
                    c13770e.Signature(false);
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC8844e.ad(this.f7921e, this.f7920e, null, this.f7922e, null, c13770e2, 0, 108);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
