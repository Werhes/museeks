package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0234e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f1479e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3229e f1480e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1481e;

    public /* synthetic */ C0234e(C3229e c3229e, Function0 function0, int i) {
        this.f1481e = i;
        this.f1480e = c3229e;
        this.f1479e = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1481e) {
            case 0:
                if (!this.f1480e.billing()) {
                    this.f1479e.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                if (!this.f1480e.billing()) {
                    this.f1479e.invoke();
                }
                return Unit.INSTANCE;
            default:
                if (!this.f1480e.billing()) {
                    this.f1479e.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
