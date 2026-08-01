package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15246e implements InterfaceC9354e, InterfaceC1425e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f30165e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f30166e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C3095e f30167e;

    public C15246e(C3095e c3095e, ArrayList arrayList, boolean z) {
        this.f30167e = null;
        new ArrayList();
        this.f30167e = c3095e;
        this.f30166e = arrayList;
        this.f30165e = z;
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e ad(EnumC8271e enumC8271e, String... strArr) {
        if (enumC8271e.equals(EnumC8271e.COVER_ART)) {
            throw new C14803e(enumC8271e.name(), 17, (byte) 0);
        }
        return this.f30167e.ad(enumC8271e, strArr);
    }

    @Override // defpackage.InterfaceC9354e
    public final Iterator adcel() {
        return this.f30167e.adcel();
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e advert(AbstractC13977e abstractC13977e) {
        abstractC13977e.getClass();
        if (abstractC13977e.ad()) {
            return new C8340e(abstractC13977e.ad, abstractC13977e.metrica, abstractC13977e.vip, abstractC13977e.license, abstractC13977e.appmetrica);
        }
        throw new Exception("Unable to createField buffered image from the image");
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC12614e amazon() {
        this.f30167e.getClass();
        return C3095e.f7179e.keySet();
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e appmetrica(EnumC8271e enumC8271e) {
        if (EnumC8271e.COVER_ART.equals(enumC8271e)) {
            throw new C14803e(enumC8271e.name(), 17, (byte) 0);
        }
        return this.f30167e.appmetrica(enumC8271e);
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean billing(EnumC8271e enumC8271e) {
        return enumC8271e == EnumC8271e.COVER_ART ? this.f30166e.size() > 0 : this.f30167e.billing(enumC8271e);
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean isEmpty() {
        C3095e c3095e = this.f30167e;
        return (c3095e == null || c3095e.isEmpty()) && this.f30166e.size() == 0;
    }

    @Override // defpackage.InterfaceC9354e
    public final int license() {
        return this.f30166e.size() + this.f30167e.license();
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC9354e loadAd(AbstractC13977e abstractC13977e) {
        AbstractC5542e.license(abstractC13977e, "artwork");
        smaato(advert(abstractC13977e));
        return this;
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC17475e metrica(EnumC8271e enumC8271e) {
        EnumC8271e enumC8271e2 = EnumC8271e.COVER_ART;
        if (!enumC8271e2.equals(enumC8271e2)) {
            return this.f30167e.metrica(enumC8271e2);
        }
        C13304e Signature = AbstractC17475e.Signature();
        Signature.license(this.f30166e);
        return Signature.billing();
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC9354e mopub(EnumC8271e enumC8271e, String... strArr) {
        if (enumC8271e != EnumC8271e.ALBUM_ARTIST) {
            smaato(ad(enumC8271e, strArr));
            return this;
        }
        C12927e.license();
        smaato(ad(enumC8271e, (String) AbstractC5542e.appmetrica(strArr)));
        return this;
    }

    @Override // defpackage.InterfaceC1425e
    public final void smaato(InterfaceC3589e interfaceC3589e) {
        if (!(interfaceC3589e instanceof C8340e)) {
            this.f30167e.smaato(interfaceC3589e);
            return;
        }
        ArrayList arrayList = this.f30166e;
        if (arrayList.size() == 0) {
            arrayList.add(0, (C8340e) interfaceC3589e);
        } else {
            arrayList.set(0, (C8340e) interfaceC3589e);
        }
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e startapp(EnumC8271e enumC8271e) {
        return appmetrica(enumC8271e);
    }

    public final String toString() {
        return "FLAC " + this.f30167e;
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean vip() {
        return this.f30165e;
    }
}
