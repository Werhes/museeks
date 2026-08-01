package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11683e extends AbstractC16997e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final Function0 f23493e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final int f23494e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final List f23495e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final Function0 f23496e;

    public /* synthetic */ C11683e(int i, List list) {
        this(i, list, new C0568e(9), null);
    }

    public C11683e(int i, List list, Function0 function0, C17011e c17011e) {
        super(false, 3);
        this.f23494e = i;
        this.f23495e = list;
        this.f23496e = function0;
        this.f23493e = c17011e;
    }

    @Override // defpackage.AbstractC5004e
    public final void purchase() {
        super.purchase();
        this.f23496e.invoke();
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(1989624628);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(-770847687, new C4684e(this), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4684e(this, i);
        }
    }
}
