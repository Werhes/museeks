package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2525e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4390e f6372e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6373e;

    public /* synthetic */ C2525e(C4390e c4390e, int i) {
        this.f6373e = i;
        this.f6372e = c4390e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f6373e) {
            case 0:
                this.f6372e.m1627private((String) obj);
                return Unit.INSTANCE;
            default:
                int intValue = ((Integer) obj).intValue();
                C6977e c6977e = this.f6372e.f11121e;
                if (c6977e == null) {
                    c6977e = null;
                }
                c6977e.setCurrentItem(intValue, true);
                return Unit.INSTANCE;
        }
    }
}
