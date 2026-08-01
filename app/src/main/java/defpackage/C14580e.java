package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14580e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2921e f28790e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28791e;

    public /* synthetic */ C14580e(C2921e c2921e, int i) {
        this.f28791e = i;
        this.f28790e = c2921e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28791e) {
            case 0:
                this.f28790e.f6912e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                this.f28790e.f6912e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                C2921e c2921e = this.f28790e;
                c2921e.f6912e.setValue(Boolean.FALSE);
                AppActivity appActivity = (AppActivity) c2921e.pro();
                AbstractC16519e.ad(AbstractC17947e.billing(appActivity), appActivity, true, new C16600e(c2921e, null, 26));
                return Unit.INSTANCE;
        }
    }
}
