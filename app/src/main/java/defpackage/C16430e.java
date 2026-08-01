package defpackage;

import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16430e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13578e f32260e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32261e;

    public /* synthetic */ C16430e(C13578e c13578e, int i) {
        this.f32261e = i;
        this.f32260e = c13578e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32261e) {
            case 0:
                String str = (String) obj;
                C13578e c13578e = this.f32260e;
                if (c13578e.applovin()) {
                    if (str != null) {
                        c13578e.billing(Collections.singletonMap("success_token", str));
                    } else {
                        c13578e.billing(C9139e.f18290e);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                this.f32260e.billing((Map) obj);
                return Unit.INSTANCE;
            case 2:
                this.f32260e.billing((Map) obj);
                return Unit.INSTANCE;
            default:
                Unit unit = Unit.INSTANCE;
                this.f32260e.billing(unit);
                return unit;
        }
    }
}
