package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۡؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13555e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String f26859e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1963e f26860e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26861e;

    public /* synthetic */ C13555e(C1963e c1963e, String str, int i) {
        this.f26861e = i;
        this.f26860e = c1963e;
        this.f26859e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26861e) {
            case 0:
                C1963e c1963e = this.f26860e;
                c1963e.m739transient().billing(this.f26859e);
                c1963e.f5162e.setValue(null);
                return Unit.INSTANCE;
            case 1:
                C1963e c1963e2 = this.f26860e;
                c1963e2.m739transient().billing(this.f26859e);
                c1963e2.f5162e.setValue(null);
                return Unit.INSTANCE;
            default:
                C1963e c1963e3 = this.f26860e;
                c1963e3.m739transient().purchase(this.f26859e, c1963e3.f5157e);
                c1963e3.f5162e.setValue(null);
                return Unit.INSTANCE;
        }
    }
}
