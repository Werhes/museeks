package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3920e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f8752e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15274e f8753e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f8754e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4993e f8755e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8756e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ View f8757e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ String f8758e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C13440e f8759e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C14609e f8760e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f8761e;

    public C3920e(C13440e c13440e, C4993e c4993e, C15274e c15274e, View view, InterfaceC16132e interfaceC16132e, Function1 function1, C14609e c14609e, boolean z, String str, Function1 function12) {
        this.f8759e = c13440e;
        this.f8755e = c4993e;
        this.f8753e = c15274e;
        this.f8757e = view;
        this.f8752e = interfaceC16132e;
        this.f8761e = function1;
        this.f8760e = c14609e;
        this.f8756e = z;
        this.f8758e = str;
        this.f8754e = function12;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C12692e c12692e = (C12692e) obj;
        ((Boolean) obj2).getClass();
        C13770e c13770e = (C13770e) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(c12692e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 131) != 130)) {
            C13440e c13440e = this.f8759e;
            AbstractC12640e.purchase(c13440e, AbstractC16653e.license(-569877421, new C11783e(0, c13440e), c13770e), null, false, !this.f8755e.adcel.ad(), false, null, AbstractC16653e.license(468937561, new C17459e(c12692e, this.f8753e, this.f8757e, this.f8752e, this.f8761e, this.f8760e, this.f8756e, this.f8758e, this.f8754e), c13770e), c13770e, 12586032);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
