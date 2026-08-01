package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٝٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17892e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1718e f35137e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35138e;

    public /* synthetic */ C17892e(C1718e c1718e, int i) {
        this.f35138e = i;
        this.f35137e = c1718e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35138e) {
            case 0:
                C1718e c1718e = this.f35137e;
                if (((Boolean) c1718e.f4671e.getValue()).booleanValue()) {
                    c1718e.m680import();
                } else {
                    c1718e.m684transient();
                }
                return Unit.INSTANCE;
            case 1:
                C1718e c1718e2 = this.f35137e;
                c1718e2.getClass();
                AbstractC5336e.purchase(c1718e2, null, 0, new C0618e(c1718e2, null, 1), 3);
                return Unit.INSTANCE;
            case 2:
                VKXApplication vKXApplication = VKXApplication.f36528e;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                vKXApplication.getApplicationContext();
                VKXApplication vKXApplication2 = VKXApplication.f36528e;
                if (vKXApplication2 == null) {
                    vKXApplication2 = null;
                }
                Context applicationContext = vKXApplication2.getApplicationContext();
                C1343e ad = AbstractC12918e.ad();
                C7838e c7838e = VKXApplication.f36530e;
                C17148e license = AbstractC15390e.license(applicationContext, ad, (c7838e != null ? c7838e : null).f15871e, new C10673e(18), new C14136e(25), (c7838e != null ? c7838e : null).f15872e);
                license.mo3032e(new C3335e(2, 0, 1, 1, 0, false, true), false);
                license.f33577e.ad(new C12959e(1, this.f35137e));
                return license;
            default:
                C1718e c1718e3 = this.f35137e;
                boolean booleanValue = ((Boolean) c1718e3.f4673e.getValue()).booleanValue();
                C12742e c12742e = c1718e3.f4674e;
                return Integer.valueOf(booleanValue ? c12742e.size() + 1 : c12742e.size());
        }
    }
}
