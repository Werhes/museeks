package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۛٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0559e implements InterfaceC5021e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f2735e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String[] f2736e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC16799e f2737e;

    public C0559e(EnumC16799e enumC16799e, String... strArr) {
        this.f2737e = enumC16799e;
        this.f2736e = strArr;
        String str = enumC16799e.f32935e;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.f2735e = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(copyOf, copyOf.length))}, 1));
    }

    @Override // defpackage.InterfaceC5021e
    public final Collection ad() {
        return C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC5021e
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.InterfaceC5021e
    public final InterfaceC4077e advert() {
        C18139e.ad.getClass();
        return C18139e.metrica;
    }

    @Override // defpackage.InterfaceC5021e
    public final AbstractC13270e amazon() {
        return (C4053e) C4053e.purchase.getValue();
    }

    @Override // defpackage.InterfaceC5021e
    public final List getParameters() {
        return C13664e.f27089e;
    }

    public final String toString() {
        return this.f2735e;
    }
}
