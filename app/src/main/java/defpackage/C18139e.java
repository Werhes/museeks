package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۦُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18139e {
    public static final C18139e ad = new Object();
    public static final C17341e vip = C17341e.f34028e;
    public static final C13263e metrica = new C13263e(C0520e.billing(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final C3267e license = vip(EnumC16799e.f32918e, new String[0]);
    public static final C3267e appmetrica = vip(EnumC16799e.f32909e, new String[0]);
    public static final Set purchase = Collections.singleton(new C13100e());

    public static final C9866e ad(int i, boolean z, String... strArr) {
        if (!z) {
            return new C9866e(i, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new C9866e(i, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static final boolean appmetrica(InterfaceC15498e interfaceC15498e) {
        if (interfaceC15498e != null) {
            return (interfaceC15498e instanceof C13263e) || (interfaceC15498e.mo1351switch() instanceof C13263e) || interfaceC15498e == vip;
        }
        return false;
    }

    public static C3267e license(EnumC16799e enumC16799e, List list, InterfaceC5021e interfaceC5021e, String... strArr) {
        return new C3267e(interfaceC5021e, ad(7, false, (String[]) Arrays.copyOf(new String[]{interfaceC5021e.toString()}, 1)), enumC16799e, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static C0559e metrica(EnumC16799e enumC16799e, String... strArr) {
        return new C0559e(enumC16799e, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final C3267e vip(EnumC16799e enumC16799e, String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return license(enumC16799e, C13664e.f27089e, metrica(enumC16799e, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }
}
