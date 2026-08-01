package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5610e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f11966e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0971e f11967e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C4034e f11968e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11969e = 1;

    public /* synthetic */ C5610e(C0971e c0971e, C2892e c2892e, C4034e c4034e) {
        this.f11967e = c0971e;
        this.f11966e = c2892e;
        this.f11968e = c4034e;
    }

    public /* synthetic */ C5610e(C4034e c4034e, C0971e c0971e, C2892e c2892e) {
        this.f11968e = c4034e;
        this.f11967e = c0971e;
        this.f11966e = c2892e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f11969e;
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C0971e c0971e = this.f11967e;
                    C2892e c2892e = this.f11966e;
                    C4034e c4034e = this.f11968e;
                    AbstractC6190e.ad(c4034e, AbstractC16653e.license(-284825865, new C5610e(c0971e, c2892e, c4034e), c13770e), c13770e, 48);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC1101e.ad(AbstractC5956e.ad.ad(this.f11967e), AbstractC16653e.license(610483127, new C15284e(this.f11966e, this.f11968e), c13770e), c13770e, 56);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
