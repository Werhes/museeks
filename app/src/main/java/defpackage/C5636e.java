package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5636e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2038e f12011e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12012e;

    public /* synthetic */ C5636e(C2038e c2038e, int i) {
        this.f12012e = i;
        this.f12011e = c2038e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f12012e) {
            case 0:
                return this.f12011e.adcel();
            case 1:
                return Float.valueOf(this.f12011e.startapp().metrica);
            case 2:
                return Float.valueOf(this.f12011e.startapp().metrica);
            case 3:
                AppActivity appActivity = this.f12011e.ad;
                AbstractC16519e.ad(AbstractC17947e.billing(appActivity), appActivity, false, new C1086e(2, null));
                return Unit.INSTANCE;
            default:
                return this.f12011e.adcel();
        }
    }
}
