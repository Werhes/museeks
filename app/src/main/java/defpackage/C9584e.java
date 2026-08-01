package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9584e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C2443e f19013e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2443e f19014e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C2443e f19015e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C2443e f19016e;

    public C9584e(C2443e c2443e, C2443e c2443e2, C2443e c2443e3, C2443e c2443e4) {
        this.f19016e = c2443e;
        this.f19014e = c2443e2;
        this.f19013e = c2443e3;
        this.f19015e = c2443e4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C12052e c12052e = (C12052e) obj;
        C2443e c2443e = new C2443e(this.f19016e + "[index]", 3);
        C2443e ad = c2443e.ad("url");
        C17874e c17874e = new C17874e(c2443e, this.f19015e, 19);
        ArrayList arrayList = c12052e.ad;
        C9770e c9770e = new C9770e(26, ad);
        C12052e c12052e2 = new C12052e();
        c17874e.invoke(c12052e2);
        arrayList.add(new C3168e(c9770e, c12052e2.ad, 22));
        C2443e c2443e2 = this.f19014e;
        C11883e c11883e = new C11883e(c2443e2, new C5401e(1, 18, (byte) 0), 25);
        ArrayList arrayList2 = c12052e.ad;
        arrayList2.add(new C11883e(c2443e2, c11883e, 26));
        C2443e c2443e3 = this.f19013e;
        arrayList2.add(new C11883e(c2443e3, new C5891e(c2443e3, new C5401e(1, 18, (byte) 0), 23), 26));
        return Unit.INSTANCE;
    }
}
