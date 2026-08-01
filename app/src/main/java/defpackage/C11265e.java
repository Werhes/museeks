package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11265e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15866e f22626e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22627e;

    public /* synthetic */ C11265e(C15866e c15866e, int i) {
        this.f22627e = i;
        this.f22626e = c15866e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C10263e c10263e = (C10263e) obj;
        switch (this.f22627e) {
            case 0:
                this.f22626e.getClass();
                C5874e c5874e = c10263e.purchase;
                C8208e c8208e = AbstractC1002e.vip;
                Unit unit = Unit.INSTANCE;
                c5874e.billing(c8208e, unit);
                return unit;
            default:
                this.f22626e.getClass();
                C5874e c5874e2 = c10263e.purchase;
                C8208e c8208e2 = AbstractC1002e.vip;
                Unit unit2 = Unit.INSTANCE;
                c5874e2.billing(c8208e2, unit2);
                return unit2;
        }
    }
}
