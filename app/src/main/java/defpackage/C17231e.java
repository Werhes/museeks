package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17231e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f33761e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33762e;

    public /* synthetic */ C17231e(AppActivity appActivity, int i) {
        this.f33762e = i;
        this.f33761e = appActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f33762e;
        InterfaceC5083e interfaceC5083e = null;
        int i2 = 2;
        AppActivity appActivity = this.f33761e;
        switch (i) {
            case 0:
                int i3 = AppActivity.f36539e;
                return new C1731e(appActivity.getWindow(), appActivity.getWindow().getDecorView());
            case 1:
                int i4 = AppActivity.f36539e;
                AbstractC16519e.ad(AbstractC17947e.billing(appActivity), appActivity, false, new C12559e(i2, i2, interfaceC5083e));
                return Unit.INSTANCE;
            case 2:
                int i5 = AppActivity.f36539e;
                AbstractC16519e.ad(AbstractC17947e.billing(appActivity), appActivity, false, new C12559e(i2, 3, interfaceC5083e));
                return Unit.INSTANCE;
            default:
                int i6 = AppActivity.f36539e;
                AbstractC16519e.ad(AbstractC17947e.billing(appActivity), appActivity, false, new C12559e(i2, 4, interfaceC5083e));
                return Unit.INSTANCE;
        }
    }
}
