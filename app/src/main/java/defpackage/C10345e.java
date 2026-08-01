package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10345e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2243e f20417e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20418e;

    public /* synthetic */ C10345e(C2243e c2243e, int i) {
        this.f20418e = i;
        this.f20417e = c2243e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20418e) {
            case 0:
                AbstractC14966e.metrica(this.f20417e.license, new C17371e(2));
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(AbstractC7890e.billing(((C15369e) this.f20417e.appmetrica.startapp()).ad.ad, C14999e.INSTANCE));
            case 2:
                this.f20417e.license.ad(new C1068e(3, C14999e.INSTANCE), new C17084e(7));
                return Unit.INSTANCE;
            case 3:
                this.f20417e.license.ad(new C1068e(1, C14999e.INSTANCE), new C17084e(5));
                return Unit.INSTANCE;
            case 4:
                this.f20417e.license.ad(new C1068e(2, C14704e.INSTANCE), new C17084e(6));
                return Unit.INSTANCE;
            case 5:
                AbstractC14966e.metrica(this.f20417e.license, new C2091e(26));
                return Unit.INSTANCE;
            default:
                AbstractC14966e.metrica(this.f20417e.license, new C2091e(27));
                return Unit.INSTANCE;
        }
    }
}
