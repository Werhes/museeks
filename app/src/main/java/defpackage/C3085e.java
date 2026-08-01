package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؒۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3085e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C1839e f7163e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f7164e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f7165e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f7166e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7167e = 1;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ long f7168e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ long f7169e;

    public /* synthetic */ C3085e(C2892e c2892e, Function2 function2, Function2 function22, C1839e c1839e, long j, long j2, int i) {
        this.f7165e = c2892e;
        this.f7164e = function2;
        this.f7166e = function22;
        this.f7163e = c1839e;
        this.f7169e = j;
        this.f7168e = j2;
    }

    public /* synthetic */ C3085e(Function2 function2, C2892e c2892e, Function2 function22, C1839e c1839e, long j, long j2) {
        this.f7164e = function2;
        this.f7165e = c2892e;
        this.f7166e = function22;
        this.f7163e = c1839e;
        this.f7169e = j;
        this.f7168e = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7167e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    c13770e.m3676strictfp(-168956728);
                    c13770e.m3676strictfp(-942207887);
                    AbstractC0839e.ad(this.f7165e, this.f7164e, this.f7166e, this.f7163e, this.f7169e, this.f7168e, c13770e, 0);
                    c13770e.Signature(false);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC0839e.ad(this.f7165e, this.f7164e, this.f7166e, this.f7163e, this.f7169e, this.f7168e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
