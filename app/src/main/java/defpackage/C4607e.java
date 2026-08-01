package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4607e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5250e f9934e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9935e;

    public /* synthetic */ C4607e(C5250e c5250e, int i) {
        this.f9935e = i;
        this.f9934e = c5250e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9935e) {
            case 0:
                this.f9934e.f11326e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                this.f9934e.f11326e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                C5250e c5250e = this.f9934e;
                c5250e.f11326e.setValue(Boolean.FALSE);
                AppActivity appActivity = (AppActivity) c5250e.pro();
                AbstractC16519e.ad(AbstractC17947e.billing(appActivity), appActivity, true, new C15238e(c5250e, null, 11));
                return Unit.INSTANCE;
            case 3:
                this.f9934e.f11325e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                this.f9934e.f11325e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
