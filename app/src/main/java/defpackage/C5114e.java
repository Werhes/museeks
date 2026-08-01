package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۘٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5114e extends AbstractC14297e implements InterfaceC0182e, InterfaceC10798e {
    /* renamed from: eؓٞؖ, reason: contains not printable characters */
    public final void m1756e(InterfaceC7227e interfaceC7227e) {
        try {
            m1759e(AbstractC0869e.adcel(this, interfaceC7227e, "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).metrica());
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message != null && AbstractC5304e.inmobi(message, "not part of this configuration schema", false)) {
                throw new IllegalArgumentException(e.getMessage());
            }
            throw e;
        }
    }

    /* renamed from: eؘُٗ, reason: contains not printable characters */
    public final InterfaceC17544e m1757e(InterfaceC17544e interfaceC17544e) {
        C17974e c17974e = ((C14918e) this.f22047e).purchase;
        C16981e yandex = super.yandex();
        int i = AbstractC3422e.ad;
        return (InterfaceC17544e) AbstractC3422e.ad(c17974e, yandex, interfaceC17544e, 2, new LinkedHashMap());
    }

    /* renamed from: eُِؕ, reason: contains not printable characters */
    public final C14097e m1758e(InterfaceC7227e interfaceC7227e, String str, Object... objArr) {
        return AbstractC0869e.adcel(this, interfaceC7227e, str, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: eٔۥۥ, reason: contains not printable characters */
    public final void m1759e(InterfaceC2334e interfaceC2334e) {
        AbstractC12322e.ad(interfaceC2334e).appmetrica();
    }

    /* renamed from: eٍٕ, reason: contains not printable characters */
    public final boolean m1760e() {
        long ptr$cinterop_release = ((LongPointerWrapper) super.yandex().f33290e).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return realmcJNI.realm_is_writable(ptr$cinterop_release);
    }

    @Override // defpackage.AbstractC14297e, defpackage.AbstractC11130e, defpackage.InterfaceC0182e
    public final InterfaceC15348e yandex() {
        return super.yandex();
    }
}
