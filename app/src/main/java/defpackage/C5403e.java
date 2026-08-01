package defpackage;

import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5403e extends AbstractC1816e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC10073e f11585e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f11586e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f11587e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f11588e;

    public C5403e(InterfaceC12385e interfaceC12385e, Size size, InterfaceC10073e interfaceC10073e) {
        super(interfaceC12385e);
        this.f11586e = new Object();
        if (size == null) {
            this.f11588e = this.f4899e.getWidth();
            this.f11587e = this.f4899e.vip();
        } else {
            this.f11588e = size.getWidth();
            this.f11587e = size.getHeight();
        }
        this.f11585e = interfaceC10073e;
    }

    @Override // defpackage.AbstractC1816e, defpackage.InterfaceC12385e
    public final int getWidth() {
        return this.f11588e;
    }

    @Override // defpackage.AbstractC1816e, defpackage.InterfaceC12385e
    /* renamed from: synchronized */
    public final InterfaceC10073e mo691synchronized() {
        return this.f11585e;
    }

    @Override // defpackage.AbstractC1816e, defpackage.InterfaceC12385e
    public final int vip() {
        return this.f11587e;
    }
}
