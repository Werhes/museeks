package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۦؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14377e extends AbstractC8761e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final List f28433e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final List f28434e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final InterfaceC7227e f28435e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC0861e f28436e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f28437e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f28438e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final boolean f28439e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f28440e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC13984e f28441e;

    public C14377e(InterfaceC0861e interfaceC0861e, List list, boolean z, List list2, InterfaceC13984e interfaceC13984e, boolean z2, boolean z3, boolean z4, InterfaceC7227e interfaceC7227e, Function0 function0) {
        super(function0);
        this.f28436e = interfaceC0861e;
        this.f28434e = list;
        this.f28438e = z;
        this.f28433e = list2;
        this.f28441e = interfaceC13984e;
        this.f28440e = z2;
        this.f28437e = z3;
        this.f28439e = z4;
        this.f28435e = interfaceC7227e;
    }

    @Override // defpackage.AbstractC8761e
    public final InterfaceC13984e adcel() {
        return this.f28441e;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean admob() {
        return this.f28437e;
    }

    @Override // defpackage.AbstractC8761e
    public final InterfaceC7227e advert() {
        return this.f28435e;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean amazon() {
        return this.f28440e;
    }

    @Override // defpackage.AbstractC8761e
    /* renamed from: class */
    public final AbstractC8761e mo2501class(boolean z) {
        return new C14377e(this.f28436e, this.f28434e, z, this.f28433e, this.f28441e, false, this.f28437e, this.f28439e, this.f28435e, null);
    }

    @Override // defpackage.AbstractC8761e
    public final AbstractC8761e crashlytics() {
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final AbstractC8761e firebase(boolean z) {
        return new C14377e(this.f28436e, this.f28434e, this.f28438e && !z, this.f28433e, this.f28441e, z, this.f28437e, this.f28439e, this.f28435e, null);
    }

    @Override // defpackage.InterfaceC11034e
    public final List getAnnotations() {
        return this.f28433e;
    }

    @Override // defpackage.AbstractC8761e
    /* renamed from: interface */
    public final AbstractC8761e mo2502interface() {
        return null;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean isPro() {
        return false;
    }

    @Override // defpackage.InterfaceC13984e
    public final InterfaceC0861e isVip() {
        return this.f28436e;
    }

    @Override // defpackage.InterfaceC13984e
    public final List signatures() {
        return this.f28434e;
    }

    @Override // defpackage.InterfaceC13984e
    public final boolean startapp() {
        return this.f28438e;
    }

    @Override // defpackage.AbstractC8761e
    public final boolean subs() {
        return this.f28439e;
    }
}
