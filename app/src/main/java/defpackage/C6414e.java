package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6414e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String f13296e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3409e f13297e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13298e;

    public /* synthetic */ C6414e(C3409e c3409e, String str, int i) {
        this.f13298e = i;
        this.f13297e = c3409e;
        this.f13296e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13298e) {
            case 0:
                C3409e c3409e = this.f13297e;
                c3409e.m1358transient().billing(this.f13296e);
                c3409e.f7626e.setValue(null);
                return Unit.INSTANCE;
            case 1:
                C3409e c3409e2 = this.f13297e;
                c3409e2.m1358transient().purchase(this.f13296e, c3409e2.f7628e);
                c3409e2.f7626e.setValue(null);
                return Unit.INSTANCE;
            default:
                C3409e c3409e3 = this.f13297e;
                c3409e3.m1358transient().billing(this.f13296e);
                c3409e3.f7626e.setValue(null);
                return Unit.INSTANCE;
        }
    }
}
