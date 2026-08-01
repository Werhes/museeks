package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7123e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C7123e f14583e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C7123e f14584e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C7123e f14585e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C7123e f14586e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C7123e f14587e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C7123e f14588e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C7123e f14589e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C7123e f14590e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C7123e f14591e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C7123e f14592e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C7123e f14593e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C7123e f14594e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C7123e f14595e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C7123e f14596e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C7123e f14597e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f14598e;

    static {
        int i = 2;
        f14586e = new C7123e(i, 0);
        f14594e = new C7123e(i, 1);
        f14583e = new C7123e(i, 2);
        f14597e = new C7123e(i, 3);
        f14596e = new C7123e(i, 4);
        f14592e = new C7123e(i, 5);
        f14595e = new C7123e(i, 6);
        f14587e = new C7123e(i, 7);
        f14593e = new C7123e(i, 8);
        f14585e = new C7123e(i, 9);
        f14584e = new C7123e(i, 10);
        f14588e = new C7123e(i, 11);
        f14590e = new C7123e(i, 12);
        f14591e = new C7123e(i, 13);
        f14589e = new C7123e(i, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7123e(int i, int i2) {
        super(i);
        this.f14598e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        InterfaceC12561e interfaceC12561e;
        switch (this.f14598e) {
            case 0:
                return (Unit) obj;
            case 1:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 3:
                return (Unit) obj;
            case 4:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 5:
                C11796e c11796e = (C11796e) obj;
                int i = ((C11796e) obj2).ad;
                return c11796e;
            case 6:
                return (InterfaceC16154e) obj;
            case 7:
                return (String) obj;
            case 8:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 9:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 10:
                return (String) obj;
            case 11:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 12:
                C10591e c10591e = (C10591e) obj;
                C10591e c10591e2 = (C10591e) obj2;
                if (c10591e == null || (str = c10591e.ad) == null) {
                    str = c10591e2.ad;
                }
                if (c10591e == null || (interfaceC12561e = c10591e.vip) == null) {
                    interfaceC12561e = c10591e2.vip;
                }
                return new C10591e(str, interfaceC12561e);
            case 13:
                return obj == null ? obj2 : obj;
            default:
                C6071e c6071e = (C6071e) obj2;
                Object valueOf = Float.valueOf(0.0f);
                C0500e c0500e = ((C6071e) obj).license;
                C16591e c16591e = AbstractC9058e.signatures;
                Object billing = c0500e.f2578e.billing(c16591e);
                if (billing == null) {
                    billing = valueOf;
                }
                float floatValue = ((Number) billing).floatValue();
                Object billing2 = c6071e.license.f2578e.billing(c16591e);
                if (billing2 != null) {
                    valueOf = billing2;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
        }
    }
}
