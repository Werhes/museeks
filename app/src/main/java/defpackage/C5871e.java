package defpackage;

import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5871e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C3967e f12408e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3967e f12409e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12410e;

    public /* synthetic */ C5871e(C3967e c3967e, C3967e c3967e2, int i) {
        this.f12410e = i;
        this.f12409e = c3967e;
        this.f12408e = c3967e2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C14031e c14031e = (C14031e) obj;
        switch (this.f12410e) {
            case 0:
                C3967e c3967e = this.f12409e;
                if (c3967e.f8852e == -1) {
                    c3967e.f8852e = c14031e.vip().f22523e;
                }
                this.f12408e.f8852e = c14031e.vip().f22522e + 1;
                return BuildConfig.FLAVOR;
            default:
                C3967e c3967e2 = this.f12409e;
                if (c3967e2.f8852e == -1) {
                    c3967e2.f8852e = c14031e.vip().f22523e;
                }
                this.f12408e.f8852e = c14031e.vip().f22522e + 1;
                return BuildConfig.FLAVOR;
        }
    }
}
