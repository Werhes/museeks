package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۦِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6056e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f12731e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f12732e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12733e;

    public /* synthetic */ C6056e(Function1 function1, Function1 function12, int i) {
        this.f12733e = i;
        this.f12732e = function1;
        this.f12731e = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f12733e) {
            case 0:
                Function1 function1 = this.f12732e;
                if (function1 != null) {
                    function1.invoke(obj);
                }
                this.f12731e.invoke(obj);
                return Unit.INSTANCE;
            case 1:
                C9167e c9167e = (C9167e) obj;
                this.f12732e.invoke(c9167e);
                this.f12731e.invoke(c9167e);
                return Unit.INSTANCE;
            case 2:
                this.f12732e.invoke(obj);
                this.f12731e.invoke(obj);
                return Unit.INSTANCE;
            default:
                this.f12732e.invoke(obj);
                this.f12731e.invoke(obj);
                return Unit.INSTANCE;
        }
    }
}
