package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0668e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7065e f2927e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2928e;

    public /* synthetic */ C0668e(C7065e c7065e, int i) {
        this.f2928e = i;
        this.f2927e = c7065e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f2928e;
        C7065e c7065e = this.f2927e;
        switch (i) {
            case 0:
                return ((C16423e) AbstractC10432e.vip(c7065e, AbstractC10809e.ad)).ad() ? ((double) AbstractC6532e.inmobi(((C3618e) AbstractC10432e.vip(c7065e, AbstractC12256e.ad)).ad)) > 0.5d ? AbstractC17394e.license : AbstractC17394e.appmetrica : AbstractC17394e.purchase;
            default:
                if (((C4899e) AbstractC10432e.vip(c7065e, AbstractC17394e.ad)) == null) {
                    C0302e c0302e = c7065e.f14499e;
                    if (c0302e != null) {
                        c7065e.m2042e(c0302e);
                    }
                    c7065e.f14499e = null;
                } else if (c7065e.f14499e == null) {
                    C5954e c5954e = new C5954e(1, c7065e);
                    C0668e c0668e = new C0668e(c7065e, 0);
                    C15274e c15274e = c7065e.f14497e;
                    boolean z = c7065e.f14500e;
                    float f = c7065e.f14501e;
                    C12870e c12870e = AbstractC11876e.ad;
                    C0302e c0302e2 = new C0302e(c15274e, z, f, c5954e, c0668e);
                    c7065e.m2050e(c0302e2);
                    c7065e.f14499e = c0302e2;
                }
                return Unit.INSTANCE;
        }
    }
}
