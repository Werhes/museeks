package defpackage;

import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7924e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f16039e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ String f16040e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ boolean f16041e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String f16042e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f16043e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ Function1 f16044e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f16045e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C4993e f16046e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f16047e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ String f16048e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ View f16049e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ List f16050e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C2317e f16051e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C10743e f16052e;

    public C7924e(List list, InterfaceC18435e interfaceC18435e, String str, String str2, Function1 function1, C10743e c10743e, C2317e c2317e, C4993e c4993e, View view, InterfaceC16132e interfaceC16132e, Function1 function12, boolean z, String str3, Function1 function13) {
        this.f16050e = list;
        this.f16045e = interfaceC18435e;
        this.f16042e = str;
        this.f16048e = str2;
        this.f16039e = function1;
        this.f16052e = c10743e;
        this.f16051e = c2317e;
        this.f16046e = c4993e;
        this.f16049e = view;
        this.f16043e = interfaceC16132e;
        this.f16047e = function12;
        this.f16041e = z;
        this.f16040e = str3;
        this.f16044e = function13;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C14609e c14609e = (C14609e) this.f16050e.get(intValue);
            c13770e.m3676strictfp(818383503);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC17861e.adcel(c13770e);
            }
            C15274e c15274e = (C15274e) m3681throw;
            c13770e.m3676strictfp(1729504407);
            InterfaceC14388e interfaceC14388e = (InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex);
            boolean purchase = c13770e.purchase(interfaceC14388e);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == c5170e) {
                m3681throw2 = new C16352e(interfaceC14388e, 0);
                c13770e.m3682throws(m3681throw2);
            }
            Function1 function1 = (Function1) m3681throw2;
            c13770e.Signature(false);
            Object[] objArr = new Object[0];
            C11883e c11883e = new C11883e(new C14151e((byte) 0, 9), new C2046e(12, function1), 15);
            boolean license = c13770e.license(2) | c13770e.purchase(function1);
            Object m3681throw3 = c13770e.m3681throw();
            if (license || m3681throw3 == c5170e) {
                m3681throw3 = new C5565e(EnumC3856e.f8687e, function1, 22);
                c13770e.m3682throws(m3681throw3);
            }
            C13440e c13440e = (C13440e) AbstractC10510e.appmetrica(objArr, c11883e, (Function0) m3681throw3, c13770e, 0);
            boolean yandex = c13770e.yandex(c13440e) | c13770e.yandex(this.f16045e) | c13770e.purchase(c14609e) | c13770e.purchase(this.f16042e) | c13770e.purchase(this.f16048e) | c13770e.purchase(this.f16039e);
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex || m3681throw4 == c5170e) {
                C6365e c6365e = new C6365e(c13440e, this.f16045e, this.f16051e, this.f16042e, this.f16048e, this.f16039e, c14609e, null, 6);
                c13770e.m3682throws(c6365e);
                m3681throw4 = c6365e;
            }
            AbstractC17680e.appmetrica(c14609e, c13440e, (Function2) m3681throw4, c13770e);
            AbstractC7763e.vip(c18055e, this.f16052e, c14609e.ad, null, false, null, AbstractC16653e.license(-504512203, new C3920e(c13440e, this.f16046e, c15274e, this.f16049e, this.f16043e, this.f16047e, c14609e, this.f16041e, this.f16040e, this.f16044e), c13770e), c13770e, (i & 14) | 1572864, 28);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
