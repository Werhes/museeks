package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C11162e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f22387e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10142e f22388e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f22389e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22390e;

    public /* synthetic */ C11162e(C10142e c10142e, int i, int i2, int i3) {
        this.f22390e = i3;
        this.f22388e = c10142e;
        this.f22387e = i;
        this.f22389e = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22390e) {
            case 0:
                C10142e c10142e = this.f22388e;
                try {
                    c10142e.f20074e.isVip(this.f22387e, this.f22389e);
                } catch (IOException e) {
                    c10142e.ad(2, 2, e);
                }
                return Unit.INSTANCE;
            default:
                C10142e c10142e2 = this.f22388e;
                try {
                    c10142e2.f20074e.Signature(this.f22387e, this.f22389e, true);
                } catch (IOException e2) {
                    c10142e2.ad(2, 2, e2);
                }
                return Unit.INSTANCE;
        }
    }
}
