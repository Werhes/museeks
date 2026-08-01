package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16517e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7065e f32336e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32337e;

    public /* synthetic */ C16517e(C7065e c7065e, int i) {
        this.f32337e = i;
        this.f32336e = c7065e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f32337e;
        C7065e c7065e = this.f32336e;
        switch (i) {
            case 0:
                if (((C1959e) AbstractC10432e.vip(c7065e, AbstractC17052e.ad)) == null) {
                    C0302e c0302e = c7065e.f14499e;
                    if (c0302e != null) {
                        c7065e.m2042e(c0302e);
                    }
                    c7065e.f14499e = null;
                } else if (c7065e.f14499e == null) {
                    C5954e c5954e = new C5954e(0, c7065e);
                    C16517e c16517e = new C16517e(c7065e, 1);
                    C15274e c15274e = c7065e.f14497e;
                    boolean z = c7065e.f14500e;
                    float f = c7065e.f14501e;
                    C12870e c12870e = AbstractC11876e.ad;
                    C0302e c0302e2 = new C0302e(c15274e, z, f, c5954e, c16517e);
                    c7065e.m2050e(c0302e2);
                    c7065e.f14499e = c0302e2;
                }
                return Unit.INSTANCE;
            default:
                return AbstractC18039e.ad;
        }
    }
}
