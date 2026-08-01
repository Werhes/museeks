package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3267e extends AbstractC10226e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final List f7415e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C9866e f7416e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC5021e f7417e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f7418e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final EnumC16799e f7419e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String[] f7420e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f7421e;

    public C3267e(InterfaceC5021e interfaceC5021e, C9866e c9866e, EnumC16799e enumC16799e, List list, boolean z, String... strArr) {
        this.f7417e = interfaceC5021e;
        this.f7416e = c9866e;
        this.f7419e = enumC16799e;
        this.f7415e = list;
        this.f7421e = z;
        this.f7420e = strArr;
        String str = enumC16799e.f32935e;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.f7418e = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // defpackage.AbstractC1186e
    public final boolean Signature() {
        return this.f7421e;
    }

    @Override // defpackage.AbstractC1186e
    public final AbstractC1186e admob(C13520e c13520e) {
        return this;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: applovin */
    public final AbstractC10226e isVip(C6557e c6557e) {
        return this;
    }

    @Override // defpackage.AbstractC1186e
    /* renamed from: eؗٔٓ */
    public final InterfaceC8528e mo483e() {
        return this.f7416e;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: isPro */
    public final AbstractC10226e pro(boolean z) {
        String[] strArr = this.f7420e;
        return new C3267e(this.f7417e, this.f7416e, this.f7419e, this.f7415e, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // defpackage.AbstractC10226e, defpackage.AbstractC15728e
    public final AbstractC15728e isVip(C6557e c6557e) {
        return this;
    }

    @Override // defpackage.AbstractC1186e
    public final InterfaceC5021e loadAd() {
        return this.f7417e;
    }

    @Override // defpackage.AbstractC1186e
    public final List mopub() {
        return this.f7415e;
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e signatures(C13520e c13520e) {
        return this;
    }

    @Override // defpackage.AbstractC1186e
    public final C6557e smaato() {
        C6557e.f13492e.getClass();
        return C6557e.f13491e;
    }
}
